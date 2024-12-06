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

public class UserRegisterSteps {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on register")
	public void theUserClicksOnRegister() {
		driver.findElement(By.id("myaccount-dropdown-register-button")).click();		
	}
	
	@Then("the user register form appears")
	public void theUserRegisterFormAppears(){
		 WebElement form = driver.findElement(By.xpath(
			        "//form[@aria-label='Formulario de inscripción Paso 1 - Correo electrónico' " +
			        "and @data-test='mms-myacc-registration-email-form' and @method='post' and @novalidate='']"
			    ));
	    assertTrue(form != null);
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
		String msg = driver.findElement(By.xpath("//p[@font-family='default' and @color='#3a3a3a' "
				+ "and @font-size='xs' and @data-test='email__error']")).getText();
		assertTrue(msg.contains("Por favor, añade un correo electrónico válido."));		
	}
	
	@When("the user completes register form correctly")
	public void theUserCompletesRegisterFromCorrectly() {
		driver.findElement(By.id("email")).click();

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("peportinlopez@gmail.com");
		
		WebElement form = driver.findElement(By.id("submit"));
		form.submit();	
	}
	
	@Then("the user verification register message appears")
	public void theUserVerificationRegisterMessageAppears() {
		String msg = driver.findElement(By.xpath(
			    "//p[contains(@class, 'sc-8b815c14-0 jqNLmg') and @font-family='default' and @color='#3a3a3a' and @font-size='sm']"
			)).getText();
		assertTrue(msg.contains("Comprueba tu buzón de correo. Introduce el código de verificación de 6 dígitos enviado a"));
	}
}
