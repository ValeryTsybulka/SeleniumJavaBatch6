package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class FacebookTask extends BaseClass {
	public static void main(String[] args) {

		setUp();// https://www.facebook.com
		driver.findElement(By.name("firstname")).sendKeys("Ivan");
		driver.findElement(By.name("lastname")).sendKeys("Ivanov");
		driver.findElement(By.name("reg_email__")).sendKeys("999-319-9929");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456789");
		WebElement month = driver.findElement(By.id("month"));
		Select obj = new Select(month);
		List<WebElement> months = obj.getOptions();
		System.out.println(months.size());
		for (WebElement w : months) {
			String textMonth = w.getText();
			// System.out.println(textMonth);
			if (textMonth.equals("Sep")) {
				w.click();
				break;
			}
		}
		WebElement day = driver.findElement(By.id("day"));
		Select obj1 = new Select(day);
		List<WebElement> days = obj1.getOptions();
		for (WebElement w : days) {
			String textDay = w.getText();
			if (textDay.equals("8")) {
				w.click();
				break;
			}
		}
		WebElement year = driver.findElement(By.id("year"));
		Select obj2 = new Select(year);
		List<WebElement> years = obj2.getOptions();
		for (WebElement w : years) {
			String textYear = w.getText();
			if (textYear.equals("1960")) {
				w.click();
				break;
			}
		}
		driver.findElement(By.cssSelector("input[value='2']")).click();
		driver.findElement(By.name("websubmit")).click();
	}
}
