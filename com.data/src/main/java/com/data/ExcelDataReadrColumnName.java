package com.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReadrColumnName {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\authenticationData.xlsx");

		XSSFWorkbook w = new XSSFWorkbook(fis);
		XSSFSheet sheet = w.getSheet("LoginDetails");
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = null;
		int cellIndex=0;
		for(int i=0;i<row.getLastCellNum();i++) {
			if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase("Password"))
		cellIndex=i;
		}
		
		row=sheet.getRow(2);
		cell=row.getCell(cellIndex);
	String str=	cell.getStringCellValue();
	System.out.println(str);
	w.close();
	fis.close();

	}

}
