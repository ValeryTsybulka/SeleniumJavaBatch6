package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
	String url=driver.getCurrentUrl();
	
	System.err.println(url);
	System.out.println(url);
	System.out.println(driver.getTitle());
	
	driver.close();
}
}
