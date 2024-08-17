package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Featurefiles/vtigerCreateOrg.feature",
glue = {"com.vtiger.stepdef"},
plugin = {"pretty", "html: target/cucumber-reports_vtiger.html", "json: target/cucumber-reports_vtiger.json"},
monochrome = true,
dryRun = false,
tags = "@smoke"
)
public class vtigerRunner {
	

}
