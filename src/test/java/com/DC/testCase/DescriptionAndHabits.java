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

import com.DC.pageObjects.DescriptionAndHabitsPage;
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

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class DescriptionAndHabits extends BaseClass {

//  ========Login===================
    @Test(priority=1, description="Login the Appliaction")
    @Epic("EP001")
    @Feature("feature1:Login")
    @Story("Story:Logo Prsence")
    @Step("Verify Logo prsence")
    @Severity(SeverityLevel.MINOR)
    public void loginTest() throws InterruptedException, AWTException, IOException {
    LoginPage lp = new LoginPage(driver);
	lp.setUserName(username);
	lp.setPassword(password);
	lp.clickLogin();
	Thread.sleep(2000);
}
//  ==========UserInfomation==========
	@Test(priority=2 , description ="UserInterfacePage")
	@Epic("EP002")
	@Feature("Feature2:UserInfomation")
	@Story("Story:UserInfomation")
	@Step("Verify UserInfomation Heading")
	@Severity(SeverityLevel.MINOR)
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
	@Test(priority=3, description="InterrogeeDeatils")
	@Epic("EP003")
	@Feature("Feature2:InterrogeeDeatils")
	@Story("Story:InterrogeeDeatilsPage")
	@Step("Verify InterrogeeDeatils Form")
	@Severity(SeverityLevel.MINOR)
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
	@Test(priority=4, description="Present Address Form")
	@Epic("EP004")
	@Feature("Feature2:PresentAddress")
	@Story("Story:PresentAddress")
	@Step("Verify Present Address URL")
	@Severity(SeverityLevel.CRITICAL)
	public void PresentTest() throws InterruptedException, AWTException, IOException{
											
	PresentAddressPage pap = new PresentAddressPage(driver);
	pap.clickNextPage();
	Thread.sleep(4000);
										
										
				 }
//  ==========PermanentAddress============
	@Test(priority=5 , description="PermanentAddress From")
	@Epic("EP005")
	@Feature("Feature2:PermanentAddress")
	@Story("Story:PermanenetAddress")
	@Step("Verify PermanentAddress URL")
	@Severity(SeverityLevel.MINOR)
	public void PermanentAddressTest() throws InterruptedException, AWTException, IOException{
	PermanentAddressPage pp= new PermanentAddressPage(driver);	
										
	pp.ClickPermanentIcon();
//	logger.info("Please click to nextpage button");
	Thread.sleep(5000);
										
	}
			
//  ============Education============
	@Test(priority=6 , description ="Education From")
	@Epic("EP006")
	@Feature("Feature2:Education")
	@Story("Story:Education URL prsence")
	@Step("Verify Education URL prsence")
	@Severity(SeverityLevel.MINOR)
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
			
	@Test(priority=7 , description ="TelePhoneNumber Form")
	@Epic("EP007")
	@Feature("Feature2:TelePhoneNumber")
	@Story("Story:TelePhoneNumber URL prsence")
	@Step("Verify TelePhoneNumber URL prsence")
	@Severity(SeverityLevel.NORMAL)
	public void TelephoneNumberTest() throws InterruptedException, AWTException, IOException{
	TelephonNumberPage tp = new TelephonNumberPage(driver);
							
	tp.ClickContactNextbutton();
//	logger.info("Please click to Next button");
	Thread.sleep(5000);
							
			}	
			
//  ==============Language=========
	@Test(priority=8 , description ="Language From")
	@Epic("EP008")
	@Feature("Feature2:Language")
	@Story("Story:Language URL prsence")
	@Step("Verify Language URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void LanguageTest() throws InterruptedException,AWTException, IOException{
	LanguagePage lp = new LanguagePage(driver);
					
	lp.ClickNextButton();
//	logger.info("Please click to Next button ");
	Thread.sleep(5000);
					
		}			
//  ===============Email====================
	@Test(priority=9 , description ="Email Form")
	@Epic("EP009")
	@Feature("Feature2:Email")
	@Story("Story:Email URl prsence")
	@Step("Verify Email URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void EmailTest()  throws InterruptedException,AWTException, IOException{
	EmailPage ep= new EmailPage(driver);		
			
	ep.ClickNextButton();
//	logger.info("Please click to next button");
	Thread.sleep(2000);
			
		}	
//  ==========MessgignApp============
	@Test(priority=10 , description="MessgingApp Form")
	@Epic("EP010")
	@Feature("Feature2:MessgingApp")
	@Story("Story:MessgingApp URl prsence")
	@Step("Verify MessgingApp URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void MessgingAppTest() throws InterruptedException,AWTException, IOException{
	MessagingAppPage map = new MessagingAppPage(driver);	
			
	map.ClickMessgingNextButton();
//	logger.info("Please click to next button");
	Thread.sleep(3000);

		}

// ============PersonalDocument=======
	@Test(priority=11,description ="PersonalDocument From")
	@Epic("EP011")
	@Feature("Feature2:PersonalDocument")
	@Story("Story:PersonalDocument URL prsence")
	@Step("Verify PersonalDocument URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void PersonalDocumentTest() throws InterruptedException,AWTException, IOException{
	PersonalDocumentPage  pdp = new PersonalDocumentPage(driver);
			
	pdp.ClickPersonalNextButton();
//	logger.info("Please enter the next button");
	Thread.sleep(4000);
			
			}

//  =============VOICE SAMPLE===========
	@Test(priority=12, description ="Voice sample Form")
	@Epic("EP012")
	@Feature("Feature2:Voice Sample")
	@Story("Story:Voice Sample prsence")
	@Step("Verify Voice Sample URl prsence")
	@Severity(SeverityLevel.MINOR)
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
		    
// for pressing and releasing Enter
	rc.keyPress(KeyEvent.VK_ENTER);
	rc.keyRelease(KeyEvent.VK_ENTER);
	Thread.sleep(5000);
			
			
	vsp.ClickVoiceSampleSubmit();
//	logger.info("Please select the Voice Sample");
	Thread.sleep(6000);
			
			
//			vsp.ClickVoiceDeletebutton();
//			logger.info("Please click to delete button");
//			Thread.sleep(5000);
			
//			vsp.ClickVoiceDelete();
//			logger.info("Please delete  voice file");
//			Thread.sleep(6000);
			
	vsp.ClickVoiceNextButton();
//	logger.info("Please click to NextButton");
	Thread.sleep(5000);
			
			}			
	
// ===============Description And Habit======	
	@Test(priority=13, description="Description And Habit From")	
	@Epic("EP013")
	@Feature("Feature13:Description And Habit")
	@Story("Story:Description And Habit URl prsence")
	@Step("Verify Description And Habit URl Prsence")
	@Severity(SeverityLevel.MINOR)
	public void DescriptionandHabitTest()throws InterruptedException,AWTException, IOException{
	DescriptionAndHabitsPage	dah = new DescriptionAndHabitsPage(driver);
	  
	dah.setClothes("whiteshirt");
//	logger.info("Please enter the Clothes");
	Thread.sleep(2000);
	  
	dah.setFootwear("blackshoes");
//	logger.info("Please enter the Footwear");
	Thread.sleep(2000);
	  
	dah.setDrinking("rum");
//	logger.info("Please enter the drinking");
	Thread.sleep(2000);
	  
	dah.setSmoking("smoking");
//	logger.info("Please enter the smoking");
	Thread.sleep(2000);
	  
	dah.setDrug("qewrty");
//	logger.info("Please enter the drug");
	Thread.sleep(2000);
	  
	dah.setProstitute("sdgsh");
//	logger.info("please enter the prostitute");
	Thread.sleep(2000);
	  
	dah.setRemark("asdfgrtqyuiuhvqjqjq");
//	logger.info("Please enter the Remark");
	Thread.sleep(2000);
	  
	dah.clickSubmit();
//	logger.info("Please click the Submit button");
	Thread.sleep(2000);
	  
	dah.clickEdit();
//	logger.info("Please click the edit button ");
	Thread.sleep(2000);
	  
	dah.clickSubmit();
//	logger.info("Please click the update button");
	Thread.sleep(2000);
	  
	dah.clickNextButton();
//	logger.info("Please click the nextbutton");
	Thread.sleep(2000);

	  
			
			
}
}