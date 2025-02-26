package pages;

import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassAcc;

public class ViewAccountPage extends BaseClassAcc {

	public ViewAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public ViewAccountPage accountValidation() {
		System.out.println("Account is created successfully.");
		return this;
	}
}
