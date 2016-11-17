package femr.ui.controllers;

import com.google.inject.Inject;
import femr.business.services.core.*;
import femr.common.dtos.CurrentUser;
import femr.common.dtos.ServiceResponse;
import femr.common.models.*;
import femr.ui.models.medical.EditViewModelPost;
import femr.ui.views.html.medical.index;
import femr.util.stringhelpers.StringUtils;
import play.data.Form;
import play.mvc.Result;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Inam Khan on 16-Nov-16.
 */
public class MedicalControllerImplRefactor extends MedicalController {
    private final ISessionService sessionService = null;
    private final ISearchService searchService = null;
    private final IEncounterService encounterService = null;
    private final IMedicationService medicationService = null;
    private final IPhotoService photoService = null;
    private final Form<EditViewModelPost> createViewModelPostForm = null;


    public MedicalControllerImplRefactor(ITabService tabService, IEncounterService encounterService, IMedicationService medicationService, IPhotoService photoService, ISessionService sessionService, ISearchService searchService, IVitalService vitalService, IInventoryService inventoryService) {
        super(tabService, encounterService, medicationService, photoService, sessionService, searchService, vitalService, inventoryService);
    }

    public Result editPost(int patientId) {
        CurrentUser currentUserSession = sessionService.retrieveCurrentUserSession();

        EditViewModelPost viewModelPost = createViewModelPostForm.bindFromRequest().get();

        //get current patient
        ServiceResponse<PatientItem> patientItemServiceResponse = searchService.retrievePatientItemByPatientId(patientId);
        if (patientItemServiceResponse.hasErrors()) {
            throw new RuntimeException();
        }
        PatientItem patientItem = patientItemServiceResponse.getResponseObject();

        //get current encounter
        ServiceResponse<PatientEncounterItem> patientEncounterServiceResponse = searchService.retrieveRecentPatientEncounterItemByPatientId(patientId);
        if (patientEncounterServiceResponse.hasErrors()) {
            throw new RuntimeException();
        }
        PatientEncounterItem patientEncounterItem = patientEncounterServiceResponse.getResponseObject();
        patientEncounterItem = encounterService.checkPatientInToMedical(patientEncounterItem.getId(), currentUserSession.getId()).getResponseObject();

        //get and save problems
        List<String> problemList = new ArrayList<>();
        for (ProblemItem pi : viewModelPost.getProblems()) {
            if (StringUtils.isNotNullOrWhiteSpace(pi.getName())) {
                problemList.add(pi.getName());
            }
        }
        if (problemList.size() > 0) {
            encounterService.createProblems(problemList, patientEncounterItem.getId(), currentUserSession.getId());
        }

        //get tab fields that do not have a related chief complaint and put them into a nice map
        Map<String, String> tabFieldItemsWithNoRelatedChiefComplaint = new HashMap<>();
        Map<String, Map<String, String>> tabFieldItemsWithChiefComplaint = new HashMap<>();
        //get tab fields other than problems
        for (TabFieldItem tfi : viewModelPost.getTabFieldItems()) {
            if (StringUtils.isNotNullOrWhiteSpace(tfi.getValue()) && StringUtils.isNullOrWhiteSpace(tfi.getChiefComplaint())) {

                tabFieldItemsWithNoRelatedChiefComplaint.put(tfi.getName(), tfi.getValue());
            }else if (StringUtils.isNotNullOrWhiteSpace(tfi.getValue()) && StringUtils.isNotNullOrWhiteSpace(tfi.getChiefComplaint())) {

                // Get the tabField Map for chief complaint
                Map<String, String> tabFieldMap = tabFieldItemsWithChiefComplaint.get(tfi.getChiefComplaint());
                if (tabFieldMap == null){
                    // if it does not exist, create it
                    tabFieldMap = new HashMap<>();
                }
                // create and add a tabFieldMap to the Map of Maps for the chief complaint, ummm  yea...
                tabFieldMap.put(tfi.getName(), tfi.getValue());
                tabFieldItemsWithChiefComplaint.put(tfi.getChiefComplaint(), tabFieldMap);
            }
        }
        //save the tab fields that do not have a related chief complaint
        ServiceResponse<List<TabFieldItem>> createPatientEncounterTabFieldsServiceResponse;
        if (tabFieldItemsWithNoRelatedChiefComplaint.size() > 0) {

            createPatientEncounterTabFieldsServiceResponse = encounterService.createPatientEncounterTabFields(tabFieldItemsWithNoRelatedChiefComplaint, patientEncounterItem.getId(), currentUserSession.getId());
            if (createPatientEncounterTabFieldsServiceResponse.hasErrors()) {

                throw new RuntimeException();
            }
        }
        //save the tab fields that do have related chief complaint(s)
        ServiceResponse<List<TabFieldItem>> createPatientEncounterTabFieldsWithChiefComplaintsServiceResponse;
        if (tabFieldItemsWithChiefComplaint.size() > 0){
            //call the service once for each existing chief complaint
            for (Map.Entry<String, Map<String,String>> entry : tabFieldItemsWithChiefComplaint.entrySet()){

                createPatientEncounterTabFieldsWithChiefComplaintsServiceResponse = encounterService.createPatientEncounterTabFields(entry.getValue(), patientEncounterItem.getId(), currentUserSession.getId(), entry.getKey());
                if (createPatientEncounterTabFieldsWithChiefComplaintsServiceResponse.hasErrors()){

                    throw new RuntimeException();
                }
            }
        }

        //create patient encounter photos
        photoService.createEncounterPhotos(request().body().asMultipartFormData().getFiles(), patientEncounterItem, viewModelPost);

        //get the prescriptions that have an ID (e.g. prescriptions that exist in the dictionary).
        List<PrescriptionItem> prescriptionItemsWithID = viewModelPost.getPrescriptions()
                .stream()
                .filter(prescription -> prescription.getMedicationID() != null)
                .collect(Collectors.toList());

        //create the prescriptions that already have an ID
        ServiceResponse<PrescriptionItem> createPrescriptionServiceResponse;
        for (PrescriptionItem prescriptionItem : prescriptionItemsWithID){

            //The POST data sends -1 if an administration ID is not set. Null is more appropriate for the
            //service layer
            if (prescriptionItem.getAdministrationID() == -1)
                prescriptionItem.setAdministrationID(null);

            createPrescriptionServiceResponse = medicationService.createPrescription(
                    prescriptionItem.getMedicationID(),
                    prescriptionItem.getAdministrationID(),
                    patientEncounterItem.getId(),
                    currentUserSession.getId(),
                    prescriptionItem.getAmount(),
                    null);

            if (createPrescriptionServiceResponse.hasErrors()){

                throw new RuntimeException();
            }
        }

        // get the prescriptions that DO NOT have an ID (e.g. prescriptions that DO NOT exist in the dictionary).
        // also ignore new new prescriptions that do not have a name
        List<PrescriptionItem> prescriptionItemsWithoutID = viewModelPost.getPrescriptions()
                .stream()
                .filter( prescription -> prescription.getMedicationID() == null )
                .filter( prescription -> StringUtils.isNotNullOrWhiteSpace( prescription.getMedicationName() ) )
                .collect(Collectors.toList());

        for (PrescriptionItem prescriptionItem : prescriptionItemsWithoutID){

            //The POST data sends -1 if an administration ID is not set. Null is more appropriate for the
            //service layer
            if (prescriptionItem.getAdministrationID() == -1)
                prescriptionItem.setAdministrationID(null);

            createPrescriptionServiceResponse = medicationService.createPrescriptionWithNewMedication(
                    prescriptionItem.getMedicationName(),
                    prescriptionItem.getAdministrationID(),
                    patientEncounterItem.getId(),
                    currentUserSession.getId(),
                    prescriptionItem.getAmount(),
                    null);

            if (createPrescriptionServiceResponse.hasErrors()){

                throw new RuntimeException();
            }
        }



        String message = "Patient information for " + patientItem.getFirstName() + " " + patientItem.getLastName() + " (id: " + patientItem.getId() + ") was saved successfully.";

        return ok(index.render(currentUserSession, message, 0));
    }
}
