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
	
	@When("the user changes to the best results")
	public void theUserChangesToTheBestResults() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[2]/div/div[2]/div[1]/div/div/select")).click();
	}
}
