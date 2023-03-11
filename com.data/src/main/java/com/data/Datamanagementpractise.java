package com.data;

public class Datamanagementpractise {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		practiseDemo3 e=new practiseDemo3("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\suite.xlsx");
		String sheetName="Sheet1";
		String testname="TestA";
		// to find the mathcing test rownumber
		
		int teststratRowNum=0;
		while(!e.getCellData(sheetName, 0, teststratRowNum).equals("")) {
			
			teststratRowNum++;
		}
		
		System.out.println("teststartrs row number:"+teststratRowNum);
		
		int colStartRowNum=teststratRowNum+1;
		int datastartRowNum=teststratRowNum+2;
		int rows=0;
		while(!e.getCellData(sheetName, 0, datastartRowNum+rows).equals("")) {
		rows++;
		}
		System.out.println("col stars row num:"+rows);
		int cols=0;
		for(int rNum=datastartRowNum;rNum<datastartRowNum+rows;rNum++) {
			for(int cNum=0;cNum<cols;cNum++) {
				System.out.println(e.getCellData(sheetName, cNum, rNum));
				
				
			}
		}
	}

}
