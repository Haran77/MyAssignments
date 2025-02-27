package testcases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassAcc;
import pages.LoginPageAcc;

public class LogoutFunctionality extends BaseClassAcc{
	
	@BeforeTest
	public void setValue() {
		filename="ExcelData";
	}
	
	@Test(dataProvider="fetchData")
	public void logoutFunc(String uname, String pwd) {
		LoginPageAcc lp=new LoginPageAcc();
		lp.enterUname(uname).enterPwd(pwd).loginButton().viewWelcome().logoutButton();
}
}