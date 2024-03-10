package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class New_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.get("https://www.flipkart.com/");
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     
     driver.findElement(By.xpath("//input[@title='Search for Products, Brands and More']")).sendKeys("littles diaper m size");
     
     driver.findElement(By.xpath("//div[@class='_1sFryS _2alaMB']//child::button")).click();
     
     driver.findElement(By.xpath("//div[@class='_13oc-S']//child::div[text()='₹549']//preceding::a[1]")).click();
     
     String Mainwindow = driver.getWindowHandle();
     Set<String> childwindows = driver.getWindowHandles();
     
     for(String childwindow:childwindows)
     {
    	 if(! Mainwindow.equalsIgnoreCase(childwindow))
    	 {
    		 driver.switchTo().window(childwindow);
    		
    		 try
    		 {
    			 driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("415003");
    		 }
    		 catch(Exception e)
    		 {
    			 driver.switchTo().window(childwindow);
    			 driver.findElement(By.xpath("//input[@id='pincodeInputId']")).sendKeys("415003");
    		 }
    		 
    		 driver.findElement(By.xpath("//span[text()='Check']")).click();
    		 
    		 try
    		 {
    			 driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
    		 }
    		catch(Exception e)
    		 {
    			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
    		 }
    		 
    		
    	 }
     }
     driver.switchTo().window(Mainwindow);
     driver.navigate().refresh();
    String count = driver.findElement(By.xpath("//div[@class='KK-o3G']")).getText();
     Assert.assertEquals(count, "1","Cart count is not equal to 1");
     System.out.println(" Program succesfully Executed");
       
     driver.quit();
	}

}
