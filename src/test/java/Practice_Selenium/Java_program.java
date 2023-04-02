package Practice_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class Java_program {

	public static void main(String[] args) {
				
		//WebDriver driver = new EdgeDriver();
		
	
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
	   	driver.get("https://www.makemytrip.com/");
	   	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	   driver.findElement(By.xpath("//span[@class='chNavIcon appendBottom2 chSprite chFlights active']")).click();
		
	   driver.findElement(By.xpath("//span[text()='From']")).click();
				
	   driver.findElement(By.xpath("//div[@class='react-autosuggest__section-title']//following::p[text()='Pune, India']")).click();
		
		driver.close();
	}

}
