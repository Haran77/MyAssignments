package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassAcc;

public class HomePageAcc extends BaseClassAcc {

	public HomePageAcc(ChromeDriver driver) {
		this.driver=driver;
	}
	
	public MyAccountsPage accountsOption() {
		driver.findElement(By.linkText("Accounts")).click();
		return new MyAccountsPage(driver);
	}

	
}
