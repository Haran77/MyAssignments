package week3.day12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

public class ColmnDataFromTable {

	public static void main(String[] args) {
		
    ChromeDriver driver=new ChromeDriver();
			
	driver.get("https://leafground.com/table.xhtml");
			
	driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	//Child to parent based xpath to locate the table
	WebElement table = driver.findElement(By.xpath("//thead[@class='ui-datatable-scrollable-theadclone']/parent::table"));
	
	//Xpath to locate all rows and 3rd column data from the table 
	List<WebElement> columnData = table.findElements(By.xpath("//thead[@class='ui-datatable-scrollable-theadclone']/parent::table/tbody/tr[\"+i+\"]/td[3]"));
	
	System.out.println("Data of 3rd column : ");	
	System.out.println("-----------------------------");

	//For loop to get all the data from 3rd column
	for(int i=0;i<columnData.size();i++) {
		String text = columnData.get(i).getText();
	System.out.println(text);	
	}
}
}