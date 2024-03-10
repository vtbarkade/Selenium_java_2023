package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Practice_demoblaze_E_Store {

	public static void main(String[] args) {
		// Demoblaze e commerce
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.demoblaze.com/index.html");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
		driver.findElement(By.xpath("//a[text()='2017 Dell 15.6 Inch']")).click();
		driver.findElement(By.xpath("//a[text()='Add to cart']")).click();
		
				
		System.out.println(wait.until(ExpectedConditions.alertIsPresent()).getText());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.xpath("//a[text()='Cart']")).click();
		
		String prod_name =driver.findElement(By.xpath("//td[text()='2017 Dell 15.6 Inch']")).getText();
		String price = driver.findElement(By.xpath("//td[text()='700']")).getText();
		Assert.assertEquals(prod_name, "2017 Dell 15.6 Inch");
		Assert.assertEquals(price, "700");
		
		String cart_cost= driver.findElement(By.xpath("//h3[text()='700']")).getText();
		Assert.assertEquals(cart_cost, "700");
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("vijay");
		driver.findElement(By.xpath("//input[@id='country']")).sendKeys("India");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@id='card']")).sendKeys("56433769345");
		driver.findElement(By.xpath("//input[@id='month']")).sendKeys("12");
		driver.findElement(By.xpath("//input[@id='year']")).sendKeys("25");
		
		driver.findElement(By.xpath("//button[text()='Purchase']")).click();
		
		WebElement print = driver.findElement(By.xpath("//h2[text()='Thank you for your purchase!']"));
		
		System.out.println(wait.until(ExpectedConditions.visibilityOf(print)).getText());
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
	}

}
