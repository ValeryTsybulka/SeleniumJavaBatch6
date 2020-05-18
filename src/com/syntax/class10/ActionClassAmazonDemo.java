package com.syntax.class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class ActionClassAmazonDemo {
public static void main(String[] args) {
	WebDriver driver=BaseClass.setUp();
	WebElement account=driver.findElement(By.xpath(""));
	
}
}
