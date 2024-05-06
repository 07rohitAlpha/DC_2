package com.DC.testCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.DC.pageObjects.DirectionPage;
import com.DC.pageObjects.InterrogeeDetailsPage;
import com.DC.pageObjects.LoginPage;
import com.DC.pageObjects.UserInfoPage;

public class Direction extends BaseClass {

	@Test()
	public void directionTest() throws InterruptedException, IOException, AWTException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		Thread.sleep(2000);

		UserInfoPage uip = new UserInfoPage(driver);

		uip.setRank("INSPECTOR");
		uip.setName("Ajit");
		uip.setEntmob("9999999999");
		uip.clickCheckbox();
		Thread.sleep(2000);
		uip.setPhone("8950776471");
		uip.clickGenerateOtp(); 
		Thread.sleep(3000);
		uip.setPwrd("123456");
		uip.clickSubmit();
		Thread.sleep(2000);

		String ExpectedTitle = "http://localhost:3000/home/direction";
		String ExpectedTitle1 = "http://localhost:3000/home";
		String ExpectedTitle2 = "http://localhost:3000/home/suspect";
		String ExpectedTitle3 = "http://localhost:3000/home/suspect";

		DirectionPage dir = new DirectionPage(driver);
		String ActualTitle = dir.getTitle();
		System.out.println(ActualTitle);
		Thread.sleep(2000);

		dir.clickArrested();
		Thread.sleep(2000);
		try {
			if (driver.getTitle().equals(ExpectedTitle)) {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "directionTest");
			Assert.assertTrue(false);
		}

//		InterrogeeDetailsPage idp = new InterrogeeDetailsPage(driver);
//
//		idp.setFName("Karan");
////		logger.info("Entered Name");
//		Thread.sleep(1000);
//
//		idp.setParentage("arjun");
////		logger.info("Entered parentage");
//		Thread.sleep(1000);
//
//		idp.setGender("Male");
////		logger.info("Entered Gender");
//		Thread.sleep(1000);
//
//		idp.setAlias("qwertqwe");
////		logger.info("Entered Alias");
//		Thread.sleep(1000);
//
//		idp.setDOB("01-01-2020");
////		logger.info("Entered DOB");
//		Thread.sleep(1000);
//
//		idp.setAge("3");
////		logger.info("Entered Age");  
//		Thread.sleep(1000);
//
//		idp.BirthPlace("Delhi");
////		logger.info("Entered BirthPlace");
//		Thread.sleep(1000);
//
//		idp.DossierNo("123456789");
////		logger.info("Entered tribe");
//		Thread.sleep(1000);
//
//		idp.Tribe("Yes");
////		logger.info("Entered Tribe");
//		Thread.sleep(1000);
//
//		idp.Marital("MARRIED");
////		logger.info("Entered Martial");
//		Thread.sleep(1000);
//
//		idp.FingerPrNo("12ABC");
////		logger.info("Entered FingerPrNo");
//		Thread.sleep(1000);
//
//		idp.Religion("HINDU");
////		logger.info("Entered Religion");
//		Thread.sleep(1000);
//
//		idp.Caste("BRAHMIN");
////		logger.info("Entered Caste");
//		Thread.sleep(100);
//
//		idp.Sect("SHAKTISM");
////		logger.info("Entered Sect");
//		Thread.sleep(1000);
//
//		idp.Nationality("INDIA");
////		logger.info("Entered Nationality");
//		Thread.sleep(1000);
//
//		idp.Identification("CUT MARK ON LRFT HAND WRIST");
////		logger.info("Entered Identification Mark");
//		Thread.sleep(2000);
//
//		idp.Occupation("KJGF");
////		logger.info("Entered Occupation");
//		Thread.sleep(2000);
//
//		idp.NatureOfCrime("Gangster");
////		logger.info("Entered NatureOdCrime");
//		Thread.sleep(2000);
//
//		idp.Gangster();
////		logger.info("select gangster");
//		Thread.sleep(2000);
//
//		idp.Terrorist();
////		logger.info("select Terrorist");
//		Thread.sleep(2000);
//
//		idp.uncheck4();
////		logger.info("uncheck");
//		Thread.sleep(3000);
//
//		idp.CriminalExpertise("Consumer");
////		logger.info("Entered CriminalExpertise");
//		Thread.sleep(1000);
//
//		idp.Consumer();
////		logger.info("select consumer");
//		Thread.sleep(1000);
//
//		idp.Carrier();
////		logger.info("select Carrier");
//		Thread.sleep(1000);
//
//		idp.Destination();
////		logger.info("select destination");
//		Thread.sleep(1000);
//
//		idp.Financer();
////		logger.info("select financer");
//		Thread.sleep(1000);
//
//		idp.uncheck7();
////		logger.info("uncheck the Financer ");
//		Thread.sleep(500);
////
////		WebElement Frontbutton = driver.findElement(By.xpath("(//input[@name='frontimagesAttachment'])[1]"));
////		JavascriptExecutor FrontSidePhoto = (JavascriptExecutor) driver;
////		FrontSidePhoto.executeScript("arguments[0].click();", Frontbutton);
////
////		// creating object of robot class
////		Robot fb = new Robot();
////		Thread.sleep(2000);
////
////		StringSelection Frontphoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho");
////		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Frontphoto, null);
////
////		// press Contol+V for pasting
////		fb.keyPress(KeyEvent.VK_CONTROL);
////		fb.keyPress(KeyEvent.VK_V);
////
////		// release Contol+V for pasting
////		fb.keyRelease(KeyEvent.VK_CONTROL);
////		fb.keyRelease(KeyEvent.VK_V);
////
//////	    // for pressing and releasing Enter
////		fb.keyPress(KeyEvent.VK_ENTER);
////		fb.keyRelease(KeyEvent.VK_ENTER);
////		Thread.sleep(5000);
//
//		WebElement Backbutton = driver.findElement(By.xpath("//input[@name='backimagesAttachment']"));
//		JavascriptExecutor BackSidePhoto = (JavascriptExecutor) driver;
//		BackSidePhoto.executeAsyncScript("arguments[0].click();", Backbutton);
//
//		// Creating object of robot class
//		Robot bb = new Robot(); 
//		Thread.sleep(2000); 
//
//		StringSelection Backphoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\7.1 ");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Backphoto, null);
//
//		// press Contol+V for pasting
//		bb.keyPress(KeyEvent.VK_CONTROL);
//		bb.keyPress(KeyEvent.VK_V);
//
//		// release Contol+V for pasting
//		bb.keyRelease(KeyEvent.VK_CONTROL);
//		bb.keyRelease(KeyEvent.VK_V);
//
//		// for pressing and releasing Enter
//		bb.keyPress(KeyEvent.VK_ENTER);
//		bb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(5000);
//		
//		idp.clickSubmit();
////		logger.info("Submit The Form");
//		Thread.sleep(1000);

		// ==========SUSPECT=================
		
		dir.clickHome();
		Thread.sleep(3000);
		
		String ActualTitle1 = dir.getTitle();
		System.out.println(ActualTitle1);
		dir.clickSuspect();
		Thread.sleep(2000);
		try {
			if (driver.getTitle().equals(ExpectedTitle1)) {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "directionTest");
			Assert.assertTrue(false);
		}

		// ===========LEFTOVER/WANTED=============
		
		dir.clickHome();
		Thread.sleep(3000);

		String ActualTitle2 = dir.getTitle();
		System.out.println(ActualTitle2);
		dir.clickLeftover();
		Thread.sleep(2000);
		try {
			if (driver.getTitle().equals(ExpectedTitle2)) {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "directionTest");
			Assert.assertTrue(false);
		}
		
		dir.setNatureOfCrime("Gangster");
		Thread.sleep(1000);
		
		dir.setFIRNo("1231");
		Thread.sleep(1000);
		
		dir.setFIRYear("2020");
		Thread.sleep(1000);
		
		dir.setFIRDate("05-04-2024");
		Thread.sleep(1000);
		
		dir.setFIRState("Delhi");
		Thread.sleep(1000);
		
		dir.setFIRDistrict("CENTRAL");
		Thread.sleep(1000);
		
		dir.setFIRPoliceStation("ANAND PARBAT");
		Thread.sleep(1000);
		
		dir.setContext("Leftover/wanted ");
		Thread.sleep(1000);

	}

}
