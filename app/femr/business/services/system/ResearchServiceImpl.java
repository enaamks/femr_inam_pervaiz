package femr.business.services.system;

import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.Query;
import com.google.gson.Gson;
import com.google.gson.JsonParser;
import femr.business.helpers.LogicDoer;
import femr.business.helpers.QueryProvider;
import femr.common.dtos.ServiceResponse;
import femr.common.models.ResearchExportItem;
import femr.common.models.ResearchFilterItem;
import femr.data.daos.IRepository;
import femr.data.models.core.*;
import femr.data.models.core.research.IResearchEncounter;
import femr.data.models.mysql.PatientEncounterTabField;
import femr.data.models.mysql.Vital;
import femr.data.models.mysql.research.ResearchEncounter;
import femr.data.models.mysql.research.ResearchEncounterVital;
import femr.util.calculations.dateUtils;
import femr.util.stringhelpers.CSVWriterGson;
import femr.util.stringhelpers.GsonFlattener;
import femr.util.stringhelpers.StringUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by Inam Khan on 15-Nov-16.
 */
public class ResearchServiceImpl extends ResearchService {
    /**
     * Initializes the research service and injects the dependence
     *
     * @param researchEncounterRepository
     * @param vitalRepository
     * @param patientEncounterTabFieldRepository
     */
    public ResearchServiceImpl(IRepository<IResearchEncounter> researchEncounterRepository, IRepository<IVital> vitalRepository, IRepository<IPatientEncounterTabField> patientEncounterTabFieldRepository) {
        super(researchEncounterRepository, vitalRepository, patientEncounterTabFieldRepository);
    }

    @Override
    public ServiceResponse<File> retrieveCsvExportFile(ResearchFilterItem filters) {

        // Get Vital Ids for below
        Integer heightFeetId = 0;
        Integer heightInchesId = 0;
        IVital vital;

        // As new patients are encountered, generate a UUID to represent them in the export file
        Map<Integer, UUID> patientIdMap = new HashMap<>();

        //why is this either height or not height?
        //when it is not height it assumes it's a vital?

        if (filters.getPrimaryDataset().equals("height")){

            ExpressionList<Vital> qfemr.data.daos.core.IMedicationRepository vitalRepository;uery = QueryProvider.getVitalQuery().where().eq("name", "heightFeet");
            vital = vitalRepository.findOne(query);

            heightFeetId = vital.getId();

            query = QueryProvider.getVitalQuery().where().eq("name", "heightInches");
            vital = vitalRepository.findOne(query);

            heightInchesId = vital.getId();
        }
        else{
            String vitalName = filters.getPrimaryDataset();
            ExpressionList<Vital> query = QueryProvider.getVitalQuery().where().eq("name", vitalName);
            vital = vitalRepository.findOne(query);

        }

        ServiceResponse<File> response = new ServiceResponse<>();

        // Find Patient Encounters which match the current filters
        filters.setOrderBy("patientId");
        List<? extends IResearchEncounter> patientEncounters = queryPatientData(filters);

        List<ResearchExportItem> researchExportItemsForCSVExport = new ArrayList<>();
        //this for loop makes sure that the primary dataset is properly filtered when the user enters
        //a start and end number under "Filter Primary Dataset".
        //what about weight filters?
        for(IResearchEncounter patientEncounter : patientEncounters ){

            // only filtering age, height, and vitals
            if( filters.getPrimaryDataset().equals("age") ) {

                Float age = (float) Math.floor(dateUtils.getAgeAsOfDateFloat(patientEncounter.getPatient().getAge(), patientEncounter.getDateOfTriageVisit()));
                // skip encounter if age is out of range
                if (age < filters.getFilterRangeStart() || age > filters.getFilterRangeEnd()) continue;
            }
//            else if( filters.getPrimaryDataset().equals("pregnancyStatus") ||
//                    filters.getPrimaryDataset().equals("pregnancyTime") ){
//
//
//            }
//            else if( filters.getPrimaryDataset().equals("gender") ){
//
//
//            }
            else if( filters.getPrimaryDataset().equals("height") ){

                ResearchEncounterVital vitalFeet = patientEncounter.getEncounterVitals().get(heightFeetId);
                ResearchEncounterVital vitalInches = patientEncounter.getEncounterVitals().get(heightInchesId);

                // height values may not exist
                Float vitalValue = 0.0f;
                if( vitalFeet != null ){

                    vitalValue += vitalFeet.getVitalValue() * 12;
                }
                if( vitalInches != null ){

                    vitalValue += vitalInches.getVitalValue();
                }

                if( vitalValue < filters.getFilterRangeStart() || vitalValue > filters.getFilterRangeEnd() ) continue;

            }
            // Check for medication filters
//            else if( filters.getPrimaryDataset().equals("prescribedMeds") ||
//                    filters.getPrimaryDataset().equals("dispensedMeds") ){
//
//
//            }
            else if (vital != null){

                ResearchEncounterVital vitals = patientEncounter.getEncounterVitals().get(vital.getId());
                if( vitals == null ) continue;

                Float vitalValue = vitals.getVitalValue();

                if( vitalValue == null ) continue;
                if( vitalValue < filters.getFilterRangeStart() || vitalValue > filters.getFilterRangeEnd() ) continue;
            }

            UUID muddledPatientId;
            // If UUID already generated for patient, use that
            if( patientIdMap.containsKey(patientEncounter.getPatient().getId()) ){

                muddledPatientId = patientIdMap.get(patientEncounter.getPatient().getId());
            }
            // otherwise generate and store for potential additional patient encounters
            else{

                muddledPatientId = UUID.randomUUID();
                patientIdMap.put(patientEncounter.getPatient().getId(), muddledPatientId);
            }
            ResearchExportItem item = createResearchExportItem(patientEncounter, muddledPatientId);
            researchExportItemsForCSVExport.add(item);

        }

        // Make File and get path
        String csvFilePath = LogicDoer.getCsvFilePath();
        //Ensure folder exists, if not, create it
        File f = new File(csvFilePath);
        if (!f.exists())
            f.mkdirs();

        // trailing slash is included in path
        //CurrentUser currentUser = sessionService.retrieveCurrentUserSession();
        SimpleDateFormat format = new SimpleDateFormat("MMddyy-HHmmss");
        String timestamp = format.format(new Date());
        String csvFileName = csvFilePath+"export-"+timestamp+".csv";
        File eFile = new File(csvFileName);
        boolean fileCreated = false;
        if(!eFile.exists()) {
            try {
                fileCreated = eFile.createNewFile();
            }
            catch( IOException e ){

                e.printStackTrace();
            }
        }

        if( fileCreated ) {

            Gson gson = new Gson();
            JsonParser gsonParser = new JsonParser();
            String jsonString = gson.toJson(researchExportItemsForCSVExport);

            GsonFlattener parser = new GsonFlattener();
            CSVWriterGson writer = new CSVWriterGson();

            try {

                List<Map<String, String>> flatJson = parser.parse(gsonParser.parse(jsonString).getAsJsonArray());
                writer.writeAsCSV(flatJson, csvFileName);

            } catch (FileNotFoundException e) {

                e.printStackTrace();
            }
        }
        response.setResponseObject(eFile);

        return response;
    }

    @Override
    protected ResearchExportItem createResearchExportItem(IResearchEncounter encounter, UUID patientId){

        //this item is used to populate one line in the CSV file.
        ResearchExportItem exportitem = new ResearchExportItem();

        IPatient patient = encounter.getPatient();

        // Patient Id
        exportitem.setPatientId(patientId);

        // Age
        Integer age = (int)Math.floor(dateUtils.getAgeAsOfDateFloat(patient.getAge(), encounter.getDateOfTriageVisit()));
        exportitem.setAge(age);

        // Gender
        String gender = StringUtils.outputStringOrNA(patient.getSex());
        exportitem.setGender(gender);

        // Pregnancy Status
        Integer wksPregnant = getWeeksPregnant(encounter);
        exportitem.setWeeksPregnant(wksPregnant);

        // Week Pregnant
        if( wksPregnant > 0 ){
            exportitem.setIsPregnant(true);
        }
        else{
            exportitem.setIsPregnant(false);
        }

        // Chief Complaints
        List<String> chiefComplaints = new ArrayList<>();
        for (IChiefComplaint c : encounter.getChiefComplaints()) {

            chiefComplaints.add(c.getValue());
        }
        exportitem.setChiefComplaints(chiefComplaints);

        // Prescriptions - Prescribed and Dispensed
        List<String> prescribed = new ArrayList<>();
        List<String> dispensed = new ArrayList<>();
        if( encounter.getPatientPrescriptions() != null ) {
            for (IPatientPrescription p : encounter.getPatientPrescriptions()) {

                if( p.getDateDispensed() != null ){

                    dispensed.add(p.getMedication().getName());
                }

                prescribed.add(p.getMedication().getName());
            }
        }
        exportitem.setDispensedMedications(dispensed);
        exportitem.setPrescribedMedications(prescribed);

        // Tab Fields
        ExpressionList<PatientEncounterTabField> patientEncounterTabFieldExpressionList = QueryProvider.getPatientEncounterTabFieldQuery()
                .where()
                .eq("patient_encounter_id", encounter.getId());
        List<? extends IPatientEncounterTabField> existingPatientEncounterTabFields = patientEncounterTabFieldRepository.find(patientEncounterTabFieldExpressionList);
        Map<String, String> tabFields = new HashMap<>();
        if( existingPatientEncounterTabFields.size() > 0 ){

            for( IPatientEncounterTabField tf : existingPatientEncounterTabFields ){

                tabFields.put(tf.getTabField().getName(), tf.getTabFieldValue());
            }
        }
        exportitem.setTabFieldMap(tabFields);

        // Vitals
        Map<Integer, ResearchEncounterVital> vitalMap = encounter.getEncounterVitals();
        Map<String, Float> vitals = new HashMap<>();
        for( ResearchEncounterVital vital : vitalMap.values() ){

            vitals.put(vital.getVital().getName(), vital.getVitalValue());
        }
        exportitem.setVitalMap(vitals);

        //month and year of the encounter
        exportitem.setDayOfVisit(dateUtils.getFriendlyDateMonthYear(encounter.getDateOfTriageVisit()));

        return exportitem;

    }

    @Override
    protected List<? extends IResearchEncounter> queryPatientData(ResearchFilterItem filters){

        String datasetName = filters.getPrimaryDataset();

        String startDateString = filters.getStartDate();
        String endDateString = filters.getEndDate();
        Date startDateObj;
        Date endDateObj;
        SimpleDateFormat sqlFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {

            // Set Start Date to start of day
            String startParseDate = startDateString + " 00:00:00";
            startDateObj = sqlFormat.parse(startParseDate);

            // Set End Date to end of day
            String parseEndDate = endDateString + " 23:59:59";
            endDateObj = sqlFormat.parse(parseEndDate);
        }
        catch(ParseException e){

            startDateObj = null;
            endDateObj = null;
        }

        // Build Query based on Filters
        Query<ResearchEncounter> researchEncounterQuery = QueryProvider.getResearchEncounterQuery();
                researchEncounterQuery.fetch("patient");


        if( datasetName.equals("prescribedMeds") || datasetName.equals("dispensedMeds") ){

            researchEncounterQuery.fetch("patientPrescriptions");
        }

        // filtering by medication, so make sure to fetch the medication info
        if( filters.getMedicationName() != null && filters.getMedicationName().length() > 0 ){

            researchEncounterQuery.fetch("patientPrescriptions.medication");
        }

        ExpressionList<ResearchEncounter> researchEncounterExpressionList = researchEncounterQuery.where();

        // filter by date - can have only start, or only end date
        if( startDateObj != null ) {
            researchEncounterExpressionList.gt("dateOfTriageVisit", sqlFormat.format(startDateObj));
        }
        if( endDateObj != null ) {
            researchEncounterExpressionList.lt("dateOfTriageVisit", sqlFormat.format(endDateObj));
        }

        // filtering by medication if the name is set
        if( filters.getMedicationName() != null && filters.getMedicationName().length() > 0 ){

            researchEncounterExpressionList.like("patientPrescriptions.medication.name", "%" + filters.getMedicationName() + "%");
        }

        if ( filters.getMissionTripId() != null) {

            researchEncounterExpressionList.eq("missionTrip.id",filters.getMissionTripId()); //Andrew Trip Filter
        }

        // if the filters exist - use them in the query
//        if( filters.getFilterRangeStart() > -1 * Float.MAX_VALUE ){
//
//            if( filters.getPrimaryDataset().equals("age") ){
//
//                // Age comes in as an integer -- need to make it a date
//                Float age = filters.getFilterRangeStart();
//                DateTime maxBirthDate = new DateTime();
//                maxBirthDate = maxBirthDate.withTimeAtStartOfDay().minusYears((int) Math.floor(age));
//
//                e.le("patient.age", sqlFormat.format(maxBirthDate.toDate()));
//            }
//
//        }
//
//        if( filters.getFilterRangeEnd() < Float.MAX_VALUE ){
//
//            if( filters.getPrimaryDataset().equals("age") ){
//
//                // Age comes in as an integer -- need to make it a date
//                Float age = filters.getFilterRangeEnd();
//                DateTime maxBirthDate = new DateTime();
//                maxBirthDate = maxBirthDate.withTimeAtStartOfDay().minusYears((int) Math.floor(age));
//
//                e.ge("patient.age", sqlFormat.format(maxBirthDate.toDate()));
//            }
//        }
        researchEncounterExpressionList.isNull("patient.isDeleted");
        // add age specific parameters
        if( datasetName.equals("age") ) {

            researchEncounterExpressionList.ne("patient.age", null);
            researchEncounterExpressionList.orderBy().desc("patient.age");
        }

        if( filters.getOrderBy() != null && filters.getOrderBy().equals("patientId") ){

            researchEncounterExpressionList.orderBy().desc("patient.id");
        }
        else {
            researchEncounterExpressionList.orderBy().desc("date_of_triage_visit");
        }


        researchEncounterExpressionList.findList();
        return researchEncounterRepository.find(researchEncounterExpressionList);

    }
}
