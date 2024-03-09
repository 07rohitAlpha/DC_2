package com.DC.testCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DC.pageObjects.EducationPage;
import com.DC.pageObjects.EmailPage;
import com.DC.pageObjects.InterrogeeDetailsPage;
import com.DC.pageObjects.LanguagePage;
import com.DC.pageObjects.LoginPage;
import com.DC.pageObjects.MessagingAppPage;
import com.DC.pageObjects.PermanentAddressPage;
import com.DC.pageObjects.PersonalDocumentPage;
import com.DC.pageObjects.PresentAddressPage;
import com.DC.pageObjects.TelephonNumberPage;
import com.DC.pageObjects.UserInfoPage;
import com.DC.pageObjects.VoiceSamplePage;

public class VoiceSample  extends BaseClass{
	
//  ========Login===================
    @Test(priority=1)
    public void loginTest() throws InterruptedException, AWTException, IOException {
    LoginPage lp = new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickLogin();
	Thread.sleep(2000);
}
//  ==========UserInfomation==========
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

//  ==========InterrogeeDeatils Form=========
	@Test(priority=3)
	public void IntoTest() throws InterruptedException, AWTException, IOException {
    InterrogeeDetailsPage idp = new InterrogeeDetailsPage(driver);
				      
	idp.ClickShowAllbutton();
//	logger.info("Enter the ShowAll button");
	Thread.sleep(6000);
				      
	idp.ClickbtnCWIRbutton();
//	idp.ClickEditbutton();
//	logger.info("Enter edit button");
	Thread.sleep(3000);
				      
	}  
					
//  ===========Present Address============
	@Test(priority=4)
	public void PresentTest() throws InterruptedException, AWTException, IOException{
									
	PresentAddressPage pap = new PresentAddressPage(driver);
	pap.clickNextPage();
	Thread.sleep(4000);
								
								
		 }
//  ==========PermanentAddress============
	@Test(priority=5)
	public void PermanentAddressTest() throws InterruptedException, AWTException, IOException{
	PermanentAddressPage pp= new PermanentAddressPage(driver);	
								
	pp.ClickPermanentIcon();
//	logger.info("Please click to nextpage button");
	Thread.sleep(5000);
								
							
		}
	
//  ============Education============
	@Test(priority=6)
	public void EducationTest() throws InterruptedException, AWTException, IOException {
	EducationPage ep= new EducationPage(driver);
	ep.setInstituteType("COLLEGE");
//	logger.info("Please select the insitute type");
	Thread.sleep(2000);
								
	ep.setEducation("Bachelor of Education");
//	logger.info("Please enter the Education name");
	Thread.sleep(2000);
	ep.ClickEducationNextbutton();
	Thread.sleep(5000);
		}	
	
//  ==========TelephoneNumber========
	
	@Test(priority=7)
	public void TelephoneNumberTest() throws InterruptedException, AWTException, IOException{
	TelephonNumberPage tp = new TelephonNumberPage(driver);
					
	tp.ClickContactNextbutton();
//	logger.info("Please click to Next button");
	Thread.sleep(5000);
					
	}	
	
//  ==============Language=========
	@Test(priority=8)
	public void LanguageTest() throws InterruptedException,AWTException, IOException{
	LanguagePage lp = new LanguagePage(driver);
			
	lp.ClickNextButton();
//	logger.info("Please click to Next button ");
	Thread.sleep(5000);
			
	}
	
//  ===============Email====================
	@Test(priority=9)
	public void EmailTest()  throws InterruptedException,AWTException, IOException{
	EmailPage ep= new EmailPage(driver);		
	
	ep.ClickNextButton();
//	logger.info("Please click to next button");
	Thread.sleep(2000);
	
	}

//  ==========MessgignApp============
	@Test(priority=10)
	public void MessgingAppTest() throws InterruptedException,AWTException, IOException{
	MessagingAppPage map = new MessagingAppPage(driver);	
	
	map.ClickMessgingNextButton();
//	logger.info("Please click to next button");
	Thread.sleep(3000);

}
	
// ============PersonalDocument=======
	@Test(priority=11)
	public void PersonalDocumentTest() throws InterruptedException,AWTException, IOException{
	PersonalDocumentPage  pdp = new PersonalDocumentPage(driver);
	
	pdp.ClickPersonalNextButton();
//	logger.info("Please enter the next button");
	Thread.sleep(4000);
	
	}
	
	
//  =============VOICE SAMPLE===========
	@Test(priority=12)
	public void VoiceSampleTest() throws InterruptedException,AWTException, IOException{
	VoiceSamplePage vsp= new VoiceSamplePage(driver);
	
	WebElement VoiceUploadbutton =driver.findElement(By.xpath("//input[@name='formField']"));
	JavascriptExecutor VoiceUploadPhoto = (JavascriptExecutor)driver;
	VoiceUploadPhoto.executeScript("arguments[0].click();" ,VoiceUploadbutton );
	
	// creating object of robot class
	Robot rc = new Robot();
	Thread.sleep(2000);
	
	StringSelection Immigrationphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\sample-3s");
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Immigrationphoto, null);
	
	// press Contol+V for pasting
    rc.keyPress(KeyEvent.VK_CONTROL);
    rc.keyPress(KeyEvent.VK_V);
   
    
    // release Contol+V for pasting
    rc.keyRelease(KeyEvent.VK_CONTROL);
    rc.keyRelease(KeyEvent.VK_V);
    
//    // for pressing and releasing Enter
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
	
	
	vsp.ClickVoiceSampleSubmit();
//	logger.info("Please select the Voice Sample");
	Thread.sleep(6000);
	
	
	vsp.ClickVoiceDeletebutton();
//	logger.info("Please click to delete button");
	Thread.sleep(5000);
	
	vsp.ClickVoiceDelete();
//	logger.info("Please delete  voice file");
	Thread.sleep(6000);
	
	vsp.ClickVoiceNextButton();
//	logger.info("Please click to NextButton");
	Thread.sleep(5000);
	
	}

}
