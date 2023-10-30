package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports2.html",
                "json:target/json-reports/cucumber2.json",
                "junit:target/xml-report/cucumber2.xml"},
        features = "src/test/resources/features",
        glue = "stepDefinitions",
        // glue= {"stepdefinitions", "hooks"},
        tags = "@gp2",// iki tane tag clistirmak icinde "@gp1 or @gp2" diye yazariz
        dryRun = false
)

public class TestRunner2 {


}
