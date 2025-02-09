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
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonActions {

	public static void main(String[] args) throws IOException, InterruptedException {
EdgeDriver driver = new EdgeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));

//Enter text in the search bar
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");

//Click on the search button
driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

//Get the price of the first mobile displayed in the result page
String priceOfFirstMobile = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
System.out.println("Price of first mobile displayed in the page : "+priceOfFirstMobile);

//Get the number of customer ratings for the first displayed product
String customerRating = driver.findElement(By.xpath("(//span[@class='a-declarative']/following-sibling::a)[1]")).getText();
System.out.println("Customer ratings for the first displayed product : "+customerRating);

 //Click on the first text link of the first image
driver.findElement(By.xpath("(//div[@class='puisg-col-inner']/div/div/a)[1]")).click();

//Switch the driver focus to child window
Set<String> allWindows = driver.getWindowHandles();

List<String> listOfAllWindows=new ArrayList<String>(allWindows);
System.out.println("Address of both parent and child windows: "+listOfAllWindows);

driver.switchTo().window(listOfAllWindows.get(1));

//To capture screenshot
File source = driver.getScreenshotAs(OutputType.FILE);
File destination=new File("./Screenshot/Amazon.png");
FileUtils.copyFile(source, destination);

//To move to the 'Add to cart' element and click on it using Actions
Actions moveToElement=new Actions(driver);
WebElement move = driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]"));

//Wait and click 'Add to cart'
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@id='add-to-cart-button'])[2]")));
moveToElement.scrollToElement(move).perform();
move.click();

//To get cart subtotal
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='attach-accessory-cart-subtotal']")));
String cartTotal = driver.findElement(By.xpath("//span[@id='attach-accessory-cart-subtotal']")).getText(); //.replaceAll("[^0-9]", "")
System.out.println("Cart subtotal: "+cartTotal);

//Compare the values of priceOfFirstMobile and cartTotal
if(priceOfFirstMobile.equals(cartTotal)) {
	System.out.println("Cart subtotal: "+cartTotal);
}
 	 }

}