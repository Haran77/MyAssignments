package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPageAcc extends BaseClassAcc {

	/*
	 * public LoginPageAcc(ChromeDriver driver) { this.driver=driver; }
	 */
	@Given("Enter Username as {string}")
	public LoginPageAcc enterUname(String uname) {
		getDriver().findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	
	@Given("Enter password as {string}")
	public LoginPageAcc enterPwd(String pwd) {
		getDriver().findElement(By.id("password")).sendKeys(pwd);
		return this;
	}
	
	@When("Click on Login Button")
	public WelcomePageAcc loginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageAcc();
	}
}
