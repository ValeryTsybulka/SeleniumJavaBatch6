package com.syntax.class02;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Mercury2 {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\19292\\eclipse-workspace\\JavaBasics" + ""
				+ "\\configs\\Url.properties";

		FileInputStream fileInput = new FileInputStream(filePath);

		Properties prop = new Properties();
		prop.load(fileInput);

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText("Register here")).click();
		driver.findElement(By.name("firstName")).sendKeys(prop.getProperty("firstName"));
		driver.findElement(By.name("lastName")).sendKeys(prop.getProperty("lastName"));
		driver.findElement(By.name("phone")).sendKeys(prop.getProperty("phone"));
		driver.findElement(By.id("userName")).sendKeys(prop.getProperty("email"));
		driver.findElement(By.name("address1")).sendKeys(prop.getProperty("adress1"));
		driver.findElement(By.name("city")).sendKeys(prop.getProperty("city"));
		//driver.findElement(By.name("register")).click();
		//driver.close();
	}}

