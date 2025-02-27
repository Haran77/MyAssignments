package pages;

import org.openqa.selenium.By;

import base.BaseClassAcc;
import io.cucumber.java.en.When;

public class CreateAccountPage extends BaseClassAcc {

	/*
	 * public CreateAccountPage(ChromeDriver driver) { this.driver=driver; }
	 */

@When("Enter account name as {string}")
public CreateAccountPage accountName(String accname) {
	getDriver().findElement(By.id("accountName")).sendKeys(accname); 
	return this;
}

@When("Enter description as {string}")
public CreateAccountPage descOption(String desc) {
	getDriver().findElement(By.name("description")).sendKeys(desc);
	return this;
}

@When("Give create account")
public ViewAccountPage createButton() {
	getDriver().findElement(By.className("smallSubmit")).click();
	return new ViewAccountPage();
}
}
