package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassAcc;

public class WelcomePageAcc extends BaseClassAcc {

	public WelcomePageAcc(ChromeDriver driver) {
		this.driver=driver;
	}

	public HomePageAcc clickCRMSFALink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
         return new HomePageAcc(driver);
	}
	
	public WelcomePageAcc viewWelcome() {
		System.out.println("Welcome page is landed successfully.");
		return this;
	}
	
	public LoginPageAcc logoutButton() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		return new LoginPageAcc(driver);
	}
}