import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/addproducttocart.feature", glue="steps")
public class AddProductToCartTest extends AbstractTestNGCucumberTests{

}
