package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PvrCinemas {

	public static void main(String[] args) throws InterruptedException {
ChromeDriver driver = new ChromeDriver();

WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(30));
Actions scroll=new Actions(driver);

driver.get("https://www.pvrcinemas.com/");
driver.manage().window().maximize();

Thread.sleep(2000);

//To select location as Chennai
driver.findElement(By.xpath("(//span[@class='cities-placed'])[2]")).click();
WebElement location = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='cities-names'])[6]")));
location.click();

driver.findElement(By.xpath("//span[text()='Cinema']")).click();

//To select the cinema
driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
WebElement cinemaOption = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='p-dropdown-items-wrapper']//span)[1]")));
cinemaOption.click();

//To select the show date

//WebElement selectDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Select Date']")));
//selectDate.click();
WebElement showDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Tomorrow']")));
showDate.click();

//Selecting movie from the movie list shown
WebElement movie = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='CAPTAIN AMERICA: BRAVE NEW WORLD']")));
movie.click();

//To select show timing
WebElement showTiming = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='04:05 PM']")));
showTiming.click();

//To book the show
driver.findElement(By.xpath("(//div[@id='time']/following::span[text()='Book'])[1]")).click();

//To accept terms and conditions
WebElement acceptButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Accept']")));
acceptButton.click();

//To select a seat
WebElement seatSelection = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//tr[@class='seats-row'])[5]/td[9]")));
seatSelection.click();

//To click on proceed
driver.findElement(By.xpath("//button[text()='Proceed']")).click();

//To get the seat number and ticket price
WebElement seatNum = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='seat-number']/p")));
String textSeatNum = seatNum.getText();
System.out.println("Seat number : "+textSeatNum);

String textPrice = driver.findElement(By.xpath("//div[@class='grand-prices']")).getText();
System.out.println("Price of the ticket : "+textPrice);

//To click on proceed
WebElement proceedButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Proceed']")));
proceedButton.click();

Thread.sleep(2000);
WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='cross-icon mx-2']//i)[2]")));
closeButton.click();

String titleOfPage = driver.getTitle();
System.out.println("Title of the page : "+titleOfPage);

driver.close();

	}

}
