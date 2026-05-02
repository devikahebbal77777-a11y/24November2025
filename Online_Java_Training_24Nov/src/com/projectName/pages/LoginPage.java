package com.projectName.pages;

import com.projectName.genericPage.CommonMethods;

public class LoginPage extends CommonMethods {
	
	public LoginPage() throws Exception{
		super();
	}
	
	//Click on email field
	public void clickEmail() {
		ClickWebElement("Email");
		handleLogger("LoginPage","Clicked Email Field");	
	}
	
	//Enter Email
	public void enterEmail() {
		enterData("Email", "TestData1");
		handleLogger("LoginPage", "Clicked Email Field");
	}
	
	//Clear Email
	public void clearEmail() {
		clearWebElement("Email");
		handleLogger("LoginPage", "Cleared Email Field");
	}
	
	//Click on password field
	public void cickPassword() {
		clearWebElement("Password");
		handleLogger("LoginPage", "Cleared Password Field");
	}	
	
	
	//Enter Password
	public void enterPassword() {
		enterData("Password", "TestData2");
		handleLogger("LoginPage", "Clicked Email Field");
	}
	
	//Clear Email
	public void clearPassword() {
		clearWebElement("Password");
		handleLogger("LoginPage", "Cleared Password Field");
	}
	
	//Get Facebook text
	public void getFacebookText() {
		getTextOfWebElement("FacebookText");
		handleLogger("LoginPage", "Fetching Facebook Text");
		
	}
	
	//Click on login button
	public void loginButton() {
		ClickWebElement("Login");
		handleLogger("LoginPage","Clicked Login Button");	
	}

}

