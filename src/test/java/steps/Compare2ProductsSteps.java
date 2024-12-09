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

public class Compare2ProductsSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on compare button for product1")
	public void theUserClicksOnCompareButtonProd1() {

	}
	
	@When("the user clicks on compare button for product2")
	public void theUserClicksOnCompareButtonProd2() {

	}
	
	@Then("the compare now option appears")
	public void theCompareNowOptionAppears(){
		// Test ToDo
	}
	
	@When("the user clicks on compare now")
	public void theUserClicksOnCompareNow() {
		
	}
	
	@Then("the comparison between products appears")
	public void theComparisonBetweenProductsAppears() {
		// Test ToDo
	}
	
	@When("the user clicks on the exit comparison button")
	public void theUserClickOnTheExitComparisonButton() {
		
	}
	
	@When("the user clicks on confirm exit comparison")
	public void theUserClickOnConfirmExitComparison() {
		
	}
	
	@Then("previous product added appear")
	public void previousProductAddedAppear() {
		// Test ToDo
	}
}
