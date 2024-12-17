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

public class SearchProductSteps {
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@When("the user clicks on search bar button")
	public void theUserClicksOnSearchBarButton() {
		driver.findElement(By.id("search-form")).click();
		
		WebElement search = driver.findElement(By.id("search-form"));
		search.clear();
		search.sendKeys("iphone 11");		
	}
	
	@When("the user clicks on submit product search")
	public void theUserClicksOnSubmitProductSearch() {
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/div[1]/header/div/div/div[1]/div[2]/div/div/form/div/div/div/button")).click();
	}
	
	@Then("product result list appears")
	public void theProductResultListAppears(){
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div")));
		
		WebElement list = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div"));
		assertTrue(list != null);
		
		WebElement title1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[1]/h1/div"));
		assertTrue(title1 != null);
		
		String title1Msg = title1.getText();
		assertTrue(title1Msg.contains("Resultados de la búsqueda para iphone 11"));
		
		WebElement filters = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/aside"));
		assertTrue(filters != null);
		
		WebElement title2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/aside/div/section/ul/li[1]/div[1]/button/span[1]/span"));
		String title2Msg = title2.getText();
		assertEquals(title2Msg, "Categoría");
		
		WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[2]/div/div[2]/div[1]/div/div/select/option[1]"));
		assertTrue(btn != null);
		
		String btnMsg = btn.getText();
		assertEquals(btnMsg, "Mejores resultados");
	}
	
	@When("the user clicks on product container")
	public void theUserClicksOnProductContainer() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='sc-8b815c14-0 jnuBey' and @color='#3a3a3a' and @font-family='default' and @spacing='base' and @font-size='[object Object]']")));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, 600);");
		// 600, document.body.scrollHeight
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/div[3]/div[2]/div/div/div/a")));

		driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/div[3]/div[2]/div/div/div/a")).click();
	}
	
	@Then("the product detail info appears")
	public void theProductDetailInfoAppears() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[1]")));
		
		WebElement wrapper = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[1]"));
		assertTrue(wrapper != null);
		
		WebElement title1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div[1]/div[1]/h1"));
		assertTrue(title1 != null);
		
		String title1Msg = title1.getText();
		assertEquals(title1Msg, "Móvil - APPLE iPhone 11, Negro, 64 GB, 4 GB RAM, 6,1 \", LCD,Anti-huellas, A13 Bionic, 3,310 mAh, iOS 13");
		
		WebElement price = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div/div/div/div[2]/div/span[1]"));
		assertTrue(price != null);
		
		String priceMsg = price.getText();
		assertEquals(priceMsg, "249,");
		
		WebElement price2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div/div/div/div[2]/div/div/span"));
		assertTrue(price2 != null);
		
		String price2Msg = price2.getText();
		assertEquals(price2Msg, "90");
		
		WebElement price3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[1]/div[2]/div[3]/div[1]/div[1]/div/div/div/div[2]/div/span[2]"));
		assertTrue(price3 != null);
		
		//String price3Msg = price3.getText();
		//assertEquals(price3Msg," €");
		
		WebElement btn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[4]/div/div/div[3]/div"));
		assertTrue(btn != null);
		
		WebElement btnTitle = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div/div[1]/div[4]/div/div/div[3]/div/button/span[1]"));
		String btnMsg = btnTitle.getText();
		assertEquals(btnMsg, "Añadir al carrito");
	}
}
