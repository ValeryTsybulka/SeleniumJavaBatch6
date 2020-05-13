package com.syntax.class02;

public class WebDriverTest {

	public static void main(String[] args) {

		SWebDriver drive = new SChromeDriver();

		drive.get("https://www.facebook.com");
		drive.getCurrentUrl();
		drive.getTitle();
		drive.close();
		
		SWebDriver drive1 = new SFireFoxDriver();
		
		drive1.get("https://www.google.com");
		
	}
}
