package steps;

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

public class UserLogInSteps {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on user menu")
	public void theUserClicksOnMenu() {
		driver.findElement(By.xpath("//button[@type='button' and @aria-disabled='false' and @data-test='myaccount-dropdown-button']")).click();		
	}
	
	@Then("the lateral menu tab info appears")
	public void theLateralTabInfoAppears() {
		// Test ToDo
		assertTrue(true);
	}
	
	@When("the user clicks on login")
	public void theUserClicksOnLogIn() {
		driver.findElement(By.id("myaccount-dropdown-login-button")).click();	
	}
	
	@Then("the user login form appears")
	public void theUserLogInFormAppears(){
		// Test ToDo
		assertTrue(true);
	}
	
	@When("the user completes form incorrectly")
	public void theUserCompletesFormIncorrectly() {
		driver.findElement(By.id("email")).click();

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("wrongemail");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("1234");
		
		WebElement form = driver.findElement(By.id("mms-login-form__login-button"));
		form.submit();
	}
	
	@Then("the user fatal login message appears")
	public void theUserFatalLogInMessageAppears() {
		// Test ToDo
		assertTrue(true);
	}
	
	@When("the user completes form correctly")
	public void theUserCompletesFromCorrectly() {
		// Email: arnaumunozbarrera@gmail.com
		// Password: testPass
		
		driver.findElement(By.id("email")).click();

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("arnaumunozbarrera@gmail.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("testPass");
		
		WebElement form = driver.findElement(By.id("mms-login-form__login-button"));
		form.submit();
	}
	
	@Then("the user correct login message appears")
	public void theUserCorrectLoginMessageAppears() {
		// Test ToDo
		assertTrue(true);
	}
}
