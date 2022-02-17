package org.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseutils {

	protected static WebDriver driver;
	
	public WebDriver driverinit(String s) {
		if(s.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/resources/chromedriver1.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}
	
	public void getUrl(String url) {
		driver.get(url);
	}
	
	public void click(WebElement element) {
		element.click();
	}
	
	public void inputTextBox(WebElement element, String key) {
		element.sendKeys(key);
	}
	
	
}
