package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassAcc;

public class LoginPageAcc extends BaseClassAcc {

	public LoginPageAcc(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPageAcc enterUname() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
	public LoginPageAcc enterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePageAcc loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageAcc(driver);
	}
}
