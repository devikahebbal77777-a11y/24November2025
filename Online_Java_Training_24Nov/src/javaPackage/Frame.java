package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws Exception {
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://paytm.com/");
	    driver.findElement(By.xpath("//*[text()='Sign In']")).click();
	    Thread.sleep(3000);
	    
	    //Find the total number of frames present on web page
	    int allFrames = driver.findElements(By.tagName("iframe")).size();
	    System.out.println("Total Frames: " + allFrames);
	    
	    //Check if the element is present or not
	    for(int i=0; i < allFrames; i++) {
	        driver.switchTo().frame(i);
	        driver.switchTo().frame(i);
	    	
	    	String expText = "Open Paytm App";
	    	String actText = driver.findElement(By.xpath("//*[text()='Open Paytm App']")).getText();
	    	
	    	if(actText.equalsIgnoreCase(expText)) {
	    		System.out.println("Element Found");
	    		break;
	    	} else {
	    		System.out.println("Element not Found");
	    	}
	    	
	    }
	    

	}

}
