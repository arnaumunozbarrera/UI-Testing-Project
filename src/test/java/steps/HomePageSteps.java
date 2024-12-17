package steps;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	static WebDriver driver;
	
	@Given("the user is in the index page")
	public static void theUserIsInTheIndexPage() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.mediamarkt.es/es");
		driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
	}
	
	@Then("the index page appears")
	public void theIndexPageAppears() {
		
		WebElement body = driver.findElement(By.id("root"));
		assertTrue(body != null);
		
		WebElement div1 = driver.findElement(By.id("mms-root-modal-portal"));
		assertTrue(div1 != null);
		
		WebElement div2 = driver.findElement(By.id("mms-app-header-portal"));
		assertTrue(div2 != null);
		
		WebElement div3 = driver.findElement(By.id("mms-app-root"));
		assertTrue(div3 != null);
		
		WebElement div4 = driver.findElement(By.id("mms-consent-portal-container"));
		assertTrue(div4 != null);
		
	}
	
	public static WebDriver getDriver() {
		if (driver == null) {
			theUserIsInTheIndexPage();
		}
		return driver;
	}
}
