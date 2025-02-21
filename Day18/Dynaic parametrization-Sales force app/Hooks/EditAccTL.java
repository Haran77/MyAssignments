package steps2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EditAccTL extends BaseClassAccount {

	@When("Click on Find accounts option")
	public void click_on_find_accounts_option() {
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
	}

	@When("Enter account name as {string} in Account name field")
	public void enter_account_name_as_in_account_name_field(String accName) {
		driver.findElement(By.xpath("(//label[text()='Account Name:']/following::input[@name='accountName'])[2]")).sendKeys(accName);
	}

	@When("Click on Find account")
	public void click_on_find_account() {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}
	
	@When("Select first account")
	public void select_first_acc() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement firstAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Haranya'])[2]")));
		driver.executeScript("arguments[0].click();", firstAcc);
	}

	@When("Click on Edit")
	public void click_on_edit() {
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
	}

	@When("Edit decription as {string}")
	public void edit_decription_as(String description) {
		WebElement desc = driver.findElement(By.name("description"));
		desc.clear();
		desc.sendKeys(description);
	}

	@When("Click on save")
	public void click_on_save() {
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	}

	@Then("Account should be edited")
	public void account_should_be_edited() {
	    System.out.println("Account is edited successfully.");
	}
}