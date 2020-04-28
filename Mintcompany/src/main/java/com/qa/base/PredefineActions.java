package com.qa.base;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qa.constant.ConstantPath;

public class PredefineActions {

	protected static WebDriver driver;

	final static public WebDriver initialization()

	{
		System.setProperty(ConstantPath.chromeDriverkey, ConstantPath.chromeDriver);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		return driver;

	}

	protected String acceptAlert() {
		Alert alert = driver.switchTo().alert();
		String actual = alert.getText();
		alert.accept();
		return actual;

	}

	public static void close() {
		driver.close();
	}
}
