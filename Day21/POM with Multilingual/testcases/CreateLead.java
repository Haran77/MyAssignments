package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.BaseClassAcc;
import pages.LoginPageAcc;

public class CreateLead extends BaseClassAcc{
	
	@BeforeTest
	public void setValue() {
		filename="ExcelData";
	}
	
	@Test(dataProvider="fetchData")
	public void createLeadFunctionality(String uname, String pwd, String compName, String fname, String lname) {
		
		LoginPageAcc lp=new LoginPageAcc();
		lp.enterUname(uname).enterPwd(pwd).loginButton().clickCRMSFALink().clickOnLeadsButton().LeadPage().enterCompanyname(compName).enterFirstname(fname).enterLastName(lname).clickCreateLeadButton().viewLead();
	}
}
