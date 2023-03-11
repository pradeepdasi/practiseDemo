package com.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelMethodOverloading {

	public FileInputStream fis = null;
	public FileOutputStream fos = null;
	public XSSFWorkbook wb = null;

	public XSSFSheet sheet = null;
	public XSSFRow row = null;
	public XSSFCell cell = null;
	String xlfilepath;

	public ExcelMethodOverloading(String xlfilepath) throws Exception {
		System.out.println("Excel has intialized....");
		this.xlfilepath=xlfilepath;
		fis=new FileInputStream(xlfilepath);
		wb=new XSSFWorkbook(fis);
		
	}
	
	public int  getRowCount(String sheetName) {
		sheet=wb.getSheet(sheetName);
		
		int rowCount=sheet.getLastRowNum();
		return rowCount;
	}
	
	public int columnCount(String sheetName) {
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(0);
		int colCount = row.getLastCellNum();
		return colCount;
	}
	
	//reading celldata from excel by using column number
	public String getcellData(String sheetName,int colNum,int rowNum) {
		try {
			sheet=wb.getSheet(sheetName);
			row=sheet.getRow(rowNum);
			cell=row.getCell(colNum);
			
			if(cell.getCellTypeEnum()==CellType.STRING) {
				return cell.getStringCellValue();
			}else if(cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA) {
				String cellValue = String.valueOf(cell.getNumericCellValue());
				if(HSSFDateUtil.isCellDateFormatted(cell)) {
					DateFormat d=new SimpleDateFormat("dd/mm/yy");
					Date date = cell.getDateCellValue();
					cellValue=d.format(date);
				}
				return cellValue;
			}else if(cell.getCellTypeEnum()==CellType.BLANK) {
			
				return "";}
				else
					return String.valueOf(cell.getBooleanCellValue());
			
				
			
		}catch(Exception e) {
			e.printStackTrace();
			return "No matching value";
					
		}
		
	}
	
	//reading cell data from excel by using column name
	public String getCellData(String sheetName,String colName,int rowNum) {
		
		try {
			int colNum=-1;
		sheet=wb.getSheet(sheetName);
		row=sheet.getRow(0);
		for(int i=0;i<row.getLastCellNum();i++){
			if(row.getCell(i).getStringCellValue().trim().equals(colName))
				colNum=i;
		}
			row=sheet.getRow(rowNum);
			row.getCell(colNum);
			if(cell.getCellTypeEnum()==CellType.STRING) 
				return cell.getStringCellValue();
				else if(cell.getCellTypeEnum()==CellType.NUMERIC || cell.getCellTypeEnum()==CellType.FORMULA)
				{
				String cellValue=	String.valueOf(cell.getNumericCellValue());
				if(HSSFDateUtil.isCellDateFormatted(cell)) 
				{
					DateFormat dt=new SimpleDateFormat("dd/mm/yyyy");
				Date date=cell.getDateCellValue();
				cellValue=dt.format(date);
				}
				return cellValue;
				
			}
				else if(cell.getCellTypeEnum()==CellType.BLANK)
			return "";
				else return String.valueOf(cell.getBooleanCellValue());
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return "No matching value";
		}
		
		
		
		
	}
	
	//writing cell data to excel by using column number
	public boolean setCellData(String sheetName,int colNum,int rowNum,String value) {
		
		try {
			
			sheet=wb.getSheet(sheetName);
			row=sheet.getRow(rowNum);
			cell=row.getCell(colNum);
			
			cell.setCellValue(value);
			
			fos=new FileOutputStream(xlfilepath);
			wb.write(fos);
			fos.close();
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
		
	}
	
//writing cell data to excel by using column name
	public boolean setCellData(String sheetName,String colName,int rowNum,String value) {
		
		try {
			int colNum=-1;
			sheet=wb.getSheet(sheetName);
			row=sheet.getRow(rowNum);
			for(int i=0;i<row.getLastCellNum();i++) {
				if(row.getCell(i).getStringCellValue().trim().equalsIgnoreCase(colName)) {
				colNum=i;	
				}
			}
			row=sheet.getRow(rowNum+1);
			if(row==null)
				sheet.createRow(rowNum-1);
			cell=row.getCell(colNum);
			if(cell==null)
				cell=row.createCell(colNum);
			cell.setCellValue(value);
			
			fos=new FileOutputStream(xlfilepath);
			wb.write(fos);
			fos.close();
			
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
