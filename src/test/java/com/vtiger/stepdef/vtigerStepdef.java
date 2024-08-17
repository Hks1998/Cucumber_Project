package com.vtiger.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.vtiger.genericUtilities.*;

import io.cucumber.java.en.*;

public class vtigerStepdef {
	public WebdriverUtility wutil = new WebdriverUtility();
	public JavaUtility jutil = new JavaUtility();
	public WebDriver driver;
	public String AcT;
	@Given("User opens vtigercrm application")
	public void user_opens_vtigercrm_application() {
	   driver = new ChromeDriver();
	   driver.get("http://localhost:8888/");
	}

	@When("User logs into vtigercrm application")
	public void user_logs_into_vtigercrm_application() {
	    driver.findElement(By.xpath(" //input[@name='user_name']")).sendKeys("admin");
	    driver.findElement(By.xpath(" //input[@name='user_password']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}
	
	@And("User clicks on the organizations option")
	public void user_clicks_on_the_organizations_option() {
	   driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	}

	@And("User clicks on lookup img")
	public void user_clicks_on_lookup_img() {
	   driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
	}

	@And("User enters the organization name")
	public void user_enters_the_organization_name() {
		 driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("TCS"+jutil.getRandomNum());
	}

	@And("User clicks on save button")
	public void user_clicks_on_save_button() {
		driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	  
	}

	@And("Organization information page is displayed")
	public void organization_information_page_is_displayed() {
		wutil.waitForPageLoad(driver);
	    AcT = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	}

	@Then("User verifies the title of the organization")
	public void user_verifies_the_title_of_the_organization() {
	    Assert.assertTrue(AcT.contains("TCS"));
	    System.out.println("Organization Title is matched");
	    System.out.println("Organization created successfully and TC is passed");
	}




}
