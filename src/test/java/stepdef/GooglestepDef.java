package stepdef;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class GooglestepDef {
	 public WebDriver driver;
	 public String AcT;
	@Given("Open the Google application")
	public void open_the_google_application() {
	    driver = new ChromeDriver();
	    driver.get("https://www.google.co.in");
	    
	}

	@When("User captures current page title")
	public void user_captures_current_page_title() {
	  AcT = driver.getTitle();
	}

	@Then("Title should match with")
	public void title_should_match_with() {
		Assert.assertTrue(AcT.contains("Google"));
		
		System.out.println("Title is matched "+AcT);
		System.out.println("Tc is passed");
		
	}
}
