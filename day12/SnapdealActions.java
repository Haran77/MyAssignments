package week3.day12;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SnapdealActions {

	public static void main(String[] args) throws InterruptedException, IOException {

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	
//Instantiate the Actions class
Actions move=new Actions(driver);

//Mouse hover to Men's Fashion option
WebElement mensFashion = driver.findElement(By.xpath("(//span[@class='catText'])[1]"));
move.moveToElement(mensFashion).perform();

//Click on sports shoe option from Footwear
WebElement sportsShoe = driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]"));
move.moveToElement(sportsShoe).click().perform();

//To get the count of sports shoes
String countOfSportsShoe = driver.findElement(By.xpath("//div[text()='Sports Shoes for Men']/following-sibling::div")).getText();
System.out.println("Count of Sports shoes: "+countOfSportsShoe);

//To click on the training shoes
driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();

//To select 'Low to high' from Sort option
driver.findElement(By.xpath("//span[text()='Sort by:']/following-sibling::i")).click();
driver.findElement(By.xpath("(//ul[@class='sort-value'])/li[2]")).click();

WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));

Actions scroll=new Actions(driver);

Thread.sleep(5000);

//To check whether the displayed items are in sorted format as per the price (low to high)
List<WebElement> priceList = wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath("//span[@class='lfloat product-price']"))));

//Creating 2 List
List<Integer> sortedList=new ArrayList<Integer>();    
List<Integer> sortedList1=new ArrayList<Integer>();

for(int i=0; i<=priceList.size()-1;i++) {
	String text = priceList.get(i).getText().replaceAll("[^0-9]", "");
    int price = Integer.parseInt(text);        //Convert to integer
//Add to the lists
    sortedList.add(price);                    
    sortedList1.add(price);
}
    Collections.sort(sortedList);   //Sort one list
    
    if(sortedList.equals(sortedList1)) {        //Compare the sorted list with the other list
    	System.out.println("The displayed products are sorted as per Low to high price");
    }
System.out.println("Sorted list from Low to high price: "+sortedList1);
	
//Set the price range between any 2 values
WebElement priceActionMin = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='price-text-box']/input)[1]")));
scroll.moveToElement(priceActionMin).click().perform();
priceActionMin.clear();
priceActionMin.sendKeys("500");

WebElement priceActionMax = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='price-text-box']/input)[2]")));
scroll.moveToElement(priceActionMax).click().perform();
priceActionMax.clear();
priceActionMax.sendKeys("3000");

driver.findElement(By.xpath("(//div[@class='price-input']/following-sibling::div)[2]")).click();

Thread.sleep(3000);
		
//Selecting color
 WebElement color = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Black')]")));
 scroll.moveToElement(color).click().perform();
 
 Thread.sleep(3000);
 
 //Hover to the first result displayed and click on 'Quick view' button
 WebElement hoverFirstResult = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//picture[@class='picture-elem'])[1]")));
scroll.moveToElement(hoverFirstResult).perform();

WebElement quickView = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='clearfix row-disc']/div)[1]")));
scroll.moveToElement(quickView).click().perform();

//To get the price and discount percentage of the product
WebElement price = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='payBlkBig']")));
String priceOfShoe = price.getText();
System.out.println("Price of shoe: "+priceOfShoe);

WebElement offer = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='percent-desc ']")));
String offerOfShoe = offer.getText();
System.out.println("Offer percentage of the shoe is: "+offerOfShoe);

Thread.sleep(3000);
File source = driver.getScreenshotAs(OutputType.FILE);
File destination=new File("./Screenshot/snapdeal.png");
FileUtils.copyFile(source, destination);

driver.findElement(By.xpath("//div[@class='close close1 marR10']/i")).click();

driver.close();

}
}
