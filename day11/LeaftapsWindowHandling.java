package week3.day11;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeaftapsWindowHandling {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='partyIdFrom']/following::img)[1]")));
		
		//Clicking the widget of from contact
		element.click();
		
		//Explicit wait till all the windows get completely loaded
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//To get all the window address and to change the driver focus from parent window to child window and vice versa
		Set<String> allWindows1 = driver.getWindowHandles();
		List<String> listOfWindows1=new ArrayList<String>(allWindows1);
		System.out.println("Address of all Windows: "+listOfWindows1);
		
		//To switch the driver focus to child window 1
		driver.switchTo().window(listOfWindows1.get(1));
		
		WebElement Element2 = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a[1])[1]"))));
		Element2.click();  //1st contact from "From contact window"
		
		driver.switchTo().window(listOfWindows1.get(0)); //driver focus to parent window
		
		//Clicking the widget of to contact		
		WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@id='partyIdFrom']/following::img)[2]")));				
		element1.click();
		
		//Explicit wait till all the windows get completely loaded
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		
		//To get all the window address and to change the driver focus from parent window to child window and vice versa
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> listOfWindows2=new ArrayList<String>(allWindows2);
		System.out.println("Address of all Windows: "+listOfWindows2);
		
		//To switch the driver focus to child window 2
		driver.switchTo().window(listOfWindows2.get(1));
				
 		WebElement Element3 = wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//table[@class='x-grid3-row-table']/tbody/tr[1]/td[1]/div/a)[2]"))));
		Element3.click();  //2nd contact from "To contact window"
				
		//To switch driver focus to Parent window
		driver.switchTo().window(listOfWindows2.get(0));
		
		//Merge the contacts
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		
		//Switch driver focus to alert
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//To get the title of the page
		String title = driver.getTitle();
		System.out.println("Title of the page: "+title);
		
	}

}
