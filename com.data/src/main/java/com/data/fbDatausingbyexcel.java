package com.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class fbDatausingbyexcel {
public static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		ExcelMethodOverloading e = new ExcelMethodOverloading("C:\\Users\\admin\\eclipse-workspace\\com.data\\Excels\\Datsheet.xlsx");

		//multiple sets of data entering from excel if excel has different data 
		for(int i=1;i<e.getRowCount("Data");i++) {
			driver.findElement(By.xpath("//input[@name='email']")).clear();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(e.getCellData("Data","UserName",i));
		
		Thread.sleep(1000);
		
		}
		
	}

}
