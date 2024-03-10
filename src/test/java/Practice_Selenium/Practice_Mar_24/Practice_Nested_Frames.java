package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Nested_Frames {

	public static void main(String[] args) {
		// Nested Frame Program
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		
		List<WebElement> frm =driver.findElements(By.tagName("frame"));
		System.out.println("Total Number of Frames : "+frm.size());
				
		
		// Print Left, Middle, Right frame text
				   
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		String left= driver.findElement(By.tagName("body")).getText();
		System.out.println(left);
		driver.switchTo().defaultContent();  // it is for leaving frame & go to main frame
				
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		String middle= driver.findElement(By.tagName("body")).getText();
		System.out.println(middle);
		
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");
		String right= driver.findElement(By.tagName("body")).getText();
		System.out.println(right);
		driver.switchTo().defaultContent();
		
		// print Bottom frame text
		
		driver.switchTo().frame("frame-bottom");
		String bottom =driver.findElement(By.tagName("body")).getText();
		System.out.println(bottom);
		driver.switchTo().defaultContent(); // go to main frame
		
		driver.quit();
	}

}
