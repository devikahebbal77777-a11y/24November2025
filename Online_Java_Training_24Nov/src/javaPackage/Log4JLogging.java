package javaPackage;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4JLogging {

	public static void main(String[] args) {
		
		//Create a logger instance
		Logger logger = Logger.getLogger("Log4JLogging");
		
		//Configure log4j.properties file
		PropertyConfigurator.configure("C:\\Users\\Devika Hebbal\\eclipse-workspace\\Online_Java_Training_24Nov\\log4j.properties");
		
		//Open browser Instance
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    logger.info("Open Browser Instance");
	    
	    //Maximize the window
	    driver.manage().window().maximize();
	    logger.info("window Maximized");
	    
	    //Implicit wait
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    logger.info("Implicit wait given");
	    
	    //Launch Application
	    driver.get("https://www.facebook.com/");
	    logger.info("Application Launched");
	    
	    //Check if the web element is displayed or not
	    try {
			driver.findElement(By.id("emails")).isDisplayed();
			logger.info("Web Element Found");
		} catch (Exception e) {
			logger.info("Web Element not Found");;
		}
	    

	}

}
