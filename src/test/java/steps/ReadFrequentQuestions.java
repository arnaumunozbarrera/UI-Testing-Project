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

public class ReadFrequentQuestions {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on sale your devices")
	public void theUserClicksOnSaleYourDevices() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[2]/div[1]/div/div/div[2]/div[2]/nav/div/ul[2]/li[7]/a")).click();

	}
	
	@Then("sale your devices page appears")
	public void saleYourDevicesPageAppears() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/section[1]/section[2]/section[3]/section/div/div/div[1]/h2")));
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/section[1]/section[2]/section[3]/section/div/div/div[1]/h2"));
		assertTrue(title != null);
	}
	
	@When("user clicks on how it works the rebuy of devices")
	public void userClicksOnHowItWorksTheRebuyOfDevices() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/section/section[2]/section[3]/section/div/div/div[2]/div/div/div[1]/a/div/div/div[2]/div/h3")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 3500);");
		// 600, document.body.scrollHeight
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("1")));

		driver.findElement(By.id("0")).click();
		driver.findElement(By.id("0")).click();
	}
	
	@Then("the answer appears")
	public void theAnswerAppears() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("acc-content-id-0")));
		
		WebElement answer = driver.findElement(By.id("acc-content-id-0"));
		assertTrue(answer != null);
	}
}
