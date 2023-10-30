package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"},
        features = "src/test/resources/features", // features yolunu veriyoruz
        glue = "stepDefinitions", // stepdefinitions yolunu veriyoruz
        tags = "@gp2",// iki tane tag clistirmak icinde "@gp1 or @gp2" diye yazariz
        dryRun = false
)

public class TestRunner {


}
