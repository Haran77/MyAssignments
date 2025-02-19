package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClassLogin;
import steps.BaseSalesForce;

@CucumberOptions(features="src/main/java/feature/SalesforceAccount.feature", glue="steps", monochrome=true, publish=true)
public class RunnerClass extends BaseSalesForce{

}