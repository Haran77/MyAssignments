package runner;

import base.BaseClassAcc;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/main/java/feature/CreateAccount.feature", glue="pages", monochrome=true, publish=true)
public class RunnerClass extends BaseClassAcc{

}