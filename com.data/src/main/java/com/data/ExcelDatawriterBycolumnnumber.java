package com.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDatawriterBycolumnnumber {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\authenticationData.xlsx");

		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("LoginDetails");
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(4);
		if(cell==null) {
			cell=row.createCell(4);
			
		}
		cell.setCellValue("failed");
		FileOutputStream fos = new FileOutputStream(
				"C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\authenticationData.xlsx");
		wb.write(fos);

		wb.close();
		fis.close();

	}

}
