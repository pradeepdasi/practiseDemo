package com.data;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class DataManagementWithDataProvider {
  @Test(dataProvider = "getData")
  public void f(Hashtable<String,String> obj)
  {
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception {
    
		
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
	int dataRow=0;
	//hashtable has consider only one clolumn so thats why i passed here '1' insted of passing "cols"
	Object[][] data=new Object[rows][1];
	Hashtable<String, String> table=null;
	
	for(int rNum=dataStartRowNum;rNum<dataStartRowNum+rows;rNum++) {
		
		table=new Hashtable<String, String>();
		for(int cNum=0;cNum<cols;cNum++) {
			//System.out.println(e.getcellData(sheetName, cNum, rNum));
		//data[dataRow][cNum]=e.getcellData(sheetName, cNum, dataStartRowNum);
		
			//colstartrownum=teststarrow+1;
			String key = e.getcellData(sheetName, cNum, colStartRownum);
			//rNum=dataStartRowNum==testStartRowNum+2
		String value = e.getcellData(sheetName, cNum, rNum);
			table.put(key, value);
		}
		data[dataRow][0]=table;
		dataRow++;
	}
	
	
	  return data;
  }
}
