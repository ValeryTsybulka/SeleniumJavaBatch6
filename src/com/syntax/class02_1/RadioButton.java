package com.syntax.class02_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/automation-practice-form/");
	
	List<WebElement>radio=driver.findElements(By.xpath("//input[@type='radio'] "));
	System.out.println(radio.size());
	
	radio.get(0).click();
	String value0=radio.get(0).getAttribute("value");
	System.out.println(value0);
	
	for(int i=0; i<radio.size(); i++) {
		radio.get(i).click();
		Thread.sleep(1000);
	}
	for(int i=0; i<radio.size(); i++) {
	String value=radio.get(i).getAttribute("value");
	if(value.equalsIgnoreCase("male")) {
		radio.get(i).click();
		Thread.sleep(1000);
	}
	}
	
	driver.quit();
}
}
