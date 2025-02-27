package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;
import io.cucumber.java.en.When;

public class CreateLeadPage extends BaseClassAcc {
	
	/*
	 * public CreateLeadPage(ChromeDriver driver) { this.driver=driver; }
	 */

	@When("Enter company name as {string}")
	public CreateLeadPage enterCompanyname(String compName) {	
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys(compName);
	      return this;
	}
	
	@When("Enter first name as {string}")
	public CreateLeadPage enterFirstname(String fname) {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
         return this;
	}
	
	@When("Enter last name as {string}")
	public CreateLeadPage enterLastName(String lname) {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
          return this;
	}
	
	@When("Click on create lead button")
	public ViewPage clickCreateLeadButton() {
		getDriver().findElement(By.name("submitButton")).click();
        return new ViewPage();
	}

}
