package com.projectName.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFactoryLoginPage {
	
	@FindBy(xpath = "//input[@name='email']")
	WebElement Email;
	
	@FindBy(xpath = "//input[@name='pass']")
	WebElement Password;
	
	public void enterEmail(String testData) {
		Email.sendKeys(testData);
	}
	
	public void enterPassword(String testData) {
		Email.sendKeys(testData);
	}

}
