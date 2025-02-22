package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;

public class MyAccountsPage extends BaseClassAcc{

	public CreateAccountPage createAccount() {
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}
	
}
