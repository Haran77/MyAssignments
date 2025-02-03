package week3.day9;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingAlertInteractions {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.leafground.com/alert.xhtml");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
Alert promptAlert = driver.switchTo().alert();    //Switching to alert
promptAlert.sendKeys("Haranya");                  //Entering the name input
String textBox=promptAlert.getText();             //To get the text present in the text box
System.out.println("Text entered in the text box : "+textBox);
promptAlert.dismiss();

WebElement textAfterDismissing = driver.findElement(By.xpath("//span[@id='confirm_result']"));
String text=textAfterDismissing.getText();       //To get the text present in the web page after dismissing the prompt alert
System.out.println("Text after dismissing: "+text);
driver.close();
	}

}
