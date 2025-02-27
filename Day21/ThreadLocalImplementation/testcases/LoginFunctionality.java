package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassAcc;
import pages.LoginPageAcc;

public class LoginFunctionality extends BaseClassAcc{
	
	@BeforeTest
	public void setValue() {
		filename="ExcelData";
	}
	
	@Test(dataProvider="fetchData")
	public void loginFunc(String uname, String pwd) {
		LoginPageAcc lp=new LoginPageAcc();
		lp.enterUname(uname).enterPwd(pwd).loginButton().viewWelcome();
}
}