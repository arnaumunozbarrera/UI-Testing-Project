package steps;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/form/h1")));
		
		WebElement form = driver.findElement(By.xpath("//*[@id=\"main-content\"]"));
		assertTrue(form != null);
		
		String title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/form/h1")).getText();
		assertTrue(title != null);
		
		assertEquals(title, "¿Nuevo cliente?");
	}
	
	@When("the user completes register form incorrectly")
	public void theUserCompletesRegisterFormIncorrectly() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		driver.findElement(By.id("email")).click();

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("wrongemail");
		
		WebElement form = driver.findElement(By.id("submit"));
		form.submit();
	}
	
	@Then("the user fatal register message appears")
	public void theUserFatalRegisterMessageAppears() {
		WebElement error = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/form/div[2]/div/div[2]/div/div[2]/p"));
		assertTrue(error != null);

		String errorMsg = error.getText();
		assertEquals(errorMsg, "Por favor, añade un correo electrónico válido.");
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div[2]/form/p")));
		
		WebElement verification1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div[2]/form/p"));
		assertTrue(verification1 != null);

		String verification1Msg = verification1.getText();
		assertTrue(verification1Msg.contains("Comprueba tu buzón de correo. Introduce el código de verificación de 6 dígitos enviado a "));
		
		WebElement verification2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div[2]/form/p/span"));
		assertTrue(verification2 != null);

		String verification2Msg = verification2.getText();
		assertEquals(verification2Msg, "arnaumunozbarrera@gmail.com");
		
		WebElement verification3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div[2]/form/div[2]/div/label"));
		assertTrue(verification3 != null);

		String verification3Msg = verification3.getText();
		assertEquals(verification3Msg, "Introduce el código de 6 dígitos");
		
		WebElement btn = driver.findElement(By.xpath("//*[@id=\"submit\"]"));
		assertTrue(btn != null);

		String btnMsg = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div[2]/form/div[3]/button/span[1]")).getText();
		assertEquals(btnMsg, "Enviar");
		
	}
}
