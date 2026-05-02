package com.projectName.genericPage;



import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.apache.log4j.Logger;


public class CommonMethods extends MasterPage {

	public CommonMethods() throws Exception {
		super();
	}
	
	//get text of web element
	public void getTextOfWebElement(String webElementKey) {
		String getTextOfWebElement = driver.findElement(By.xpath(pro2.getProperty(webElementKey))).getText();
		System.out.println(getTextOfWebElement);
	}
	
	//Click web element
	public void ClickWebElement(String webElementKey) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).click();	
	}
	
	//Click list of web element
	public void clickListOfWebElement(String webElementKey, String testData) {
		List<WebElement> listOfElements = driver.findElements(By.xpath(pro2.getProperty(webElementKey)));
		for(int i =0; i < listOfElements.size(); i++) {
			if (listOfElements.get(i).getText().equalsIgnoreCase(pro3.getProperty(testData))) {
				listOfElements.get(i).click();
			}
		}
	}
	//clear web element
	public void clearWebElement(String webElementKey) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).clear();	
	} 	
	
	//enter data
	public void enterData(String webElementKey, String testData) {
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).sendKeys(pro3.getProperty(testData));
	}
	
	//Mouse Hover
	public void moveToElement(String webElementKey) {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath(pro2.getProperty(webElementKey)))).build().perform();
	}
	
	//Select Dropdown value using visible test
	public void selectDropdownValue(String webElementKey, String testData) {
		WebElement ele = driver.findElement(By.xpath(pro2.getProperty(webElementKey)));
		Select webElem = new Select(ele);
		webElem.selectByVisibleText(pro3.getProperty(testData));
	}
	
	//Read Excel Data
	public void readExcelData(String webElementKey, int rowNo, int columnNo, String excelSheetName) throws Exception {
		File src = new File(".\\src\\com\\projectName\\resources\\Excel Test Data.xlsx");
		//Load the File
		FileInputStream fis = new FileInputStream(src);
		//Load Work Book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
	    //Load Work Sheet
		XSSFSheet sh = wb.getSheet(pro1.getProperty(excelSheetName));
		String abc = sh.getRow(rowNo).getCell(columnNo).getStringCellValue();
		driver.findElement(By.xpath(pro2.getProperty(webElementKey))).sendKeys(abc);
	}
	
	//Handle Explicit wait - elementToBeClickable
	public void handleExplicitWait_elementToBeClickable(String webElemetKey) {
		WebDriverWait wt = new WebDriverWait(driver, 30);
		wt.until(ExpectedConditions.elementToBeClickable(By.xpath(pro2.getProperty(webElemetKey)))).click();	
	}
	
	//Handle Log File
	public void handleLogger(String logClassName, String loggerText) {
		Logger logger = Logger.getLogger(logClassName);
        PropertyConfigurator.configure(pro1.getProperty("log4JPropertiesFileLoc"));
        logger.info(loggerText);
	}
	
	//Capture Screenshot
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
