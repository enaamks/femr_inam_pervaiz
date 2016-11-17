package femr.utd.tests;

import com.google.inject.Inject;
import femr.business.services.core.*;
import femr.common.dtos.CurrentUser;
import femr.common.dtos.ServiceResponse;
import femr.common.models.MedicationItem;
import femr.common.models.PatientItem;
import femr.common.models.TabFieldItem;
import femr.ui.models.medical.EditViewModelPost;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Unit Tests for MedicationService
 */
public class MedicalControllerImplRefactor extends BaseTest {

    private static IMedicationService service;
    private static MedicationItem newMed;
    private Static ISessionService sessionService;
    private Static ISessionService sessionService ;
   // private Static ISearchService searchService ;
    private Static IEncounterService encounterService ;
   // private Static IMedicationService medicationService ;
    private Static IPhotoService photoService;

    @Inject
    public void setService(IMedicationService service) {
        this.service = service;
    }

    @Inject
    public void setService(ISessionService service) {
        this.service = service;
    }

    @Inject
    public void setService(IEncounterService service) {
        this.service = service;
    }

    @Inject
    public void setService(IPhotoService service) {
        this.service = service;
    }


    @BeforeClass
    public static void initialize(){
        System.out.println("Testing Medical Controller Refactor!!");
        cleanDB();
    }

    @AfterClass
    public static void cleanDB(){

        //clean the DB
        if (newMed!=null) {

            //remove the new medication
            ServiceResponse<MedicationItem> response2 = service.removeMedication(newMed.getId());
            checkForErrors(response2);

            //assert deletion
            MedicationItem medDeleted = response2.getResponseObject();
            assertNull(medDeleted);
        }
    }


    @Test
    public void testRetrieveMedicalServiceController() throws Exception {
        CurrentUser currentUserSession = sessionService.retrieveCurrentUserSession();

        CurrentUser currentUserSession = sessionService.retrieveCurrentUserSession();

        EditViewModelPost viewModelPost = createViewModelPostForm.bindFromRequest().get();

        //get current patient
        ServiceResponse<PatientItem> patientItemServiceResponse = searchService.retrievePatientItemByPatientId(patientId);
        if (patientItemServiceResponse.hasErrors()) {
            assertFalse();
        }
        PatientItem patientItem = patientItemServiceResponse.getResponseObject();
        if(patientItem != null){
            assertTrue();
        }
    }

    @Test
    public void testCreateService(){

        createPatientEncounterTabFieldsServiceResponse = encounterService.createPatientEncounterTabFields("abc");
        if (createPatientEncounterTabFieldsServiceResponse.hasErrors()) {

            assertFalse();
        }else {
            ServiceResponse<List<TabFieldItem>> createPatientEncounterTabFieldsWithChiefComplaintsServiceResponse;
            assertTrue();
        }

    }



}