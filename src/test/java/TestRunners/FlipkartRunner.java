package TestRunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Featurefiles/FlipksrtPhSearch.feature"},
glue = {"com.flipkart.stepdef"},
plugin = {"pretty", "html: target/cucumber-reports_flipkart.html", "json: target/cucumber-reports_flipkart.json"},
tags = "@smoke"
)
public class FlipkartRunner extends AbstractTestNGCucumberTests {

}
