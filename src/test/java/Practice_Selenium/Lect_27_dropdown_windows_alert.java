package Practice_Selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Lect_27_dropdown_windows_alert {
WebDriver driver;
WebDriverWait wait;
	
	@BeforeMethod
	public void setup()
	{
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		 wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	@Test()
	public void Dropdown()
	{		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			link.click();			
		}
		
		Set<String> windows = driver.getWindowHandles();
		
		for(String window:windows)
		{
			String title = driver.switchTo().window(window).getTitle();
			System.out.println(title);			
		}		
	}
	
	@Test()
	public void alert()
	{
		driver.get("https://testautomationpractice.blogspot.com/");
		
		//driver.navigate().to("https://testautomationpractice.blogspot.com/");
		driver.findElement(By.xpath("//button[text()='Alert']")).click();
		
		System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
		
		driver.switchTo().alert().accept();
				
	}
}
