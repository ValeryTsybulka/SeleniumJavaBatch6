package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonTest {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.amazon.com");
		
		driver.get("https://www.github.com");
		
		System.out.println(driver.getTitle());
		
		//driver.close();
		
		//WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.redfin.com");
		//String url=driver.getCurrentUrl();
		//Thread.sleep(2000);
		//driver.close();
		
	}

}
