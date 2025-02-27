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
		String propOfAccOption= prop.getProperty("ClickAccounts");
		getDriver().findElement(By.linkText(propOfAccOption)).click();
		return new MyAccountsPage();
	}

	@When("Click on Leads link")
	public LeadPage clickOnLeadsButton() {
		String propOfLeadOption= prop.getProperty("ClickLeads");
		getDriver().findElement(By.linkText(propOfLeadOption)).click();
          return new LeadPage();
}
	
}
