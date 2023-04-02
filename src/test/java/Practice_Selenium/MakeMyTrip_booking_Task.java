package Practice_Selenium;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class MakeMyTrip_booking_Task {
	
	
	
  @Test
  public void f() throws IOException {
	  WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	   	driver.get("https://www.makemytrip.com/");
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   	JavascriptExecutor js =  (JavascriptExecutor)driver;
	//  FileInputStream src = new FileInputStream("C:\\Users\\Nine\\eclipse-workspace\\Selenium_java_2023\\src\\test\\java\\config_Files\\config.properties");
	  FileInputStream src = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config_Files\\config.properties"); 	
	  Properties prop = new Properties();
	   	prop.load(src);
	   		   	
		 		
	   driver.findElement(By.xpath("//span[text()='From']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys(prop.getProperty("From"));
				
	   driver.findElement(By.xpath("//div[@class='react-autosuggest__section-title']//following::p[text()="+ prop.getProperty("From")+"]")).click();
	  
	   driver.findElement(By.xpath("//span[text()='To']")).click();
	   driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(prop.getProperty("To"));
	   driver.findElement(By.xpath("//ul[@role='listbox']//child::p[text()="+ prop.getProperty("To")+"]")).click();
	  WebElement date = driver.findElement(By.xpath("//div[@class='DayPicker-Month'][1]//child::p[text()='1']"));
	  js.executeScript("arguments[0].click();", date); 
	  
	   WebElement search =driver.findElement(By.xpath("//a[text()='Search']"));
	   js.executeScript("arguments[0].click();", search);
	   
	  driver.findElement(By.xpath("//button[text()='OKAY, GOT IT!']")).click();
	  driver.findElement(By.xpath("//p[text()="+ prop.getProperty("plane_code")+"]//following::span[text()='View Prices'][1]")).click();
	  String mainwindow =driver.getWindowHandle();
	  driver.findElement(By.xpath("//p[text()="+ prop.getProperty("plane_code")+"]//following::button[text()='Book Now'][1]")).click();
	   
	 
	  Set<String> childwindows = driver.getWindowHandles();
	  
	  for(String childwindow:childwindows)
	  {
		  driver.switchTo().window(childwindow);
		  if(!childwindow.equalsIgnoreCase(mainwindow))
		  {
			  
			WebElement upgrade =driver.findElement(By.xpath("//div[@class='refundUpgradeCard appendBottom10  ']//following::span[text()='UPGRADE']"));
			js.executeScript("arguments[0].click();", upgrade);
			
			driver.switchTo().window(mainwindow);
		  }
	  }
		//driver.quit();
		
	  
  }
}
