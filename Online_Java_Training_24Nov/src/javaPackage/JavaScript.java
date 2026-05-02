package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws Exception {
		
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    
	    //Delete all cookies
	    driver.manage().deleteAllCookies();
	    
	    // JavaScriptExecutor
	    JavascriptExecutor jse = (JavascriptExecutor) driver ;
	    
	    // Locate web element using Java Script
	    jse.executeScript("document.getElementById('email').value='abc@gmail.com'");
	    jse.executeScript("document.getElementsByName('pass')[0].value='abc123645'");
	    jse.executeScript("document.getElementsByName('login')[0].click()");
	    
	    //Scrolldown using Java script
	    Thread.sleep(3000);
	    jse.executeScript("window.scrollBy(0, 500)");
	    
	    //Scrollup using Java script
	    Thread.sleep(3000);
	    jse.executeScript("window.scrollBy(0,-500)");
	    
	}

}
