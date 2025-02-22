package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;

public class CreateAccountPage extends BaseClassAcc {

public CreateAccountPage accountName() {
	driver.findElement(By.id("accountName")).sendKeys("Veera"); 
	return this;
}

public CreateAccountPage descOption() {
	driver.findElement(By.name("description")).sendKeys("Senior Testing Associate");
	return this;
}

public ViewAccountPage createButton() {
	driver.findElement(By.className("smallSubmit")).click();
	return new ViewAccountPage();
}
}
