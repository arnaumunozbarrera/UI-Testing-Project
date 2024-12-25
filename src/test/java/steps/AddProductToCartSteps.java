package steps;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[4]/div/div/div[3]/div")));
				
		WebElement checkbox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[4]/div/div/div[3]/div"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[4]/div/div/div[3]/div/button")));
			
		WebElement checkbox2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[4]/div/div/div[3]/div/button"));
		js.executeScript("arguments[0].click();", checkbox2);

	}
	
	@Then("cart display appears and contains product")
	public void theCartDisplayAppearsAndContainsProduct(){
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[2]/div/div[2]/div[1]")));
		
		WebElement tab = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]"));
		assertTrue(tab != null);
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[1]/div/div/h3"));
		assertTrue(title != null);
		
		assertEquals(title.getText(),"Su producto fue añadido con éxito al carrito");
		
		WebElement more = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[2]/div/div[2]/div[1]"));
		assertTrue(more != null);
		
		assertEquals(more.getText(), "También puede interesarte");
	}
	
	@When("the user click on go to cart button")
	public void theUserClicksOnGoToCartButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]")));
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]/button[2]")).click();
	}
	
	@Then("all cart info appears")
	public void allCartInforAppears() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("				/html/body/div[1]/div[3]/main/div[2]/div[1]/div/div/div/div[1]/div[2]/div\r\n"
				+ "")));
		
		WebElement title = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div[1]/div/div/div/div[1]/div[2]/h2"));
		
		assertTrue(title != null);
		
		assertEquals(title.getText(), "Carrito");
		
		WebElement subtitle = driver.findElement(By.xpath("				/html/body/div[1]/div[3]/main/div[2]/div[1]/div/div/div/div[1]/div[2]/div\r\n"
				+ ""));
		
		assertTrue(subtitle != null);
		
		assertEquals(subtitle.getText(), "Los productos de la cesta de la compra no están reservados");
		
		WebElement resum = driver.findElement(By.xpath("		/html/body/div[1]/div[3]/main/div[2]/div[1]/div/div/div/div[1]/div[8]/div/div/div/div[1]/h3\r\n"
				+ ""));
		
		assertTrue(resum != null);
		
		assertEquals(resum.getText(), "Resumen");
		
		WebElement products = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[2]/div[1]/div/div/div/div[1]/div[5]/div/div/div[1]/div"));
		assertTrue(products != null);
	}
	
	@When("the user click on keep shopping button")
	public void theUserClickOnKeepShoppingButton() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]")));

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[4]/div[2]/div[3]/div[2]/button[1]")).click();

	}
}
