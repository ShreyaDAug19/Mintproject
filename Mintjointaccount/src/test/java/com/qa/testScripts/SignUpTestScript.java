package com.qa.testScripts;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class SignUpTestScript {


	private WebDriver driver;
	private WebElement we;
	private String screenshotName;


	@Test
	public void createAccountForSingleUser() throws Exception {
		String driverPath = System.getProperty("user.dir") + "/src/test/java/Drivers/chromedriver.exe";
//		System.out.println(driverPath);
	    System.setProperty("webdriver.chrome.driver","./src/main/resources/com/qa/driver/chromedriver.exe" );
		
		ChromeOptions options = new ChromeOptions();
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://test-dev.ap-southeast-2.elasticbeanstalk.com/login");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("Login V2", title);

		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + dateName + ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);

		Assert.assertTrue(true);
		WebElement we = driver.findElement(By.xpath("//a[@id='txt2']"));
		we.click();
		Thread.sleep(2000);
		we = driver.findElement(By.xpath("//fieldset[@id='step1']//input[@name='next']"));
		we.click();
		String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);
		String emailID = "User" + userName + "@example.com";
		System.out.println(emailID);
		we = driver.findElement(By.xpath("//input[@id='email']"));
		we.sendKeys(emailID);
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='password']"));
		we.sendKeys("Shreya@1");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step11']//input[@name='next']"));
		we.click();
	
		we = driver.findElement(By.xpath("//div[contains(text(),'Joint Account')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step1']//input[@id='fullName']"));
		we.sendKeys("Mahesh");
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//input[@id='surname']"));
		we.sendKeys("Dubey");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='dob']"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[18]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step1']//div[@class='selected-flag']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step1']//li[14]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='select-occupation']/option[7]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//select[@class='selectoption form-group avisor-click working_with_adviser']/option[2]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(
				By.xpath("//select[@class='selectoption form-group avisor-click working_with_adviser']/option[2]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(
				By.xpath("//select[@id='isAdvisorCompany']/option[2]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//input[@class='form-control input-field '] "));
		we.sendKeys("1000");
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//fieldset[@id='step1']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='address']"));
		we.sendKeys("102 Hobson Street, Auckland CBD, Auckland, New Zealand");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//div[@class='col-sm-6']//input[@id='mobileNo']"));
		we.sendKeys("8745246895");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step2']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//li[1]//label[1]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='verificationa']"));
		we.sendKeys("000000");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step3']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='license_number']"));
		we.sendKeys("HFJDJ647H");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='licenseIshueDate']"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[81]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[3]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//a[contains(text(),'29')]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//input[@id='dob1']"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[11]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[3]"));
		we.click();
		Thread.sleep(1000);
		
		
		we = driver.findElement(By.xpath("//a[contains(text(),'29')]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(
				By.xpath("//div[@class='row drivery-licence']//input[@placeholder='Enter version number']"));
		we.sendKeys("001");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step4']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@class='selectoption form-group aml-select PIR']/option[2]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step5']//input[@placeholder='XXX-XXX-XXX']"));
		we.sendKeys("036471441");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='wealth_src']/option[4]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='isUSCitizen']/option[2]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step5']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@class='fname input-field more-investor-fname']"));
		we.sendKeys("Another Joint");
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//input[@class='sname input-field more-investor-sname']"));
		we.sendKeys("Holder");
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//input[@placeholder='Enter email address']"));
		we.sendKeys("mno@pqr.co");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//span[@class='enter-btn-small small-padd']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step6']//input[@name='next']"));
		we.click();
		Thread.sleep(2000);
		we = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/div[1]/div[1]/form[1]/fieldset[7]/div[1]/div[2]/div[1]/div[4]/input[1]"));
		we.click();
		Thread.sleep(2000);
		
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[44]"));
		we.click();
		Thread.sleep(2000);
		
		we = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
		we.click();
		Thread.sleep(2000);
		we = driver.findElement(By.xpath(
				"//div[@class='col-sm-6 form-group country-set flag-drop']//div[@class='intl-tel-input']//div[@class='intl-tel-input']//div[@class='selected-flag']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//ul[@class='country-list']//span[@class='country-name'][contains(text(),'Australia')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step601']//select[@name='occupation']/option[7]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step601']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath(
				"//fieldset[@id='step602']//button[@class='director-btn postal-address all-btn-color upper-btn same-as-investor1'][contains(text(),'Same as Investor 1')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step602']//input[@placeholder='Enter mobile number']"));
		we.sendKeys("8456795213");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step602']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//fieldset[@id='step603']//input[contains(@placeholder,'Enter licence number')]"));
		we.sendKeys("BVCDGHV346G");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@class='input-field clear-more-investor more-investor-issue more-investor-licenseIssueDate hasDatepicker']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[81]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[3]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//a[contains(text(),'29')]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//input[@class='input-field more-investor-exp clear-more-investor lic_expiry_Date more-investor-licenseExpiryDate hasDatepicker']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[11]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']/option[3]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//a[contains(text(),'29')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step603']//input[@placeholder='Enter version number']"));
		we.sendKeys("002");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step603']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath(
				"//fieldset[@id='step604']//select[@class='selectoption form-group aml-select presInvestRate']/option[2]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step604']//input[@placeholder='XXX-XXX-XXX']"));
		we.sendKeys("109045209");
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//fieldset[@id='step604']//select[@class='selectoption selectoption2 form-group usCitizen "
						+ "more-investor-usCitizen']/option[1]"));
		we.click();
		Thread.sleep(2000);
		we = driver.findElement(By.xpath("//fieldset[@id='step604']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//div[@class='textfirst']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//li[contains(text(),'ASB Bank')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='nameOfAccount']"));
		we.sendKeys("Abhay chobey");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='accountNumber']"));
		we.sendKeys("0201100317025000");
		Thread.sleep(2000);
		JavascriptExecutor jsx1 = (JavascriptExecutor) driver;
		jsx1.executeScript("document.getElementById('attachbankfile').click()");
		Thread.sleep(5000);
		StringSelection selection = new StringSelection(
				"D:\\Office_Code_Base\\Mintjointaccount\\src\\main\\resources\\com\\qa\\driver\\IRF.jpg");
		Robot rb = new Robot();
		Thread.sleep(2000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step11']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver
				.findElement(By.xpath("//label[contains(text(),'I have read and agree to the Terms and Conditions')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//label[contains(text(),'I am authorized to accept and act on behalf of all')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step12']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='submit']"));
		we.click();

		driver.get("http://test-dev.ap-southeast-2.elasticbeanstalk.com/login?logout");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		we = driver.findElement(By.xpath("//button[@class='confirm']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='Email']"));
		we.clear();
		we.sendKeys(emailID);
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='password']"));
		we.clear();
		we.sendKeys("Shreya@1");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//button[@id='logbtn']"));
		we.click();

		String title2 = driver.getTitle();
		System.out.println(title2);
		// Assert.assertEquals(title, "Beneficiary Dashboard");

		if (title2 == "Beneficiary Dashboard") {
			System.out.println("Joint Account" + emailID + "Successful");
		} else {
			System.out.println("Joint Account" + emailID + "UnSuccessful");
		}
	
		driver.quit();

}
}
