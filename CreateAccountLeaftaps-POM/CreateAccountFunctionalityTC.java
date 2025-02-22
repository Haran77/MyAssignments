package testcases;

import org.testng.annotations.Test;

import base.BaseClassAcc;
import pages.LoginPage;

public class CreateAccount extends BaseClassAcc {

	@Test
	public void createAccountFunctionality() {
		LoginPage lp=new LoginPage();
		lp.enterUname().enterPwd().loginButton().clickCRMSFALink().accountsOption().createAccount().accountName().descOption().createButton().accountValidation();
	}
}
