import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/changesetting.feature", glue="steps")
public class ChangeSettingTest extends AbstractTestNGCucumberTests {

}
