package com.projectName.tests;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.projectName.pages.LoginPage;

public class LoginTest {
	
	@Test
	public void loginText() throws Exception {
		
		LoginPage lp = new LoginPage();
		
		lp.clearEmail();
		lp.enterEmail();
		lp.clearPassword();
		lp.enterPassword();
		lp.getFacebookText();
		Thread.sleep(2000);
		lp.clearEmail();
		Thread.sleep(2000);
		lp.clearPassword();
		Thread.sleep(2000);
		lp.readExcelData("Email", 3, 1, "ExcelSheetName");
		Thread.sleep(2000);
		lp.readExcelData("Password", 3, 2, "ExcelSheetName");
	}
	
	@AfterMethod
	public void takeScreenshot (ITestResult result2) throws Exception{
		LoginPage lp = new LoginPage();
		lp.captureScreenshot(result2);
		
	}
	
}
