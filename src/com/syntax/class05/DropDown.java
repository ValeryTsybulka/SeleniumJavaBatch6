package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class DropDown extends BaseClass{
public static void main(String[] args) {
	
	setUp();//facebook.com
	
	List<WebElement> months=driver.findElements(By.id("month")); 
	System.out.println(months.size());
	
}
}
