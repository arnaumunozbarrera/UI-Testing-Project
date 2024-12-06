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

public class UserRegisterSteps {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on register")
	public void theUserClicksOnRegister() {

	}
	
	@Then("the user register form appears")
	public void theUserRegisterFormAppears(){
		// Test ToDo
	}
	
	@When("the user completes register form incorrectly")
	public void theUserCompletesRegisterFormIncorrectly() {
		
	}
	
	@When("the user completes register form correctly")
	public void theUserCompletesRegisterFromCorrectly() {
		
	}
	
	@Then("the user register message appears")
	public void theUserRegisterMessageAppears() {
		// Test ToDo
	}
}
