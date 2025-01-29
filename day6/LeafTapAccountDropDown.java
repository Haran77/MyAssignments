package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapAccountDropDown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Haranya Amazon");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		  WebElement industryDropdown = driver.findElement(By.name("industryEnumId"));
		     
		     Select dd2=new Select(industryDropdown);
		     
		     dd2.selectByValue("IND_SOFTWARE");
		     
		  WebElement ownershipDd = driver.findElement(By.name("ownershipEnumId"));
		  
		     Select dd3=new Select(ownershipDd);
		     
		     dd3.selectByVisibleText("S-Corporation");
		     
		  WebElement sourceDd = driver.findElement(By.id("dataSourceId"));
		  
		     Select dd4=new Select(sourceDd);
		     
		     dd4.selectByValue("LEAD_EMPLOYEE");
		     
		  WebElement marketingDd = driver.findElement(By.id("marketingCampaignId"));
		  
		     Select dd5=new Select(marketingDd);
		     
		     dd5.selectByIndex(6);
		     
		  WebElement stateDd = driver.findElement(By.id("generalStateProvinceGeoId"));
		  
		     Select dd6=new Select(stateDd);
		     
		     dd6.selectByValue("TX");
		     
		  driver.findElement(By.className("smallSubmit")).click();

	}

}
