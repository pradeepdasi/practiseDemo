package com.data;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class btnsDemo {
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void ControlMouseClick(WebElement ele) {
		Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).build().perform();
		ele.click();
		action.keyUp(Keys.CONTROL).build().perform();
	}

	public static void headersDemo() throws Exception {

	}

	public static void windowHandle() {
		String parentWindow = driver.getWindowHandle();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> i1 = windows.iterator();
		while (i1.hasNext()) {
			String ChildWindow = i1.next();
			if (!parentWindow.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
				driver.close();
				System.out.println("Child window closed");
			}
		}
		driver.switchTo().window(parentWindow);
	}

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("https://rahulshettyacademy.com/client");

			driver.findElement(By.id("userEmail")).sendKeys("kumartest.d@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.id("userPassword")).sendKeys("Pradeep123@");

			driver.findElement(By.name("login")).click();

			System.out.println(driver.getTitle());

			List<WebElement> links = driver.findElements(By.cssSelector("button[class*=btn-custom]"));

			for (WebElement printer : links) {

				int size = 0;
				if (printer.getText().contains("ORDERS")) {
					printer.click();
					Thread.sleep(3000);
					size++;
					windowHandle();

				} else if (printer.getText().contains("Cart")) {
					printer.click();
					Thread.sleep(3000);
					size++;
					windowHandle();

				}

				if (size == 2)
					break;

			}

		} catch (StaleElementReferenceException e) {
			driver.navigate().back();

			WebElement ele = driver.findElement(By.xpath("(//*[@class='btn btn-custom'])[2]"));
			String addedWishlistProduct = ele.getText();

			List<WebElement> links = driver.findElements(By.cssSelector("button[class*=btn-custom]"));
			

			for (WebElement printer : links) {

				int size = 0;
				if (printer.getText().contains("ORDERS") &&!addedWishlistProduct.contains("ORDERS")) {
					printer.click();
					Thread.sleep(3000);
					size++;
					windowHandle();

				} else if (printer.getText().contains("Cart") &&!addedWishlistProduct.contains("Cart") ) {
					printer.click();
					Thread.sleep(3000);
					size++;
					windowHandle();

				}

				
				  if (size == 2) 
					  break;
				 

			}

			
		}
		finally {
			driver.quit();
		}
	}
}