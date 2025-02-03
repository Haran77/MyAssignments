package week3.day9;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.leafground.com/alert.xhtml");
driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
Alert confirmationAlert = driver.switchTo().alert();
String textField = confirmationAlert.getText();
System.out.println(textField);
confirmationAlert.accept();
}

}
