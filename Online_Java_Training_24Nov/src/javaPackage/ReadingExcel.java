package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingExcel {

	public static void main(String[] args) throws Exception {
		
		//Specify the location of excel file
		File src = new File("E:\\Training Materials\\Short Notes.xlsx");
		
		//Load the File
		FileInputStream fis = new FileInputStream(src);
		
		//Load Work Book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//Load Work Sheet
		XSSFSheet sh = wb.getSheet("Sheet1");
		
		//Print the loaded Sheet name
		System.out.println(sh.getSheetName());
		
		//Print merged cell from excel sheet
		System.out.println(sh.getRow(0).getCell(0).getStringCellValue());
		
		//Print Check Java installed or not from excel sheet
		System.out.println(sh.getRow(1).getCell(1).getStringCellValue());
		
		//Print 1 from excel sheet
		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());
		
		//Print OOPS Concept/ float/double value from ExcelSheet
		//System.out.println(sh.getRow(2).getCell(1).getNumericCellValue()); // this applied only when the numeric value is present in the row or column
		System.out.println(sh.getRow(2).getCell(1).getStringCellValue());

		//Print int value from ExcelSheet- this applied only when the numeric value is present in the row or column
		//System.out.println((int)sh.getRow(2).getCell(1).getNumericCellValue());
		
		//Print total number of rows
		System.out.println("Total rows: " + sh.getPhysicalNumberOfRows());
		
		//Print total number of columns
		System.out.println("Total columns: " + sh.getRow(2).getLastCellNum());
		
		//Real Time Implementation
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		String s = sh.getRow(1).getCell(1).getStringCellValue();
		driver.findElement(By.id("email")).sendKeys(s);
		
	}

}
