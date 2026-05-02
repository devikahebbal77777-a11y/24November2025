package com.projectName.tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.projectName.genericPage.CommonMethods;
import com.projectName.pages.PageFactoryLoginPage;

public class PageFactoryLoginTest extends CommonMethods {

	public PageFactoryLoginTest() throws Exception {
		super();
	}
	
	@Test
	public void loginTests() {
		
		PageFactoryLoginPage pfc = PageFactory.initElements(driver, PageFactoryLoginPage.class);
		pfc.enterEmail(pro3.getProperty("TestData1"));
		pfc.enterPassword(pro3.getProperty("TestData2"));
	}
		
	}

