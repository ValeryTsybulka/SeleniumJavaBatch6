package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZillowTest {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.zillow.com/");
	        //  driver.get("https://www.google.com");
	driver.navigate().to("https://www.google.com/");
	driver.navigate().back();
	driver.navigate().refresh();
	String title=driver.getTitle();
	System.out.println(title);
	//driver.navigate().forward();
	//String title1=driver.getTitle();
	
}
}
