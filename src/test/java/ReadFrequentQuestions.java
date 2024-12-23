import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/readfrequentquestions.feature", glue="steps")
public class ReadFrequentQuestions extends AbstractTestNGCucumberTests {

}
