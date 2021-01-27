package com.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class libGlobal {
	public static WebDriver driver;

	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);

	}

	public void loadUrl(String url) {
		
			driver.get(url);
		
	}

	public boolean ishidden(WebElement element) {
		return element.isDisplayed();
	}

	public boolean isenable(WebElement element) {
		return element.isEnabled();
	}

	public void fillText(WebElement element, String text) {
		if (ishidden(element) && isenable(element)) {
			if (!(text.equals(null))) {
				element.clear();
				element.sendKeys(text);
			
			}
		} else {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			element.clear();
			js.executeScript("arguments[0].setAttribute('value'," + text + ")", element);
		}

	}

	public void selectDrop(WebElement element, String text) {
		new Select(element).selectByVisibleText(text);
	}

	public void click(WebElement element) {
		if (isenable(element) && ishidden(element)) {
			element.click();
		}
	}

	public String getValue(WebElement element) {
		return element.getAttribute("value");

	}
}
