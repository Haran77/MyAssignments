package week3.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.leafground.com/radio.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

//To select your most favorite browser from the radio button
driver.findElement(By.xpath("(//label[text()='Chrome'])[1]")).click();

//To select and unselect the radio buttons
WebElement unselected = driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div"));
unselected.click();   //first click

unselected.click();   //second click

boolean unselectedButton = driver.findElement(By.xpath("//label[text()='Chennai']/preceding-sibling::div")).isSelected();
if(unselectedButton==false) {
	System.out.println("The button is unselected after second click.");
}
else {
	System.out.println("The button is selected after second click.");
}

//To identify the radio button that is initially selected by default
WebElement defaultButton = driver.findElement(By.xpath("(//h5[text()='Find the default select radio button']/following::div[contains(@class,'ui-state-active')])[1]"));
String defaultSelectedLabel = defaultButton.findElement(By.xpath("((//div[contains(@class,'ui-state-active')])[5])/following::label")).getText();
System.out.println("Default button is : "+defaultSelectedLabel);

//Check and select the age group (21-40 Years) if not already selected
WebElement ageGroup = driver.findElement(By.xpath("//label[text()='21-40 Years']/preceding::div[contains(@class,'ui-state-active')][6]"));
if(!ageGroup.getAttribute("class").contains("ui-state-active")) {
	driver.findElement(By.xpath("//label[text()='21-40 Years']")).click();	
	System.out.println("The age group is not already selected. Now selected.");
}
else {
	System.out.println("The age group of '21-40 Years' is already selected by default.");
}
}
	}
