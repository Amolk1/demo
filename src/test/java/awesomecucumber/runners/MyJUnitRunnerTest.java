
package awesomecucumber.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:test-output/cucumber-reports/cucumber-report.html",
                "pretty", "com.epam.reportportal.cucumber.StepReporter",
                //"pretty", "com.epam.reportportal.cucumber.ScenarioReporter",
                "rerun:target/failedrerun.txt"
        },
        glue = {"awesomecucumber"},
        features = "src/test/resources/awesomecucumber"
)
public class MyJUnitRunnerTest {
       }

