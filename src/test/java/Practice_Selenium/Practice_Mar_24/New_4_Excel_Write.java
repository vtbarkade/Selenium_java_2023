package Practice_Selenium.Practice_Mar_24;

import java.io.FileOutputStream;

import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class New_4_Excel_Write {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		XSSFWorkbook wbook = new XSSFWorkbook();
		XSSFSheet sheet =wbook.createSheet("Sheet1");
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" Plz Enter data : ");
		for(int r=0;r<=1;r++)
		{
			XSSFRow curnt_row = sheet.createRow(r);
			for(int c=0;c<=2;c++)
			{
				
				curnt_row.createCell(c).setCellValue(sc.next());
			}
			
		}
		sc.close();
		FileOutputStream file1 = new FileOutputStream("C:\\Users\\Nine\\eclipse-workspace\\Selenium_java_2023\\Test_Data\\write.xlsx");
		wbook.write(file1);
		
		System.out.println("Writing Completed in Excel");
		wbook.close();
		file1.close();
	}
	
}
