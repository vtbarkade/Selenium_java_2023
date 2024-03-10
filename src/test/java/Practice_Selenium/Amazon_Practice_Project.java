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




public class Amazon_Practice_Project {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
		Properties prop= new Properties();
		FileInputStream srcfile = new FileInputStream("C:\\Users\\Nine\\eclipse-workspace\\Selenium_java_2023\\src\\test\\java\\config_Files\\config.properties");
		prop.load(srcfile);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[text()='Account & Lists']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("barkade.vijay@gmail.com");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Satara@123");
		driver.findElement(By.xpath("//input[@name='rememberMe']")).click();
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(prop.getProperty("amazon_search"));
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
		WebElement product = driver.findElement(By.xpath(prop.getProperty("amazon_product_xpath")));
		js.executeScript("arguments[0].click();", product);
		
		String mainwindow = driver.getWindowHandle();
		
		Set<String> childwindows =driver.getWindowHandles();
		
		for(String childwindow:childwindows)
		{
			if(!mainwindow.equalsIgnoreCase(childwindow))
			{
				driver.switchTo().window(childwindow);
				
				driver.findElement(By.xpath("//input[@id = 'add-to-cart-button']")).click();
				
			}
			
		}
		driver.switchTo().window(mainwindow);
		
		driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
		driver.navigate().refresh();
		driver.findElement(By.xpath("//span[@id='sc-subtotal-label-activecart']//preceding::input[@value='Delete']")).click();
		
		System.out.println("Program executed Succesfully");	
		driver.quit();
	}

}
