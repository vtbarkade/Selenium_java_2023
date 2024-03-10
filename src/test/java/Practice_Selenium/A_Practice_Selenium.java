package Practice_Selenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A_Practice_Selenium {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement buttn= driver.findElement(By.xpath("//a[text()='Jasmine.Morgan']//preceding::input[1]"));
		WebElement userid= driver.findElement(By.xpath("//input[@id='userId']"));
		
		// .Properties file
		Properties prop = new Properties();
		FileInputStream srcfile = new FileInputStream("C:\\Users\\Nine\\eclipse-workspace\\Selenium_java_2023\\src\\test\\java\\config_Files\\config.properties");
		prop.load(srcfile);
		prop.getProperty("URL");
		
		// Javascript executor practice 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", buttn);
		//option for sendkeys using javascript
		js.executeScript("arguments[0].value= 'barkade.vijay@gmail.com';",userid ); 
		js.executeScript("arguments[0].scrollIntoView();", userid);
		// create Alert using javascript
		js.executeScript("alert('this is alert');");  
		driver.switchTo().alert().accept();
		
		//Actions class for Mouse & keyboard operations
		
		Actions act = new Actions(driver);
		act.sendKeys(userid, "Vijay Barkade").perform();
		act.sendKeys("vijay").perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL).build().perform();
		
		//Take Screenshot Format
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		Date d = new Date();
		String Filename = d.toString().replaceAll(":", "_").replaceAll(" ", "_")+".png";
		FileUtils.copyFile(src, new File("C:\\Users\\Nine\\eclipse-workspace\\Selenium_java_2023\\Screenshot\\"+Filename));
		
		// Explicit Wait Syntax Format Only
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='userId']")));
		wait.until(ExpectedConditions.elementToBeClickable(userid));
		wait.until(ExpectedConditions.alertIsPresent());
		
		
	}

}
