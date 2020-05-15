package com.syntax.SeleniumReview;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.syntax.utils.BaseClass;

public class GetAllLinks extends BaseClass {
	public static void main(String[] args) {

		setUp();//http://the-internet.herokuapp.com/
//		String title = driver.getTitle();
//		System.out.println(title);
//		tearDown();
		
		List<WebElement>allLinks=driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
		
		for(WebElement link:allLinks) {
			String textOfLinks=link.getText();
			String links=link.getAttribute("href");
			//System.out.println(textOfLinks);
			System.out.println(textOfLinks+" --> "+links);
		}
		
		
	}
}
