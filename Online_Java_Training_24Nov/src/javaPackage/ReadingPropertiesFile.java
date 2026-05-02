package javaPackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws Exception {
		//config properties file
		File src1 = new File("C:\\Users\\Devika Hebbal\\eclipse-workspace\\Online_Java_Training_24Nov\\Repository\\config.properties");
		FileInputStream fis1 = new FileInputStream(src1);
		Properties pro1 = new Properties();
		pro1.load(fis1);
		
		//locators properties file
		File src2 = new File("C:\\Users\\Devika Hebbal\\eclipse-workspace\\Online_Java_Training_24Nov\\Repository\\locators.properties");
		FileInputStream fis2 = new FileInputStream(src2);
		Properties pro2 = new Properties();
		pro2.load(fis2);
		
		//testdata properties file
		File src3 = new File("C:\\Users\\Devika Hebbal\\eclipse-workspace\\Online_Java_Training_24Nov\\Repository\\testdata.properties");
		FileInputStream fis3 = new FileInputStream(src3);
		Properties pro3 = new Properties();
		pro3.load(fis3);
		
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", pro1.getProperty("driverPath"));
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get(pro1.getProperty("URL_1"));
	    
	    //get Property() method will accept key and return value of that key
	    driver.findElement(By.xpath(pro2.getProperty("Email"))).sendKeys(pro3.getProperty("TestData1"));
	    driver.findElement(By.xpath(pro2.getProperty("Password"))).sendKeys(pro3.getProperty("TestData2"));


	}

}
