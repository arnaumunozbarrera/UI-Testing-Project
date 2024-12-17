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

public class SearchShopSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on shop button menu")
	public void theUserClicksOnShopButtonMenu() {
		//sc-f524209-0 kZZfSV
		driver.findElement(By.xpath("//div[@class='sc-f524209-0 kZZfSV']")).click();		

	}
	
	@Then("the shop location tab info appears")
	public void theShopLocationTabInfoAppears() {
		// Test ToDo
		assertTrue(true);
	}
	
	@When("the user completes search by city")
	public void theUserCompletesSearchByCity() {
		driver.findElement(By.id(":r0:")).click();

		WebElement city = driver.findElement(By.id(":r0:"));
		city.clear();
		city.sendKeys("Sabadell");
		
		driver.findElement(By.xpath("//button[@class='sc-2c264fcb-1 pqlAH' and @type='button' and @aria-disabled='false' and @translate='no' and @aria-label='Buscar']")).click();
	}
	
	@When("the user completes search by postal code")
	public void theUserCompletesSearchByPostalCode() {
		
		driver.findElement(By.id(":r0:")).click();

		WebElement city = driver.findElement(By.id(":r0:"));
		city.clear();
		city.sendKeys("08223");
		
		driver.findElement(By.xpath("//button[@class='sc-2c264fcb-1 pqlAH' and @type='button' and @aria-disabled='false' and @translate='no' and @aria-label='Buscar']")).click();

	}
	
	@Then("the shop info appears")
	public void theShopInfoAppears(){
		// Test ToDo
		assertTrue(true);
	}
}
