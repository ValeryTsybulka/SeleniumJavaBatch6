package com.syntax.class06_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.syntax.utils.BaseClass;

public class AmazonTask extends BaseClass{
public static void main(String[] args) {
	
	setUp();
	WebElement  searchDropDown=driver.findElement(By.id("searchDropdownBox"));
	
	Select selectDD = new Select(searchDropDown);
	List<WebElement> ddOptions=selectDD.getOptions();
	
	for(WebElement a: ddOptions) {
		String optionText=a.getText();
		System.out.println(optionText);
	}
	selectDD.selectByVisibleText("Books");
	WebElement searchTextbox=driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
	searchTextbox.sendKeys("Harry Potter");
	//WebElement seachButton=driver.findElement(by);
	
}
}
