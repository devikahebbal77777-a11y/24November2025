package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation1 {

	public static void main(String[] args) throws Exception {
		
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/audio-video/pr?sid=0pm&otracker=categorytree");
	    
	    Actions act = new Actions(driver);
	    
	    //Create Electronics Web Element Ref
	    WebElement electro = driver.findElement(By.xpath("//*[text()='Electronics']"));
	    //Mouse Hover to electronics
	    Thread.sleep(3000);
	    act.moveToElement(electro).build().perform();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[text()='Gaming Laptops']")).click();
	    
	    //Keyboard Operations
	    Thread.sleep(3000);
	    WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
	    act.sendKeys(men, Keys.ENTER).build().perform();
	    System.out.println("Men Option Clicked");

	}

}
