package com.syntax.class04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllLinksMy {
	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com");
		List<WebElement> a = driver.findElements(By.tagName("a"));
		System.out.println(a.size());
		
		for(WebElement link:a) {
			String text=link.getText();
			System.out.println(text);
			if(!text.isEmpty()) {
				System.out.println(text);
			}
		}
		driver.quit();
	}
}
