package Practice_Selenium.Practice_Mar_24;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class New_3_Excel_Read {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream srcfile = new FileInputStream("C:\\Users\\Nine\\eclipse-workspace\\Selenium_java_2023\\Test_Data\\read.xlsx");
		
		XSSFWorkbook wbook = new XSSFWorkbook(srcfile);
		XSSFSheet sheet =wbook.getSheet("Sheet1");
		
		int R_cnt =sheet.getLastRowNum();
		int C_cnt = sheet.getRow(0).getLastCellNum();
		
		for(int r=0;r<=R_cnt;r++)
		{
			//XSSFRow row = sheet.getRow(r);
			
			for(int c=0;c<C_cnt;c++)
			{
				
				System.out.print(sheet.getRow(r).getCell(c)+"\t");
				
			}
			System.out.println();
		}
		
	}

}
