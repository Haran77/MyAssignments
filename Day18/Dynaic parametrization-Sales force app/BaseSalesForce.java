package steps;

import java.time.Duration;

import org.openqa.selenium.By;
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

@BeforeMethod
public void preConditions() {
driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.get("https://login.salesforce.com/"); 

//Enter username, password and login into the application
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test@2025");
driver.findElement(By.xpath("//input[@id='Login']")).click();

//Click on the toggle element
wait = new WebDriverWait(driver, Duration.ofSeconds(40));
WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
toggle.click();

//Click on the view all option
wait = new WebDriverWait(driver, Duration.ofSeconds(40));
WebElement viewAll = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='al-menu-dropdown-list']/following::button"))); 
viewAll.click();

//Click on Sales option
wait = new WebDriverWait(driver, Duration.ofSeconds(40));
WebElement salesOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Manage your sales process')]"))); 
salesOption.click();

//Click on Accounts tab
wait = new WebDriverWait(driver, Duration.ofSeconds(40));
WebElement accountsTab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Accounts']/parent::a"))); 
driver.executeScript("arguments[0].click();", accountsTab);

//Click on New option
wait = new WebDriverWait(driver, Duration.ofSeconds(40));
WebElement newAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']"))); 
newAcc.click();
}

@AfterMethod
public void postConditions() {
//driver.close();
}
	}