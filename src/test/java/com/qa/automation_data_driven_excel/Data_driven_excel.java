package com.qa.automation_data_driven_excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven_excel {


		
		public void readFromExelSheetTN (String sheetname) throws Exception {
			
		FileInputStream ip = new FileInputStream (System.getProperty("user.dir")+ "\\src\\test\\java\\com\\qa\\automation_data_driven_excel\\DATA_DRIVEN_TESTING_DATA.xls");	
		XSSFWorkbook workbook = new XSSFWorkbook (ip);
		XSSFSheet sheet = workbook.getSheet(sheetname);	
		int rows = sheet.getFirstRowNum();
		int cols = sheet.getRow(0).getLastCellNum();
		//Create a 2-Dimensional object Array and then return the object Array
		Object[][] data = new Object [rows][cols];
		for (int i=0; i<rows; i++) {
			
			XSSFRow row = sheet.getRow(i+1);
			for(int j=0; j<cols; j++ ) {
			XSSFCell cell = row.getCell(j);	
			CellType celltype= cell.getCellType();	
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
	}


