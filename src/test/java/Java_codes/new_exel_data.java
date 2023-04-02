package Java_codes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class new_exel_data {

	public static void main(String[] args) throws IOException {
		
				
		FileInputStream exlfile = new FileInputStream("C:\\Users\\vijay\\Desktop\\new.xlsx");
		XSSFWorkbook wbook = new XSSFWorkbook(exlfile);
		XSSFSheet s1= wbook.getSheet("sheet2");
		System.out.println(s1.getRow(1).getCell(0).getStringCellValue());
		System.out.println(s1.getRow(1).getCell(1).getStringCellValue());
		System.out.println(s1.getRow(2).getCell(2).getNumericCellValue());
		wbook.close();
	}

}
