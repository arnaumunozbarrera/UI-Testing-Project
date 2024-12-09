package steps;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterProductSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on filter1 button")
	public void theUserClicksOnFilter1Button() {

	}
	
	@When("the user clicks on filter2 button")
	public void theUserClicksOnFilter2Button() {

	}
	
	@When("the user clicks on filter3 button")
	public void theUserClicksOnFilter3Button() {

	}
	
	@When("the user clicks on filter4 button")
	public void theUserClicksOnFilter4Button() {

	}
	
	@When("the user clicks on filter5 button")
	public void theUserClicksOnFilter5Button() {

	}
	
	@Then("the new product result list appears")
	public void theNewProductResultListAppears(){
		// Test ToDo
	}
}
