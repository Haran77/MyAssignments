package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import utils.LearnExcel;

public class BaseClassAcc extends AbstractTestNGCucumberTests{

//Runs with encapsulation concept (POM with cucumber)
private static final ThreadLocal<ChromeDriver> cDriver=new ThreadLocal<ChromeDriver>();

//A pre-defined java class for loading the file 
public static Properties prop;

public void setDriver() {
	cDriver.set(new ChromeDriver());
}

public ChromeDriver getDriver() {
	return cDriver.get();
}

public String filename;
	
	@BeforeMethod
	public void preConditions() throws IOException {
		
		//To locate the file in the path, to load the file and to pass the file to the property class
		FileInputStream fis=new FileInputStream("src/main/resources/fr.properties");
		prop=new Properties();
		prop.load(fis);
		
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
