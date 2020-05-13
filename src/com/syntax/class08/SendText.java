package com.syntax.class08;

import org.openqa.selenium.WebElement;

import com.syntax.utils.BaseClass;

public class SendText extends BaseClass{

		
		public static void sendText(WebElement element, String text) {
			element.clear();
			element.sendKeys(text);
		}
		
	}

