package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;
import io.cucumber.java.en.When;

public class LeadPage extends BaseClassAcc {

	/*
	 * public LeadPage(ChromeDriver driver) { this.driver=driver; }
	 */
	
@When("Click on CreateLead link")
public CreateLeadPage LeadPage() {
	String propOfCreateLead= prop.getProperty("ClickCreateLead");
	getDriver().findElement(By.partialLinkText(propOfCreateLead)).click();
    return new CreateLeadPage();
}
}