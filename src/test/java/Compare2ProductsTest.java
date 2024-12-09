import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/compare2products.feature", glue="steps")
public class Compare2ProductsTest extends AbstractTestNGCucumberTests{

}
