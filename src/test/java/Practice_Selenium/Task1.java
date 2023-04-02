package Practice_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task1 {
	WebDriver driver;
	 @BeforeMethod
	  public void setup() {
		 // WebDriverManager.chromedriver().setup();
		 WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
		//  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	 
  @Test
  public void states() {
	  driver.get("https://petdiseasealerts.org/forecast-map/#/heartworm-canine/dog/united-states");
	  WebElement frameName= driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
	  driver.switchTo().frame(frameName);
	  driver.findElement(By.xpath("//g[@id='alabama']")).click();
	 
  }
  
  @AfterMethod
  public void teardown()
  {
	  driver.quit();
  }
}
