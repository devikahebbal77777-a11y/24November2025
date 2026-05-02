package javaPackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandling {

	public static void main(String[] args) throws InterruptedException {
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/browser-windows/");
	    
	    //Step 1 - Tab Handling
	    Thread.sleep(3000);
	    driver.findElement(By.id("tabButton")).click();
	    Set<String> allWindowsid = driver.getWindowHandles();
	    System.out.println("All Windows ID: " + allWindowsid);
	    
	    String parentWindowid = driver.getWindowHandle();
	    System.out.println("Parent Windoe ID: " + parentWindowid);
	    
	    for(String abcd : allWindowsid) {
	    	driver.switchTo().window(abcd);
	    	if(abcd.equalsIgnoreCase(parentWindowid)) {
	    		System.out.println("Parent Tab Title: " + driver.getTitle());
	    	}else {
	    		System.out.println("Child Tab URL: " + driver.getCurrentUrl());
	    	}
	    }
	    Thread.sleep(5000);
	    driver.close();
	    
	    //Step 2 - Window Handling
	    driver.switchTo().window(parentWindowid);
	    Thread.sleep(5000);
	    JavascriptExecutor jse = (JavascriptExecutor) driver ;
	    jse.executeScript("document.getElementById('windowButton').click()");
	    Set<String> allWindowsid2 = driver.getWindowHandles();
	    System.out.println("All Windows ID2: " + allWindowsid2);
	    
	    for (String window : allWindowsid2) {
	    	driver.switchTo().window(window);
	    	System.out.println("Window ID: " + window);
	    	System.out.println("Title: " + driver.getTitle());
	    	System.out.println("URL: " + driver.getCurrentUrl());	
	    }
	    Thread.sleep(5000);
	    driver.quit();
	    System.out.println("Windows and Tabs Handled");
	}

}
