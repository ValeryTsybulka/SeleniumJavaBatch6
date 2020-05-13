package com.syntax.class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Recap {
	public static void main(String[] args) throws InterruptedException {
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php/"
				+ "pim/viewPersonalDetails/empNumber/4380";

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
//		
//		WebElement userName=driver.findElement(By.xpath("//input[@id='txtUsername']"));
//		userName.sendKeys("Admin");
//		WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
//		pass.sendKeys("Hum@nhrm123");
//		WebElement login=driver.findElement(By.xpath("//input[@id='btnLogin']"));
//		login.click();
//		Thread.sleep(2000);
//		driver.close();
		
		WebElement userName1=driver.findElement(By.cssSelector("input[id='txtUsername']"));
		userName1.sendKeys("Admin");
		WebElement pass1=driver.findElement(By.cssSelector("input[id*='Password']"));
		pass1.sendKeys("Hum@nhrm123");
		WebElement login1=driver.findElement(By.cssSelector("input[id^='btn']"));
		login1.click();
		Thread.sleep(1000);
		driver.close();

	}
}
