package marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonShopping {
	
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//label[text()='Search Amazon.in']/following-sibling::input")));
		search.sendKeys("Bags for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		WebElement productCount = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']/span")));
		String countNum = productCount.getText();
		System.out.println("Total number products displayed in the result page : "+countNum);
		
		driver.findElement(By.xpath("//span[@class='a-list-item']//span[text()='Skybags']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-list-item']//span[text()='Safari']"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-dropdown-label']"))).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Newest Arrivals']"))).click();
		
		WebElement bagName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal']//span)[1]")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", bagName);
		
		String textOfBagName = bagName.getText();
		System.out.println("Bag name : "+textOfBagName );
		
		String priceOfBag = driver.findElement(By.xpath("(//div[@class='a-row a-size-base a-color-base']//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("Price of Bag : "+priceOfBag );
		
		String titleOfPage=driver.getTitle();
		System.out.println("Title of page : "+titleOfPage);
		
		//driver.close();
		
		
		
		
		
				
		
		
	}

}
