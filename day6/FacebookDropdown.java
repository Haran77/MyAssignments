package week2.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDropdown {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Haranya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Gunasekaran");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9876543210");
		driver.findElement(By.id("password_step_input")).sendKeys("Qwerty@!#123456");
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
		
		WebElement dateDd = driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(dateDd);
		dd1.selectByValue("16");
		
		WebElement monthDd = driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(monthDd);
		dd2.selectByValue("9");
		
		WebElement yearDd = driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(yearDd);
		dd3.selectByValue("1998");

	}

}
