package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Alerts {

	public static void main(String[] args) {
		// Alerts accept, send data, get text
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// click on JS alert
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		//click  JS confirm
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
		// click JS prompt
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Hello");
		driver.switchTo().alert().accept();
		System.out.println(driver.findElement(By.xpath("//p[@id='result']")).getText());
		
	}

}
