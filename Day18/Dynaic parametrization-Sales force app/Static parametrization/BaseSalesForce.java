package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.java.en.When;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class BaseSalesForce extends AbstractTestNGCucumberTests{
	
public static ChromeDriver driver;
public static Actions action;
public static WebDriverWait wait;
public static JavascriptExecutor js;

@BeforeMethod
public void preConditions() {
driver=new ChromeDriver();
js = (JavascriptExecutor) driver;
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.get("https://login.salesforce.com/"); 

//Enter username, password and login into the application
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@2025");
driver.findElement(By.xpath("//input[@id='Login']")).click();
}

@AfterMethod
public void postConditions() {
//driver.close();
}
	}