package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verificatiuon {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.zillow.com");
	driver.navigate().to("https://www.google.com");
	driver.navigate().back();
	driver.navigate().refresh();
	String url=driver.getCurrentUrl();
	System.out.println(url);
	
}
}
