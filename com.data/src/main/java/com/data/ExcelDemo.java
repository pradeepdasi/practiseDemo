package com.data;

public class ExcelDemo {

	
	public static void main(String[] args) throws Exception {
		
		// TODO Auto-generated method stub
		
		//facebook program
		
		ExcelMethodOverloading e = new ExcelMethodOverloading("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\authenticationData.xlsx");

	System.out.println(e.getRowCount("LoginDetails"));
	System.out.println(e.columnCount("LoginDetails"));
	System.out.println(e.getcellData("LoginDetails",2, 3));
	System.out.println(e.getCellData("LoginDetails", "Password",3));
	System.out.println(e.setCellData("LoginDetails","Result", 4, "passed"));
	
	
	
	
	}

}
