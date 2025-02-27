package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;
import io.cucumber.java.en.When;

public class HomePageAcc extends BaseClassAcc {

	/*
	 * public HomePageAcc(ChromeDriver driver) { this.driver=driver; }
	 */
	
	@When("Click on Accounts option")
	public MyAccountsPage accountsOption() {
		getDriver().findElement(By.linkText("Accounts")).click();
		return new MyAccountsPage();
	}

	
}
