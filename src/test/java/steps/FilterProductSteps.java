package steps;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.Assert.assertTrue;

import java.sql.DriverManager;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.time.Duration;

public class FilterProductSteps {
	// Classe que testeja el filtres que apareixen a la pàgina web a la part lateral esquerra pels productes cercats
	
	WebDriver driver = HomePageSteps.getDriver();
	
	@Then("the product result list1 appears")
	public void productResultList1Appears() {
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
	
	@When("the user clicks on filter1 button")
	public void theUserClicksOnFilter1Button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(12)); 
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("facet-Categoría-5")));

		//driver.findElement(By.id("Reacondicionado-promotions")).click();
		WebElement checkbox = driver.findElement(By.id("Reacondicionado-promotions"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", checkbox);

	}
	
	@When("the user clicks on filter2 button")
	public void theUserClicksOnFilter2Button() {
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//button[@class='sc-dc935540-0 iWdMCq' and @aria-label='Quitar filtro Campañas destacadas: Reacondicionado' and @title='Quitar filtro Campañas destacadas: Reacondicionado' and @data-test='mms-clear-filter']")
	    ));
	   
	   	WebElement checkbox = driver.findElement(By.id("A_prueba_de_salpicaduras-specialty"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", checkbox);

	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	@When("the user clicks on filter3 button")
	public void theUserClicksOnFilter3Button() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
	    wait.until(ExpectedConditions.visibilityOfElementLocated(
	        By.xpath("//button[@class='sc-dc935540-0 iWdMCq' and @aria-label='Quitar filtro Especificaciones: A prueba de salpicaduras' and @title='Quitar filtro Especificaciones: A prueba de salpicaduras' and @data-test='mms-clear-filter']")
	    ));
	   
	   	WebElement checkbox = driver.findElement(By.id("MediaMarkt-marketplace"));

	   	JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView({behavior: 'smooth', block: 'center'});", checkbox);

	    js.executeScript("arguments[0].click();", checkbox);
	}
	
	@Then("the new product result list appears")
	public void theNewProductResultListAppears(){
		WebElement title1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/section/div[1]/h1/div"));
		assertTrue(title1 != null);
		
		String title1Msg = title1.getText();
		assertTrue(title1Msg.contains("1 Resultado de la búsqueda para iphone 11"));
		
		WebElement filter1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/aside/div/section/ul/li[2]/div[2]/div/div/div/div/div[1]/div/label/p"));
		assertTrue(filter1 != null);
		
		assertEquals(filter1.getText(), "Reacondicionado (1)");
		
		WebElement filter2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/aside/div/section/ul/li[3]/div[2]/div/div/div/div/div[1]/div/label/p"));
		assertTrue(filter2 != null);
		
		assertEquals(filter2.getText(),"A prueba de salpicaduras (1)");
		
		WebElement filter3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/aside/div/section/ul/li[4]/div[2]/div/div/div/div/div/div/label/p"));
		assertTrue(filter3 != null);
		
		assertEquals(filter3.getText(), "MediaMarkt (1)");
		
		WebElement btn1 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/div[1]/aside/button[2]"));
		assertTrue(btn1 != null);
		
		String btn1Msg = btn1.getText();
		assertEquals(btn1Msg, "Campañas destacadas: Reacondicionado");
		
		WebElement btn2 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/div[1]/aside/button[3]"));
		assertTrue(btn2 != null);
		
		String btn2Msg = btn2.getText();
		assertEquals(btn2Msg, "Especificaciones: A prueba de salpicaduras");
		
		WebElement btn3 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/div[1]/aside/button[4]"));
		assertTrue(btn3 != null);
		
		String btn3Msg = btn3.getText();
		assertEquals(btn3Msg, "Vendedor: MediaMarkt");	
		
		WebElement btn4 = driver.findElement(By.xpath("/html/body/div[1]/div[3]/main/div[1]/div/div/div/div[1]/aside/button[1]"));
		assertTrue(btn4 != null);
		
		String btn4Msg = btn4.getText();
		assertEquals(btn4Msg, "Borrar todo");	
	}
}
