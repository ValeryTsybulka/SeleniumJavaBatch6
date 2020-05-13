package com.syntax.class02_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class Links extends BaseClass{
public static void main(String[] args) {
	
	setUp();
	
	List <WebElement> links=driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	int count=0; 
	for(WebElement link:links) {
		String linkText=link.getText();
		if(!linkText.isEmpty()) {
			System.out.println(linkText);
			count++;
		}
	}
	System.out.println(count);
	driver.quit();
}
}
