package com.syntax.class02_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw {
	public static void main(String[] args) throws IOException {
		String a=System.getProperty("user.dir");
		System.out.println(a);
		String filePath=a+"\\configs\\Examples.properties";
		System.out.println(filePath);
	
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Properties prop=new Properties();
		prop.load(fis);
		System.out.println(prop.getProperty("email"));
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.cssSelector("span[class='nav-line-2 ']")).click();
		WebElement email=driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys(prop.getProperty("email"));
		driver.findElement(By.cssSelector("input[id='continue']")).click();
		
		
		
		
	}

}
