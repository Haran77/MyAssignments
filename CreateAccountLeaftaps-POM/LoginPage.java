package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;

public class LoginPage extends BaseClassAcc {

	public LoginPage enterUname() {
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		return this;
	}
	
	public LoginPage enterPwd() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		return this;
	}
	
	public WelcomePage loginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new WelcomePage();
	}
}
