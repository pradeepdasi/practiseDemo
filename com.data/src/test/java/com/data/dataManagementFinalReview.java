package com.data;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class dataManagementFinalReview {
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> obj)
  {
	  if(obj.get("RunMode").equals("N"))
		  throw new SkipException("TestCase skiped due to runmode N");
	  System.out.println(obj.get("Browser"));
	  System.out.println(obj.get("UserName"));
	  System.out.println(obj.get("UserPassword"));
  }

  @DataProvider
  public Object[][] getData() throws Exception {
		ExcelMethodOverloading e=new ExcelMethodOverloading("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\suite.xlsx");
		
		String sheetName="data";
		String testName="TestA";
		return DataUtil.getTestData(e, sheetName, testName);
	  
	  
  }
}
