package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap2 {
	public static void main(String[] args) {
		String fburl="https://www.facebook.com";
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	driver.get(fburl);
	String url=driver.getCurrentUrl();
	System.out.println("What is it? "+url);
	
	String title=driver.getTitle();
	System.out.println("Title is : "+title);
	driver.close();
	
	}

	
}
