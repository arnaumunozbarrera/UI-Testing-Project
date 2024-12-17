package steps;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddProductToCartSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user click on add to cart button")
	public void theUserClicksOnAddToCartButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[4]/div/div/div[3]/div")));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[4]/div/div/div[3]/div")).click();
	}
	
	@Then("cart display appears and contains product")
	public void theCartDisplayAppearsAndContainsProduct(){
		// Test ToDo
	}
	
	@When("the user click on go to cart button")
	public void theUserClicksOnGoToCartButton() {
		//btn /html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]/button[2]
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]/button[2]")));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]/button[2]")).click();
	}
	
	@Then("all cart info appears")
	public void allCartInforAppears() {
		// Test ToDo
	}
	
	@When("the user click on keep shopping button")
	public void theUserClickOnKeepShoppingButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]/button[1]")));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]/button[1]")).click();
	}
}
