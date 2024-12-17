package steps;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

public class FilterProductSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@Then("the product result list1 appears")
	public void productResultList1Appears() {
		// Test ToDo
		assertTrue(true);
	}
	
	@When("the user clicks on filter1 button")
	public void theUserClicksOnFilter1Button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facet-Categoría-16")));

		//driver.findElement(By.id("Reacondicionado-promotions")).click();
		WebElement checkbox = driver.findElement(By.id("Reacondicionado-promotions"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);

	}
	
	@When("the user clicks on filter2 button")
	public void theUserClicksOnFilter2Button() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//button[@class='sc-dc935540-0 iWdMCq' and @aria-label='Quitar filtro Campañas destacadas: Reacondicionado' and @title='Quitar filtro Campañas destacadas: Reacondicionado' and @data-test='mms-clear-filter']")
	    ));
	   
	   	WebElement checkbox = driver.findElement(By.id("APPLE-brand"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", checkbox);

	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	@When("the user clicks on filter3 button")
	public void theUserClicksOnFilter3Button() {
		//driver.findElement(By.id("HP-brand"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//button[@class='sc-dc935540-0 iWdMCq' and @aria-label='Quitar filtro Marca: APPLE' and @title='Quitar filtro Marca: APPLE' and @data-test='mms-clear-filter']")
	    ));
	   
	   	WebElement checkbox = driver.findElement(By.id("HP-brand"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", checkbox);

	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	@When("the user clicks on filter4 button")
	public void theUserClicksOnFilter4Button() {
		//driver.findElement(By.id("SSD-specialty"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//button[@class='sc-dc935540-0 iWdMCq' and @aria-label='Quitar filtro Marca: HP' and @title='Quitar filtro Marca: HP' and @data-test='mms-clear-filter']")
	    ));
	   
	   	WebElement checkbox = driver.findElement(By.id("SSD-specialty"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", checkbox);

	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	@When("the user clicks on filter5 button")
	public void theUserClicksOnFilter5Button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//button[@class='sc-dc935540-0 iWdMCq' and @aria-label='Quitar filtro Especificaciones: SSD' and @title='Quitar filtro Especificaciones: SSD' and @data-test='mms-clear-filter']")
	    ));
	   
	   	WebElement slider = driver.findElement(By.id("acc-content-id-facet-Precio-1"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", slider);

	    WebElement to = driver.findElement(By.id("max"));
	    //driver.findElement(By.id("min")).click();
	    to.sendKeys(Keys.CONTROL + "a");
	    to.sendKeys(Keys.BACK_SPACE);
	    to.sendKeys("2000" + Keys.ENTER);
	}
	
	@Then("the new product result list appears")
	public void theNewProductResultListAppears(){
		// Test ToDo
		assertTrue(true);
	}
}
