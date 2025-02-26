package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassAcc;

public class LoginPageAcc extends BaseClassAcc {

	public LoginPageAcc(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPageAcc enterUname(String uname) {
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	
	public LoginPageAcc enterPwd(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	public WelcomePageAcc loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageAcc(driver);
	}
}
