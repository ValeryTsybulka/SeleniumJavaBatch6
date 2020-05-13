package com.syntax.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	driver.findElement(By.id("u_0_m")).sendKeys("Valera");
	driver.findElement(By.id("u_0_o")).sendKeys("Cyba");
	driver.findElement(By.id("u_0_r")).sendKeys("9292999229");
	driver.findElement(By.id("u_0_13")).click();
	driver.close();
}
}
