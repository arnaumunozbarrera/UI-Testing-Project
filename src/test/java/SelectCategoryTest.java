import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/selectcategory.feature", glue="steps")
public class SelectCategoryTest extends AbstractTestNGCucumberTests{

}