package Practice_Selenium.Practice_Mar_24;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.DataProvider;

public class Dataprovider_program {
	
	public WebDriver driver;
  @Test(dataProvider = "dp")
  public void f( String brows) {
	  
	  if(brows.equalsIgnoreCase("chrome"))
	  {
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.dignityhealth.org/");
	  }
	  else if(brows.equalsIgnoreCase("edge"))
	  {
		  driver = new EdgeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://www.dignityhealth.org/");
	  }
	  driver.quit();
  }

  @DataProvider(parallel= true)
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "chrome" },
      new Object[] { "edge" },
    };
  }
}
