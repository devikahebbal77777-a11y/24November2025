package javaPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenApplication1 {

	public static void main(String[] args) throws Exception {
		
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
		
		// Launch Chrome browser instance
		WebDriver driver = new ChromeDriver();
		
		//open the url using get() method
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");

		// Maximize the window
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		// Open the url using navigate method
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		
		// Refresh the page
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		// Navigate to back
		Thread.sleep(2000);
		driver.navigate().back();
		
		// Navigate to forward
		Thread.sleep(2000);
		driver.navigate().forward();
		
		// Fetch the current url
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		// Fetch the title of webpage
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		
		//Close the browser instance
		Thread.sleep(2000);
		driver.close();
	}

}
