package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/failedRerun.txt"
        },
        monochrome=true,
        features = "./src/test/resources/features",//PATH OF FEATURES FOLDER
        glue = {"stepdefinitions"},//PATH OF STEP DEFINITIONS
        dryRun = false,
        tags = "@parametrizing1"
)
public class TestRunner {
}
