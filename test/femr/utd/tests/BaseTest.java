package femr.utd.tests;

import femr.common.dtos.ServiceResponse;
import femr.util.dependencyinjection.modules.BusinessLayerModule;
import femr.util.dependencyinjection.modules.DataLayerModule;
import femr.util.dependencyinjection.modules.MapperModule;
import femr.util.dependencyinjection.modules.UtilitiesModule;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import play.test.FakeApplication;
import play.test.Helpers;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.fail;

/**
 * Created by ojcch on 3/14/2016.
 */
@RunWith(GuiceJUnitRunner.class)
@GuiceJUnitRunner.GuiceModules({BusinessLayerModule.class, DataLayerModule.class, MapperModule.class, UtilitiesModule.class})
public class BaseTest {

    public static FakeApplication app;

    @BeforeClass
    public static void startApp() {

        Map<String, Object> conf = conf = new HashMap<>();

       conf.put("db.default.url","jdbc:mysql://127.0.0.1:3306/femr_testdb");
        //conf.put(  "db.default.url","jdbc:mysql://localhost/femr_testdb?characterEncoding=UTF-8");
        conf.put("db.default.username","femrdb");
        conf.put("db.default.password","femrdb");
        conf.put( "ebean.default", "models.*, femr.data.models.*");
        //conf.put("ebean.default", "models.*, femr.data.models.*");
        //conf.put("ebean.default", " femr.data.models.*");
        conf.put("play.evolutions.db.default.enabled","false");
        conf.put("play.evolutions.enabled","false");
       // conf.put(  "play.evolutions.db.default.autoApply","true");
        System.out.println("To check the Map List " + conf);

        app = Helpers.fakeApplication(conf);
        System.out.println("To check before Helper is start or not : " + app);
        Helpers.start(app);
        System.out.println("To check After Helper is start or not : " + app);
    }

    @AfterClass
    public static void stopApp() {
        Helpers.stop(app);
    }

    public static void checkForErrors(ServiceResponse response){
        Map<String, String> errs = response.getErrors();

        if (errs.size() != 0){
            fail(errs.toString());
        }

    }
}
