package com.syntax.class08;

import org.openqa.selenium.By;

import com.syntax.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp();
		driver.findElement(By.id("email")).sendKeys("syntaxtest@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("syntax123");
		Thread.sleep(3000);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
