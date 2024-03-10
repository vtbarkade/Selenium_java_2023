package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice_candimapper_site {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions act = new Actions(driver);
		
		driver.get("https://candymapper.com/");
		//-----------------first we will close pop up window X --------------------------------
		driver.findElement(By.xpath("//div[@data-ux='ModalBody']//child::div[@class='x-el x-el-div c1-1 c1-2 c1-r c1-48 c1-5g c1-5h c1-5e c1-12 c1-u c1-ep c1-b4 c1-b c1-c c1-d c1-e c1-f c1-g']")).click();
		System.out.println("Pop up closed");
		
		// ------------------Select dropdown ----------------------------
		driver.switchTo().frame(0);
		
		WebElement country = driver.findElement(By.xpath("//select[@class='form-control dropdown']"));
		Select sel = new Select(country);
		sel.selectByVisibleText("Worcestershire");
		
		System.out.println("Dropdown Completed");
			
	}

}
