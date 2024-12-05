import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/usermenutab.feature", glue="steps")
public class UserMenuTabTest extends AbstractTestNGCucumberTests{

}
