package week2.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonPhoneList {

	public static void main(String[] args) {

		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		List<WebElement> mobilePriceList = driver.findElements(By.className("a-price-whole"));
		int size=mobilePriceList.size();
		List<Integer> priceList=new ArrayList<Integer>();
		
		for(int i=0;i<size;i++) {
			String price=mobilePriceList.get(i).getText();
			String repComma=price.replace(",", "").trim();
			int num=Integer.parseInt(repComma);
			priceList.add(num);
		
					
		}
		
		Collections.sort(priceList);
		
		System.out.println(priceList);
		
		Integer firstItem = priceList.get(0);
		
		System.out.println("firstItem "+firstItem);
					
		}
		
	}

