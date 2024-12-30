package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources/Featurefiles/vtigerCreateOrg.feature",
glue = {"com.vtiger.stepdef"},
plugin = {"pretty", "html: target1/cucumber-reports_vtiger.html", "json: target1/cucumber-reports_vtiger.json"},
monochrome = true,
dryRun = false,
tags = "@smoke"
)
public class VtigerRunner extends AbstractTestNGCucumberTests {
	

}
