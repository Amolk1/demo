package awesomecucumber.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = { "awesomecucumber" },
        plugin = { "pretty",
                "html:target/cucumber/cucumber.html",
                "pretty", "com.epam.reportportal.cucumber.StepReporter",
                "rerun:target/failedrerun.txt"},
        monochrome =true,
        features = { "@target/failedrerun.txt" }
)
public class RerunFailedTests extends AbstractTestNGCucumberTests {

}
