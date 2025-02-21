package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClassLogin;
import steps.BaseSalesForce;
import steps2.HooksImplementation;

@CucumberOptions(features="src/main/java/feature/DeleteAccount.feature", glue="steps2", monochrome=true, publish=true)
public class RunnerClass extends AbstractTestNGCucumberTests{

}