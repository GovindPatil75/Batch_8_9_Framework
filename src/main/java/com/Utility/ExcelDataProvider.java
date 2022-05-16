package com.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String excelpath=System.getProperty("user.dir")+"\\TestData\\Data.xlsx";
		FileInputStream fis1=new FileInputStream(excelpath);
		 wb=new XSSFWorkbook(fis1);
		
	}
	
	public String getStringData(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
