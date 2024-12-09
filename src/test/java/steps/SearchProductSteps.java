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

public class SearchProductSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on search bar button")
	public void theUserClicksOnSearchBarButton() {

	}
	
	@When("the user clicks on submit product search")
	public void theUserClicksOnSubmitProductSearch() {

	}
	
	@Then("product result list appears")
	public void theProductResultListAppears(){
		// Test ToDo
	}
	
	@When("the user clicks on product container")
	public void theUserClicksOnProductContainer() {
		
	}
	
	@Then("the product detail info appears")
	public void theProductDetailInfoAppears() {
		// Test ToDo
	}
}
