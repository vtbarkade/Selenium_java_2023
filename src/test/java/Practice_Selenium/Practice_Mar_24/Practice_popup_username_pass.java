package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_popup_username_pass {

	public static void main(String[] args) {
		// popup admin:admin ---   https://username:password@ domain
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String message= driver.findElement(By.xpath("//div[@class='example']")).getText();
		System.out.println(message);
		driver.quit();
		
		
	}

}
