package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseSimulation2 {

	public static void main(String[] args) throws Exception {
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/droppable/");
	    
	    //Switch to frame
	    driver.switchTo().frame(0);
	    WebElement drag = driver.findElement(By.id("draggable"));
	    WebElement drop = driver.findElement(By.id("droppable"));
	    Thread.sleep(3000);
	    Actions act = new Actions(driver);
	    act.dragAndDrop(drag, drop).build().perform();

	}

}
