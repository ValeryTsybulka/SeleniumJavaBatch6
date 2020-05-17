package com.syntax.SeleniumReview;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HendlingWindows {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/Practiceform/");
		// driver.manage().window().maximize();
		WebElement newBrowserTab = driver.findElement(By.xpath("//button[text()='New Browser Tab']"));
		newBrowserTab.click();
		String parentWindow = driver.getWindowHandle();
		Thread.sleep(2000);
		driver.close();

		Set<String> allWindows = driver.getWindowHandles();
		Iterator<String> it = allWindows.iterator();
		//String child=driver.getWindowHandle(); driver.switchTo().window(child);--> 2nd way in this case
		while (it.hasNext()) {
			String childWindow = it.next();
			if (!childWindow.equals(parentWindow)) {
				driver.switchTo().window(childWindow);
			}
		}
		WebElement header = driver.findElement(By.xpath("//strong[contains(text(),'Agile Testing ')]"));
		String headerText = header.getText();
		System.out.println(headerText);

	}
}
