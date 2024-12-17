package steps;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration; // Importa la clase Duration


public class SearchProductSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on search bar button")
	public void theUserClicksOnSearchBarButton() {
		driver.findElement(By.id("search-form")).click();
		
		WebElement search = driver.findElement(By.id("search-form"));
		search.clear();
		search.sendKeys("ordenador");		
	}
	
	@When("the user clicks on submit product search")
	public void theUserClicksOnSubmitProductSearch() {
		driver.findElement(By.xpath("//button[@class='sc-2c264fcb-1 cgnsBc sc-d2a9f86e-0 chJTmY' and @type='button' and @aria-disabled='false' and @translate='no' and @height='48' and @width='48' and @aria-label='Busca en']")).click();
	}
	
	@Then("product result list appears")
	public void theProductResultListAppears(){
		// Test ToDo
		assertTrue(true);
	}
	
	@When("the user clicks on product container")
	public void theUserClicksOnProductContainer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='sc-8b815c14-0 jnuBey' and @color='#3a3a3a' and @font-family='default' and @spacing='base' and @font-size='[object Object]']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 600);");
		// 600, document.body.scrollHeight
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='sc-2fa46f1d-1 hHoKle sc-66851cef-0 dEaRKk' and @data-test='mms-product-list-item-link' and @href='/es/product/_pc-sobremesa-hp-m01-f3002ns-amd-ryzentm-3-5300g-8gb-ram-512gb-ssd-amd-radeontm-w11-h-negro-1560381.html' and @target='_self']")));

		driver.findElement(By.xpath("//a[@class='sc-2fa46f1d-1 hHoKle sc-66851cef-0 dEaRKk' and @data-test='mms-product-list-item-link' and @href='/es/product/_pc-sobremesa-hp-m01-f3002ns-amd-ryzentm-3-5300g-8gb-ram-512gb-ssd-amd-radeontm-w11-h-negro-1560381.html' and @target='_self']")).click();
	}
	
	@Then("the product detail info appears")
	public void theProductDetailInfoAppears() {
		// Test ToDo
		assertTrue(true);
	}
}
