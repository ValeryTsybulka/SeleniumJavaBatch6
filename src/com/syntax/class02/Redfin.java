package com.syntax.class02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Redfin {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.redfin.com");
	String a=driver.getCurrentUrl();
	System.out.println(a);
	driver.close();
}
}
