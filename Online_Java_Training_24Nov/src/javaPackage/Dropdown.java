package javaPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws Exception {
		
		//Set the property of chrome browser and pass chrome driver path
		System.setProperty("webdriver.chrome.driver", "E:\\Training Materials\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.facebook.com");
	    
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	    
	    //1st way
	    driver.findElement(By.id("month")).sendKeys("July");
	    
	    //2nd way
	    List<WebElement> birthmonth = driver.findElements(By.xpath("//select[@id = 'month']/option"));
	    System.out.println("Total Dropdown Values: " + birthmonth.size());
	    birthmonth.get(6).click(); //July
	    Thread.sleep(2000);
	    birthmonth.get(5).click(); //June
	    
	    //3rd way
	    WebElement bm = driver.findElement(By.xpath("//select[@id ='month']"));
	    Select month = new Select(bm);
	    Thread.sleep(2000);
	    month.selectByVisibleText("Apr");//April
	    Thread.sleep(2000);
	    month.selectByValue("7");// July
	    Thread.sleep(2000);
	    month.selectByIndex(2);//March
	    System.out.println(month.getFirstSelectedOption().getText());//March which use current selected value
	    
	    //4th way
	    List<WebElement> dropdown = month.getOptions();
	    System.out.println("Total Dropdown Value 2nd Time : " +dropdown.size() );
	    for (int i = 0; i < dropdown.size(); i++) {
	    	if (dropdown.get(i).getText().equalsIgnoreCase("July")) {
	    		dropdown.get(i).click();
	    	}
	    }
	}

}
