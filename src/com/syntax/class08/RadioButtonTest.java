package com.syntax.class08;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.syntax.utils.CommonMethods;

public class RadioButtonTest extends CommonMethods {
	public static void main(String[] args) {
		setUp();

		List<WebElement> sex = driver.findElements(By.name("sex"));
		clickRadioOrCheckbox(sex, "-1");

		// List<WebElement>
		// sex=driver.findElements(By.cssSelector("input[name='sex']"));
		// System.out.println(sex.size());
		// for (WebElement w : sex) {
		// String value = w.getAttribute("value");
		// System.out.println(value);
		// }

		List<WebElement> radio=driver.findElements(By.cssSelector("input[type='radio']"));
		clickRadioOrCheckbox(radio, "1");
		System.out.println(radio.size());
		for(WebElement w:radio) {
		String a=	w.getAttribute("name");
		System.out.println(a);
		}
	}
}
