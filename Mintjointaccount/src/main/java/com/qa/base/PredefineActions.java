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

	private WebElement getElement(String locator) {
		String[] loc = locator.split("]:-");
		//Type of locator eg: xpath
		String locatorType = loc[0].substring(1); 
		// value of xpath
		String locatorValue = loc[1]; 
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, 30);

		switch (locatorType.toLowerCase()) {
		case "id":
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(locatorValue)));
			break;
		case "xpath":
			element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue)));
			break;
		default:
			System.out.println("invalid element selection");

		}
		return element;
	}

	protected void setText(String locator, String value) {
		WebElement element = getElement(locator);
		if (element.isEnabled())
			element.sendKeys(value);
		else
			System.out.println("SORRY!!Elemennt not enabled");

	}

	protected void clickOnElement(String locator) {
		WebElement element = getElement(locator);
		if (element.isEnabled())
			element.click();
		else
			System.out.println("element not enabled");
	}
}
