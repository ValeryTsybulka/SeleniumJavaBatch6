package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.CommonMethods;

public class DropDownTest extends CommonMethods {
	public static void main(String[] args) throws InterruptedException {
		setUp();

		WebElement month = driver.findElement(By.id("month"));
		selectDdValue(month, "Nov");
		Thread.sleep(1000);
		
//		WebElement month=driver.findElement(By.id("month"));
//		selectDdValue(month, "Nov");
//		Thread.sleep(3000);
//		
//		Select obj=new Select(month);
//		List<WebElement> options=obj.getOptions();
//		for(WebElement w:options) {
//			String month1=w.getText();
//			if(month1.equalsIgnoreCase("nov")) {
//				w.click();
//			}
//			System.out.println(w.getText());
//		}
		WebElement day = driver.findElement(By.id("day"));
		selectDdValue(day, 3);

//		Select obj1=new Select(day);
//		List<WebElement>options1=obj1.getOptions();
//		for(WebElement w:options1) {
//			String day1=w.getText();
//			System.out.println(day1);
//			if(day1.equalsIgnoreCase("17")){
//				w.click();
//			}
//		}

	}

}
