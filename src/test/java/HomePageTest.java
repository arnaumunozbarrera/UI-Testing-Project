import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/homepage.feature", glue="steps")
public class HomePageTest extends AbstractTestNGCucumberTests{

}
