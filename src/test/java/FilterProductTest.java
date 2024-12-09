import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/filterproduct.feature", glue="steps")
public class FilterProductTest extends AbstractTestNGCucumberTests{

}
