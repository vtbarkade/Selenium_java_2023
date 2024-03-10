package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_IFrame_NotePad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/tinymce");
		
		driver.switchTo().frame("mce_0_ifr");
		System.out.println(driver.findElement(By.tagName("p")).getText());
		
	}

}
