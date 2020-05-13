package com.syntax.class00;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
	public static void main(String[] args) {
		//1. set a system property
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\19292\\eclipse-workspace\\SeleniumJavaBatch6\\drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://syntaxtechs.com");
		
		//WebDriver is an interface that we calling to achieve abstraction
		//driver is reference variable
		//= is assigning operator
		//new keyword
		//ChromeDriver() ism a constructor we are calling
	}

}
