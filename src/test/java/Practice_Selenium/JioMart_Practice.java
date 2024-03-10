package Practice_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class JioMart_Practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jiomart.com/");
		
		Actions act = new Actions(driver);
		
		
		WebElement search =driver.findElement(By.xpath("//input[@class='aa-Input search_input']"));
		
		act.sendKeys(search, "dove soap");
		act.sendKeys(Keys.ENTER);
		act.build().perform();
		
		driver.findElement(By.xpath("//li[@class='ais-InfiniteHits-item jm-col-4 jm-mt-base']//div[text()=' Dove Cream Beauty Bathing Bar 125 g (Buy 4 Get 1 Free) ']//following::button[text()=' Add '][1]")).click();
		driver.findElement(By.xpath("//button[@id='btn_minicart']")).click();
		String price = driver.findElement(By.xpath("//div[@class='total-details sign yougetfdord']//span[@class='j-text flt-right j-text-heading-xxs ng-star-inserted'][contains(text(),'₹347.00')]")).getText();
		System.out.println("value of Price is : "+price); 
		Assert.assertEquals(price, "₹347.00");
		 System.out.println(" Test case passed ");

	}

}
