package Practice_Selenium;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import org.testng.annotations.Test;

public class TestNG_Practice{
	
	public WebDriver driver;
	
 	
  @Test(dataProvider ="dp", dataProviderClass = DP.class)
  public void browser(String brows)  {
	
	  if(brows.equalsIgnoreCase("chrome"))
	  {
		  driver =new ChromeDriver();		
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.google.com/"); 
		  driver.quit();
	  }
	  
	  else if(brows.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.google.com/"); 
		  driver.quit();
	  }
	  else if(brows.equalsIgnoreCase("firefox"))
	  {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.google.com/"); 
		  driver.quit();
	  }
  }
}
  

