package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_ToolsQA_Forms {

	public static void main(String[] args) {
		// ToolsQA form Practice
WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demoqa.com/automation-practice-form/");
		Actions act = new Actions(driver);
		
		
		WebElement name = driver.findElement(By.xpath("//input[@id='firstName']"));
		
		act.sendKeys(name, "vijay").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("Barkade").perform();
		act.sendKeys(Keys.TAB).perform();
		act.sendKeys("barkade.vijay@gmail.com");
		act.build().perform();
		
		
		WebElement gender= driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
		act.moveToElement(gender).click().build().perform();
		
		WebElement mobile_no = driver.findElement(By.xpath("//input[@id='userNumber']"));		
		act.moveToElement(mobile_no).sendKeys("7276774615").build().perform();
		
		System.out.println("Form Filled Succesfully");
		
	}

}
