package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class DropDown extends BaseClass{
public static void main(String[] args) {
	
	setUp();//navigate to facebook.com
	//identify dd element
	WebElement months=driver.findElement(By.id("month")); 
	Select obj=new Select(months);
	//get allvalues from dd
	List<WebElement> value=obj.getOptions();
	int totalValues=value.size();
	System.out.println(totalValues);
	for(WebElement a:value) {
	System.out.println(a.getText());
	}
	
}
}
