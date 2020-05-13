package com.syntax.class02_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PositiveLoging extends BaseClass{
public static void main(String[] args) {
	setUp();
	driver.findElement(By.xpath("//input[starts-with(@id,'user-name')]")).sendKeys("John");
	driver.findElement(By.xpath("//input[starts-with(@id,'password')]")).sendKeys("1234");
	driver.findElement(By.xpath("//input[starts-with(@value,'LOGI')]")).click();
	boolean logo=driver.findElement(By.cssSelector("div[class='login_logo']")).isDisplayed();
	System.out.println(logo);
	
	if(logo) {
		System.out.println("Robot logo is displayed");
	}else {
		System.out.println("Robot logo is not displayed");		
	}
	//verify product text
	WebElement product=driver.findElement(By.cssSelector("div[class='login_logo']"));
	boolean displayP=product.isDisplayed();
	String productTextString=product.getText();
	List <WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	driver.quit();
}
}
