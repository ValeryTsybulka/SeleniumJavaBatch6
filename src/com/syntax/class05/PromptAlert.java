package com.syntax.class05;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.syntax.utils.BaseClass;

public class PromptAlert extends BaseClass{
public static void main(String[] args) throws InterruptedException {
	setUp();//rediff
	
	driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//*[text()='CORONAVIRUS']")).click();
	driver.findElement(By.id("subscribe_btn_in_top")).click();
	Alert alert=driver.switchTo().alert();
	String alertText=alert.getText();
	System.out.println(alertText);
	
	
	Thread.sleep(4000);
	alert.accept();
	
}
}
