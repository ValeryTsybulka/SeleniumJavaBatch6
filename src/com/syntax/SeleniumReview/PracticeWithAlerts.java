package com.syntax.SeleniumReview;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.syntax.utils.BaseClass;

public class PracticeWithAlerts extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement simpleAlert = driver.findElement(By.id("alert"));
		simpleAlert.click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement timingAlert = driver.findElement(By.xpath("//button[text()='Timing Alert']"));
		timingAlert.click();

		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.alertIsPresent());

		alert.accept();

	}
}
