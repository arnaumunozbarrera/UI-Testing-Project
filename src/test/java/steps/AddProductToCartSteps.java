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

public class AddProductToCartSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user click on add to cart button")
	public void theUserClicksOnAddToCartButton() {

	}
	
	@Then("cart display appears and contains product")
	public void theCartDisplayAppearsAndContainsProduct(){
		// Test ToDo
	}
	
	@When("the user click on go to cart button")
	public void theUserClicksOnGoToCartButton() {
		
	}
	
	@Then("all cart info appears")
	public void allCartInforAppears() {
		// Test ToDo
	}
	
	@When("the user click on keep shopping button")
	public void theUserClickOnKeepShoppingButton() {
		
	}
}
