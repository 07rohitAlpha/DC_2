//package com.DC.utilities;
//
//import com.aventstack.extentreports.ExtentReports;
//import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//
//public class Reporting1 {
//	
//	ExtentSparkReporter htmlReporter;
//	ExtentReports reports;
//	ExtentTest test;
//	
//	
//	
//	public void startReport() {
//		htmlReporter = new ExtentSparkReporter("ExtentReportDemo.html");
//		reports = new ExtentReports();
//		reports.attachReporter(htmlReporter);
//		
//		reports.setSystemInfo("Machine", "testpc1");
//		reports.setSystemInfo("OS", "Window 11");
//		reports.setSystemInfo("user", "rohit");
//		reports.setSystemInfo("browser", "chrome");
//		
//		
//		
//		htmlReporter.config().setDocumentTitle("DC Test Project");
//		htmlReporter.config().setReportName("Functional Test Report");
//		htmlReporter.config().setTheme(Theme.STANDARD);
//	}
//
//}
