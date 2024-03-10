package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Key_Presses {

	public static void main(String[] args) {
		// Key Presses program
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/key_presses");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter Characters : ");
		
		for(int i=0;i<=5;i++)
		{
			String in = sc.next();
			driver.findElement(By.xpath("//input[@id='target']")).sendKeys(in);
			String out_Text =driver.findElement(By.xpath("//p[@id='result']")).getText();
			System.out.println(out_Text);
		}
		sc.close();
		driver.close();
	}

}
