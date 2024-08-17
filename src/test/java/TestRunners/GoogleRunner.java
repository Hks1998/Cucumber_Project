package TestRunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="C:\\Users\\harsh\\Downloads\\eclipse-workspace-2a\\eclipse-workspace-2\\CucumberFramework\\src\\test\\resources\\Featurefiles\\Google.feature",glue = "stepdef")
public class GoogleRunner {

}
