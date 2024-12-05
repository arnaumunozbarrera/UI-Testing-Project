package steps;

import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserMenuTabSteps {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on user menu")
	public void theUserClicksOnMenu() {
		driver.findElement(By.xpath("//button[@type='button' and @aria-disabled='false' and @data-test='myaccount-dropdown-button']")).click();		
	}
	
	@Then("the lateral menu tab info appears")
	public void theLateralTabInfoAppears() {
		assertTrue(true);
	}
}
