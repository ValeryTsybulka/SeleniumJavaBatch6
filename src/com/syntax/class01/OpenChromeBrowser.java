package com.syntax.class01;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();// go ahead and open chrome browser

		driver.get("https://facebook.com");

		String url = driver.getCurrentUrl();
		if (url.equalsIgnoreCase("https://www.facebook.com/")) {
			String titel = driver.getTitle();
			System.out.println(titel);
		} else {
			System.out.println("Wrong");
		}
		driver.close();
	}
}
