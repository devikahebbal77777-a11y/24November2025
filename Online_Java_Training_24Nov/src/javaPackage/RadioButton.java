package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws Exception {
		
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
				
		// Launch Chrome browser instance
	    WebDriver driver = new ChromeDriver();
	    
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    
	    //1st way- Not recommended
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='1']")).click();//Female
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='2']")).click();//Male
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@value='-1']")).click();//Custom
	    
	    //2nd way - Appropriate way
	    List<WebElement> radios = driver.findElements(By.xpath("//label[@class='_58mt']"));
	    System.out.println("Total Radio Buttons:-" + radios.size());
	    String expResult = "Female";
	    for (int i = 0; i < radios.size(); i++) {
	    	if (radios.get(i).getText().equalsIgnoreCase(expResult)) {
	    		radios.get(i).click();
	    		System.out.println(expResult + " clicked");
	    	}
	    }

	}

}
