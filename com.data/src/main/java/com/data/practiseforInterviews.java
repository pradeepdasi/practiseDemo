package com.data;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class practiseforInterviews {
	public static WebDriver driver;
	
	public practiseforInterviews() {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public static String getMethodName() {
		Object methodName=Thread.currentThread().getStackTrace()[1];
		getMethodName();
		System.out.println(methodName);
		
		return (String) methodName;
		
	}
	public static void takeScreenshot(WebElement element,String destination) throws Exception {
		File v=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(v, new File(destination));
		
		
	}
	
	public static void pressKeyDown(WebElement ele) {
		
		ele.findElement(By.cssSelector("")).sendKeys(Keys.DOWN);
		
	}
	
	public void presskeyenter(WebElement ele) {
		ele.sendKeys(Keys.ENTER);
		
	}
	public void pressKeyUp(WebElement ele) {
		ele.sendKeys(Keys.UP);
		
	}
	
	public void moveToTab(WebElement ele) {
		ele.sendKeys(Keys.chord(Keys.ALT,Keys.TAB));
	}
	
	public static void HTTPBrowser() {
		driver.navigate().to("javascript.document.getElmenetById('overrridenlink').click()");
		
	}
	public void waitToPageLoad(int i) {
		driver.manage().timeouts().pageLoadTimeout(i,TimeUnit.SECONDS);
	}
	
	public void clickAllLinks() throws Exception {
		List<WebElement> links=driver.findElements(By.xpath("ab"));
		for(WebElement link:links) {
			link.click();
			driver.getCurrentUrl();
			Thread.sleep(2000);
			driver.navigate().back();
			
		}
	}
	public void KeyBoardEvents(WebElement ele,Keys key,String alphbet) {
		ele.sendKeys(Keys.chord(key,alphbet));
		
	}
	
	public void waitmytime(int i) {
		driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
	}
	
	public void textclear(WebElement ele) {
		ele.clear();
	}
	
	public static void ClcikWebElementEnable(WebElement ele) {
		boolean elementsclickable=ele.isEnabled();
		
	
		
		while(elementsclickable) {
			ele.click();
		}
	}
	
	public static void clickdisplay(WebElement ele) {
		boolean elementslickable=ele.isDisplayed();
		while(elementslickable) {
			ele.click();
		}
		
	}
public static void clickdiselected(WebElement ele) {
	boolean elementsclickable=ele.isSelected();
	while(elementsclickable) {
		ele.click();
		
	}
	}



public static void clickmultipleElements(WebElement ele,WebElement someotherElement) {
	Actions a=new Actions(driver);
	a.keyDown(Keys.CONTROL).click(ele).click(someotherElement).keyUp(Keys.CONTROL).build().perform();
	
	
}

public static void highlitedElement(WebElement ele) {
	for(int i=0;i<4;i++) {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAtribute('style'arguments[1])",ele,"color,solid:redborder.6px solid yellow");
		
	}
}

public static boolean checkalertAccept() {
	try {
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		return true;
		
	}catch(Exception e) {
		System.out.println("no alert");
		return false;
	}
}
	
	static By ab=By.cssSelector(".mb3");
	public static WebElement a=driver.findElement(By.xpath(".mb3"));
	public static WebElement b=driver.findElement(By.xpath(".mb3"));
	public static WebElement c=driver.findElement(By.xpath(".mb3"));
	public static List<WebElement> ad=driver.findElements(By.xpath(".mb3"));
	public static WebElement ae=driver.findElement(By.xpath(".mb3"));
	public static WebElement af=driver.findElement(By.xpath(".mb3"));
	public static WebElement add=driver.findElement(By.xpath(".mb3"));

	public static boolean getProductList() {
		waitForElement(a, ad, ab, getMethodName());
		driver.findElement(ab);
		System.out.println("app ready to use");
		return false;
	}
	
	public static void scrollToelement(WebElement ele) {
		Coordinates corodinate= ((Locatable)ele).getCoordinates();
		corodinate.onPage();
		corodinate.inViewPort();
		
	}
	public void checkbox(WebElement checkbox) {
		
		boolean checkstatus=checkbox.isSelected();
		if(checkstatus==true) {
			System.out.println("check box is already checked");
		}else {
			checkbox.click();
			System.out.println("checked the checkbox");
		}
	}
	public void radiobutton(WebElement radiobtn) {
		
		boolean radiobtnstatus=radiobtn.isSelected();
		if(radiobtnstatus==true) {
		System.out.println("radio btn is checked");	
		}else {
			radiobtn.click();
			System.out.println("click the radio btn");
		}
		
	}
	public void checkbox_unchecking(WebElement uncheckbox) {
		boolean uncheck=uncheckbox.isSelected();
		if(uncheck==true) {
			System.out.println("checkbox is uncheked");
		}else {
		System.out.println("checkbox is already unchecked");
		}
		
	}
	
	public void dragAndDrop(WebElement fromele,WebElement Toele) {
		Actions a=new Actions(driver);
		a.dragAndDrop(fromele, Toele);
		
	}
	public void dragAndDrop_Method2(WebElement fromele,WebElement Toele) {
		
		Actions a=new Actions(driver);
		a.clickAndHold(fromele).moveToElement(Toele).perform();
		
	a.release(Toele).build().perform();
	}
	
	public static String getToolTip(WebElement tooltip) {
		
		String tool=tooltip.getAttribute("title");
		System.out.println("tool text:"+tooltip);
		return tool;
	}
	public void selectElementByNameMethod(WebElement ele,String Name) {
		Select selectname=new Select(ele);
		selectname.selectByVisibleText(Name);
		
		
	}
	public void selectByValue(WebElement ele,String value) {
		Select s=new Select(ele);
		s.selectByValue(value);
		
	}
	public void selctByIndex(WebElement ele,int i) {
		
		Select s=new Select(ele);
		s.selectByIndex(i);
		}
	
	
	
	
	public void checkboxFromlist(String xpathOfElement,String valueToSelect) {
		List<WebElement> list=driver.findElements(By.xpath(xpathOfElement));
		for(int i=0;i<list.size();i++) {
			List<WebElement> dr=list.get(i).findElements(By.tagName("label"));
			for(WebElement f:dr) {
				System.out.println("value in the list"+f.getText());
				if(valueToSelect.equals(f.getText())) {
					f.click();
					break;
					
				}
				
			}
		}
		
	}
	
	public void downloadfile(String href,String filename) throws Exception {
		URL url=null;
		URLConnection con=null;
		int i;
		url=new URL(href);
		con=url.openConnection();
		File f=new File(""+filename);
		BufferedInputStream bi=new BufferedInputStream(con.getInputStream());
		BufferedOutputStream bo=new BufferedOutputStream(new FileOutputStream(f));
		
		new FileOutputStream(f);
		
		while((i=bi.read())!=-1) {
			bo.write(i);
		}
		bo.flush();
		bi.close();
		
	}
	
	
	public void navigatToEveryPageLink() {
		List<WebElement> linksize=driver.findElements(By.tagName("a"));
		int linkcount=linksize.size();
		System.out.println(linkcount);
		String[] link=new String[linkcount];
		System.out.println("list of links avaialable");
		for(int i=0;i<linkcount;i++) {
			link[i]=linksize.get(i).getAttribute("href");
			System.out.println(linksize.get(i).getAttribute("href"));
		}	
			//naviagte to each link page
		for(int j=0;j<linkcount;j++) {
			driver.navigate().to(link[j]);
			System.out.println(driver.getTitle());
		}
			
		}
	
		
		
		
		
				
	/* WebElement element=driver.findElement(By.xpath("")) */
	public static void waitForElement(WebElement element,List<WebElement> elements,By el2,String text) {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		wait.until(ExpectedConditions.presenceOfElementLocated(ab));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		wait.until(ExpectedConditions.elementToBeSelected(element));
		wait.until(ExpectedConditions.elementToBeSelected(element));
		wait.until(ExpectedConditions.textToBePresentInElement(element,text));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(element));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println(getProductList());

		

	}

}
