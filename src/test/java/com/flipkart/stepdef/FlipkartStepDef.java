package com.flipkart.stepdef;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class FlipkartStepDef {
	public WebDriver driver;
	public String Phname;
	@Given("user opens flipkart applications")
	public void user_opens_flipkart_applications() {
	  driver = new ChromeDriver();
	  driver.get("https://www.flipkart.in");
	}

	@When("User searches for mobiles under Rs20000")
	public void user_searches_for_mobiles_under_rs_20000() {
	    driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Mobiles under 20000",Keys.ENTER);
	}

	@Then("All mobiles under Rs20000 are displayed")
	public void all_mobiles_under_rs20000_are_displayed() {
	    Phname = driver.findElement(By.xpath("//div[text()='Motorola g64 5G (Ice Lilac, 256 GB)']")).getText();
	    Assert.assertTrue(Phname.contains("Motorola g64 5G (Ice Lilac, 256 GB)"));
	    System.out.println("Phone name is matching");
	    System.out.println("TC is passed");
	    driver.close();
	}

}
