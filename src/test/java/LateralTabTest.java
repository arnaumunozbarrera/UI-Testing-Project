import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/lateraltab.feature", glue="steps")
public class LateralTabTest extends AbstractTestNGCucumberTests{

}