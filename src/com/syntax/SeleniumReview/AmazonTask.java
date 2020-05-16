package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class AmazonTask extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		setUp();// https://www.amazon.com/
		WebElement allDD = driver.findElement(By.id("searchDropdownBox"));
		System.out.println(allDD.getText());
		Select obj = new Select(allDD);
		List<WebElement> options = obj.getOptions();

		for (WebElement w : options) {
			String optionText = w.getText();
			System.out.println(optionText);
		}
		obj.selectByVisibleText("Books");
		WebElement searchTextBooks=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
		searchTextBooks.sendKeys("Harry Potter");
		WebElement searchButton=driver.findElement(By.xpath("//input[@type='submit'][@value='Go']"));
		searchButton.click();
		//List<WebElement>listOfBooks=driver.findElements(By.xpath("//span[@class='a-size-base a-color-base']"));
		List<WebElement>listOfBooks=driver.findElements(By.className("a-spacing-micro"));
		System.out.println("-----> "+listOfBooks.size()+" books");
		for(WebElement w:listOfBooks) {
			String book=w.getText();
			if(book.equalsIgnoreCase("Unofficial Cookbook")&&!w.isSelected()) {
				Thread.sleep(2000);
				w.click();
				break;
			}
		}
		
	}
}
