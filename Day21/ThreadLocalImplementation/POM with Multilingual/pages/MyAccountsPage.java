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
		String propOfCreateAcc= prop.getProperty("ClickCreateAccount");
		getDriver().findElement(By.partialLinkText(propOfCreateAcc)).click();
		return new CreateAccountPage();
	}
	
}
