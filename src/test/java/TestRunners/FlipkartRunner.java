package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Featurefiles/FlipksrtPhSearch.feature",
glue = {"com.flipkart.stepdef"},
plugin = {"pretty", "html: target/cucumber-reports_flipkart.html", "json: target/cucumber-reports_flipkart.json"},
monochrome = true,
dryRun = false,
tags = "@smoke"
)
public class FlipkartRunner {

}
