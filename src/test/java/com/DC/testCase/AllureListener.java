package com.DC.testCase;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class AllureListener  implements ITestListener {
	
	private static String getTestMethodName(ITestResult iTestResult) {
		return iTestResult.getMethod().getConstructorOrMethod().getName();
	}

	@SuppressWarnings("unused")
	private boolean instance;
	
	@Attachment
	public byte[] saveFailureScreenShot(WebDriver driver) {
		return ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		
	}
	
	@Attachment (value= "{0}" , type = "text/plain")
	public static String saveTextLog(String message) {
		return message;
	}
	
	@Override
	public void onStart(ITestContext iTestContext) {
		System.out.println("I am in onStart Method" + iTestContext.getName());
		iTestContext.setAttribute("WebDriver", BaseClass.getDriver());
	}
	
	@Override
	public void onFinish(ITestContext iTestContext) {
		System.out.println("I am in  onFinish Method" + iTestContext.getName());
	}
	
	
	@Override 
	
	public void onTestStart(ITestResult iTestResult) {
		System.out.println("I am in onTestStart Method " + getTestMethodName(iTestResult) + "Start");
	}
	
	@Override 
	public void onTestSuccess(ITestResult iTestResult) {
		System.out.println("I am in onTestSuccess Mehtod"+ getTestMethodName(iTestResult)+"Success");
	}
	
	@Override
	public void onTestFailure(ITestResult iTestResult) {
		System.out.println("I am in onTestFailure method " + getTestMethodName(iTestResult)+"Failure");
		Object testClass = iTestResult.getInstance();
		WebDriver driver = BaseClass.getDriver();
		// Allure ScreenShot and SaveTestLog
		if(driver instanceof WebDriver) {
			System.out.println("ScreenShot Capture for test case:" + getTestMethodName(iTestResult));
			saveFailureScreenShot(driver);
		}
		saveTextLog(getTestMethodName(iTestResult) +"faild and Screenshot taken!");
	}
	
	@Override 
	public void onTestSkipped(ITestResult iTestResult) {
		System.out.println("I am in onTestSkipped method" + getTestMethodName(iTestResult)+ "Skipped");
	}
	
	@Override 
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
		System.out.println("Test failure but it is define success ratio" + getTestMethodName(iTestResult)+ "FailureButwithinSuccessPercentage");
	}
	
	
		
		
		
	}


