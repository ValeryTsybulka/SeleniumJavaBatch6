package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioDemo1 {

	public static String url="https://demoqa.com/automation-practice-form/";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get(url);
		
		WebElement maleRadioB=driver.findElement(By.xpath("//input[@id='sex-0']"));
		
		System.out.println(maleRadioB.isDisplayed());
		System.out.println(maleRadioB.isEnabled());
		System.out.println(maleRadioB.isSelected());
		
		maleRadioB.click();
		System.out.println(maleRadioB.isSelected());
		
		List<WebElement> list=driver.findElements(By.xpath("//input[@name='exp']"));
		System.out.println(list.size());
		
		for(WebElement a:list) {
		//System.out.print(a.getAttribute("value")+" ");
		if(a.getAttribute("value").equals("5")) {
			a.click();
			System.out.println("I have "+a.getAttribute("value")+" years expirience!!!");
		}
		}	
	}
	
}
