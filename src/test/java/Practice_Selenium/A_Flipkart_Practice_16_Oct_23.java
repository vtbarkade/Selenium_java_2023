package Practice_Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_Flipkart_Practice_16_Oct_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("diaper");
		
		driver.findElement(By.xpath("//span[@class='_30XB9F']")).click();
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		String mainwindow =driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[@data-id='DPRFY6MZHPHTZ6HA']//child::div[text()='₹898']")).click();
		
				
		Set<String> windows =driver.getWindowHandles();
		
		for(String win:windows)
		{
			driver.switchTo().window(win);
			if(!win.equalsIgnoreCase(mainwindow))
			{
				driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
			}
		}
		driver.switchTo().window(mainwindow);
		
	}

}
