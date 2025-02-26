package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassAcc;

public class MyAccountsPage extends BaseClassAcc{

	public MyAccountsPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public CreateAccountPage createAccount() {
		driver.findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage(driver);
	}
	
}
