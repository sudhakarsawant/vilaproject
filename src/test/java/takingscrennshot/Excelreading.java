package takingscrennshot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Excelreading {
	@Test
	public void sham() throws IOException {
		
		String excelFilepath=".\\datafiles\\excel reading.xlsx";
		FileInputStream InputStream=new FileInputStream(excelFilepath);
		XSSFWorkbook workbook=new XSSFWorkbook(InputStream);
		XSSFSheet sheet=workbook.getSheet("sheet1");
		
		 int row=sheet.getLastRowNum();
		 System.out.println(row);
		 int cols=sheet.getRow(1).getLastCellNum();
		 
		 for(int r=0;r<row;r++) {
			 	XSSFRow rows=sheet.getRow(r);
			 	for(int c=0;c<cols;c++) {
			 		XSSFCell cell=rows.getCell(c);
			 		
			 		
			 		switch (cell.getCellType()){
			 		case STRING: System.out.print(cell.getStringCellValue()); break;
			 		case NUMERIC:System.out.print(cell.getNumericCellValue());break;
			 		case BOOLEAN: System.out.print(cell.getBooleanCellValue());break;
			 		}
			 		System.out.print(" ");
			 	}
			 	System.out.println();
		 } 
		
		
		
	}

}
