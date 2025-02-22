package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;

public class HomePage extends BaseClassAcc {
	
	public MyAccountsPage accountsOption() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountsPage();
	}

	
}
