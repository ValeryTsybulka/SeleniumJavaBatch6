package com.syntax.class08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class LoginTest extends CommonMethods{

	public static void main(String[] args) {
		
/**
 * User should be able to login to the application with valid credentials
 */
		//open browser and navigate url
		setUp();//SYNTAXHRM
		
		WebElement username=driver.findElement(By.id("txtUsername"));
		sendText(username, ConfigsReader.getProperty("username"));
		
		WebElement password=driver.findElement(By.id("txtPassword"));
		sendText(password, ConfigsReader.getProperty("password"));
		
		//click on loging
		driver.findElement(By.id("btnLogin")).click();
		//close browser
		
		tearDown();
		}

	}


