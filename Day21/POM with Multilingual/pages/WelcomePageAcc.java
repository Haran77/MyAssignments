package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;
import io.cucumber.java.en.When;

public class WelcomePageAcc extends BaseClassAcc {

	/*
	 * public WelcomePageAcc(ChromeDriver driver) { this.driver=driver; }
	 */
	
	@When("Click on CRMSFA link")
	public HomePageAcc clickCRMSFALink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
         return new HomePageAcc();
	}
	
	public WelcomePageAcc viewWelcome() {
		System.out.println("Welcome page is landed successfully.");
		return this;
	}
	
	public LoginPageAcc logoutButton() {
		getDriver().findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new LoginPageAcc();
	}
}