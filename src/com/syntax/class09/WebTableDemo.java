package com.syntax.class09;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class WebTableDemo extends CommonMethods {
	public static void main(String[] args) {
		setUp();// http://jiravm.centralus.cloudapp.azure.com:8081/table-search-filter-demo.html

		// get nunber of rows
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table']/tbody/tr"));
		System.out.println("Number of rows = " + rows.size());
		System.out.println("-------------------ROW DATA----------------------------");
		Iterator<WebElement> it = rows.iterator();
		while (it.hasNext()) {
			String rowText = it.next().getText();
			System.out.println(rowText);
		}
// get nunber of columns
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='table']/thead/tr/th"));
		System.out.println(cols.size());
		
		
		System.out.println("---------------COLOMNS HEADERS-------------------------");
		for(WebElement col:cols) {
			String colText=col.getText();
			System.out.println(colText);
		}
		
	}
}
