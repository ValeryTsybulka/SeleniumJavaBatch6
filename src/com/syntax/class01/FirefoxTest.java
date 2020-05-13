package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
	
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.firefox.com");
	 driver.get("https://www.google.com");
	 String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	 
}
}
