package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;

public class WelcomePage extends BaseClassAcc{

	public HomePage clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
         return new HomePage();
	}
}
