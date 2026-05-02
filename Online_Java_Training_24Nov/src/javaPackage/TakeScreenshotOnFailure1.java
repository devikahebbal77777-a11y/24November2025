package javaPackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class TakeScreenshotOnFailure1 {
	
	WebDriver driver;
	
	//ITestResult will provide the test case execution status and test name
	public void captureScreenshot(ITestResult result) throws Exception {
		if(ITestResult.FAILURE == result.getStatus()) {
			//Create ref of TakesScreenshot Interface and TypeCasting
			TakesScreenshot ts = (TakesScreenshot) driver;
			
			//Use getScreenshotAs() to capture the screenshot in the file format
			File sourcefile = ts.getScreenshotAs(OutputType.FILE);
			
			//Copy the file to specific location
			File destFolder = new File("./screenshot/" + result.getName() + ".png");
			FileUtils.copyFile(sourcefile, destFolder);
			System.out.println(result.getName() + "method() failed, screenshot captured.");
		}
	}

}
