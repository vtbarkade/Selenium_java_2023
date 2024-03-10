package Practice_Selenium.Practice_Mar_24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Data_Table {

	public static void main(String[] args) {
		//Data Table 

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/tables");
		
		for(int i=1;i<=6;i++)
		{
			
			String header1 = driver.findElement(By.xpath("//table[@id='table1']//child::th["+i+"]")).getText();
			System.out.print(header1+"\t");
			
		}
		System.out.println();
		
		for(int j=1;j<=4;j++)
		{
			for(int k=1;k<=6;k++)
			{
				String row =driver.findElement(By.xpath("//table[@id='table1']//tbody//tr["+j+"]"+"//td["+k+"]")).getText();
				System.out.print(row+"\t");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println(driver.findElement(By.xpath("//p[3]")).getText());
		
		for(int i=1;i<=6;i++)
		{
			
			String header2 = driver.findElement(By.xpath("//table[@id='table2']//tr[1]//th["+i+"]//span")).getText();
			System.out.print(header2+"\t");
			
		}
		System.out.println();
		
		for(int l=1;l<=4;l++)
		{
			for(int m=1;m<=6;m++)
			{
				String row =driver.findElement(By.xpath("//table[@id='table2']//tbody//tr["+l+"]//td["+m+"]")).getText();
				System.out.print(row+"\t");
			}
			System.out.println();
		}
	}

}
