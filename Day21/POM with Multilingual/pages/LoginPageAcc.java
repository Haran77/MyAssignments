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
		String propOfUname=prop.getProperty("username");
		getDriver().findElement(By.id("username")).sendKeys(propOfUname);
		return this;
	}
	
	@Given("Enter password as {string}")
	public LoginPageAcc enterPwd(String pwd) {
		String propOfPwd=prop.getProperty("password");
		getDriver().findElement(By.id("password")).sendKeys(propOfPwd);
		return this;
	}
	
	@When("Click on Login Button")
	public WelcomePageAcc loginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
		return new WelcomePageAcc();
	}
}
