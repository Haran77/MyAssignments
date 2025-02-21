package steps2;

import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateAccTL extends BaseClassAccount{

	@When("Click on Create account option")
	public void click_on_create_account_option() {
		driver.findElement(By.linkText("Create Account")).click();
	}

	@When("Enter account name as {string}")
	public void enter_account_name_as(String accName) {
		driver.findElement(By.id("accountName")).sendKeys(accName); 
	}

	@When("Enter description as {string}")
	public void enter_description_as(String des) {
		driver.findElement(By.name("description")).sendKeys(des);
	}

	@When("Give create account")
	public void give_create_account() {
		driver.findElement(By.className("smallSubmit")).click();
	}

	@Then("Account should be created")
	public void account_should_be_created() {
	    System.out.println("Account is created successfully.");
	}
}
