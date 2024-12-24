package steps;

import static org.testng.AssertJUnit.assertEquals;


import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ChangeSettingSteps {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user goes to settings profile page")
	public void theUserGoesToSettingsProfilePage() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[4]/button")).click();
		
	}
	
	@When("the user goes to his profile")
	public void theUserGoesToHisProfile() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[4]/div/div/div/div/div[2]/div[1]/div[2]/div")));

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[4]/div/div/div/div/div[2]/div[2]/div/div/ul[1]/li[8]/a")).click();
	}
	
	@Then("settings profile page appears")
	public void settingsProfilePageAppears(){
		WebElement Profile = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div[2]/div/div[2]"));
		assertTrue(Profile != null);
	}
	
	@When("user changes profile name")
	public void userChangesProfileName() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div[2]/div/div[2]/h1")));
		
		//Editar información
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/div[3]/div[1]/article/div/div/div[2]/button")).click();
		
		// El cambio de genero
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/div[3]/div[1]/div/div[2]/div[1]/div/h3")));
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/div[3]/div[1]/div/div[2]/div[2]/div/div/form/div/div[1]/div/div/div/div/div/div[2]/div/div/label/span[1]")).click();
		
		//Confirmación de cambio
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div/div[2]/div[3]/div[1]/div/div[2]/div[4]/div[2]/button")).click();
	
	}
	
	@Then("the changes on profile message appears")
	public void theChangesOnProfileMessageAppears(){
		WebElement notification = driver.findElement(By.id("mms-notification-modal-portal"));
		assertTrue(notification != null);
	}
	
}
