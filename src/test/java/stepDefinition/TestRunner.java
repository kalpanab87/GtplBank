package stepDefinition;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\User\\IdeaProjects\\GtplBank\\src\\test\\Feature",
//        features="src\test\features",
        glue = {"stepDefinition"},
       // tags = {"~@sanity"},//picks scenarios other than sanity
        //tags = {"@sanity"," @smoke"},//picks scenarios both sanity and smoke
        //tags = {"@sanity, @smoke"},//picks scenarios which have sanity, which have smoke.
        //tags = {"@important"},
       // tags = {"@vip"},
        tags = {"@current"},
        //plugin = {"pretty", "html:target/destination" + "facebook"}
        plugin = {"pretty", "html:target/destination"}
        //plugin = {"pretty", "json:target/test.json"}
)

public class TestRunner {

}
