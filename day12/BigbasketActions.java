package week3.day12;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BigbasketActions {

	public static void main(String[] args) throws IOException, InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
driver.findElement(By.xpath("//button[@id='headlessui-menu-button-:R5bab6:']")).click();

//Explicit wait till the elements are visible or clickable
WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));

//Actions class to mouse hover to particular category
Actions move=new Actions(driver);
WebElement mouseHover = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]")));
move.moveToElement(mouseHover).perform();

WebElement mouseHover1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Rice & Rice Products']")));
move.moveToElement(mouseHover1).perform();

driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']")).click();

//Filtering using BB-Royal brand
WebElement filterCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='i-BBRoyal']")));
move.moveToElement(filterCheckBox).click().perform();

Thread.sleep(3000);
//Selecting "Tamil ponni boiled rice" from the filtered result 
WebElement riceBrand = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Tamil Ponni Boiled - Rice']")));
move.scrollToElement(riceBrand).perform();
move.moveToElement(riceBrand).click().perform();

//Changing driver focus to Child window
wait.until(ExpectedConditions.numberOfWindowsToBe(2));
Set<String> allWindows = driver.getWindowHandles();
List<String> listOfWindows=new ArrayList<String>(allWindows);
driver.switchTo().window(listOfWindows.get(1));

//Select the 5kg option using Advanced action method
WebElement kgOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='5 kg']")));
move.moveToElement(kgOption).click().perform();

//To get the price of the selected quantity
String price = driver.findElement(By.xpath("(//span[text()='5 kg']/following::span)[3]")).getText();
System.out.println("Price of 5 KG rice bag: "+price);

driver.findElement(By.xpath("(//button[text()='Add to basket'])[1]")).click();   //Add to cart

WebElement successPopup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='self-center']/following-sibling::p")));  //To check whether the success message displays or not
boolean displayed = successPopup.isDisplayed();
System.out.println("Success message displayed successfully "+displayed);

//To get the screenshot
File source = driver.getScreenshotAs(OutputType.FILE);
File destination=new File("./Screenshot/bigbasket.png");
FileUtils.copyFile(source, destination);

driver.close(); //close current window

driver.switchTo().window(listOfWindows.get(0));  //switching driver focus to parent window

driver.close(); //close the parent window

	}

}
