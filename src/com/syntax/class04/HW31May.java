package com.syntax.class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW31May {
	public static void main(String[] args) throws InterruptedException {

		String url = "http://jiravn.centralus.cloudapp.azure.com:8081/index.html";
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);

		WebElement button = driver.findElement(By.cssSelector("button[id='details-button']"));
		Thread.sleep(2000);
		
		System.out.println(button.isEnabled());
		System.out.println(button.isDisplayed());
		button.click();

	}
}