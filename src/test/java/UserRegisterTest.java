import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/userregister.feature", glue="steps")
public class UserRegisterTest extends AbstractTestNGCucumberTests{

}
