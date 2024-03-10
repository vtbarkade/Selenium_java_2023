package Practice_Selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class New_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		/*	driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement search =driver.findElement(By.xpath("//select[@id='country']"));
		
		Select sel = new Select(search);
		sel.selectByVisibleText("United Kingdom");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile =ts.getScreenshotAs(OutputType.FILE);
		
		Date d = new Date();
		String Filename = d.toString().replaceAll(":", "_").replaceAll(" ", "_")+".png";
		
		FileUtils.copyFile(srcfile, new File("C:\\Users\\Nine\\eclipse-workspace\\Selenium_java_2023\\Screenshot\\"+Filename));
		
	*/
		driver.get("https://www.makemytrip.com/");
				  
		driver.switchTo().frame("webklipper-publisher-widget-container-notification-frame");
	 	WebElement pop_up=	driver.findElement(By.xpath("//i[@class='wewidgeticon we_close']"));
			 	
	 	JavascriptExecutor js =(JavascriptExecutor)driver;
	 	js.executeScript("arguments[0].click();", pop_up);
		 
	}

}
