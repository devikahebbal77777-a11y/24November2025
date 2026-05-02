package javaPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Exception {
		
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://money.rediff.com/gainers/");
	    
	    //Create a list of all companies
	    List<WebElement> allCompanies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
	    System.out.println("Total Companies: " + allCompanies.size());
	    
	    //Create a list of all currentPrice
	    List<WebElement> allCurrentPrice = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	    System.out.println("Total CurrentPrice: " + allCurrentPrice.size());
	    Thread.sleep(10000);
	    
	    String expResult = "Disa India";
	    
	    for(int i = 0; i < allCompanies.size(); i++) {
	    	if(allCompanies.get(i).getText().equalsIgnoreCase(expResult)) {
	    		System.out.println(allCompanies.get(i).getText() + " == " + allCurrentPrice.get(i).getText());
	    		allCompanies.get(i).click();
	    		System.out.println(driver.getTitle());
	    		break;	
	    	}
	    	
	    }
	    		
	}   
}
