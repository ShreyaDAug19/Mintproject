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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupScript {
	

	private WebDriver driver;
	private WebElement we;
	private String screenshotName;

	@Test
	public void createAccountForSingleUser() throws Exception {
		String driverPath = System.getProperty("user.dir") + "./src/main/resources/com/qa/driver/chromedriver.exe";
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
		we.sendKeys("Wesson@0000");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step11']//input[@name='next']"));
		we.click();

		we = driver.findElement(By.xpath("//div[contains(text(),'Company Account')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='companyName']"));
		we.sendKeys("A");
		Thread.sleep(3000);
		we.clear();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='companyName']"));
		we.sendKeys("A");
		Thread.sleep(5000);
		we = driver.findElement(By.xpath("//a[contains(text(),'A LIMITED')]"));
		we.click();
		Thread.sleep(5000);
		we = driver.findElement(By.xpath("//fieldset[@id='step1']//input[@name='next']"));
		we.click();
		Thread.sleep(2000);
		we = driver.findElement(By.xpath("//a[@id='btn20']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//select[@class='selectoption option-add adjust-option directorTitle']/option[2]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//div[@class='row director-add removedirector']//input[@id='fname']"));
		we.sendKeys("Claura Adams");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//a[@class='this-btn']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step2']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='Date_of_Birth']"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[18]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step3']//select[@name='occupation']/option[45]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='cOccupation']"));
		we.sendKeys("Business Person");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step3']//div[@class='selected-flag']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//ul[@class='country-list']//span[@class='country-name'][contains(text(),'Australia')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='positionInCompany']/option[3]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step3']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='address']"));
		we.sendKeys("102 Hobson Street, Auckland CBD, Auckland, New Zealand");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='mobileNo']"));
		we.sendKeys("9729767778");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step4']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//li[1]//label[1]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='verificationa']"));
		we.sendKeys("000000");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step5']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='src_of_fund1']/option[3]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='TypeofID']"));
		we.sendKeys("Voter Card");
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//input[@id='typeIssueDate']"));
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
		
		we = driver.findElement(By.xpath("//input[@id='typeExpiryDate']"));
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
		we = driver.findElement(
				By.xpath("//div[@class='down-arrow down-arrow-new']"));
		we.click();
		
		we = driver.findElement(
				By.xpath("//ul[@class='country-list']//span[@class='country-name'][contains(text(),'Australia')]"));
		we.click();
		Thread.sleep(1000);  
		
		we = driver.findElement(By.xpath("//input[@id='otherDocument']"));
		we.sendKeys("D:\\Office_Code_Base\\Mintcompany\\src\\main\\resources\\com\\qa\\driver\\IRF.jpg");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step6']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='irdNumber']"));
		we.sendKeys("089559693");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step7']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step701']//input[@placeholder='Enter email address']"));
		we.sendKeys("michael@max.max");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath(
				"//fieldset[@id='step701']//span[@class='enter-btn-small small-padd1'][contains(text(),'Send them an email requesting info')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step701']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step12']//input[@name='previous']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath(
				"//fieldset[@id='step701']//span[@class='enter-btn-small small-padd'][contains(text(),'I will enter their details now')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step701']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@class='form-control input-field removedata more-director-address pac-target-input']"));
		we.sendKeys("102 Hobson Street, Auckland CBD, Auckland, New Zealand");
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//body/div[@class='container']/div[@class='row']/div[contains(@class,'col-md-12')]"
						+ "/div[@class='content_body']/form[@id='msform']/fieldset[@id='step702']/div[@class='content-section']"
						+ "/div[@class='input-content']/div[@class='row']/div[@class='col-sm-6 flag-drop']/div[@class='company-flag']/input[1]"));
		we.sendKeys("0128474798");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath(
				"//input[@class='input-field more-director-dob more-director-dateOfBirth hasDatepicker']"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']/option[18]"));
		we.click();
		Thread.sleep(1000);
		
		we = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step702']//select[@name='occupation']/option[4]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath(
				"//fieldset[@id='step702']//select[@class='selectoption form-group more-director-positionInCompany']/option[3]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step702']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//fieldset[@id='step703']//input[contains(@placeholder,'Enter licence number')]"));
		we.sendKeys("GSHDY678HJ");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath(
				"//input[@class='input-field issueDate lic_expiry_Date more-director-licenseIssueDate hasDatepicker']"));
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
		
		
		we = driver.findElement(By.xpath(
				"//input[@class='input-field more-director-exp lic_expiry_Date more-director-licenseExpiryDate hasDatepicker']"));
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
		we = driver.findElement(By.xpath("//fieldset[@id='step703']//input[@placeholder='Enter version number']"));
		we.sendKeys("002");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step703']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath(
				"//fieldset[@id='step704']//div[@class='col-sm-6 form-group country-set flag-drop']//div[@class='selected-flag']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(
				By.xpath("//ul[@class='country-list']//span[@class='country-name'][contains(text(),'Australia')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step704']//input[@placeholder='XXX-XXX-XXX']"));
		we.sendKeys("022629743");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step704']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='pir']/option[2]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='comIRDNumber']"));
		we.sendKeys("010387051");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='sourceOfFunds']/option[4]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step12']//input[@name='next']"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='isCompanyFinancialInstitution']/option[2]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='isCompanyActivePassive']/option[2]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//select[@id='isCompanyUSCitizen']/option[2]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//fieldset[@id='step13']//input[@name='next']"));
		we.click();
		Thread.sleep(2000);
		we = driver.findElement(By.xpath("//div[@class='textfirst']"));
		we.click();
		Thread.sleep(2000);
		we = driver.findElement(By.xpath("//li[contains(text(),'TSB Bank')]"));
		we.click();
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='nameOfAccount']"));
		we.sendKeys("A Limited co.");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//input[@id='accountNumber']"));
		we.clear();
		we.sendKeys("0602410246335000");
		Thread.sleep(1000);
		
		JavascriptExecutor jsx1 = (JavascriptExecutor) driver;
		jsx1.executeScript("document.getElementById('attachbankfile').click()");
		Thread.sleep(5000);
		StringSelection selection = new StringSelection(
				"D:\\Office_Code_Base\\Mintcompany\\src\\main\\resources\\com\\qa\\driver\\IRF.jpg");
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
		
		we = driver.findElement(By.xpath("//fieldset[@id='step14']//input[@name='next']"));
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
		we = driver.findElement(By.xpath("//fieldset[@id='step15']//input[@name='next']"));
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
		we.sendKeys("Wesson@0000");
		Thread.sleep(1000);
		we = driver.findElement(By.xpath("//button[@id='logbtn']"));
		we.click();

		String title1 = driver.getTitle();
		System.out.println(title);
		// Assert.assertEquals(title, "Beneficiary Dashboard");

		if (title == "Beneficiary Dashboard") {
			System.out.println("Company Account" + emailID + "Successful");
		} else {
			System.out.println("Company Account" + emailID + "UnSuccessful");
		}

		driver.quit();
	}

}
