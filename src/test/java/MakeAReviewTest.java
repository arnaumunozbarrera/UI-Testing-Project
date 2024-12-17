import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/makeareview.feature", glue="steps")
public class MakeAReviewTest extends AbstractTestNGCucumberTests {

}
