package steps;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseSalesForce extends AbstractTestNGCucumberTests{
	
public static ChromeDriver driver;
public static Actions action;
public static WebDriverWait wait;

@BeforeMethod
public void preConditions() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://login.salesforce.com/");
}

@AfterMethod
public void postConditions() {
//driver.close();
}
	}