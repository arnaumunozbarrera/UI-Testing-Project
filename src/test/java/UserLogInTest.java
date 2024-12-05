import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/userlogin.feature", glue="steps")
public class UserLogInTest extends AbstractTestNGCucumberTests{

}
