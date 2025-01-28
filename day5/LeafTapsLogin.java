package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Amazon Development Center");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haranya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gunasekaran");
driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Senior Testing Associate");
driver.findElement(By.className("smallSubmit")).click();
driver.close();
	}

 }
 