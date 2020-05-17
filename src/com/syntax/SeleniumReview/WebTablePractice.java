package com.syntax.SeleniumReview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePractice {
	// acstrating data from web table
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://testingpool.com/data-types-in-java/");
		// driver.manage().window().maximize();

		List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'table')]/table/tbody/tr"));
		System.out.println("Number of rows " + rows.size());

		List<WebElement> cols = driver.findElements(By.xpath("//div[contains(@class,'table')]/table/tbody/tr[1]/td"));
		System.out.println("Number of columns " + cols.size());

		for (int i = 1; i <= rows.size(); i++) {
			for (int j = 1; j <= cols.size(); j++) {
				WebElement cellData = driver.findElement(
						By.xpath("//div[contains(@class,'table')]/table/tbody/tr[" + i + "]/td[" + j + "]"));
				String cellDataText = cellData.getText();
				//System.out.println(cellDataText);
				if(j==2) {
					System.out.println("-->"+cellDataText);
				}
			}
		}

	}
}
