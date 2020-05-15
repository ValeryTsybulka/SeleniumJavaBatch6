package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class PracticeWithDd extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();// http://166.62.36.207/syntaxpractice/bootstrap-iframe.html
		
		List<WebElement> allDDs = driver.findElements(By.tagName("a"));
		for(WebElement oneDD: allDDs) {
			String dd = oneDD.getText();
			System.out.println(dd);
			if(dd.equals("List Box")) {
				oneDD.click();

			}
			if(dd.equals("Bootstrap List Box")) {
				oneDD.click();
				break;
			}
		}

		List<WebElement> listOfDD = driver.findElements(By.tagName("li"));
		for(WebElement oneItem: listOfDD) {
			String item = oneItem.getText();


			if(item.equals("Morbi leo risus")) {
				oneItem.click();
				break;
			}
		}
		// driver.findElement(By.xpath("//li[text()='Morbi leo risus']"));
	}
}
