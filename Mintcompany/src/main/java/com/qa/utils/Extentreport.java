package com.qa.utils;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extentreport {

	@Test
	public void createsignup()
	{
	 
		System.out.println("SignUp to Company Account");
		 ExtentHtmlReporter reporter = new ExtentHtmlReporter("./src/Report/Learnreport.html");
		 
		 ExtentReports extent = new ExtentReports();
		 extent.attachReporter(reporter);
		ExtentTest logger=  extent.createTest("createAccountForSingleUser");
		logger.log(Status.INFO, "Signup");
		logger.log(Status.PASS, "COMPANY ACCOUNT CREATED SUCCESSFULLY ");
		extent.flush();	
	}
	
}
