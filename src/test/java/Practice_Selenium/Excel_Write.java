package Practice_Selenium;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\Test_Data\\write.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter values : ");
		
	   XSSFSheet sheet = wbook.createSheet("Sheet1");
	   for(int r=0;r<2;r++)
	   {
		  XSSFRow current_row =  sheet.createRow(r);
		  
		  for(int c=0;c<3;c++)
		  {
			  String value= in.next();  // Getting String input 
			  
			  current_row.createCell(c).setCellValue(value); // writing data in cell
						  
		  }
	   }
	
	   wbook.write(file); // IMP : writing data in file
	   wbook.close();
	   file.close();
	   in.close();
	   
	   System.out.println(" Writing Done !!!");
	
	}

}
