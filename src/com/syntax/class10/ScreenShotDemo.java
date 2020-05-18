package com.syntax.class10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.syntax.pages.LoginPageHRM;
import com.syntax.utils.BaseClass;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class ScreenShotDemo extends CommonMethods {
	public static void main(String[] args) throws IOException {
		setUp();
		// boolean
		// logo=driver.findElement(By.xpath("//div[@id='divLogo']/img")).isDisplayed();
		// System.out.println(logo);
		// tearDown();

		LoginPageHRM login = new LoginPageHRM();
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.btnLogin);
		wait(3);
		// Create an object of TakesScreenshot interface and cast the Webdriver with it
		TakesScreenshot ts = (TakesScreenshot) driver;
		// Use getScreenshotAs() method to take the screenshot(int the constructor pass
		// Type.File)
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(srcFile, new File("screenshots/HRMS/dashboard.png"));
		}catch(IOException e) {
			e.printStackTrace();
			System.out.println("Screenshot was not taken");
		}
	}
}
