package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {
	
	public static void main(String[] args) throws Exception {
		
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com/");
	    
	    //Thread.sleep(30000); // it will wait for 30 seconds - Not recommended
	    //Implicit wait
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
	    
	    //Fetch email input box attribute value
	    System.out.println(driver.findElement(By.id("email")).getAttribute("value"));
	    
	    //Use Explicit wait
	    WebDriverWait wt = new WebDriverWait(driver, 60);
	    wt.until(ExpectedConditions.elementToBeClickable(By.id("pass"))).sendKeys("abcd");
	    
	}    
	    
}
