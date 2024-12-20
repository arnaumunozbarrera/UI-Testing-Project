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

public class SearchProductByFilterSteps {
	//Clase que busca els productes segons els seguents filtres (millors resultats, més venut, novetats)
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on filter change button")
	public void theUserClicksOnFilterChangeButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[1]/h1")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 10);");
		// 600, document.body.scrollHeight
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[2]/div/div[2]/div[1]/div/div")));

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[2]/div/div[2]/div[1]/div/div")).click();
	}
	
	@When("the user changes to most saled products")
	public void theUserChangesToMostSaledProducts() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[2]/div/div[2]/div[1]/div/div/select/option[1]")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 1);");
		// 600, document.body.scrollHeight

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[2]/div/div[2]/div[1]/div/div/select/option[4]")).click();
		
	}
	
	@Then("most saled products result list appears")
	public void mostSaledProductsResultListAppears() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[1]/h1")));
		
		WebElement wrapper = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[2]/div/div[2]/div[1]/div/div/select/option[5]"));
		assertTrue(wrapper != null);
	}
	
}
