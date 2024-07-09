package TestRunnerFile;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = ("C:\\Users\\DELL\\eclipse-workspace\\Cucumber\\src\\test\\featurefile"),
		glue = "StepDefination",
		plugin = "html:target/reports/test result.html"
		
		
		)

public class TestRunner {

}
