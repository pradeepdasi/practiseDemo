package com.data;

public class DataManagement {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		ExcelMethodOverloading e=new ExcelMethodOverloading("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\suite.xlsx");
	
	String sheetName="data";
	String testName="TestA";
	
	int testStartRowNum=0;
	
	while(!e.getcellData(sheetName, 0, testStartRowNum).equals(testName)) {
		
		testStartRowNum++;
	}
	
	System.out.println("Test start row number is:"+testStartRowNum);
	
	int colStartRownum=testStartRowNum+1;
	
	int dataStartRowNum=testStartRowNum+2;
	
	//calculate howmany rows of data
	int rows=0;
	
	while(!e.getcellData(sheetName,0, dataStartRowNum).equals("")) {
		rows++;
	}
	System.out.println("Total rows are:"+rows);
	//calculate columns of data
	
	int cols=0;
	while(!e.getcellData(sheetName, cols, colStartRownum).equals("")) {
		cols++;
	}
	System.out.println("Total cols are :"+cols);
	
	//Read the test data
	
	for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++) {
		for(int cNum=0;cNum<cols;cNum++) {
			System.out.println(e.getcellData(sheetName, cNum, rNum));
		}
	}
	
	
	}

}
