package com.DC.testCase;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.DC.pageObjects.EducationPage;
import com.DC.pageObjects.EmailPage;
import com.DC.pageObjects.InterrogeeDetailsPage;
import com.DC.pageObjects.LanguagePage;
import com.DC.pageObjects.LoginPage;
import com.DC.pageObjects.MessagingAppPage;
import com.DC.pageObjects.PermanentAddressPage;
import com.DC.pageObjects.PresentAddressPage;
import com.DC.pageObjects.TelephonNumberPage;
import com.DC.pageObjects.UserInfoPage;

public class MessagingApp extends BaseClass {
	
//      ========Login===================
        @Test(priority=1)
        public void loginTest() throws InterruptedException, AWTException, IOException {
	    LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		Thread.sleep(2000);
    }
//      ==========UserInfomation==========
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
	
//      ==========InterrogeeDeatils Form=========
		@Test(priority=3)
		public void IntoTest() throws InterruptedException, AWTException, IOException {
	    InterrogeeDetailsPage idp = new InterrogeeDetailsPage(driver);
					      
		idp.ClickShowAllbutton();
//		logger.info("Enter the ShowAll button");
		Thread.sleep(6000);
					      
		idp.ClickbtnCWIRbutton();
//		idp.ClickEditbutton();
//		logger.info("Enter edit button");
		Thread.sleep(3000);
					      
		}  
						
//      ===========Present Address============
		@Test(priority=4)
		public void PresentTest() throws InterruptedException, AWTException, IOException{
										
		PresentAddressPage pap = new PresentAddressPage(driver);
		pap.clickNextPage();
		Thread.sleep(4000);
									
									
			 }
//      ==========PermanentAddress============
		@Test(priority=5)
		public void PermanentAddressTest() throws InterruptedException, AWTException, IOException{
		PermanentAddressPage pp= new PermanentAddressPage(driver);	
									
		pp.ClickPermanentIcon();
//		logger.info("Please click to nextpage button");
		Thread.sleep(5000);
									
								
			}
		
//      ============Education============
		@Test(priority=6)
		public void EducationTest() throws InterruptedException, AWTException, IOException {
		EducationPage ep= new EducationPage(driver);
		ep.setInstituteType("COLLEGE");
//		logger.info("Please select the insitute type");
		Thread.sleep(2000);
									
		ep.setEducation("Bachelor of Education");
//		logger.info("Please enter the Education name");
		Thread.sleep(2000);
		ep.ClickEducationNextbutton();
		Thread.sleep(5000);
			}	
		
//      ==========TelephoneNumber========
				
		@Test(priority=7)
		public void TelephoneNumberTest() throws InterruptedException, AWTException, IOException{
		TelephonNumberPage tp = new TelephonNumberPage(driver);
						
		tp.ClickContactNextbutton();
//		logger.info("Please click to Next button");
		Thread.sleep(5000);
						
		}				
//      ==============Language=========
		@Test(priority=8)
		public void LanguageTest() throws InterruptedException,AWTException, IOException{
		LanguagePage lp = new LanguagePage(driver);
				
		lp.ClickNextButton();
//		logger.info("Please click to Next button ");
		Thread.sleep(5000);
				
		}	
//      ===============Email====================
		@Test(priority=9)
		public void EmailTest()  throws InterruptedException,AWTException, IOException{
		EmailPage ep= new EmailPage(driver);		
		
		ep.ClickNextButton();
//		logger.info("Please click to next button");
		Thread.sleep(2000);
		
		}
		
//      ==========MessgignApp============
		@Test(priority=10)
		public void MessgingAppTest() throws InterruptedException,AWTException, IOException{
		MessagingAppPage map = new MessagingAppPage(driver);
		
		map.setMessagingApp("FACEBOOK");
//		logger.info("Please Select the FACEBOOK ");
		Thread.sleep(3000);
		
		map.setSocialMediaId("admin@gmail.com");
//		logger.info("Please enter the Mail id");
		Thread.sleep(3000);
		
		
		map.setMobileNumber("9876542122");
//		logger.info("Please enter the mobile number");
		Thread.sleep(2000);
		
		map.setMessgingRemark("This social media id and mobile number is verify");
//		logger.info("Please enter the remark");
		Thread.sleep(4000);
		
		map.ClickMessgingSubmit();
//		logger.info("Please submit the MessgingApp");
		Thread.sleep(4000);
		
		map.ClickMessgingEdit();
//		logger.info("Please enter the edit button");
		Thread.sleep(3000);
		
		
		map.ClickMessgingUpdate();
	//	logger.info("Please Click to update button ");
		Thread.sleep(3000);
		
		map.ClickMessgingNextButton();
//		logger.info("Please click to next button");
		Thread.sleep(3000);
		
		
		
}
}