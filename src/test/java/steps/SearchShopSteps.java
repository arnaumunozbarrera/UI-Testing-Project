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

public class SearchShopSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on shop button menu")
	public void theUserClicksOnShopButtonMenu() {

	}
	
	@Then("the shop location tab info appears")
	public void theShopLocationTabInfoAppears() {
		// Test ToDo
	}
	
	@When("the user enters a location")
	public void theUserEntersLocation() {

	}
	
	@Then("the shop address appears")
	public void theShopAddressAppears(){
		// Test ToDo
	}
}
