package week2.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

    public void click(){
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
	}
	
	public String setText(String text) {
		return text;
	}
	public static void main(String[] args) {
WebElement webObj=new WebElement();
webObj.click();
System.out.println(webObj.setText("Webelement is clicked"));
}

}
