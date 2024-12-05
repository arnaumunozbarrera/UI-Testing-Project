package steps;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LateralTabSteps {
	WebDriver driver;
	
	@Given("the user is in the index page2")
	public void theUserIsInTheIndexPage() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.navigate().to("https://www.mediamarkt.es/es");
	}
	
	@When("the user clicks on menu")
	public void () {
		//driver.findElement(By.id("pwa-consent-layer-accept-all-button")).click();
	}
	
	@And("user accepted cookies")
	public void () {
		
	}
	
	@Then("the lateral tab info appears")
	public void () {
		//assertTrue(true);
	}
}
