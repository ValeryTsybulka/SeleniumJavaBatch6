package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW11May {
	
	public static void main(String[] args) throws InterruptedException {
		String url = "http://166.62.36.207/humanresources/symfony/web/index.php"
				+ "/auth/login";
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		WebElement userName=driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		WebElement pass=driver.findElement(By.id("txtPassword"));
		//pass.sendKeys("Hum@nhrm123");
		pass.sendKeys("");
		
		WebElement login=driver.findElement(By.cssSelector("input[id='btnLogin']"));
		login.click();
		
		WebElement span=driver.findElement(By.cssSelector("span[id='spanMessage']"));
		System.out.println(span.isDisplayed());
		System.out.println(span.toString());
		
		//WebElement logo=driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		//Thread.sleep(2000);
		//logo.click();
		//WebElement logo=driver.findElement(By.cssSelector("img[height='56']"));
		//logo.click();
//		
//		if(logo.isDisplayed()) {
//			System.out.println("Syntax HRM logo displayed");
//		}else {
//			System.out.println("Something goes wrong");
//		}
//		
	}
}
