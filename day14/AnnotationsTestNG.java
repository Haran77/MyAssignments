package week4.day14;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AnnotationsTestNG extends AnnotationsBaseClass{

@Test
public void annotationsTestng() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	//Adding explicit wait until the toggle menu gets loaded
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(40));
	WebElement toggleMenu=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='slds-icon-waffle']")));
	toggleMenu.click();
	
	//To click the View all option
	driver.findElement(By.xpath("//div[@class='al-menu-dropdown-list']/following::button")).click(); 

	//To click on the 'Legal Entities' option
	Actions scroll=new Actions(driver);
	WebElement legalEntities = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Legal Entities']")));
	scroll.moveToElement(legalEntities).click().perform();
	
	//To click on the Legal Entities dropdown
	WebElement dropDown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Legal Entities']/following::a)[1]")));
	dropDown.click();
	
	Thread.sleep(2000);
	//To select the 'New Legal Entity' option
	WebElement newLegalEntity = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='New Legal Entity']")));
	scroll.moveToElement(newLegalEntity).click().perform();
	
	//To enter company name, description and status
	WebElement name = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='Name']")));
	name.sendKeys("Hari");
	
	driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("TestLeaf");
	
	driver.findElement(By.xpath("(//textarea[@class='slds-textarea'])[2]")).sendKeys("Salesforces");
	
	//Selecting 'Active' option from status dropdown
	Thread.sleep(1000);

	//Using JavascriptExecutor for scrolling until the element is completely viewed
    JavascriptExecutor js = (JavascriptExecutor) driver;

	WebElement statusDD = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//label[text()='Status']/following-sibling::div)[1]")));
    js.executeScript("arguments[0].scrollIntoView(true);", statusDD);
    statusDD.click();
	
	WebElement active = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Active']")));
	scroll.moveToElement(active).click().perform();
	
	//Click on save
	driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
	
	//Verify if there is the successful pop up message displayed
	WebElement popUp = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='slds-list--inline']")));
	Boolean popupMessage=popUp.isDisplayed();
	System.out.println("Pop up messade displayed - "+popupMessage);
			
	//To close the pop up
	WebElement closeButton = driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon toastClose slds-notify__close slds-button--icon-inverse slds-button_icon-bare']"));	
	closeButton.click();
	
}

}
