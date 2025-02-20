package steps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceAccount extends BaseSalesForce {

	@When("Enter Account name as {string}")
	public void enter_account_name(String accountname) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement accName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Account Name']/following::input)[1]"))); 
		accName.sendKeys(accountname);
		//driver.findElement(By.xpath("//label[text()='Account Name']/following::input)[1]")).click();
	}

	@When("Select ownership as Public")
	public void select_ownership_as_public() {
        action = new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        
		WebElement ownership = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Ownership']"))); 
		js.executeScript("arguments[0].scrollIntoView(true);", ownership);

		WebElement ownershipOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Ownership']/following::span)[1]"))); 
		ownershipOption.click();
		
		WebElement publicOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Public']"))); 
		publicOption.click();		
	}

	@When("Click on Save")
	public void click_on_save() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		driver.findElement(By.xpath("(//div[@class='center-align-buttons']//li)[3]")).click();
	}

	@Then("Account should be created and verified")
	public void account_should_be_created_and_verified() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement account=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Account']")));
		String accountNameVerification = account.getText();
		System.out.println("Account name : "+accountNameVerification);
		
	}

}
