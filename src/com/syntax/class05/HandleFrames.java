package com.syntax.class05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.syntax.utils.BaseClass;

public class HandleFrames extends BaseClass{
public static void main(String[] args) {
	setUp();
	
//	System.setProperty("webdriver,chrome.driver", "\\drivers\\chromedriver.exe");
//	WebDriver driver= new ChromeDriver();
//	driver.get("http://toolsga.com/inframe-practice-page");
	
	driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	//switch to Frame
	driver.switchTo().frame("IF1");
	driver.findElement(By.name("sss")).sendKeys("hello");
	
	// switch to main page
	driver.switchTo().defaultContent();
	
}
}
