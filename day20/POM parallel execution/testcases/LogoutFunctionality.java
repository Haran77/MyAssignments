package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.BaseClassAcc;
import pages.LoginPageAcc;

public class LogoutFunctionality extends BaseClassAcc{
	
	@Test
	public void createAccountFunctionality() {
		LoginPageAcc lp=new LoginPageAcc(driver);
		lp.enterUname().enterPwd().loginButton().viewWelcome().logoutButton();
}
}