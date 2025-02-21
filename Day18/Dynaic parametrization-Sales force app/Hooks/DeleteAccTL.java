package steps2;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DeleteAccTL extends BaseClassAccount{
	
	@When("Click Find accounts")
	public void click_find_accounts() {
		driver.findElement(By.xpath("//a[text()='Find Accounts']")).click();
	}
	
	@When("Enter Account name as {string}")
	public void enter_acc_name(String accName) {
		driver.findElement(By.xpath("(//label[text()='Account Name:']/following::input[@name='accountName'])[2]")).sendKeys(accName);
	}
	
	@When("Click on Find Account button")
	public void find_acc_button () {
		driver.findElement(By.xpath("//button[text()='Find Accounts']")).click();
	}
	
	@When("Select first acc")
	public void select_first_acc() {	
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement firstAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Haranya']")));
		driver.executeScript("arguments[0].click();", firstAcc);
	}
	
	@When("Click on Deactivate the account")
	public void deactivate_account () {
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	}
	
	@When("Accept the alert")
	public void alert_accept () {
		Alert alert= driver.switchTo().alert();
		alert.accept();
	}
	
	@Then("Account should be deactivated")
	public void acc_should_deactivate() {
		driver.findElement(By.xpath("")).click();
	}
}
