package week3.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundButton {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		
		//To get the title of the page
		String titleOfPage = driver.getTitle();
		System.out.println("Title of the page: "+titleOfPage);
		
		//To navigate back to the home page
        driver.navigate().back();
		
		//To check whether the Disabled button is getting enabled or not
		boolean disabledButton = driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		//Prints the boolean value
		System.out.println("The disabled button is enabled : "+disabledButton);
		
		//To get the position of the button
		Point positionOfButton = driver.findElement(By.xpath("(//span[text()='Submit'])[1]")).getLocation();
		System.out.println("Position of the submit button is: "+positionOfButton);
		
		//To get the Color of the button
		String cssValue = driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("background-color");
		System.out.println("Css value of the Save button is: "+cssValue);
		
		//To get the height and width of the button
		Dimension heightAndWidth = driver.findElement(By.xpath("(//span[text()='Submit'])[2]")).getSize();
		System.out.println("Height and width of the button is: "+heightAndWidth);
		
		driver.close();
		
	}

}
