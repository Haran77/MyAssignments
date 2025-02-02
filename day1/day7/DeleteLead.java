package week2.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9876512345");          //Passing the phone number of the respective lead
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click(); //clicking on Find leads button
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {    //Used Thread.sleep() with Try Catch block to wait till the page gets loaded
			e.printStackTrace();
		}
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();  //Click on the first row of the search result
		driver.findElement(By.className("subMenuButtonDangerous")).click();   //Delete the lead
		driver.findElement(By.linkText("Find Leads")).click(); 
		driver.findElement(By.xpath("(//input[@type='text'])[29]")).sendKeys("11089");  //Entering the lead number in the lead ID field
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();     //clicking on Find leads button
		driver.close();		
	}

}
