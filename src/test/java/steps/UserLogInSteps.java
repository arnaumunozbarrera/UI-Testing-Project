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

public class UserLogInSteps {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on user menu")
	public void theUserClicksOnMenu() {
		driver.findElement(By.xpath("//button[@type='button' and @aria-disabled='false' and @data-test='myaccount-dropdown-button']")).click();		
	}
	
	@Then("the lateral menu tab info appears")
	public void theLateralTabInfoAppears() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[4]/div/div/div/div/div[2]")));
		
		WebElement tab = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[4]/div/div/div/div/div[2]"));
		assertTrue(tab != null);
		
		String span = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[4]/div/div/div/div/div[2]/div[2]/div/div/a/span[2]")).getText();
		assertEquals(span, "Regístrate con tu Identificador miMediaMarkt");
	}
	
	@When("the user clicks on login")
	public void theUserClicksOnLogIn() {
		driver.findElement(By.id("myaccount-dropdown-login-button")).click();	
	}
	
	@Then("the user login form appears")
	public void theUserLogInFormAppears(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div")));
		
		WebElement form = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div"));
		assertTrue(form != null);
		
		String title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/form/h1")).getText();
		
		assertTrue(title != null);
		
		assertEquals(title, "¿Ya estás registrado?");
	}
	
	@When("the user completes form incorrectly")
	public void theUserCompletesFormIncorrectly() {
		driver.findElement(By.id("email")).click();

		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("wrongemail");
		
		driver.findElement(By.id("password")).click();

		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("1234");
		
		WebElement form = driver.findElement(By.id("mms-login-form__login-button"));
		form.submit();
	}
	
	@Then("the user fatal login message appears")
	public void theUserFatalLogInMessageAppears() {
				
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/p/span")));
		
		WebElement error = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/form/div[2]/div[1]/div[2]/p/span"));
		assertTrue(error != null);

		String errorMsg = error.getText();
		assertEquals(errorMsg, "Lamentablemente, ha habido un error en el inicio de sesión. Asegúrate de que estás utilizando la dirección de correo electrónico y la contraseña correctas.");	
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[2]")));
		
		WebElement correct = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[4]/button"));
		assertTrue(correct != null);

		String correctMsg = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[4]/button/p/span")).getText();
		assertEquals(correctMsg, "AM");
	}
}