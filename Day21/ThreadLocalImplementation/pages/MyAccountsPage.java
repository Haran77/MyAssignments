package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;
import io.cucumber.java.en.When;

public class MyAccountsPage extends BaseClassAcc{

	/*
	 * public MyAccountsPage(ChromeDriver driver) { this.driver=driver; }
	 */

	@When("Click on Create account option")
	public CreateAccountPage createAccount() {
		getDriver().findElement(By.linkText("Create Account")).click();
		return new CreateAccountPage();
	}
	
}
