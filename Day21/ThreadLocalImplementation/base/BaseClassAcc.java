package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.LearnExcel;

public class BaseClassAcc extends AbstractTestNGCucumberTests{

private static final ThreadLocal<ChromeDriver> cDriver=new ThreadLocal<ChromeDriver>();

public void setDriver() {
	cDriver.set(new ChromeDriver());
}

public ChromeDriver getDriver() {
	return cDriver.get();
}

public String filename;
	
	@BeforeMethod
	public void preConditions() {
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().get("http://leaftaps.com/opentaps/control/main");
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
	
	@AfterMethod
	public void postConditions() {
		//getDriver().close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] sendData() throws IOException {
		return LearnExcel.readData(filename);
	}
}
