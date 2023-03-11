package com.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatawriterBycolumnName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\authenticationData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("LoginDetails");
		
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell=null;
		int cellIndex=0;
		for(int i=0;i<row.getLastCellNum();i++) {
			
			if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase("Result")) 
				cellIndex=i;
			
		}
		row=sheet.getRow(3);
		cell=row.getCell(cellIndex);
		cell.setCellValue("Passed");
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\authenticationData.xlsx");
		wb.write(fos);
		
		wb.close();
		fis.close();
		}catch(NullPointerException e) {
			e.getSuppressed();
		}

	}

}
