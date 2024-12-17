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
		WebElement compareNav = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside/div"));
		assertTrue(compareNav != null);
		
		WebElement txt = driver.findElement(By.id("flyout-description"));
		assertTrue(txt != null);
		
		assertEquals(txt.getText(), "2 de 3 productos se encuentran en la lista de comparación");
		
		WebElement opt1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside/div/div[1]/div/div[1]/ul/li[1]/div/a/div/span"));
		assertTrue(opt1 != null);
		
		assertEquals(opt1.getText(), "1. Móvil - APPLE iPhone 11, Blanco, 64 GB, 4 GB RAM, 6,1 \", LCD,Anti-huellas, A13 Bionic, 3110 mAh, iOS 13");
		
		WebElement opt2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside/div/div[1]/div/div[1]/ul/li[2]/div/a/div/span"));
		assertTrue(opt2 != null);
		
		assertEquals(opt2.getText(), "2. Móvil - APPLE iPhone 11, Negro, 128 GB, 4 GB RAM, 6,1 \", Flüssiges Retina,Recubrimiento oleofóbico,Anti-huellas, A13 Bionic, iOS 13");
	
		//WebElement recomendations = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside/div/div[1]/div/div[1]/button/span"));
		//assertTrue(recomendations != null);
		
		//assertEquals(recomendations.getText(), "Recomendaciones");
		
		WebElement buyNow = driver.findElement(By.xpath("/html/body/div[1]/div[3]/aside/div/div[1]/div/div[2]/a"));
		assertTrue(buyNow != null);
		
		assertEquals(buyNow.getText(), "Comparar ahora (2)");
		
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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/section")));
	    
		
		WebElement comparison = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section"));
		assertTrue(comparison != null);
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div[1]/div/div[1]/h1"));
		assertTrue(title != null);
		
		assertEquals(title.getText(), "Comparación de productos");
		
		WebElement btn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div[1]/div/div[2]/div/div[1]/div/button/p"));
		assertTrue(btn1 != null);
		
		assertEquals(btn1.getText(), "Buscar");
		
		WebElement btn2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div[1]/div/div[2]/div/div[2]/button/p"));
		assertTrue(btn2 != null);
		
		assertEquals(btn2.getText(), "Filtrar");
		
		WebElement mainCarac = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div[4]/div[1]/div/section/ul/li[1]/div[1]/button/span[1]/h2"));
		assertTrue(mainCarac != null);
		
		assertEquals(mainCarac.getText(), "Características principales");
		
		WebElement comparisonNav = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div[4]/aside/div"));
		assertTrue(comparisonNav != null);
		
		WebElement comparisonBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div[4]/aside/div/div/button"));
		assertTrue(comparisonBtn != null);
		
		assertEquals(comparisonBtn.getText(), "Salir de la comparación");
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
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/section/div/div/div/div/h2")));
	   
		WebElement mainDiv = driver.findElement(By.id("main-content"));
		assertTrue(mainDiv != null);
		
		WebElement msg1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div/div/div/div/h2"));
		assertTrue(msg1 != null);
		
		assertEquals(msg1.getText(), "No hay productos disponibles para comparar");
		
		WebElement msg2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div/div/div/div/p"));
		assertTrue(msg2 != null);
		
		assertEquals(msg2.getText(), "Aquí se mostrarán hasta 3 productos que hayas añadido previamente.");
		
		WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section/div/div/div/div/a"));
		assertTrue(btn != null);
		
		assertEquals(btn.getText(), "Buscar productos interesantes");
	}
}
