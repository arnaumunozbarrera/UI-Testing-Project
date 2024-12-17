import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/searchproductbyfilter.feature", glue="steps")
public class SearchProductByFilterTest extends AbstractTestNGCucumberTests {
}
