package week2.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v115.browser.Browser;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Amazon");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Haranya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Ram");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Haran");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Software Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Senior software testing associate");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("haranyagunasekaran@gmail.com");
		
		WebElement stateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dd1=new Select(stateProvince);
		dd1.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.xpath("(//a[@class='subMenuButton'])[3]")).click();
		WebElement descriptionBox = driver.findElement(By.id("updateLeadForm_description"));
		descriptionBox.clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Manual tester");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		
		String titleOfPage=driver.getTitle();
		System.out.println("Title: "+ titleOfPage);
		
	    driver.close();

	}

}
