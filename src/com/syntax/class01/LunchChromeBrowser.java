package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LunchChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		//making connection for drivers
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		//opening the browsers by calling the constructors
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.google.com");
//		driver.get("https://www.ie.com");
//		driver.get("https://www.firefox.com");
		driver.getCurrentUrl();
		
		Thread.sleep(2000);
		driver.close();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		System.out.println(driver.getTitle());
	}

}
