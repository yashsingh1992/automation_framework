package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
         plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        // plugin={"pretty", "html:reports/myreport.html"},
         features={"/Users/yashaswitester/IdeaProjects/untitled/src/test/features/testcase1.feature"},
         glue="stepDefinition",
         monochrome = true,
         dryRun = false

)
public class runnerFile {
}
