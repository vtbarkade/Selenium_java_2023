package Practice_Selenium.Practice_Mar_24;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_5_Screnshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	   WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   driver.get("https://www.google.com/gmail/about/");
	   
	  TakesScreenshot ts = (TakesScreenshot)driver;
	  File src= ts.getScreenshotAs(OutputType.FILE);
	  Date d = new Date();
	  String filename = d.toString().replaceAll(":", "_").replaceAll(" ", "_")+".png";
	  
	  FileUtils.copyFile(src, new File("C:\\Users\\Nine\\eclipse-workspace\\Selenium_java_2023\\Screenshot\\"+filename));
	  
	  System.out.println("Screenshot completed");
	  
	}

}
