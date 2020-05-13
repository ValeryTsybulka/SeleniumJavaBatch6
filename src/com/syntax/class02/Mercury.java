package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.newtours.demoaut.com/");
	//driver.manage().window().maximize();
	driver.findElement(By.linkText("Register here")).click();
	driver.findElement(By.name("firstName")).sendKeys("Valery");
	driver.findElement(By.name("lastName")).sendKeys("Tsybulka");
	driver.findElement(By.name("phone")).sendKeys("2199999893");
	driver.findElement(By.id("userName")).sendKeys("valeryvalery@yhoo.com");
	driver.findElement(By.name("address1")).sendKeys("White House");
	driver.findElement(By.name("city")).sendKeys("Washington");
	driver.findElement(By.name("register")).click();
	
}
}
