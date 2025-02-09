package week3.day12;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ErailWebTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://erail.in/");
				
		driver.manage().window().maximize();
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            		
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("MAS");
		driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr']")).click();
		
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
		driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("MDU");
		driver.findElement(By.xpath("//div[text()='Madurai Jn']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		WebElement checkbox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='chkSelectDateOnly']")));
		checkbox.click();
 		
		driver.findElement(By.xpath("//input[@id='buttonFromTo']")).click();
		
		WebElement table = driver.findElement(By.xpath("//div[@id='divTrainsList']/table[1]"));
		
		List<WebElement> columnData = table.findElements(By.xpath("//div[@id='divTrainsList']/table[1]/tbody/tr[\"+i+\"]/td[2]"));
		
		Set<String> trainNameWithoutDup=new LinkedHashSet<String>();
		
		System.out.println("Train names : ");
 		System.out.println("--------------");
		
		for(int i=0;i<columnData.size();i++) {
			String trainName = columnData.get(i).getText();
			trainNameWithoutDup.add(trainName);
	}			
		System.out.println(trainNameWithoutDup);

  	}

}