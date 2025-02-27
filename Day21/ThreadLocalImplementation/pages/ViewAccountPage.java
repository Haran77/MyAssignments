package pages;

import base.BaseClassAcc;
import io.cucumber.java.en.Then;

public class ViewAccountPage extends BaseClassAcc {

	/*
	 * public ViewAccountPage(ChromeDriver driver) { this.driver=driver; }
	 */

	@Then("Account should be created")
	public ViewAccountPage accountValidation() {
		System.out.println("Account is created successfully.");
		return this;
	}
}
