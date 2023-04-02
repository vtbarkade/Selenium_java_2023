package Practice_Selenium;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Excel_Read {

	public static void main(String[] args) throws IOException {
		
				
		FileInputStream srcfile = new FileInputStream(System.getProperty("user.dir")+"\\Test_Data\\read.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(srcfile);
		 
		XSSFSheet sheet = wbook.getSheet("Sheet1");
		
		int row_cnt = sheet.getLastRowNum(); //4
		int cell_cnt = sheet.getRow(0).getLastCellNum();//4
		
		for(int r=0;r<=row_cnt;r++)
		{
			XSSFRow current_row =sheet.getRow(r);
			
			for(int c=0;c<cell_cnt;c++)
			{
				
				System.out.print(current_row.getCell(c).toString() + "     ");
			}
			System.out.println();
		}
		
		wbook.close();
		srcfile.close();
	}

}
