package com.syntax.test;

import com.syntax.pages.LoginPageHRM;
import com.syntax.utils.CommonMethods;
import com.syntax.utils.ConfigsReader;

public class HRMTest extends CommonMethods {
	public static void main(String[] args) {
		setUp();// http://166.62.36.207/humanresources/symfony/web/index.php/auth/login
		LoginPageHRM login = new LoginPageHRM();
		System.out.println(login.logo.isDisplayed());
		
		sendText(login.userName, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.btnLogin);
		
		
	}
}
