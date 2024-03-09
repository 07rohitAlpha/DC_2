package com.DC.testCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DC.pageObjects.InterrogeeDetailsPage;
import com.DC.pageObjects.LoginPage;
import com.DC.pageObjects.PresentAddressPage;
import com.DC.pageObjects.UserInfoPage;

import net.bytebuddy.implementation.Implementation;

public class PresentAddress extends BaseClass  {
	
	

// Login 
	@Test(priority=1)
	public void loginTest() throws InterruptedException, IOException {
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		Thread.sleep(2000);
	}
// UserInfomation
	@Test(priority=2)
		public void UserTest() throws InterruptedException, IOException {
		UserInfoPage uip = new UserInfoPage(driver);
		
		uip.setRank("INSPECTOR");
		uip.setName("Ajit");
		uip.setEntmob("9999999999");
		uip.clickCheckbox();
		Thread.sleep(2000);
		uip.setPhone("8950776471");
		uip.setPwrd("qwerty123321");
		uip.clickSubmit();
	    Thread.sleep(2000);
		}
// InterrogeeDeatils Form	
	@Test(priority=3)
		public void IntoTest() throws InterruptedException, AWTException, IOException {
        InterrogeeDetailsPage idp = new InterrogeeDetailsPage(driver);
		
		idp.setFName("Virat");
//		logger.info("Entered Name");
		Thread.sleep(1000);
		
		idp.setParentage("Karma");
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
		
		idp.setAge("2");
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
		Thread.sleep(1000);
		
		idp.Religion("HINDU");
//		logger.info("Entered Religion");
		Thread.sleep(1000);
		
		idp.Caste("BRAHMIN");
//		logger.info("Entered Caste");
		Thread.sleep(1000);
		
		idp.Sect("SHAKTISM");
//		logger.info("Entered Sect");
		Thread.sleep(1000);
		
		idp.Nationality("INDIA");
//		logger.info("Entered Nationality");
		Thread.sleep(1000);
		
		idp.Identification("CUT MARK oN LRFT HAND WRIST");
//		logger.info("Entered Identification Mark");
		Thread.sleep(1000);
		
		idp.Occupation("KJGF");
//		logger.info("Entered Occupation");
		Thread.sleep(3000);
		
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
		
		idp.Dfdf();
//		logger.info("select Dfdf");
		Thread.sleep(1000);
		
		idp.uncheck4();
//		logger.info("uncheck");
		Thread.sleep(3000);
		
		
		
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
		Thread.sleep(4000);
		
		WebElement Frontbutton =driver.findElement(By.xpath("(//input[@name='frontimagesAttachment'])[1]"));
		JavascriptExecutor FrontSidePhoto = (JavascriptExecutor)driver;
		FrontSidePhoto.executeScript("arguments[0].click();" ,Frontbutton );
		
		// creating object of robot class
		Robot fb = new Robot();
		Thread.sleep(5000);
		
		// Simulate the keypress of the TAB key to move the focus to the file input element
		fb.keyPress(KeyEvent.VK_TAB);
		fb.keyRelease(KeyEvent.VK_TAB);
		
		// Simulate the keypress of the ENTER key to open the file upload dialog box
		fb.keyPress(KeyEvent.VK_ENTER);
		fb.keyRelease(KeyEvent.VK_ENTER);
		
		StringSelection Frontphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Frontphoto, null);
		
		// press Contol+V for pasting
	    fb.keyPress(KeyEvent.VK_CONTROL);
	    fb.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb.keyRelease(KeyEvent.VK_CONTROL);
	    fb.keyRelease(KeyEvent.VK_V);
	    
	    // for pressing and releasing Enter
		fb.keyPress(KeyEvent.VK_ENTER);
		fb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);	
		

		idp.clickSubmit();
//		logger.info("Submit The Form");
	//	String parentWindowHandle= driver.getWindowHandle();
		Thread.sleep(6000);
		//driver.switchTo().window(parentWindowHandle);
		}
//  ====================Present Address=========================
		@Test(priority=4)
		public void PresentTest() throws InterruptedException, IOException{
			
		PresentAddressPage pap = new PresentAddressPage(driver);
		
		pap.setAddresstype("OWN PROPERTY");
//		logger.info("Select present address type");
		Thread.sleep(1000);
		
		pap.setFromDate("01-01-2010");
//		logger.info("Select the From Date");
		Thread.sleep(1000);
		
		pap.setToDate("11-11-2020");
//		logger.info("Select the To Date");
		Thread.sleep(1000);
		
		pap.setPresentRemark("this address is valid");
//		logger.info("Please the remark ");
		Thread.sleep(1000);
		
		pap.ClickOwnSubmit();
//		logger.info("please submit the Present submit");
		Thread.sleep(4000);
		
		//=========Own Property Details==================
		
		pap.setOwnHouseNo("1019");
//		logger.info("please enter the house no");
		Thread.sleep(1000);
		
		pap.setOwnFlatName("kumar vishawash");
//		logger.info("please enter the FlatName");
		Thread.sleep(1000);
		
		pap.setOwnLane("Krishna");
//		logger.info("please enter the lane");
		Thread.sleep(1000);
		
		pap.setOwnCity("GURUGRAM");
//		logger.info("Please enter the City name");
		Thread.sleep(2000);
		
		pap.setCountry("AFGHANISTANI");
//		logger.info("please enter the countty name");
		Thread.sleep(2000);
		
		pap.setState("FTFTH");
//		logger.info("Please enter the state name ");
		Thread.sleep(2000);
		
		pap.setDistrict("VJGJYGYUJ");
//		logger.info("Please enter the district name");
		Thread.sleep(2000);
		
		pap.setPinCode("110044");
//		logger.info("Please enter the Pincode");
		Thread.sleep(1000);
		
		pap.clickOwnDetailsSubmit();
//		logger.info("Please Submit the from ");
		Thread.sleep(4000);
		
//===================Add New Address Type===============
		
//		driver.switchTo().alert().accept();
//		driver.getWindowHandle();
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		
//		pap.clickAddNewAddress();
//		logger.info("please add one more address type");
//		Thread.sleep(6000);
//		pap.clickAddresstype1();
//		Thread.sleep(2000);
		
//		pap.setPresentRemark("this address is valid");
//		logger.info("Please the remark ");
//		Thread.sleep(2000);
//		
//		
//		pap.setAddresstype1("OWN PROPERTY");
//		logger.info("Select present address type");
//		Thread.sleep(3000);
//		
//		pap.setFromDate("11-11-2014");
//		logger.info("Select the From Date");
//		Thread.sleep(2000);
//		
//		pap.setToDate("12-12-2020");
//		logger.info("Select the To Date");
//		Thread.sleep(2000);
//		
//		
//		
//		pap.clickPresentSubmit();
//		logger.info("please submit the Present submit");
//		Thread.sleep(5000);
//		
		
		
//		=============== Rented Property Details==============
		
//		=====Select Present Address============
//		pap.setAddresstype("RENT");
//		logger.info("Select present address type");
//		Thread.sleep(1000);
//		
//		pap.setFromDate("01-01-2010");
//		logger.info("Select the From Date");
//		Thread.sleep(1000);
//		
//		pap.setToDate("11-11-2020");
//		logger.info("Select the To Date");
//		Thread.sleep(1000);
//		
//		pap.setPresentRemark("this address is valid");
//		logger.info("Please the remark ");
//		Thread.sleep(1000);
//		
//		pap.clickPresentSubmit();
//		logger.info("please submit the Present submit");
//		Thread.sleep(4000);
		
//		============Add Details=====================
	
//		pap.setNameLandlord("Ravi gupta");
//		logger.info("Please enter the anme of Landlord");
//		Thread.sleep(1000);
//		
//		pap.setLandlordHouseNo("303");
//		logger.info("Please enter the landlord house no");
//		Thread.sleep(1000);
//		
//		pap.setFlatNo("F-202");
//		logger.info("Please enter the flat no");
//		Thread.sleep(1000);
//		
//		pap.setLandlordLane("gurugram");
//		logger.info("Please enter the landlordlane");
//		Thread.sleep(2000);
//		
//		pap.setLandlordCity("Gurgaon");
//		logger.info("Please enetr the landlord city name");
//		Thread.sleep(2000);
//		
//		pap.setLandlordCountry("INDIA");
//		logger.info("Please enter the Landlord country name ");
//		Thread.sleep(2000);
//		
//		pap.setLandlordState("HARAYAN");
//		logger.info("Please enter the landlord state name");
//		Thread.sleep(2000);
//		
//		pap.setLandlordDistrict("GURUGRAM");
//		logger.info("Please enter the landlord district name");
//		Thread.sleep(3000);
//		
//		WebElement RentAgreement =driver.findElement(By.xpath("//input[@placeholder='Attach rent agreement ']"));
//		JavascriptExecutor RentAgreementPhoto = (JavascriptExecutor)driver;
//		RentAgreementPhoto.executeScript("arguments[0].click();" ,RentAgreement );
//		
//		// creating object of robot class
//		Robot r = new Robot();
//		Thread.sleep(5000);
//		
//		
//		StringSelection RentAttachment= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(RentAttachment, null);
//		
//		// press Contol+V for pasting
//	    r.keyPress(KeyEvent.VK_CONTROL);
//	    r.keyPress(KeyEvent.VK_V);
//	   
//	    
//	    // release Contol+V for pasting
//	    r.keyRelease(KeyEvent.VK_CONTROL);
//	    r.keyRelease(KeyEvent.VK_V);
//	    
//	    // for pressing and releasing Enter
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);	
//		
//		pap.setPaymentMode("CASH");
//		logger.info("Please select the cash payment mode");
//		Thread.sleep(2000);
//	
	//==================Cash Account=========================
		
//		pap.clickAddPayemntDetails();
//		logger.info("Please click on Add payment details");
//		Thread.sleep(4000);
//		
//		
//		pap.setSourceOfCase("Bhanu");
//		logger.info("Please enter the Source of cash");
//		Thread.sleep(2000);
//		
//		pap.setPlaceName("Delhi");
//		logger.info("Please enter the Place name");
//		Thread.sleep(2000);
//		
//		pap.setPaidToWhom("Malik");
//		logger.info("Please enter the Paid to Whom");
//		Thread.sleep(2000);
//		
//		pap.setAmount("29900");
//		logger.info("Please enter the Amount ");
//		Thread.sleep(2000);
//		
//		pap.setTransactionDate("09-09-2009");
//		logger.info("Please enter the Transaction date");
//		Thread.sleep(2000);
//		
//		pap.clickContinue();
//		logger.info("Please click to Continue");
//		Thread.sleep(2000);
//		
//		
		
//	==============Contact Details========================
		
//		
//		pap.setContactType("INDIAN");
//		logger.info("please enetr the contact type");
//		Thread.sleep(2000);
//		
//		pap.setCountryCode("91");
//		logger.info("please enter the Country code");
//		Thread.sleep(4000);
//		
//		pap.setMobileNo("9986722333");
//		logger.info("please enter the mobile number");
//		Thread.sleep(2000);
//		
//		pap.setIDType("PAN CARD");
//		logger.info("please enter the ID Type");
//		Thread.sleep(2000);
//		
//		pap.setIDProofNo("BHGF#45");
//		logger.info("please enter the IDProofNo");
//		Thread.sleep(2000);
//		
//
//		WebElement ID =driver.findElement(By.xpath("//input[@name='attachments']"));
//		JavascriptExecutor IDAttachment = (JavascriptExecutor)driver;
//		IDAttachment.executeScript("arguments[0].click();" ,ID );
//		
//		// creating object of robot class
//		Robot IDAttch = new Robot();
//		Thread.sleep(5000);
//		
//		// Simulate the keypress of the TAB key to move the focus to the file input element
//		fb.keyPress(KeyEvent.VK_TAB);
//		fb.keyRelease(KeyEvent.VK_TAB);
//		
//		// Simulate the keypress of the ENTER key to open the file upload dialog box
//		fb.keyPress(KeyEvent.VK_ENTER);
//		fb.keyRelease(KeyEvent.VK_ENTER);
//		
//		StringSelection IdAtt= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(IdAtt, null);
//		
//		// press Contol+V for pasting
//	    fb.keyPress(KeyEvent.VK_CONTROL);
//	    fb.keyPress(KeyEvent.VK_V);
//	   
//	    
//	    // release Contol+V for pasting
//	    fb.keyRelease(KeyEvent.VK_CONTROL);
//	    fb.keyRelease(KeyEvent.VK_V);
//	    
//	    // for pressing and releasing Enter
//		fb.keyPress(KeyEvent.VK_ENTER);
//		fb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);	
//		
//		pap.clickRentSubmit();
//		logger.info("Please click to Submit ");
//		Thread.sleep(2000);
//		
		pap.clickNextPage();
//		logger.info("Please click to NextPage");
		Thread.sleep(4000);
		
		
		 
		
		
	
	//============UPI====================================
//		
//		
//		pap.setPaymentMode("UPI");
//		logger.info("Please select the upi");
//		Thread.sleep(4000);
//		
//		WebElement click = driver.findElement(By.xpath("//button[normalize-space()='Add payment details']"));
//		JavascriptExecutor Addclick=(JavascriptExecutor)driver;
//		Addclick.executeScript("argument[].click()", click);
//		logger.info("Please click on Add payment details");
//		Thread.sleep(4000);
//		
//		pap.setUPIMobileNo("0988234671");
//		logger.info("Please enter the ");
//		Thread.sleep(2000);
//		
//		pap.setUPIToName("Rohit");
//		logger.info("Please enter the To Name");
//		Thread.sleep(2000);
//		
//		pap.setUPIID("12346976562");
//		logger.info("Please enter the UPI id ");
//		Thread.sleep(2000);
//		
//		pap.setUPiAmount("80000");
//		logger.info("Please enter the amount");
//		Thread.sleep(2000);
//		
//		pap.setUPItransactionId("123456098765");
//		logger.info("Please enter the Transaction id");
//		Thread.sleep(2000);
//		
//		pap.setUPITransactionDate("05-01-2016");
//		logger.info("Please enter the transaction date");
//		Thread.sleep(2000);
//		
//		pap.setUPITransactionTime("07:20");
//		logger.info("Please enter the transaction time");
//		Thread.sleep(2000);
//		
//		pap.setUPIAppName("AMAZON PAY");
//		logger.info("Please enter the AppName");
//		Thread.sleep(2000);
//		
//		pap.setAccHolderName("Khana");
//		logger.info("Please enter the Account holder name ");
//		Thread.sleep(2000);
//		
//		pap.setBankName("Central Bank of India");
//		logger.info("Please enter the bank name");
//		Thread.sleep(2000);
//		
//		pap.setBankBranch("old delhi");
//		logger.info("Please enter the Bank name");
//		Thread.sleep(2000);
//		
//		pap.setBankAccNo("00123348");
//		logger.info("Please enter the Bank accont number");
//		Thread.sleep(2000);
//		
//		
//		pap.UPIContine();
//		logger.info("Please click to Continue");
//		Thread.sleep(2000);
//		
//	    pap.clickUPIEdit();
//		logger.info("Please select the Edit button ");
//		Thread.sleep(1000);
//		
//		pap.setCountryCode("+91");
//		logger.info("Please select the Country code");
//		Thread.sleep(1000);
//		
//
//		WebElement ID2 =driver.findElement(By.xpath("//input[@name='attachments']"));
//		JavascriptExecutor IDAttachment2 = (JavascriptExecutor)driver;
//		IDAttachment2.executeScript("arguments[0].click();" ,ID );
//		
//		// creating object of robot class
//		Robot IDAt = new Robot();
//		Thread.sleep(5000);
//		
//		// Simulate the keypress of the TAB key to move the focus to the file input element
//		fb.keyPress(KeyEvent.VK_TAB);
//		fb.keyRelease(KeyEvent.VK_TAB);
//		
//		// Simulate the keypress of the ENTER key to open the file upload dialog box
//		fb.keyPress(KeyEvent.VK_ENTER);
//		fb.keyRelease(KeyEvent.VK_ENTER);
//		
//		StringSelection IdAt= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho");
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(IdAtt, null);
//		
//		// press Contol+V for pasting
//	    fb.keyPress(KeyEvent.VK_CONTROL);
//	    fb.keyPress(KeyEvent.VK_V);
//	   
//	    
//	    // release Contol+V for pasting
//	    fb.keyRelease(KeyEvent.VK_CONTROL);
//	    fb.keyRelease(KeyEvent.VK_V);
//	    
//	    // for pressing and releasing Enter
//		fb.keyPress(KeyEvent.VK_ENTER);
//		fb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(4000);	
//		
//		pap.clickRentSubmit();
//		logger.info("Please click to Submit ");
//		Thread.sleep(1000);
//		
//		pap.clickNextPage();
//		logger.info("Please click to NextPage");
//		Thread.sleep(4000);
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
	
}
