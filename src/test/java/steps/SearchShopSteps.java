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

public class SearchShopSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on shop button menu")
	public void theUserClicksOnShopButtonMenu() {
		driver.findElement(By.xpath("//div[@class='sc-f524209-0 kZZfSV']")).click();		
	}
	
	@Then("the shop location tab info appears")
	public void theShopLocationTabInfoAppears() {
		WebElement tab = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]"));
		assertTrue(tab != null);
		
		WebElement div1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[1]"));
		assertTrue(div1 != null);
		
		String div1Msg = div1.getText();
		assertEquals(div1Msg, "Selecciona tu tienda");
		
		WebElement div2 = driver.findElement(By.xpath("		/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div/div/div[2]/p\r\n"
				+ ""));
		assertTrue(div2 != null);
		
		String div2Msg = div2.getText();
		assertEquals(div2Msg, "Introduce tu código postal o ciudad para ver las tiendas más cercanas. Esto te permitirá comprobar la disponibilidad del producto.");
	
		WebElement label = driver.findElement(By.id(":r0:-label"));
		assertTrue(label != null);
		
		String labelMsg = label.getText();
		assertEquals(labelMsg,"Buscar por código postal o ciudad");
	}
	
	@When("the user completes search by city")
	public void theUserCompletesSearchByCity() {
		driver.findElement(By.id(":r0:")).click();

		WebElement city = driver.findElement(By.id(":r0:"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", city);
	    
		city.clear();
		city.sendKeys("Sabadell");
		
		driver.findElement(By.xpath("//button[@class='sc-2c264fcb-1 pqlAH' and @type='button' and @aria-disabled='false' and @translate='no' and @aria-label='Buscar']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-bf62a61f-0 gPeytf sc-42541eed-1 ghVqvJ sc-e445213e-0 chGvKW' and @aria-disabled='false' and @mode='standard']")));
		
		driver.findElement(By.xpath("//div[@class='sc-bf62a61f-0 gPeytf sc-42541eed-1 ghVqvJ sc-e445213e-0 chGvKW' and @aria-disabled='false' and @mode='standard']")).click();
		
		driver.findElement(By.xpath("//button[@class='sc-2c264fcb-1 hlqBNA sc-e01dde25-7 eNyEPk' and @type='button' and @aria-disabled='false' and @translate='no' and @data-test='start-select-market']")).click();
	}
	
	@When("the user completes search by postal code")
	public void theUserCompletesSearchByPostalCode() {
		
		driver.findElement(By.id(":r0:")).click();

		WebElement city = driver.findElement(By.id(":r0:"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", city);
	    
		city.clear();
		city.sendKeys("08223");
		
		driver.findElement(By.xpath("//button[@class='sc-2c264fcb-1 pqlAH' and @type='button' and @aria-disabled='false' and @translate='no' and @aria-label='Buscar']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-bf62a61f-0 gPeytf sc-42541eed-1 ghVqvJ sc-e445213e-0 chGvKW' and @aria-disabled='false' and @mode='standard']")));
		
		driver.findElement(By.xpath("//div[@class='sc-bf62a61f-0 gPeytf sc-42541eed-1 ghVqvJ sc-e445213e-0 chGvKW' and @aria-disabled='false' and @mode='standard']")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[2]/button")).click();

	}
	
	@Then("the shop info appears")
	public void theShopInfoAppears(){
		String value = driver.findElement(By.id(":r0:")).getCssValue("value");
		
		if (value == "Sabadell")
		{
			WebElement result1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div"));
			assertTrue(result1 != null);
			
			WebElement title1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div/label/div/div/div[1]/h2"));
			assertTrue(title1 != null);
			
			String title1Msg = title1.getText();
			assertEquals(title1Msg, "MediaMarkt Barcelona - Sabadell");	
		}
		else if (value == "08223") 
		{
			WebElement result2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div"));
			assertTrue(result2 != null);
			
			WebElement title2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div/div/div/div/div/div/div[1]/div/div/label/div/div/div[1]/h2"));
			assertTrue(title2 != null);
			
			String title2Msg = title2.getText();
			assertEquals(title2Msg, "MediaMarkt Barcelona - Terrassa");
		}
	}
}
