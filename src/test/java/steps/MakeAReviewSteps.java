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

public class MakeAReviewSteps  {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on product reviews button")
	public void theUserClicksOnProductReviewButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div[1]/div[1]/h1")));

		driver.findElement(By.id("tab-reviews")).click();
	}

	@When("the user clicks on make a review button")
	public void theUserClicksOnMakeAReviewButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[2]/div/div/div/div[2]/div[6]/div/div/div/div/div[1]/div[2]/section/ul/li[1]/div[1]/button/span[1]/h2")));

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[2]/div/div/div/div[2]/div[6]/div/div/div/div/div[1]/div[1]/div/button")).click();
	}
	
	@Then("the product form review appears")
	public void theProductFormReviewAppears(){
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div/h3"));
		assertTrue(element != null);
	}
	
	@When("the user fill out the form")
	public void theUserFillOutTheForm() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[1]/div/h3")));

		//Puntua el producte amb 4 estrelles
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/form/div[1]/div/div[1]/label[4]")).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 600);");
		// 600, document.body.scrollHeight
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("comment")));

		//Introdueix el títol de la reseña
		WebElement title = driver.findElement(By.id("title"));
		title.clear();
		title.sendKeys("Iphone de calidad");
		
		//Introdueix la opinió
		WebElement opinion = driver.findElement(By.id("comment"));
		opinion.clear();
		opinion.sendKeys("iphone de fiable y de calidad");
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollTo(0, 600);");
		// 600, document.body.scrollHeight
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
		
		//Introdueix l'apodo
		WebElement nickname = driver.findElement(By.id("nickname"));
		nickname.clear();
		nickname.sendKeys("Jose");
		
		//Introdueix correu
		WebElement email = driver.findElement(By.id("email"));
		email.clear();
		email.sendKeys("peportinlopez@gmail.com");
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[2]/div[2]/div/div/div/form/button[3]")).click();
	}
	
	@Then("the review appears")
	public void theReviewAppears(){
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div"));
		assertTrue(element != null);
	}
}

