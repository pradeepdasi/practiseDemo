package com.data;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRedaerByColumnNumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		FileInputStream f=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\authenticationData.xlsx");
		
		System.out.println(f);
		
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet sheet = wb.getSheet("LoginDetails");
		
		XSSFRow row=sheet.getRow(1);
		/*
		 * Iterator<Cell> itr = row.cellIterator(); while(itr.hasNext()) { Cell cv =
		 * itr.next();
		 * 
		 * System.out.println(cv.getStringCellValue()); }
		 */
		//.........................................................
		XSSFCell cell = row.getCell(1);
		String str=cell.getStringCellValue();
		System.out.println(str);
	wb.close();
	f.close();
		
		
	}

}
