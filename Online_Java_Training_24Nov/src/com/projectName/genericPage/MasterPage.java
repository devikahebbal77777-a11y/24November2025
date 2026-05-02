package com.projectName.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MasterPage {
	
	public static WebDriver driver;
	public Properties pro1;
	public Properties pro2;
	public Properties pro3;
	
	//Constructor Implementation
	public MasterPage() throws Exception {
		
		//config properties file
		FileInputStream fis1 = new FileInputStream(".\\src\\com\\projectName\\repository\\config.properties");
	    pro1 = new Properties();
		pro1.load(fis1);
		
		//locators properties file
		FileInputStream fis2 = new FileInputStream(".\\src\\com\\projectName\\repository\\locators.properties");
		pro2 = new Properties();
		pro2.load(fis2);
		
		//testdata properties file
		FileInputStream fis3 = new FileInputStream(".\\src\\com\\projectName\\repository\\testdata.properties");
		pro3 = new Properties();
		pro3.load(fis3);
		
		//Launching Browsers - chrome/firefox/edge
		if (pro1.getProperty("browser").equalsIgnoreCase("chrome"))	{
			System.setProperty("webdriver.chrome.driver",pro1.getProperty("driverPath")+ "chromedriver.exe");//System.setProperty("webdriver.chrome.driver", ".\\src\\com\\projectName\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (pro1.getProperty("browser").equalsIgnoreCase("firefox"))	{
			System.setProperty("webdriver.firefox.driver", pro1.getProperty("driverPath")+ "firefox.exe");//System.setProperty("webdriver.firefox.driver", ".\\src\\com\\projectName\\drivers\\firefox.exe");
			driver = new FirefoxDriver();
		} else if (pro1.getProperty("browser").equalsIgnoreCase("edge"))	{
			System.setProperty("webdriver.chrome.driver", pro1.getProperty("driverPath")+ "msedgedriver.exe");
			driver = new EdgeDriver();
		} else {
			System.out.println("No Browser instance Found");
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();    //pro1.getProperty("maximizeWindow");     //driver.manage().window().maximize()
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);  //pro1.getProperty("implicitlyWait");     //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(pro1.getProperty("URL_1"));

	}

}
