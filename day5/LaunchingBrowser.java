package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get(" https://www.facebook.com/");
driver.manage().window().maximize();
driver.findElement(By.id("email")).sendKeys("testleaf.2023@gail.com");
driver.findElement(By.id("pass")).sendKeys("Tuna@321");
driver.findElement(By.tagName("button")).click();
driver.findElement(By.linkText("Find your account and log in.")).click();
	}

}