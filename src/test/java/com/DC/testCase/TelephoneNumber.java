package com.DC.testCase;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.DC.pageObjects.EducationPage;
import com.DC.pageObjects.InterrogeeDetailsPage;
import com.DC.pageObjects.LoginPage;
import com.DC.pageObjects.PermanentAddressPage;
import com.DC.pageObjects.PresentAddressPage;
import com.DC.pageObjects.TelephonNumberPage;
import com.DC.pageObjects.UserInfoPage;

public class TelephoneNumber  extends BaseClass {
	
	//=========================Login===============================
	      @Test(priority=1)
	      public void loginTest() throws InterruptedException, AWTException, IOException {
		  LoginPage lp = new LoginPage(driver);
			lp.setUserName(username);
			lp.setPassword(password);
			lp.clickLogin();
			Thread.sleep(2000);
	      }
	//=======================UserInfomation=========================
			@Test(priority=2)
			public void UserTest() throws InterruptedException,IOException{
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
	// ================InterrogeeDeatils Form=======================
			@Test(priority=3)
			public void IntoTest() throws InterruptedException, AWTException, IOException {
		      InterrogeeDetailsPage idp = new InterrogeeDetailsPage(driver);
		      
		      idp.ClickShowAllbutton();
//		      logger.info("Enter the ShowAll button");
		      Thread.sleep(6000);
		      
		      idp.ClickbtnCWIRbutton();
//		      idp.ClickEditbutton();
//		      logger.info("Enter edit button");
		      Thread.sleep(3000);
		      
			}  
	// ====================Present Address===========================
			@Test(priority=4)
			public void PresentTest() throws InterruptedException, AWTException, IOException{
				
			PresentAddressPage pap = new PresentAddressPage(driver);
			pap.clickNextPage();
			Thread.sleep(4000);
			
			
			}
    // ============PermanentAddress==================================
			@Test(priority=5)
			public void PermanentAddressTest() throws InterruptedException, AWTException, IOException{
			PermanentAddressPage pAp= new PermanentAddressPage(driver);	
			
			pAp.clickPermanentNextPage();
//			logger.info("Please click to nextpage button");
			Thread.sleep(5000);
			
			
			}
			
    //===================Education===================================
			@Test(priority=6)
			public void EducationTest() throws InterruptedException, AWTException, IOException {
			EducationPage ep= new EducationPage(driver);
			ep.setInstituteType("COLLEGE");
//			logger.info("Please select the insitute type");
			Thread.sleep(2000);
			
			ep.setEducation("Bachelor of Education");
//			logger.info("Please enter the Education name");
			Thread.sleep(2000);
			ep.ClickEducationNextbutton();
			Thread.sleep(5000);
			}
	//=================TelephoneNumber===============================
			@Test(priority=7)
			public void TelephoneNumberTest() throws InterruptedException, AWTException, IOException{
			TelephonNumberPage tp = new TelephonNumberPage(driver);
			
			tp.setContactType("INDIA");
//			logger.info("Please select the Contact type");
			Thread.sleep(3000);
			
			tp.setContactCountryCode("91");
//			logger.info("Please enter the Country");
			Thread.sleep(2000);
			
			tp.setContactMobileNumber("9876543122");
//			logger.info("Please enter the MObile Number");
			Thread.sleep(2000);
			
			tp.setContactIMEINumner("1111009966551221");
//			logger.info("Please enter the IMEI");
			Thread.sleep(3000);
			
			tp.ClickContactSubmit();
//			logger.info("Please enter the submit");
			Thread.sleep(3000);
			
			tp.ClickContactEditbutton();
//			logger.info("Please click the edit button");
			Thread.sleep(3000);
			
			tp.ClickContactUpdatebutton();
//			logger.info("Please update the contact details ");
			Thread.sleep(3000);
			
			tp.ClickContactNextbutton();
//			logger.info("Please click to to Next button");
			Thread.sleep(3000);
			
			}
}
