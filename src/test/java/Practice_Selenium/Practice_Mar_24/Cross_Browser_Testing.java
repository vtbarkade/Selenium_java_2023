package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser_Testing {
	
	public WebDriver driver;
  @Test
  @Parameters("brows")
  public void browser(String brows1) {
	  
	  if(brows1.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.dignityhealth.org/");
	  }
	  else if(brows1.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.dignityhealth.org/");
	  }
	  else if(brows1.equalsIgnoreCase("firefox"))
	  {
		  driver = new FirefoxDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.dignityhealth.org/");
	  }
	  
	  driver.quit();
  }
}
