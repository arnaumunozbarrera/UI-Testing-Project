package steps;

import static org.testng.Assert.assertEquals;
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

public class UserRegisterSteps {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on register")
	public void theUserClicksOnRegister() {
		driver.findElement(By.id("myaccount-dropdown-register-button")).click();		
	}
	
	@Then("the user register form appears")
	public void theUserRegisterFormAppears(){
		
		// Test ToDo
		WebElement form = driver.findElement(By.xpath("//*[@id=\"main-content\"]"));
		assertTrue(form != null);
		
		//String title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div[2]/form/h1")).getText();
		
		//assertTrue(title != null);
		
		//assertEquals(title, "¿Nuevo cliente?");
	}
	
	@When("the user completes register form incorrectly")
	public void theUserCompletesRegisterFormIncorrectly() {
		driver.findElement(By.id("email")).click();

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("wrongemail");
		
		WebElement form = driver.findElement(By.id("submit"));
		form.submit();
	}
	
	@Then("the user fatal register message appears")
	public void theUserFatalRegisterMessageAppears() {
		// Test ToDo
		WebElement error = driver.findElement(By.xpath(""));
		assertTrue(error != null);

		String errorMsg = error.getText();
		assertEquals(errorMsg, "");
	}
	
	@When("the user completes register form correctly")
	public void theUserCompletesRegisterFromCorrectly() {
		driver.findElement(By.id("email")).click();

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("arnaumunozbarrera@gmail.com");
		
		WebElement form = driver.findElement(By.id("submit"));
		form.submit();	
	}
	
	@Then("the user verification register message appears")
	public void theUserVerificationRegisterMessageAppears() {
		// Test ToDo
		WebElement verification = driver.findElement(By.xpath(""));
		assertTrue(verification != null);

		String verificationMsg = verification.getText();
		assertEquals(verificationMsg, "");
	}
}
