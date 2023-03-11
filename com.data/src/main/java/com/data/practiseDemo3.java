package com.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class practiseDemo3 {
	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public XSSFWorkbook wb = null;
	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	public String xlpath;

	public practiseDemo3(String xlpath) throws Exception {
		System.out.println("Excle has instialized...");
		this.xlpath = xlpath;
		fis = new FileInputStream(xlpath);
		wb = new XSSFWorkbook(fis);

	}

	public int getRowCount(String sheetName) {

		sheet = wb.getSheet(sheetName);
		int rowcount = sheet.getLastRowNum() + 1;

		return rowcount;

	}

	public int getclocount(String sheetName) {

		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(0);
		int cellcount = row.getLastCellNum();

		return cellcount;
	}

	// excel by using number

	public String getCellData(String sheetName, int colNum, int rowNum) {

		try {
			sheet = wb.getSheet(sheetName);
			row = sheet.getRow(rowNum);
			cell = row.getCell(colNum);

			if (cell.getCellTypeEnum() == CellType.STRING)
				return cell.getStringCellValue();
			else if (cell.getCellTypeEnum() == CellType.NUMERIC || cell.getCellTypeEnum() == CellType.FORMULA) {
				String cellValue = String.valueOf(cell.getNumericCellValue());
				if (HSSFDateUtil.isCellDateFormatted(cell)) {
					DateFormat dt = new SimpleDateFormat("dd//mm//yyyy");
					Date date = cell.getDateCellValue();
					cellValue = dt.format(date);
				}
				return cellValue;
			} else if (cell.getCellTypeEnum() == CellType.BLANK)
				return "";
			else
				return String.valueOf(cell.getBooleanCellValue());
		} catch (Exception e) {
			e.printStackTrace();
			return "No matching value";
		}

	}

	// Readinf cell data from
	public String getCellData(String sheetName, String colname, int rowNum) {
		try {
		int colNum=-1;
		sheet = wb.getSheet(sheetName);
		row = sheet.getRow(0);
		for (int i = 0; i < row.getLastCellNum(); i++) {
			
			if (row.getCell(i).getStringCellValue().trim().equals(colname))
				colNum = i;
		}
		
		row=sheet.getRow(rowNum);
		cell=row.getCell(colNum);
		if(cell.getCellTypeEnum()==CellType.STRING)
			return cell.getStringCellValue();
		else if(cell.getCellTypeEnum()==CellType.NUMERIC||cell.getCellTypeEnum()==CellType.FORMULA) {
			
		
			String cellValue=String.valueOf(cell.getNumericCellValue());
		
			if(HSSFDateUtil.isCellDateFormatted(cell)) {
				DateFormat dt=new SimpleDateFormat("dd//mm//yyyy");
				Date date=cell.getDateCellValue();
				cellValue=dt.format(date);
			}
			return cellValue;
		}else if(cell.getCellTypeEnum()==CellType.BLANK) 
			return "";
			else 
				return String.valueOf(cell.getBooleanCellValue());
		}catch(Exception e) {
			e.printStackTrace();
			return "No matching value";
		}

	}
		
	public boolean setCellData(String sheetName,int colNum,int rownum,String value) {
		try {
			sheet=wb.getSheet(sheetName);
			row=sheet.getRow(rownum);
			cell=row.getCell(colNum);
			cell.setCellValue(value);
			
			fos=new FileOutputStream(xlpath);
			wb.write(fos);
			fos.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public boolean setCellData(String sheetName,String colName,int rownum,String value) {
		try {
			int colnum=-1;
			sheet=wb.getSheet(sheetName);
			row=sheet.getRow(rownum);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().trim().equals(colName)) {
				
					colnum=i;
				}
			}
			row=sheet.getRow(rownum+1);
			cell.setCellValue(value);
			fos=new FileOutputStream(xlpath);
			wb.write(fos);
			fos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		practiseDemo3 e = new practiseDemo3("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\abhi.xlsx");
		System.out.println(e.getRowCount("Sheet1"));
		System.out.println(e.getclocount("Sheet1"));

	}

}
