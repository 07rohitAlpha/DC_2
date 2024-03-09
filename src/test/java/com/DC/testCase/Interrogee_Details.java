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
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.DC.actiondriver.Action;
import com.DC.pageObjects.DirectionPage;
import com.DC.pageObjects.InterrogeeDetailsPage;
import com.DC.pageObjects.LoginPage;
import com.DC.pageObjects.UserInfoPage;

public class Interrogee_Details extends BaseClass{
	
	private static final String AWTException = null;
	private static final String InterruptedException = null;
	private WebElement txtNatureOfCrime;
	public static Logger log;
	
	

	@Test()
	public void IntoTest() throws InterruptedException, AWTException, IOException {
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
		Thread.sleep(5000);
		uip.setPwrd("123456");
		uip.clickSubmit();
		
		
		String ExpectedTitle = " http://localhost:3001/home/direction";
		String ExpectedTitleNamea= "karan";
		String ExpectedTitleFingerPrintNo="12ABC";
		String ExpectedTitleDossierNo = "123456789";
		String ExpectedTitleFRS =" ";

		DirectionPage dir = new DirectionPage(driver);
		String ActualTitle = dir.getTitle();
		System.out.println(ActualTitle);
		Thread.sleep(3000);

		dir.clickArrested();
		Thread.sleep(3000);
		try {
			if (driver.getTitle().equals(ExpectedTitle)) {
				Assert.assertTrue(true);
			}
		} catch (Exception e) {
			e.printStackTrace();
			captureScreen(driver, "directionTest");
			Assert.assertTrue(false);
		}
		
		
		Thread.sleep(2000);
		InterrogeeDetailsPage idp = new InterrogeeDetailsPage(driver);
		
		idp.setFName("Karan");
//		logger.info("Entered Name");
		Thread.sleep(1000);
		
		idp.setParentage("arjun");
//		logger.info("Entered parentage");
		Thread.sleep(1000);
		
		idp.setGender("Male");
//		logger.info("Entered Gender");
		Thread.sleep(1000);
		
		idp.setAlias("qwertqwe");
//		logger.info("Entered Alias");
		Thread.sleep(1000);
		
		idp.setDOB("01-01-2020");
//		logger.info("Entered DOB");
		Thread.sleep(1000);
		
		
		idp.setAge("3");
//		logger.info("Entered Age");  
		Thread.sleep(1000);
		
		idp.BirthPlace("Delhi");
//		logger.info("Entered BirthPlace");
		Thread.sleep(1000);
		
		idp.DossierNo("123456789");
//		logger.info("Entered tribe");
		Thread.sleep(1000);
		
		idp.Tribe("Yes");
//		logger.info("Entered Tribe");
		Thread.sleep(1000);
		
		idp.Marital("MARRIED");
//		logger.info("Entered Martial");
		Thread.sleep(1000);
		
		idp.FingerPrNo("12ABC");
//		logger.info("Entered FingerPrNo");
		Thread.sleep(500);
		
		idp.Religion("HINDU");
//		logger.info("Entered Religion");
		Thread.sleep(500);
		
		idp.Caste("BRAHMIN");
//		logger.info("Entered Caste");
		Thread.sleep(500);
		
		idp.Sect("SHAKTISM");
//		logger.info("Entered Sect");
		Thread.sleep(500);
		
		idp.Nationality("INDIA");
//		logger.info("Entered Nationality");
		Thread.sleep(500);
		
		
		idp.Identification("CUT MARK ON LRFT HAND WRIST");
//		logger.info("Entered Identification Mark");
		Thread.sleep(1000);
		
		idp.Occupation("KJGF");
//		logger.info("Entered Occupation");
		Thread.sleep(1000);
		
//	    idp.clickNatureOfCrime();
//		Select s1 = new Select(txtNatureOfCrime);
//		s1.selectByValue("Gangster");
//		 
		
		idp.NatureOfCrime("Gangster");
//		logger.info("Entered NatureOdCrime");
		Thread.sleep(1000);
		
		idp.Gangster();
//		logger.info("select gangster");
		Thread.sleep(1000);
		
		idp.Narcotics();
//		logger.info("select Narcotics");
		Thread.sleep(1000);
		
		
		idp.Terrorist();
//		logger.info("select Terrorist");
		Thread.sleep(1000);
		
//		idp.Dfdf();
//		logger.info("select Dfdf");
//		Thread.sleep(1000);
		
		idp.uncheck4();
//		logger.info("uncheck");
		Thread.sleep(3000);
//		
//		WebElement n = driver.findElement(By.xpath("(//input[@id='search_input'])[1]"));
//		Select s1 = new Select(n);
//		s1.selectByValue("Gangster");
		
		
		
		idp.CriminalExpertise("Consumer");
//		logger.info("Entered CriminalExpertise");
		Thread.sleep(1000);
		
		
		idp.Consumer();
//		logger.info("select consumer");
		Thread.sleep(1000);
		
		
		
		idp.Carrier();
//		logger.info("select Carrier");
		Thread.sleep(1000);
		
		
		idp.Destination();
//		logger.info("select destination");
		Thread.sleep(1000);
		
		
		idp.Financer();
//		logger.info("select financer");
		Thread.sleep(1000);
		
		
		idp.uncheck7();
//		logger.info("uncheck the Financer ");
		Thread.sleep(500);
		
		
		
		WebElement Frontbutton =driver.findElement(By.xpath("(//input[@name='frontimagesAttachment'])[1]"));
		JavascriptExecutor FrontSidePhoto = (JavascriptExecutor)driver;
		FrontSidePhoto.executeScript("arguments[0].click();" ,Frontbutton );
		
		
		// creating object of robot class
		Robot fb = new Robot();
		Thread.sleep(2000);
//		
//		// Simulate the keypress of the TAB key to move the focus to the file input element
//		fb.keyPress(KeyEvent.VK_TAB);
//		fb.keyRelease(KeyEvent.VK_TAB);
//		
//		// Simulate the keypress of the ENTER key to open the file upload dialog box
//		fb.keyPress(KeyEvent.VK_ENTER);
//		fb.keyRelease(KeyEvent.VK_ENTER);
//		
		StringSelection Frontphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Frontphoto, null);
		
		// press Contol+V for pasting
	    fb.keyPress(KeyEvent.VK_CONTROL);
	    fb.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb.keyRelease(KeyEvent.VK_CONTROL);
	    fb.keyRelease(KeyEvent.VK_V);
	    
//	    // for pressing and releasing Enter
		fb.keyPress(KeyEvent.VK_ENTER);
		fb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	
		
	
		WebElement Backbutton =driver.findElement(By.xpath("//input[@name='backimagesAttachment']"));
		JavascriptExecutor BackSidephoto = (JavascriptExecutor)driver;
		BackSidephoto.executeScript("arguments[0].click();" ,Backbutton );
		
		// creating object of robot class 
		Robot bb = new Robot();
		Thread.sleep(1000);
		
//
//		// Simulate the keypress of the TAB key to move the focus to the file input element
//		bb.keyPress(KeyEvent.VK_TAB);
//		bb.keyRelease(KeyEvent.VK_TAB);
//		
//		// Simulate the keypress of the ENTER key to open the file upload dialog box
//		bb.keyPress(KeyEvent.VK_ENTER);
//		bb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		//StringSelection Backphoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\7.1");
		
		StringSelection Backphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\5.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Backphoto, null);
				
		// press Contol+V for pasting
		bb.keyPress(KeyEvent.VK_CONTROL);
		bb.keyPress(KeyEvent.VK_V);
		Thread.sleep(500);
			    
		// release Contol+V for pasting
		bb.keyRelease(KeyEvent.VK_CONTROL);
		bb.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(500);
		// for pressing and releasing Enter
		bb.keyPress(KeyEvent.VK_ENTER);
		bb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(500);
		

//		WebElement Rightbutton =driver.findElement(By.xpath("//input[@name='rightimagesAttachment']"));
//		JavascriptExecutor RightSidephoto = (JavascriptExecutor)driver;
//		RightSidephoto.executeScript("arguments[0].click();" ,Rightbutton,null );
//		
//		
//		// creating object of robot class
//		Robot rb = new Robot();
//		Thread.sleep(500);
//		StringSelection Rightphoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\2.1");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Rightphoto, null);
//				
//		// press Contol+V for pasting
//		rb.keyPress(KeyEvent.VK_CONTROL);
//		rb.keyPress(KeyEvent.VK_V);
//		Thread.sleep(500);
//			    
//		// release Control+V for pasting
//		rb.keyRelease(KeyEvent.VK_CONTROL);
//		rb.keyRelease(KeyEvent.VK_V);
//	    Thread.sleep(500);
//		// for pressing and releasing Enter
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(500);	
//		
//		WebElement Leftbutton = driver.findElement(By.xpath("//input[@name='leftimagesAttachment']"));
//		JavascriptExecutor LeftSidephoto = (JavascriptExecutor)driver;
//		LeftSidephoto.executeScript("arguments[0].clcik();", Leftbutton);
//		
//		// Creatinh object of robot class
//		Robot lb = new Robot();
//		Thread.sleep(500);
//		
//		StringSelection Leftphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\3.1");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Leftphoto, null);
//		
//	    // press Control+V for pasting
//		lb.keyPress(KeyEvent.VK_CONTROL);
//		lb.keyPress(KeyEvent.VK_V);
//		Thread.sleep(500);
//		
//		// release Control+V for pasting 
//		lb.keyRelease(KeyEvent.VK_CONTROL);
//		lb.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(500);
//		
//		// for pressing and releasing Enter 
//		lb.keyPress(KeyEvent.VK_ENTER);
//		lb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(500);
//		
//		WebElement Tattoobutton = driver.findElement(By.xpath("//input[@name='tattooimagesAttachment']"));
//		JavascriptExecutor TattooSidePhoto = (JavascriptExecutor)driver;
//		TattooSidePhoto.executeScript("argumrnts[0].click();", Tattoobutton);
//		
//		// Creating object of robot class 
//		Robot tb = new Robot();
//		Thread.sleep(500);
//		StringSelection Tattoophoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\5.1");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Tattoophoto, null);
//		
//		// Press Control+v for pasting 
//		tb.keyPress(KeyEvent.VK_CONTROL);
//		tb.keyPress(KeyEvent.VK_V);
//		Thread.sleep(500);
//		
//		// Release Control+V for pasting
//		tb.keyRelease(KeyEvent.VK_CONTROL);
//		tb.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(500);
//		
//		// Creating object and releasing Enter
//		tb.keyPress(KeyEvent.VK_ENTER);
//		tb.keyRelease(KeyEvent.VK_ENTER);
//		
//		WebElement Deformitybutton = driver.findElement(By.xpath("//input[@name='deformatiyimagesAttachment']"));
//		JavascriptExecutor  DeformitySidePhoto= (JavascriptExecutor)driver;
//		DeformitySidePhoto.executeScript("arguments[0].click();", Deformitybutton);
//		
//		// Creating object of Robot class
//		Robot db= new Robot();
//		Thread.sleep(500);
//		StringSelection Deformityphoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\5.1");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Deformityphoto, null);
//		
//
//		// Press Control+v for pasting 
//		db.keyPress(KeyEvent.VK_CONTROL);
//		db.keyPress(KeyEvent.VK_V);
//		Thread.sleep(500);
//		
//		// Release Control+V for pasting
//		db.keyRelease(KeyEvent.VK_CONTROL);
//		db.keyRelease(KeyEvent.VK_V);
//		Thread.sleep(500);
//		
//		// Creating object and releasing Enter
//		db.keyPress(KeyEvent.VK_ENTER);
//		db.keyRelease(KeyEvent.VK_ENTER);	
		
		
		
//		idp.Remark("Automatice Fill the Form");
//		Thread.sleep(3000);
		
		
//		idp.FrontSidePhoto("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho.jpj");
//		logger.info("select the FrontSidePhoto");
//		Thread.sleep(3000);
		
		
		
		
		
//		idp.BackSidePhoto();
//		logger.info("Select the BackSidePhoto");
//		Thread.sleep(2000);
//	
//		
//		idp.RightSidePhoto();
//		logger.info("Select the RightSidePhoto");
//		Thread.sleep(2000);
//		
//		
//		idp.LeftSidePhoto();
//		logger.info("Select the leftSidePhoto");
//		Thread.sleep(2000);
//		
//		
//		idp.TattooPhoto();
//		logger.info("Select the Tattoophoto");
//		Thread.sleep(1000);
//		
//		
//		idp.DeformityPhoto();
//		logger.info("select the deformity");
//		Thread.sleep(1000);
//		
//		
		
		
		
		idp.clickSubmit();
		logger.info("Submit The Form");
		Thread.sleep(1000);
//		
		try {
			if(driver.getTitle().equals("http://localhost:3000/home/")){
				Assert.assertTrue(true);
				logger.info("Interrogee Detail from submitted");
				Reporter.log("Interrogee Detail from submitted");
			}
		}catch(Exception e) {
			
			e.printStackTrace();
			captureScreen(driver,"Interrogee");
			Assert.assertTrue(false);
			Reporter.log("Interrogee from Submitted failed ");
		}
		 
		Thread.sleep(4000);
//     ==========Close button ===========
		idp.clickclosebutton();
		
		Thread.sleep(2000);
		
		try {
			System.out.println("click to close button");
			
			logger.info("click to close button ");
		}catch(Exception e)
		{
			System.out.println("mouse is not click to close button");
			logger.info("pis not click to close button ");
		}
		
		Thread.sleep(4000);
		
		
		
		
//		========== All Match ============
		idp.clickSubmit();
		Thread.sleep(1000);
		idp.clickAllmatch();
		Thread.sleep(2000);
		logger.info("click to AllMatch button");
		try { 
			if(driver.getTitle().equals("Karan")) {
				Assert.assertTrue(true);
				Reporter.log(ExpectedTitleNamea);
				logger.info("All details showing in name field Name,Parentage,Dossierno Fingerprintno, ");
			
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			captureScreen(driver,"Interrogee");
			Assert.assertTrue(false);
			logger.info("user details is not showing in the field");
		}
		
		
		
		
		
		
		
		try { 
			if(driver.getTitle().equals("123456789")) {
				Assert.assertTrue(true);
				logger.info("DossierNo is correct");
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			captureScreen(driver,"Interrogee");
			Assert.assertTrue(false);
			logger.info("Dossier No is not correct ");
		}
		
		try { 
			if(driver.getTitle().equals("12ABC")) {
				Assert.assertTrue(true);
				
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			captureScreen(driver,"Interrogee");
			Assert.assertTrue(false);
		}
		
		
		try { 
			if(driver.getTitle().equals("Karan")) {
				Assert.assertTrue(true);
				
			}
				
		}catch(Exception e) {
			e.printStackTrace();
			captureScreen(driver,"Interrogee");
			Assert.assertTrue(false);
		}
		
//     =======NAme		
		
		
		
		
		
	}
}

