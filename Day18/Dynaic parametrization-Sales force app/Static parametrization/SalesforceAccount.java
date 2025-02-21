package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SalesforceAccount extends BaseSalesForce {

	@When("Click on toggle icon")
	public void click_on_toggle_icon() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement toggle = driver.findElement(By.xpath("//div[@class='slds-icon-waffle']"));
		toggle.click(); 
	}
	
	@When("Select View all option")
	public void view_all_option() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement viewAll = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='al-menu-dropdown-list']/following::button"))); 
		viewAll.click();
	}

	@When("Select Accounts option")
	public void select_accounts_option() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		JavascriptExecutor js = (JavascriptExecutor) driver;	        
		WebElement accountsOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Accounts']"))); 
		js.executeScript("arguments[0].scrollIntoView(true);", accountsOption);
		accountsOption.click();
	}

	@When("Search for account")
	public void search_for_account() throws InterruptedException {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement searchBar = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(text(),'Search')]"))); 
		Thread.sleep(2000);
		driver.executeScript("arguments[0].click();", searchBar);
		searchBar.sendKeys("Har");
	}
	
	@When("Select first account")
	public void select_first_acc() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement firstAcc = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Account'])[1]"))); 
		driver.executeScript("arguments[0].click();", firstAcc);
	}

	@When("Click the dropdown icon")
	public void click_the_dropdown_icon() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Show more actions']/parent::button"))); 
		dropDown.click();
	}
	
	@When("Select Edit")
	public void select_edit() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		WebElement editOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='slds-dropdown__item'])[5]"))); 
		editOption.click();
	}

	@When("Set type to Tech partner")
	public void set_type_to_tech_partner() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		WebElement selectType = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Type']/following::button)[1]"))); 
		js.executeScript("arguments[0].scrollIntoView(true);", selectType);
		selectType.click();
		
		WebElement techPartner = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Technology Partner']"))); 
		techPartner.click();
	}

	@When("Set industry to Healthcare")
	public void set_industry_to_healthcare() {
		WebElement industryOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='slds-truncate']/parent::button)[4]"))); 
		industryOption.click();
		
		WebElement scrollToHC = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Healthcare']"))); 
		js.executeScript("arguments[0].scrollIntoView(true);", scrollToHC);
		scrollToHC.click();
	}

	@When("Enter the billing address as {string}")
	public void enter_the_billing_address_as(String billingAdd) {
		WebElement billingCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Billing City']/following::input)[1]"))); 
		billingCity.clear();
		billingCity.sendKeys(billingAdd);
	}
	

	@When("Enter shipping address as {string}")
	public void enter_shipping_address_as(String shipAdd) {
		WebElement shipCity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Shipping City']/following::input)[1]"))); 
		shipCity.clear();
		shipCity.sendKeys(shipAdd);
	}

	@When("Set customer priority to low")
	public void set_customer_priority_to_low() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		
		WebElement priority = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Customer Priority']/following::button)[1]"))); 
		js.executeScript("arguments[0].scrollIntoView(true);", priority);
		priority.click();
		
		WebElement lowPrio = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Low']"))); 
		lowPrio.click();
	}

	@When("Set SLA to Silver")
	public void set_sla_to_silver() {
		WebElement slaOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='SLA']/following::button)[1]"))); 
		slaOption.click();
		driver.findElement(By.xpath("//span[text()='Silver']")).click();
	}

	@When("Set Active to no")
	public void set_active_to_no() {
		WebElement activeOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Active']/following::button)[1]"))); 
		activeOption.click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
	}

	@When("Set Upsell opportunity to no")
	public void set_upsell_opportunity_to_no() {
		WebElement upsell = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Upsell Opportunity']/following::button)[1]"))); 
		upsell.click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
	}
	

	@When("Enter unique num in the phone field as {string}")
	public void enter_unique_name_in_the_phone_field_as(String phNum) {
		WebElement phoneNum = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Phone']/following::input)[1]"))); 
		phoneNum.clear();
		phoneNum.sendKeys(phNum);
	}

	@When("Click save")
	public void click_save() {
		WebElement save = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='center-align-buttons']//li)[3]//button"))); 
		save.click();
	}

	@Then("verify phone number")
	public void verify_phone_number() {
		WebElement verifyPhNo = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//p[text()='Phone']/following::a)[1]"))); 
		String phNoValidation = driver.findElement(By.xpath("(//p[text()='Phone']/following::a)[1]")).getText();
		System.out.println("Phone number : "+phNoValidation);
	}
}