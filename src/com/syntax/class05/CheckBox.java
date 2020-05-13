package com.syntax.class05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class CheckBox extends BaseClass{
	public static void main(String[] args) throws InterruptedException {
		setUp();

		List<WebElement> prof=driver.findElements(By.name("profession"));
		System.out.println(prof.size());
		String myProfessio="Automation Tester";
		
		for(WebElement pr:prof) {
		String value=pr.getAttribute("value");
		if(value.equals(myProfessio)) {
			pr.click();
		}
		}//By.xpath("//input[@name='tool']")
		//driver.quit();
		
		
		//driver.findElement(By.id("tool-1")).click();
		
		List<WebElement> tools=driver.findElements(By.name("tool"));
		System.out.println("Number of tools are :: "+tools.size());
		for(WebElement tool:tools) {
			tool.click();
			Thread.sleep(3000);
			System.out.println(tool.isSelected());
		}
		String SW="Selenium Webdriver";
		for(WebElement tool:tools) {
			String value=tool.getAttribute("value");
			if(value.equalsIgnoreCase(SW)) {
			tool.click();
			}
		}
		
		//driver.quit();
	}
}
