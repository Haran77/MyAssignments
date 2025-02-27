package pages;

import base.BaseClassAcc;
import io.cucumber.java.en.Then;

public class ViewPage extends BaseClassAcc {

	/*
	 * public ViewPage(ChromeDriver driver) { this.driver=driver; }
	 */
	
	@Then("Lead should be created")
	public void viewLead() {
		System.out.println("Lead is created successfully.");
	}
}
