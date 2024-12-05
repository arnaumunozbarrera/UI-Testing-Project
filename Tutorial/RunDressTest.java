import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/womendress.feature", glue="steps")
public class RunDressTest extends AbstractTestNGCucumberTests{

}
