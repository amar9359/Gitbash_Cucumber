package cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "src/test/java/features", 
		plugin = "json:target/jsonReports/Cucumber-report.json",
		glue = {"stepDefinations"}
//		monochrome = true, 
//		dryRun = true
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
