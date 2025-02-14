package week4.day15;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseDynamicParameter {

	public ChromeDriver driver;   

	@Parameters({"url", "username", "password"})          //Parameters annotation which has same names from xml file
	@BeforeMethod                                         //Using @BeforeMethod annotation to execute before test case
	public void preConditions(String URL, String uName, String Pswd) {
		driver=new ChromeDriver();
		driver.get(URL);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(uName);
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pswd);
		driver.findElement(By.xpath("//input[@id='Login']")).click();
		}

	@AfterMethod
	public void postConditions() {
		driver.close();
	}
}
