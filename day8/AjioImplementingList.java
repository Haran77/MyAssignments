package week2.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AjioImplementingList {

	public static void main(String[] args) {

ChromeDriver driver=new ChromeDriver();

driver.get("https://www.ajio.com/");

driver.manage().window().maximize();

//driver.findElement(By.xpath("//div[@aria-label='ajio']/img")).click();   

driver.findElement(By.xpath("//input[@name='searchVal']")).sendKeys("Bags");         //Search for 'Bags'

driver.findElement(By.className("ic-search")).click();

driver.findElement(By.xpath("(//div[@class='facet-linkhead']/label)[2]")).click();   //To select 'Men option under Gender section

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {      //Used Thread.sleep() with Try Catch block to wait till the page gets loaded
	e.printStackTrace();
} 

driver.findElement(By.xpath("//label[contains(text(), 'Fashion Bags')]")).click();   //To select 'Fashion bags' under Category section

try {
	Thread.sleep(3000);
} catch (InterruptedException e) {       //Used Thread.sleep() with Try Catch block to wait till the page gets loaded
	e.printStackTrace();
}

WebElement fashionBagCount = driver.findElement(By.xpath("//div[contains(@aria-label,'Items Found')]"));

String itemCount=fashionBagCount.getText();        //To get the count of the items displayed in the search result page

System.out.println("Count of the items displayed in search result page: "+itemCount);

List<WebElement> brandName = driver.findElements(By.xpath("//div[@class='brand']")); //To get all the web elements from the search result page

List<String> brandNameList=new ArrayList<>();      //Creating a list to store the list of Brand names

int size=brandName.size();

System.out.println("Size of Brand Name : "+size);

for(int i=0;i<size-1;i++) {
	WebElement brand=brandName.get(i);            //Get all the brand names from the 'brandName' and store it in 'brand'
	brandNameList.add(brand.getText());     	  //Add those brand name list in the 'brandNameList' list
	}
Collections.sort(brandNameList);
System.out.println("List of Brands: "+ brandNameList);
	
	List<WebElement> bagName = driver.findElements(By.xpath("//div[@class='nameCls']"));  //To get all the web elements from the search result page

	List<String> bagNameList=new ArrayList<>();   //Creating a list to store the list of Brand names
	
	int sizeOfBagName=bagName.size();
	
	System.out.println("Size of Bag Name : "+ sizeOfBagName);
	
	for(int j=0;j<sizeOfBagName;j++){	
	WebElement bag=bagName.get(j);                //Get all the bag names from the 'bagName' and store it in 'bag'
	bagNameList.add(bag.getText());               ////Add those bag name list in the 'bagNameList' list
	}
Collections.sort(bagNameList);
System.out.println("List of Bag Names : "+bagNameList);
}
}