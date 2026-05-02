package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {
	
	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
	
	@Test
	public void doLogin() {
	     //set the property of chrome browser
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
		t1.driver = new ChromeDriver();
	    t1.driver.manage().window().maximize();
	    t1.driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    t1.driver.get("https://www.facebook.com/");
	    t1.driver.findElement(By.id("wrong_id")).click();
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenshot(result2);
	}

}
