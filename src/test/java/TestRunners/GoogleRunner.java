package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Featurefiles/Google.feature",
glue = {"com.google.stepdef"},
plugin = {"pretty", "html: target1/cucumber-reports_google.html", "json: target1/cucumber-reports_google.json"},
monochrome = true,
dryRun = false,
tags = "@smoke"
)
public class GoogleRunner extends AbstractTestNGCucumberTests {

}
