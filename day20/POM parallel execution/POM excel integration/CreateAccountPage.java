package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.BaseClassAcc;

public class CreateAccountPage extends BaseClassAcc {

	public CreateAccountPage(ChromeDriver driver) {
		this.driver=driver;
	}

public CreateAccountPage accountName(String accname) {
	driver.findElement(By.id("accountName")).sendKeys(accname); 
	return this;
}

public CreateAccountPage descOption(String desc) {
	driver.findElement(By.name("description")).sendKeys(desc);
	return this;
}

public ViewAccountPage createButton() {
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewAccountPage(driver);
}
}
