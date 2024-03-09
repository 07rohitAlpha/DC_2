package com.DC.testCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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

   public class PersonalDocument extends BaseClass{
	
	
		
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
		
		map.ClickMessgingNextButton();
//		logger.info("Please click to next button");
		Thread.sleep(3000);

}
		
//     ============PersonalDocument=======
		@Test(priority=11)
		public void PersonalDocumentTest() throws InterruptedException,AWTException, IOException{
		PersonalDocumentPage  pdp = new PersonalDocumentPage(driver);
		
		
		// PANCARD NUMBER
		pdp.setPanCard("ADG2367HK");
//		logger.info("Please enter the PANCARD");
		Thread.sleep(4000);
		
		WebElement PanCardbutton =driver.findElement(By.xpath("(//input[@name='PAN CARD'])[2]"));
		JavascriptExecutor PanCardPhoto = (JavascriptExecutor)driver;
		PanCardPhoto.executeScript("arguments[0].click();" ,PanCardbutton );
		
		// creating object of robot class
		Robot fb = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection Panphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\7.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Panphoto, null);
		
		// press Contol+V for pasting
	    fb.keyPress(KeyEvent.VK_CONTROL);
	    fb.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb.keyRelease(KeyEvent.VK_CONTROL);
	    fb.keyRelease(KeyEvent.VK_V);
	    
	    // for pressing and releasing Enter
		fb.keyPress(KeyEvent.VK_ENTER);
		fb.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
	
		
//		// create a list of image file paths to upload
//        List<String> imagePaths1 = new ArrayList<>();
//        imagePaths1.add("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\7.1.jpg");
//        imagePaths1.add("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\2.1.jpg");
//        
//		
//       // upload each image file to the first upload field
//        for (String imagePath : imagePaths1) {
//            WebElement uploadInput = new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='row']//div[1]//div[2]//div[1]//input[1]")));
//            uploadInput.sendKeys(imagePath);
//        }

		
		//======= AADHARCARD NUMBER======
		
		pdp.setAadharCard("188100982266");
//		logger.info("Please enetr the AdddharCard");
		Thread.sleep(4000);
		
		
		WebElement AadharCardbutton =driver.findElement(By.xpath("(//input[@name='AADHAR_CARD'])[2]"));
		JavascriptExecutor AadharCardPhoto = (JavascriptExecutor)driver;
		AadharCardPhoto.executeScript("arguments[0].click();" ,AadharCardbutton );
		
		// creating object of robot class
		Robot fb1 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection Aadharphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Aadharphoto, null);
		
		// press Contol+V for pasting
	    fb1.keyPress(KeyEvent.VK_CONTROL);
	    fb1.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb1.keyRelease(KeyEvent.VK_CONTROL);
	    fb1.keyRelease(KeyEvent.VK_V);
	    
	    // for pressing and releasing Enter
		fb1.keyPress(KeyEvent.VK_ENTER);
		fb1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		// ======DRIVING LICENSE NUMBER========
		
		pdp.setDrivingLicense("DVWT876CB");
//		logger.info("Please enter the DrivingCard");
		Thread.sleep(3000);
		
		WebElement DrivingLicensebutton =driver.findElement(By.xpath("(//input[@name='DRIVING_LICENSE'])[2]"));
		JavascriptExecutor DrivingLicensePhoto = (JavascriptExecutor)driver;
		DrivingLicensePhoto.executeScript("arguments[0].click();" ,DrivingLicensebutton );
		
		// creating object of robot class
		Robot fb2 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection Drivingphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\3.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Drivingphoto, null);
		
		// press Contol+V for pasting
	    fb2.keyPress(KeyEvent.VK_CONTROL);
	    fb2.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb2.keyRelease(KeyEvent.VK_CONTROL);
	    fb2.keyRelease(KeyEvent.VK_V);
	    
	    // for pressing and releasing Enter
		fb2.keyPress(KeyEvent.VK_ENTER);
		fb2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//======PASSPORT NUMBER===========
		
		pdp.setPassport("1P0876A");
//		logger.info("Please enter the Passport");
		Thread.sleep(3000);
		
		WebElement Passportbutton =driver.findElement(By.xpath("(//input[@name='PASSPORT3'])[2]"));
		JavascriptExecutor PassportPhoto = (JavascriptExecutor)driver;
		PassportPhoto.executeScript("arguments[0].click();" ,Passportbutton );
		
		// creating object of robot class
		Robot fb3 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection PassportNumberphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\5.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(PassportNumberphoto, null);
		
		// press Contol+V for pasting
	    fb3.keyPress(KeyEvent.VK_CONTROL);
	    fb3.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb3.keyRelease(KeyEvent.VK_CONTROL);
	    fb3.keyRelease(KeyEvent.VK_V);
	    
//	    // for pressing and releasing Enter
		fb3.keyPress(KeyEvent.VK_ENTER);
		fb3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
	    //========VOTERIDCARD===========
		
		pdp.setVoterIDCard("100825673VA");
//		logger.info("Please enter the VoterIdcard");
		Thread.sleep(3000);
		
		WebElement VoterIDCardbutton =driver.findElement(By.xpath("(//input[@name='VOTER_ID'])[2]"));
		JavascriptExecutor VoterIDCardPhoto = (JavascriptExecutor)driver;
		VoterIDCardPhoto.executeScript("arguments[0].click();" ,VoterIDCardbutton );
		
		// creating object of robot class
		Robot fb4 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection VoterIDphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\9.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(VoterIDphoto, null);
		
		// press Contol+V for pasting
	    fb4.keyPress(KeyEvent.VK_CONTROL);
	    fb1.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb4.keyRelease(KeyEvent.VK_CONTROL);
	    fb1.keyRelease(KeyEvent.VK_V);
	    
//	    // for pressing and releasing Enter
		fb4.keyPress(KeyEvent.VK_ENTER);
		fb1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//=======RATIONCARD NUMBER========
		
		pdp.setRationCard("23456AD1331");
//		logger.info("Please enetr the rationCard");
		Thread.sleep(3000);
		
		WebElement RationCardbutton =driver.findElement(By.xpath("(//input[@name='RATION_CARD'])[2]"));
		JavascriptExecutor RationCardPhoto = (JavascriptExecutor)driver;
		RationCardPhoto.executeScript("arguments[0].click();" ,RationCardbutton );
		
		// creating object of robot class
		Robot fb5 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection Rationphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\2.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Rationphoto, null);
		
		// press Contol+V for pasting
	    fb5.keyPress(KeyEvent.VK_CONTROL);
	    fb5.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb5.keyRelease(KeyEvent.VK_CONTROL);
	    fb5.keyRelease(KeyEvent.VK_V);
	    
//	    // for pressing and releasing Enter
		fb5.keyPress(KeyEvent.VK_ENTER);
		fb5.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//========ACCOUNT STATEMENT=====
		
		pdp.setAccountStatement("120009123");
//		logger.info("Please enter the Account number");
		Thread.sleep(2000);
		
		
		WebElement AccountStatementbutton =driver.findElement(By.xpath("(//input[@name='ACCOUNT_STATEMENT'])[2]"));
		JavascriptExecutor AccountStatementPhoto = (JavascriptExecutor)driver;
		AccountStatementPhoto.executeScript("arguments[0].click();" ,AccountStatementbutton );
		
		// creating object of robot class
		Robot fb6 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection Accountphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\7.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Accountphoto, null);
		
		// press Contol+V for pasting
	    fb6.keyPress(KeyEvent.VK_CONTROL);
	    fb1.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb6.keyRelease(KeyEvent.VK_CONTROL);
	    fb6.keyRelease(KeyEvent.VK_V);
	    
	    // for pressing and releasing Enter
		fb6.keyPress(KeyEvent.VK_ENTER);
		fb6.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		
		//======ACCOUNT ANALYSIS======
		
		pdp.setAccountAnalysis("1967615876QR");
//		logger.info("Please enter the Account Analysis");
		Thread.sleep(3000);
		
		WebElement AccountAnalysisbutton =driver.findElement(By.xpath("(//input[@name='ACCOUNT_ANALYSIS'])[2]"));
		JavascriptExecutor AccountAnalysisPhoto = (JavascriptExecutor)driver;
		AccountAnalysisPhoto.executeScript("arguments[0].click();" ,AccountAnalysisbutton );
		
		// creating object of robot class
		Robot fb7 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection Analysisphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\5.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Analysisphoto, null);
		
		// press Contol+V for pasting
	    fb7.keyPress(KeyEvent.VK_CONTROL);
	    fb7.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb7.keyRelease(KeyEvent.VK_CONTROL);
	    fb7.keyRelease(KeyEvent.VK_V);
	    
//	    // for pressing and releasing Enter
		fb7.keyPress(KeyEvent.VK_ENTER);
		fb7.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		
		//=========NIA INTERROGATION===========
		
		pdp.setNIAInterrogation("LKJGFF876534");
 //    	logger.info("Please enter the NIA INTERROGATION");
		Thread.sleep(3000);
		
		
		WebElement NIAInterrbutton =driver.findElement(By.xpath("(//input[@name='NIA_INTERROGATION_REPORT'])[2]"));
		JavascriptExecutor NIAInterrPhoto = (JavascriptExecutor)driver;
		NIAInterrPhoto.executeScript("arguments[0].click();" ,NIAInterrbutton );
		
		// creating object of robot class
		Robot fb8 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection NIAInterrogationphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\4.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(NIAInterrogationphoto, null);
		
		// press Contol+V for pasting
	    fb8.keyPress(KeyEvent.VK_CONTROL);
	    fb8.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb8.keyRelease(KeyEvent.VK_CONTROL);
	    fb8.keyRelease(KeyEvent.VK_V);
	    
//	    // for pressing and releasing Enter
		fb8.keyPress(KeyEvent.VK_ENTER);
		fb8.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		//========IMMIGRATION FORM=========
		
		pdp.setImmigrationForm("ADFHJ00987");
//		logger.info("Please enter the immigration form number ");
		Thread.sleep(3000);
		
		WebElement ImmigrationFormbutton =driver.findElement(By.xpath("(//input[@name='IMMIGRATION_FORM'])[2]"));
		JavascriptExecutor ImmigrationFormPhoto = (JavascriptExecutor)driver;
		ImmigrationFormPhoto.executeScript("arguments[0].click();" ,ImmigrationFormbutton );
		
		// creating object of robot class
		Robot fb9 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection Immigrationphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\8.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Immigrationphoto, null);
		
		// press Contol+V for pasting
	    fb9.keyPress(KeyEvent.VK_CONTROL);
	    fb9.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb9.keyRelease(KeyEvent.VK_CONTROL);
	    fb9.keyRelease(KeyEvent.VK_V);
	    
//	    // for pressing and releasing Enter
		fb9.keyPress(KeyEvent.VK_ENTER);
		fb9.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		//========FRROF FORM=========
		
		pdp.setFRROForm("88QWER12346");
//		logger.info("Please enter the FRRO Form");
		Thread.sleep(3000);
		
		
		WebElement FRROFormbutton =driver.findElement(By.xpath("(//input[@name='IMMIGRATION_FORM'])[2]"));
		JavascriptExecutor FRROFormPhoto = (JavascriptExecutor)driver;
		FRROFormPhoto.executeScript("arguments[0].click();" ,FRROFormbutton );
		
		// creating object of robot class
		Robot fb10 = new Robot();
		Thread.sleep(2000);
		
		
		StringSelection FRROphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\6.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(FRROphoto, null);
		
		// press Contol+V for pasting
	    fb10.keyPress(KeyEvent.VK_CONTROL);
	    fb10.keyPress(KeyEvent.VK_V);
	   
	    
	    // release Contol+V for pasting
	    fb10.keyRelease(KeyEvent.VK_CONTROL);
	    fb10.keyRelease(KeyEvent.VK_V);
	    
//	    // for pressing and releasing Enter
		fb10.keyPress(KeyEvent.VK_ENTER);
		fb10.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		
		
		pdp.ClickPersonalSubmitbutton();
//		logger.info("Please enter the submit button");
		Thread.sleep(4000);
		
		
		pdp.ClickPersonalNextButton();
//		logger.info("Please enter the next button");
		Thread.sleep(4000);
		
		
		}
		
   }
