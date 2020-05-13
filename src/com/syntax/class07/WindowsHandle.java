package com.syntax.class07;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import com.syntax.utils.BaseClass;

public class WindowsHandle extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		setUp();

		String signUpTitle = driver.getTitle();
		System.out.println(signUpTitle);

		driver.findElement(By.linkText("Follow On Instagram")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Like us On Facebook")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Follow Instagram & Facebook")).click();
		Thread.sleep(2000);

		Set<String> allWindowHandles = driver.getWindowHandles();

		Iterator<String> it = allWindowHandles.iterator();
		while (it.hasNext()) {
			String handle = it.next();
			Object parentWindowHandle = null;
			if (!handle.equals(parentWindowHandle)) {
				driver.switchTo().window(handle);
				System.out.println(driver.getTitle());
				driver.close();
				Thread.sleep(2000);
			}
		}
		driver.close();
	}
}
