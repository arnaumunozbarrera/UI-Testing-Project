package steps;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EnterToSocialMedia {
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on instagram button")
	public void theUserClicksOnInstagramButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 6000);");
		// 600, document.body.scrollHeight
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[3]/footer/div[1]/div/div[2]/div[2]/div[1]")));

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[3]/footer/div[1]/div/div[2]/div[1]/div/div[2]/div/div/a[4]")).click();
	}
	
	@Then("instagram account appears")
	public void instagramAccountAppears(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/span")));

		WebElement instagramCookies = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div/div/div[1]/div[1]/div/div[1]/span"));
		assertTrue(instagramCookies != null);
	}
}
