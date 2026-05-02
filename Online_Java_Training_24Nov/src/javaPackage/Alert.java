package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) throws Exception {
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://demoqa.com/alerts");
	    
	    //Accept Alert - Using JavaScriptExecutor
	    Thread.sleep(3000);
	    JavascriptExecutor jse = (JavascriptExecutor) driver ;
	    jse.executeScript("document.getElementById('confirmButton').click()");
	    Thread.sleep(3000);
	    driver.switchTo().alert().accept();
	    System.out.println("Alert Accepted");
	    
	    //Dismiss Alert - Using JavaScriptExecutor
	    Thread.sleep(3000);
	    jse.executeScript("document.getElementById('confirmButton').click()");
	    Thread.sleep(3000);
	    driver.switchTo().alert().dismiss();
	    System.out.println("Alert Dismissed");
	}

}
