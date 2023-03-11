package com.data;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelData {

	public static void main(String[] args) throws Exception {

		FileInputStream fis = new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\abhi.xlsx");

//standlone program type
		/*
		 * XSSFWorkbook wb = new XSSFWorkbook(fis); XSSFSheet sheet =
		 * wb.getSheet("login"); XSSFRow row = sheet.getRow(0); XSSFCell cell =null; int
		 * cellIndex=0; for(int i=0;i<row.getLastCellNum();i++) {
		 * if(row.getCell(i).getStringCellValue().trim().equals("Password"))
		 * cellIndex=i; } row=sheet.getRow(2); cell=row.getCell(cellIndex); String
		 * str=cell.getStringCellValue(); System.out.println(str); wb.close();
		 * fis.close();
		 */
		// excel data write by column number

		/*
		 * XSSFWorkbook wb=new XSSFWorkbook(fis); XSSFSheet sheet =
		 * wb.getSheet("login"); XSSFRow row = sheet.getRow(1); XSSFCell cell =
		 * row.getCell(4);
		 * 
		 * cell.setCellValue("passed");
		 * 
		 * FileOutputStream fos = new FileOutputStream(
		 * "C:/Users/admin/eclipse-workspace/com.data/Excels/dataProgress.xlsx");
		 * 
		 * wb.write(fos);
		 * 
		 * wb.close(); fis.close();
		 * 
		 */
		//button[class*=btn-custom]
		 XSSFWorkbook wb = new XSSFWorkbook(fis);
		// Assuming the age values are in the first column of the first sheet
		int sheetIndex =0;
        int Age = 1;
        int status = 2;
       
        for (Row row : wb.getSheetAt(sheetIndex)) {
            Cell cell = row.getCell(Age);
            if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
                double age = cell.getNumericCellValue();
               Cell statuCell=row.getCell(status);
               if(statuCell==null) {
            	   //if status cell doesn't exist,
            	   statuCell=row.createCell(status);
            	   
               }
                if (age > 18) {
                   
                	statuCell.setCellValue("Major");
                } else {
                	statuCell.setCellValue("Minor");
                   
                }
            }
        }

		FileOutputStream fos = new FileOutputStream("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\abhi.xlsx");
		wb.write(fos);
		wb.close();

		fis.close();

	}

}
