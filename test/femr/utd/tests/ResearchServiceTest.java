package femr.utd.tests;

import com.google.inject.Inject;
import femr.business.services.core.IResearchService;
import femr.common.dtos.ServiceResponse;
import femr.common.models.ResearchFilterItem;
import femr.common.models.ResearchResultSetItem;
import org.junit.BeforeClass;
import org.junit.Test;

//import femr.business.services.core.IMedicationService;
//import femr.common.dtos.ServiceResponse;
//import femr.common.models.MedicationItem;


public class ResearchServiceTest extends BaseTest {

    private static IResearchService service;
    //private static ResearchI newMed;

    @Inject
    public void setService(IResearchService service) {
        this.service = service;
    }

    @BeforeClass
    public static void initialize(){
        System.out.println("Testing ResearchService!!");
      //  cleanDB();
    }

    @Test
    public void testAgeresultData(){
        ResearchFilterItem filters =new ResearchFilterItem();
        filters.setPrimaryDataset("age");
        filters.setFilterRangeStart(1.0f);
        filters.setFilterRangeEnd((69.0f));
        //ServiceResponse<ResearchResultSetItem> retrieveGraphData(ResearchFilterItem filters){

           //create the medication
        ServiceResponse<ResearchResultSetItem>  response = service.retrieveGraphData(filters);

        //check for errors
        checkForErrors(response);

        //get the new medication
        //newMed = response.getResponseObject();

        //assert the new medication is not null
        //assertNotNull(newMed);

    }



}