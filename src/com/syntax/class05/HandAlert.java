package com.syntax.class05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class HandAlert extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	setUp();//rediff
	
	driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//a[text()='Sign in']")).click();
	driver.findElement(By.xpath("//input[@name='proceed']")).click();
	
	Alert alert=driver.switchTo().alert();//we switch focus of our driver to that alert
	String alertText=alert.getText();
	System.out.println(alertText);
		
	Thread.sleep(2000);
	alert.accept();
	driver.quit();
}
}
