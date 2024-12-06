import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/searchshop.feature", glue="steps")
public class SearchShopTest extends AbstractTestNGCucumberTests{

}
