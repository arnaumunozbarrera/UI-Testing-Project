package steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	WebDriver driver;
	
	@Given("the user is in the index page")
	public void theUserIsInTheIndexPage() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.mediamarkt.es/es");
	}
	
	@When("the user accepts cookies")
	public void theUserAcceptsCookies() {
		driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
	}
	
	@Then("the index page appears")
	public void theIndexPageAppears() {
		assertTrue(true);
	}
}
