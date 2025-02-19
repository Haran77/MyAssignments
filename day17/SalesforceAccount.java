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
	
	@When("Enter username as dilip@testleaf.com")
	public void enter_username_as_dilip_testleaf_com() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dilip@testleaf.com");
	}

	@When("Enter password as {string}")
	public void enter_password_as_test(String password) {
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	}
	
	@When("Click on login option")
	public void click_on_login() {
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

	@When("Click on toggle menu button from left corner")
	public void click_on_toggle_menu_button_from_left_corner() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click();
	}

	@When("Click on View all")
	public void click_on_view_all() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement viewAll = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='al-menu-dropdown-list']/following::button"))); 
		viewAll.click();
	}

	@When("Click on Sales from App launcher")
	public void click_on_sales_from_app_launcher() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement salesOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(),'Manage your sales process')]"))); 
		salesOption.click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement accountsTab = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Accounts']/parent::a"))); 
		driver.executeScript("arguments[0].click();", accountsTab);
	}
	@When("Click on New button")
	public void click_on_new_button() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement newAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@title='New']"))); 
		newAcc.click();
	}

	@When("Enter Account name as Haranya")
	public void enter_account_name_as_haranya() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement accName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Account Name']/following::input)[1]"))); 
		accName.sendKeys("Haranya");
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
