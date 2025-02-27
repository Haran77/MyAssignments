package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassAcc;
import pages.LoginPageAcc;

public class CreateAccount extends BaseClassAcc {

	@BeforeTest
	public void setValue() {
		filename="ExcelDataAcc";
	}
	
	@Test(dataProvider="fetchData")
	public void createAccountFunctionality(String uname, String pwd, String accname, String desc) {
		LoginPageAcc lp=new LoginPageAcc();
		lp.enterUname(uname)
		.enterPwd(pwd)
		.loginButton()
		.clickCRMSFALink()
		.accountsOption()
		.createAccount()
		.accountName(accname)
		.descOption(desc)
		.createButton()
		.accountValidation();
	}
}
