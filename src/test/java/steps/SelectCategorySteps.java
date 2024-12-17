package steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SelectCategorySteps {
	WebDriver driver = HomePageSteps.getDriver();
	
		
	@When("the user clicks on menu")
	public void theUserClicksOnMenu() {
		driver.findElement(By.id("mms-app-header-category-button")).click();
	}
	
	@Then("the lateral tab info appears")
	public void theLateralTabInfoAppears() {
		// Test ToDo
		assertTrue(true);
	}
	
	@When("the user clicks on a category")
	public void theUserClicksOnACategory() {
		driver.findElement(By.id("category-9")).click();
	}
	
	@Then("the category products appears")
	public void theCategoryProductsAppears() {
		// Test ToDo
		assertTrue(true);
	}
}
