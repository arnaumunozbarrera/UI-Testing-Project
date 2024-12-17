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

public class Compare2ProductsSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on compare button for product1")
	public void theUserClicksOnCompareButtonProd1() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[2]/div/div[2]/div[1]/div/div")));
	   
	   	WebElement checkbox = driver.findElement(By.id("srp-entry-point-a2c-108019386"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", checkbox);

	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	@When("the user clicks on compare button for product2")
	public void theUserClicksOnCompareButtonProd2() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("flyout-description")));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
			    By.xpath("//a[@data-test='mms-product-comparison-flyout-go-to' and contains(@href, 'product-comparison')]"), 
			    "Comparar ahora (1)"
			));
	   
	   	WebElement checkbox2 = driver.findElement(By.id("srp-entry-point-a2c-142752047"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", checkbox2);

	    js.executeScript("arguments[0].click();", checkbox2);
	}
	
	@Then("the compare now option appears")
	public void theCompareNowOptionAppears(){
		// Test ToDo
	}
	
	@When("the user clicks on compare now")
	public void theUserClicksOnCompareNow() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(
		    By.xpath("//a[@data-test='mms-product-comparison-flyout-go-to' and contains(@href, 'product-comparison')]"), 
		    "Comparar ahora (2)"
		));

	   	//WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside/div/div[1]/div/div[2]"));

	   	//JavascriptExecutor js = (JavascriptExecutor) driver;
	    //js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", btn);

	    //js.executeScript("arguments[0].click();", btn);
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside/div/div[1]/div/div[2]")).click();
	}
	
	@Then("the comparison between products appears")
	public void theComparisonBetweenProductsAppears() {
		// Test ToDo
	}
	
	@When("the user clicks on the exit comparison button")
	public void theUserClickOnTheExitComparisonButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/section/div[1]/div/div[1]")));
	    
	    //button    /html/body/div[1]/div[3]/main/section/div[4]/aside/div/div/button
		WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div[4]/aside/div/div/button"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", btn);

	    js.executeScript("arguments[0].click();", btn);
	}
	
	@When("the user clicks on confirm exit comparison")
	public void theUserClickOnConfirmExitComparison() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("mms-styled-modal-inner-wrapper")));
	    
		// button    /html/body/div[1]/div[1]/div/div[2]/div[4]/div[2]/button
	    
	    WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[4]/div[2]/button"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", btn);

	    js.executeScript("arguments[0].click();", btn);
		
	}
	
	@Then("previous product added appear")
	public void previousProductAddedAppear() {
		// Test ToDo
	}
}
