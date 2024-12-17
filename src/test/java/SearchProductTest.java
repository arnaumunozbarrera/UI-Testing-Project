import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/searchproduct.feature", glue="steps")
public class SearchProductTest extends AbstractTestNGCucumberTests{

}
