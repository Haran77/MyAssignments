package week3.day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://leafground.com/checkbox.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));    //Added implicit wait - 20 seconds

driver.findElement(By.id("j_idt87:j_idt89")).click();                 //To click basic check box using id attribute

driver.findElement(By.id("j_idt87:j_idt91")).click(); 				  //To click notification check box using id attribute

// Used -- setTimeout(function(){debugger},5000)  -- to freeze in debugger mode
boolean displayed = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();     //To check whether the pop-up display or not

System.out.println("Notification check box displayed : "+displayed);    //Returns boolean value

//To wait until the notification pop up disappear - using explicit wait
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
WebElement Element1 = driver.findElement(By.xpath("//span[text()='Checked']"));
wait.until(ExpectedConditions.invisibilityOf(Element1));

driver.findElement(By.xpath("//label[text()='Java']")).click();                             //To click Java option from favorite language

driver.findElement(By.id("j_idt87:ajaxTriState")).click();                                  //To select Tri-state option check box

boolean displayed1 = driver.findElement(By.xpath("//p[contains(text(),'State =')]")).isDisplayed();    //To check whether the pop-up display or not

System.out.println("Tristate check box displayed : "+displayed1);                           //Returns boolean value

String textInTristateCheckBox=driver.findElement(By.xpath("//p[contains(text(),'State = ')]")).getText();   //To get the text present in the pop up after clicking tri-state check box

System.out.println("Text present in pop up when clicked Tristate check box : "+textInTristateCheckBox);     //To print the text present in the pop-up

//To wait until the tri-state pop up disappear - using explicit wait
WebElement Element2 = driver.findElement(By.xpath("//p[contains(text(),'State = ')]"));
wait.until(ExpectedConditions.invisibilityOf(Element2));

driver.findElement(By.className("ui-toggleswitch-slider")).click();											//To enable the toggle option

boolean displayed2 = driver.findElement(By.xpath("//span[text()='Checked']")).isDisplayed();       //To check whether the pop-up display or not

System.out.println("Toggle displayed : "+displayed1);										 //Returns boolean value

boolean selectable =  driver.findElement(By.id("j_idt87:j_idt102")).isSelected();            //To check whether the disable option is selectable or not

System.out.println("Disabled check box :"+selectable);										 //Returns boolean value

driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s']")).click();       //Select multiple options from the page

driver.findElement(By.xpath("(//label[text()='London'])[2]")).click();                       //Click on 'London' check box

driver.findElement(By.xpath("//a[@class='ui-selectcheckboxmenu-close ui-corner-all']")).click();    //Close the options box

Thread.sleep(5000);
driver.close();

	}

}