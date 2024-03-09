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
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.DC.pageObjects.AdvocatePage;
import com.DC.pageObjects.ArrestDeatilsPage;
import com.DC.pageObjects.DescriptionAndHabitsPage;
import com.DC.pageObjects.EducationPage;
import com.DC.pageObjects.EmailPage;
import com.DC.pageObjects.FamilyDetailsPage;
import com.DC.pageObjects.FriendsAssociatesDetailsPage;
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

import freemarker.log.Logger;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

//@Listeners({AllureListener.class})
public class ArrestDeatils extends BaseClass {

	// ========Login===================
	@Test(priority = 1, description = "Login the Appliaction")
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

	// ==========UserInfomation==========
	@Test(priority = 2, description = "UserInterfacePage")
	@Epic("EP002")
	@Feature("Feature2:UserInfomation")
	@Story("Story:UserInfomation")
	@Step("Verify UserInfomation Heading")
	@Severity(SeverityLevel.MINOR)
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

	// ==========InterrogeeDeatils Form=========
	@Test(priority = 3, description = "InterrogeeDeatils")
	@Epic("EP003")
	@Feature("Feature2:InterrogeeDeatils")
	@Story("Story:InterrogeeDeatilsPage")
	@Step("Verify InterrogeeDeatils Form")
	@Severity(SeverityLevel.MINOR)
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

	// ===========Present Address============
	@Test(priority = 4, description = "Present Address Form")
	@Epic("EP004")
	@Feature("Feature2:PresentAddress")
	@Story("Story:PresentAddress")
	@Step("Verify Present Address URL")
	@Severity(SeverityLevel.CRITICAL)
	public void PresentTest() throws InterruptedException, AWTException, IOException {

		PresentAddressPage pap = new PresentAddressPage(driver);
		pap.clickNextPage();
		Thread.sleep(4000);

	}

	// ==========PermanentAddress============
	@Test(priority = 5, description = "PermanentAddress From")
	@Epic("EP005")
	@Feature("Feature2:PermanentAddress")
	@Story("Story:PermanenetAddress")
	@Step("Verify PermanentAddress URL")
	@Severity(SeverityLevel.MINOR)
	public void PermanentAddressTest() throws InterruptedException, AWTException, IOException {
		PermanentAddressPage pp = new PermanentAddressPage(driver);

		pp.ClickPermanentIcon();
//		logger.info("Please click to nextpage button");
		Thread.sleep(5000);

	}

	// ============Education============
	@Test(priority = 6, description = "Education From")
	@Epic("EP006")
	@Feature("Feature2:Education")
	@Story("Story:Education URL prsence")
	@Step("Verify Education URL prsence")
	@Severity(SeverityLevel.MINOR)
	public void EducationTest() throws InterruptedException, AWTException, IOException {
		EducationPage ep = new EducationPage(driver);
		ep.setInstituteType("COLLEGE");
//		logger.info("Please select the insitute type");
		Thread.sleep(2000);

		ep.setEducation("Bachelor of Education");
//		logger.info("Please enter the Education name");
		Thread.sleep(2000);
		ep.ClickEducationNextbutton();
		Thread.sleep(5000);
	}

	// ==========TelephoneNumber========

	@Test(priority = 7, description = "TelePhoneNumber Form")
	@Epic("EP007")
	@Feature("Feature2:TelePhoneNumber")
	@Story("Story:TelePhoneNumber URL prsence")
	@Step("Verify TelePhoneNumber URL prsence")
	@Severity(SeverityLevel.NORMAL)
	public void TelephoneNumberTest() throws InterruptedException, AWTException, IOException {
		TelephonNumberPage tp = new TelephonNumberPage(driver);

		tp.ClickContactNextbutton();
//		logger.info("Please click to Next button");
		Thread.sleep(5000);

	}

	// ==============Language=========
	@Test(priority = 8, description = "Language From")
	@Epic("EP008")
	@Feature("Feature2:Language")
	@Story("Story:Language URL prsence")
	@Step("Verify Language URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void LanguageTest() throws InterruptedException, AWTException, IOException {
		LanguagePage lp = new LanguagePage(driver);

		lp.ClickNextButton();
//		logger.info("Please click to Next button ");
		Thread.sleep(5000);

	}

	// ===============Email====================
	@Test(priority = 9, description = "Email Form")
	@Epic("EP009")
	@Feature("Feature2:Email")
	@Story("Story:Email URl prsence")
	@Step("Verify Email URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void EmailTest() throws InterruptedException, AWTException, IOException {
		EmailPage ep = new EmailPage(driver);

		ep.ClickNextButton();
//		logger.info("Please click to next button");
		Thread.sleep(2000);

	}

	// ==========MessgignApp============
	@Test(priority = 10, description = "MessgingApp Form")
	@Epic("EP010")
	@Feature("Feature2:MessgingApp")
	@Story("Story:MessgingApp URl prsence")
	@Step("Verify MessgingApp URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void MessgingAppTest() throws InterruptedException, AWTException, IOException {
		MessagingAppPage map = new MessagingAppPage(driver);

		map.ClickMessgingNextButton();
//		logger.info("Please click to next button");
		Thread.sleep(3000);

	}

	// ============PersonalDocument=======
	@Test(priority = 11, description = "PersonalDocument From")
	@Epic("EP011")
	@Feature("Feature2:PersonalDocument")
	@Story("Story:PersonalDocument URL prsence")
	@Step("Verify PersonalDocument URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void PersonalDocumentTest() throws InterruptedException, AWTException, IOException {
		PersonalDocumentPage pdp = new PersonalDocumentPage(driver);

		pdp.ClickPersonalNextButton();
//			logger.info("Please enter the next button");
		Thread.sleep(4000);
	}

	// =============VOICE SAMPLE===========
	@Test(priority = 12, description = "Voice sample Form")
	@Epic("EP012")
	@Feature("Feature2:Voice Sample")
	@Story("Story:Voice Sample prsence")
	@Step("Verify Voice Sample URl prsence")
	@Severity(SeverityLevel.MINOR)
	public void VoiceSampleTest() throws InterruptedException, AWTException, IOException {
		VoiceSamplePage vsp = new VoiceSamplePage(driver);

		WebElement VoiceUploadbutton = driver.findElement(By.xpath("//input[@name='formField']"));
		JavascriptExecutor VoiceUploadPhoto = (JavascriptExecutor) driver;
		VoiceUploadPhoto.executeScript("arguments[0].click();", VoiceUploadbutton);

		// creating object of robot class
		Robot rc = new Robot();
		Thread.sleep(2000);

		StringSelection Immigrationphoto = new StringSelection(
				"C:\\Users\\User\\OneDrive\\Desktop\\photos1\\sample-3s");
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
//			logger.info("Please select the Voice Sample");
		Thread.sleep(6000);

//					vsp.ClickVoiceDeletebutton();
//					logger.info("Please click to delete button");
//					Thread.sleep(5000);

//					vsp.ClickVoiceDelete();
//					logger.info("Please delete  voice file");
//					Thread.sleep(6000);

		vsp.ClickVoiceNextButton();
		// logger.info("Please click to NextButton");
		Thread.sleep(5000);

	}

	// ===============Description And Habit======
	@Test(priority = 13, description = "Description And Habit From")
	@Epic("EP013")
	@Feature("Feature13:Description And Habit")
	@Story("Story:Description And Habit URl prsence")
	@Step("Verify Description And Habit URl Prsence")
	@Severity(SeverityLevel.MINOR)
	public void DescriptionandHabitTest() throws InterruptedException, AWTException, IOException {
		DescriptionAndHabitsPage dah = new DescriptionAndHabitsPage(driver);

		dah.clickNextButton();
		// logger.info("Please click to NextButton");
		Thread.sleep(2000);
	}

	// ===========Family Details===================
	@Test(priority = 14, description = "Know")
	@Epic("EP013")
	@Feature("Feature14:Family")
	@Story("Story:Family URl prsence")
	@Step("Verify Family Form is submitted user will get the successfully message in display")
	@Severity(SeverityLevel.MINOR)
	public void FamilyDetailsTest() throws InterruptedException, AWTException, IOException {
		FamilyDetailsPage fdp = new FamilyDetailsPage(driver);

		fdp.setRelationtype("BROTHER");
//		 logger.info("Please select the Relation type");
		Thread.sleep(2000);

		fdp.setName("Aslam");
//		 logger.info("Please enter the Name");
		Thread.sleep(2000);

		fdp.setParentage("Sameer");
//		 logger.info("Please enter the Parentage Name");
		Thread.sleep(2000);

		fdp.setBirthDate("01-05-2001");
//		 logger.info("Please enter the Date Of Birth");
		Thread.sleep(2000);

		fdp.setAge(" ");
//		 logger.info("Please enter the Age");
		Thread.sleep(2000);

		fdp.setHouseNumber("22A Cambridge Tower");
//		 logger.info("Please enter the House Number");
		Thread.sleep(2000);

		fdp.setFlatName("Cambridge Tower");
//		 logger.info("Please enter the FlatName");
		Thread.sleep(2000);

		fdp.setLaneName("Noida");
//		 logger.info("Please enter the LaneName");
		Thread.sleep(2000);

		fdp.setCityName("Noida");
//		 logger.info("Please enter the CityName");
		Thread.sleep(2000);

		fdp.setCountryName("INDIA");
//		 logger.info("Please enter the Country Name");
		Thread.sleep(3000);

		fdp.setStateName("Delhi");
//		 logger.info("Please enter the Statename");
		Thread.sleep(2000);

		fdp.setDistrictName("CENTRAL");
//		 logger.info("Please enter the District name");
		Thread.sleep(2000);

		fdp.setContactType("INDIAN");
//		 logger.info("Please enter the ContactType");
		Thread.sleep(2000);

		fdp.setCountryCode("91");
//		 logger.info("Please enter the Country code");
		Thread.sleep(2000);

		fdp.setPhoneNumber("9876512233");
//		 logger.info("Please enter the Phonenumber");
		Thread.sleep(2000);

		fdp.setIMEINumber("11223344008845");
//		 logger.info("Please enter the IMEI Number");
		Thread.sleep(2000);

		// ======PAN CRAD NUMBER=======

		fdp.setIDProofType("PANCARD");
//		 logger.info("Please enter the IDProofType");
		Thread.sleep(2000);

		fdp.setIDProofNumber("ASFG12567");
//		 logger.info("Please enter the IDProofNumber");
		Thread.sleep(2000);

		WebElement FamilyDetailsbutton = driver.findElement(By.xpath("//input[@name='attachments']"));
		JavascriptExecutor FamilyDetailsPhoto = (JavascriptExecutor) driver;
		FamilyDetailsPhoto.executeScript("arguments[0].click();", FamilyDetailsbutton);

		// creating object of robot class
		Robot rf = new Robot();
		Thread.sleep(2000);

		StringSelection PanCardphoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\2.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(PanCardphoto, null);

		// press Contol+V for pasting
		rf.keyPress(KeyEvent.VK_CONTROL);
		rf.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rf.keyRelease(KeyEvent.VK_CONTROL);
		rf.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rf.keyPress(KeyEvent.VK_ENTER);
		rf.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		fdp.setRemark("asfhjaghhs jhjbhjb");
//		logger.info("Please enter the Remark");
		Thread.sleep(2000);

		fdp.ClickSubmitbutton();
//		logger.info("Please click the Submit button");
		Thread.sleep(4000);

		fdp.ClickNextButton();
//		logger.info("Please Click to NextPage Button");
		Thread.sleep(4000);

	}

	// =======FriendsAssociatesDeatils=====

	@Test(priority = 15, description = "Know")
	@Epic("EP015")
	@Feature("Feature15:FriendsAssociatedDeatild")
	@Story("Story:FriendsAssociatedDeatils URl prsence")
	@Step("Verify FriendsAssociatedDeatils Form is submitted user will get the successfully message in display")
	@Severity(SeverityLevel.MINOR)
	public void FriendsAssociatesTest() throws InterruptedException, AWTException, IOException {
		// FriendsAssociatesDetailsPage fadp = new FriendsAssociatesDetailsPage(driver);

		FriendsAssociatesDetailsPage fadp = new FriendsAssociatesDetailsPage(driver);

		fadp.SetName1("Karma");
//		logger.info("Please enter the Name");
		Thread.sleep(2000);

		fadp.setParentage1("Naik");
//		logger.info("Please enter the Parentage");
		Thread.sleep(2000);

		fadp.setBirthDate1("09-09-2002");
//		logger.info("Please enter the Date of Birth");
		Thread.sleep(2000);

		fadp.setAge1("");
//		logger.info("Please enter the Age");
		Thread.sleep(2000);

		fadp.setHouseNumber1("101A Twin Tower");
//		logger.info("Please enter the House Number");
		Thread.sleep(2000);

		fadp.setFlatName1("twin Tower");
//		logger.info("Please enter the FlatName");
		Thread.sleep(2000);

		fadp.setLaneName1("Noida sector 144");
//		logger.info("Please enter the LaneName");
		Thread.sleep(2000);

		fadp.setCityName1("Noida");
//		logger.info("Please enter the CityName");
		Thread.sleep(2000);

		fadp.setCountryName1("INDIA");
//		logger.info("Please enter the Country name");
		Thread.sleep(2000);

		fadp.setStateName1("Delhi");
//		logger.info("Please enter the statename");
		Thread.sleep(2000);

		fadp.setDistrictName1("CENTRAL");
//		logger.info("Please enter the DistrictName");
		Thread.sleep(2000);

		fadp.setContactType1("INDIAN");
//		logger.info("Please enter the ContactType");
		Thread.sleep(2000);

		fadp.setCountryCode1("91");
//		logger.info("Please enter the Country code");
		Thread.sleep(2000);

		fadp.setPhoneNumber1("9876113333");
//		logger.info("Please enter the Phonenumber");
		Thread.sleep(2000);

		fadp.setIMEINumber1("11223344008888");
//		logger.info("Please enter the IMEI Number");
		Thread.sleep(2000);

//		====PAN CARD NUMBER========

		fadp.setIDProofType1("PANCARD");
//		logger.info("Please enter the IDProofType");
		Thread.sleep(2000);

		fadp.setIDProofNumber1("ZGPG1241G");
//		logger.info("Please enter the IDProofNumber");
		Thread.sleep(2000);

		WebElement FriendsAssociatesDetailsbutton = driver.findElement(By.xpath("//input[@name='attachments']"));
		JavascriptExecutor FriendsAssociatesDetailsPhoto = (JavascriptExecutor) driver;
		FriendsAssociatesDetailsPhoto.executeScript("arguments[0].click();", FriendsAssociatesDetailsbutton);

		// creating object of robot class
		Robot rf = new Robot();
		Thread.sleep(2000);

		StringSelection PanCardphoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\2.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(PanCardphoto, null);

		// press Contol+V for pasting
		rf.keyPress(KeyEvent.VK_CONTROL);
		rf.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rf.keyRelease(KeyEvent.VK_CONTROL);
		rf.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rf.keyPress(KeyEvent.VK_ENTER);
		rf.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		fadp.setRemark1("FriendsAssociatesDeatild From is Successfully submitted");
//		logger.info("Please enter the Remark");
		Thread.sleep(2000);

		fadp.ClickSubmitbutton1();
//		logger.info("Please click the Submit button");
		Thread.sleep(4000);

		fadp.ClickEditButton1();
//		logger.info("Please click the Edit button");
		Thread.sleep(4000);

		fadp.ClickAddNewContact1();
//		logger.info("Please Click the AddNewContactButton");
		Thread.sleep(2000);

		fadp.ClickCrossButton1();
//		logger.info("click the Cross button");
		Thread.sleep(2000);

		fadp.ClickAddNewId1();
//		logger.info("Please click to add New button");
		Thread.sleep(3000);

		fadp.setIDProof_Type2("RATIONCARD");
//		logger.info("Please select the IDProof");
		Thread.sleep(2000);

		fadp.setIDProof_Number2("1278ASF122");
//		logger.info("Please enter the IdProof number");
		Thread.sleep(2000);

		WebElement FriendsAssociatesDetailsbutton1 = driver
				.findElement(By.xpath("(//input[contains(@name,'attachments')])[2]"));
		JavascriptExecutor FriendsAssociatesDetailsPhoto1 = (JavascriptExecutor) driver;
		FriendsAssociatesDetailsPhoto1.executeScript("arguments[0].click();", FriendsAssociatesDetailsbutton1);

		// creating object of robot class
		Robot rf1 = new Robot();
		Thread.sleep(2000);

		StringSelection PanCardphoto1 = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\5.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(PanCardphoto1, null);

		// press Contol+V for pasting
		rf1.keyPress(KeyEvent.VK_CONTROL);
		rf1.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rf1.keyRelease(KeyEvent.VK_CONTROL);
		rf1.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rf1.keyPress(KeyEvent.VK_ENTER);
		rf1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		fadp.ClickUpdateButton1();
//		logger.info("Please click to submit button");
		Thread.sleep(2000);

		fadp.ClickNextButton1();
//		logger.info("Please click to nextbutton page");
		Thread.sleep(2000);

	}

	// ============Advocate===========
	@Test(priority = 16, description = "AdvocateFrom")
	// @Test(priority=14, description="Know")
	@Epic("EP013")
	@Feature("Feature14:Family")
	@Story("Story:Family URl prsence")
	@Step("Verify Family Form is submitted user will get the successfully message in display")
	@Severity(SeverityLevel.MINOR)
	public void AdvocateTest() throws InterruptedException, AWTException, IOException {
		AdvocatePage app = new AdvocatePage(driver);

		app.SetName2("Ajit");
//		logger.info("Please enter the Name");
		Thread.sleep(2000);

		app.setParentage2("verma");
//		logger.info("Please enter the Parentage");
		Thread.sleep(2000);

		app.setBirthDate2("09-09-2005");
//		logger.info("Please enter the Date of Birth");
		Thread.sleep(2000);

		app.setAge2(" ");
//		logger.info("Please enter the Age");
		Thread.sleep(2000);

		app.setHouseNumber2("147A jaypee Kosmos ");
//		logger.info("Please enter the House Number");
		Thread.sleep(2000);

		app.setFlatName2("kosmos Tower");
//		logger.info("Please enter the FlatName");
		Thread.sleep(2000);

		app.setLaneName2("Noida sector 134");
//		logger.info("Please enter the LaneName");
		Thread.sleep(2000);

		app.setCityName2("Noida");
//		logger.info("Please enter the CityName");
		Thread.sleep(2000);

		app.setCountryName2("INDIA");
//		logger.info("Please enter the Country name");
		Thread.sleep(2000);

		app.setStateName2("Goa");
//		logger.info("Please enter the statename");
		Thread.sleep(2000);

		app.setDistrictName2("NORTHGOA");
//		logger.info("Please enter the DistrictName");
		Thread.sleep(2000);

		app.setContactType2("INDIAN");
//		logger.info("Please enter the ContactType");
		Thread.sleep(2000);

		app.setCountryCode2("91");
//		logger.info("Please enter the Country code");
		Thread.sleep(2000);

		app.setPhoneNumber2("9877100022");
//		logger.info("Please enter the Phonenumber");
		Thread.sleep(2000);

		app.setIMEINumber2("112233440002342");
//		logger.info("Please enter the IMEI Number");
		Thread.sleep(2000);

//		====AADHAR CARD NUMBER========

		app.setIDProofType2("AADHARCARD");
//		logger.info("Please enter the IDProofType");
		Thread.sleep(2000);

		app.setIDProofNumber2("199822556788");
//		logger.info("Please enter the IDProofNumber");
		Thread.sleep(2000);

		WebElement AdvocateDetailsbutton = driver.findElement(By.xpath("//input[@name='attachments']"));
		JavascriptExecutor AdvocateDetailsPhoto = (JavascriptExecutor) driver;
		AdvocateDetailsPhoto.executeScript("arguments[0].click();", AdvocateDetailsbutton);

		// creating object of robot class
		Robot rf = new Robot();
		Thread.sleep(2000);

		StringSelection AadharCardphoto = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\5.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(AadharCardphoto, null);

		// press Contol+V for pasting
		rf.keyPress(KeyEvent.VK_CONTROL);
		rf.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rf.keyRelease(KeyEvent.VK_CONTROL);
		rf.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rf.keyPress(KeyEvent.VK_ENTER);
		rf.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		app.setRemark2("AdvocateDeatild From is Successfully submitted");
//		logger.info("Please enter the Remark");
		Thread.sleep(2000);

		app.ClickSubmitbutton2();
//		logger.info("Please click the Submit button");
		Thread.sleep(2000);

		app.ClickEditButton2();
//		logger.info("Please click the edit button");
		Thread.sleep(2000);

		app.ClickAddNewContact2();
//		logger.info("Please click to AddNewContactbutton");
		Thread.sleep(2000);

		app.ClickCrossButton2();
//		logger.info("Please click to Cross button");
		Thread.sleep(2000);

		app.ClickAddNewId2();
//		logger.info("Please Add new Id ");
		Thread.sleep(2000);

//		=======PASSPORT======================

		app.setIDProofType_2("PASSPORT");
//		logger.info("Please Select the Id type");
		Thread.sleep(2000);

		app.setIDProofNumber_2("H1239876");
//		logger.info("Please enter the IDProof number");
		Thread.sleep(2000);

		WebElement AdvocateDeatilsButton1 = driver.findElement(By.xpath("(//input[contains(@name,'attachments')])[2]"));
		JavascriptExecutor AdvocateDeatilsPhoto1 = (JavascriptExecutor) driver;
		AdvocateDeatilsPhoto1.executeScript("arguments[0].click();", AdvocateDeatilsButton1);

		// Creating Object of Robot Class
		Robot rf2 = new Robot();
		Thread.sleep(2000);

		StringSelection VoterID = new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\5.1");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(VoterID, null);

		// press Contol+V for pasting
		rf2.keyPress(KeyEvent.VK_CONTROL);
		rf2.keyPress(KeyEvent.VK_V);

		// release Contol+V for pasting
		rf2.keyRelease(KeyEvent.VK_CONTROL);
		rf2.keyRelease(KeyEvent.VK_V);

		// for pressing and releasing Enter
		rf2.keyPress(KeyEvent.VK_ENTER);
		rf2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);

		app.ClickUpdateButton2();
//			logger.info("Please Click to Update");
		Thread.sleep(2000);

		app.ClickNextButton2();
//			logger.info("Please click to nextbutton");
		Thread.sleep(5000);
	}

//		=========Arrest Deatils====================

	@Test(priority = 17, description = "ArrestDeatilsForm")
	@Epic("EP017")
	@Feature("Feature17:Arrest")
	@Story("Story:ArrestDeatils URl prsence")
	@Step("Verify Arrest Form is submitted user will get the successfully message in display")
	@Severity(SeverityLevel.MINOR)
	public void ArrestDeatilsTest() throws InterruptedException, AWTException, IOException {
		ArrestDeatilsPage adp = new ArrestDeatilsPage(driver);

		adp.setOfficerRank("ACP");
//		logger.info("Please select the officer Rank");
		Thread.sleep(2000);

		adp.setOfficerName("Dharmendhra");
//		logger.info("Please enter the officer Name");
		Thread.sleep(2000);

		adp.setOfficerphoneNumber("9877552233");
//		logger.info("Please enter the Officerphone number ");
		Thread.sleep(2000);

		adp.setPlaceOfArrest("Govind Nagar");
//		logger.info("Please enter the Place of arrest ");
		Thread.sleep(2000);

		adp.setArrestDate("04-06-2018");
//		logger.info("Please enter the Arrest date");
		Thread.sleep(2000);

		adp.setDDNo("ASF1235FG");
//		logger.info("Please enter the DD number");
		Thread.sleep(2000);

		adp.setFIRNo("FIR-123/2019");
//		logger.info("Please enter the FIR Number");
		Thread.sleep(2000);

		adp.setFIRYear("2018");
//		logger.info("Please enter the FIR Year");
		Thread.sleep(2000);

		adp.setFIRDate("08-03-2019");
//		logger.info("Please enter the FIR Date");
		Thread.sleep(2000);

		adp.FIRState("Delhi");
//		logger.info("Please enter the FIR State");
		Thread.sleep(2000);

		adp.District("delhi");
//		logger.info("please enter the District");
		Thread.sleep(2000);

		adp.FIRPoliceStation("DBG Road");
//		logger.info("Please enter the PoliceStation name");
		Thread.sleep(2000);

		adp.Acts("DMC ACt");
//		logger.info("Please enter the Acts");
		Thread.sleep(3000);

		adp.Sections("144A");
//		logger.info("Please enter the Section");
		Thread.sleep(3000);

		adp.RoleOfAccused("Carrier");
//		logger.info("Please enter the Role of accused");
		Thread.sleep(2000);

		adp.CircumstancesOfArrest("ASD1");
//		logger.info("Please enter the CircumstancesArrest");
		Thread.sleep(3000);

		adp.Remark("Arrest Form will submit please check the this Form");
//		logger.info("Please enter the remark ");
		Thread.sleep(2000);

		adp.Submit();
//		logger.info("Please enter the submit button");
		Thread.sleep(4000);

//=============AddNewActs=====================		

		adp.AddNewActs();
//		logger.info("Please add New Acts");
		Thread.sleep(4000);

		adp.Acts1("ARMS ACTTRTES");
//		logger.info("second Acts enter");
		Thread.sleep(3000);

		adp.Sections1("147C");
//		logger.info("second Sections enter");
		Thread.sleep(2000);

		adp.AddNewActs();
//		logger.info("third acts added");
		Thread.sleep(2000);

		adp.Cross();
//		logger.info("Please click to Cross button");
		Thread.sleep(2000);

		adp.Update();
//		logger.info("Please Click to Update");
		Thread.sleep(2000);

		adp.SeizuremadeFrom();
//		logger.info("Please click to SeizuremadeForm");
		Thread.sleep(5000);

//      =======Seizure Made Form======	

		// ====ARMS=========

		adp.SeizureType("ARMS");
		Thread.sleep(2000);

		adp.NameOfARMS("ADG");
		Thread.sleep(2000);

		adp.QuantityOfSeizure("1345");
		Thread.sleep(2000);

		adp.UnitOfCount("STONE");
		Thread.sleep(2000);

		adp.ValueOfRupees("12556");
		Thread.sleep(2000);

		adp.SeizureRemark("Note that steps' mechanics was revised and now\"\r\n"
				+ "	it supports smart fields' analysis. In Allure\"\r\n"
				+ "	1 users had to specify indexes to refer which args'\"\r\n"
				+ "	values they want to inject into step. Allure 2 uses\"\r\n"
				+ "	reflection-based approach, which provides deep fields'\"\r\n" + "	extraction by their names.");
		Thread.sleep(2000);

		adp.SeizureMadeSubmit();
		Thread.sleep(4000);

		// =====vehicle=====

		adp.SeizureType("VEHICLE");
		Thread.sleep(3000);

		adp.Vehicleclass("SEDAN");
		Thread.sleep(2000);

		adp.VehicleColor("RED");
		Thread.sleep(2000);

		adp.TypeOfVehicle("FOUR WHEELER");
		Thread.sleep(3000);

		adp.Vehicle_Make("TATA");
		Thread.sleep(2000);

		adp.Vehicle_Model("STAR CITY");
		Thread.sleep(2000);

		adp.QuantityOfSeizure("");
		Thread.sleep(2000);

		adp.ValueOfRupees("28091");
		Thread.sleep(2000);

		adp.SeizureRemark(
				"Note that steps' mechanics was revised and now" + " it supports smart fields' analysis. In Allure"
						+ " 1 users had to specify indexes to refer which args'"
						+ " values they want to inject into step. Allure 2 uses"
						+ " reflection-based approach, which provides deep fields'" + " extraction by their names.");
		Thread.sleep(2000);

		adp.SeizureMadeSubmit();
		Thread.sleep(4000);

		adp.SeizureEdit();
		Thread.sleep(2000);

		adp.TypeOfVehicle("OTHER");
		Thread.sleep(2000);

		adp.OtherTypeOfVehicle("ASFH");
		Thread.sleep(2000);

		adp.OtherVehicleMaker("KIHG");
		Thread.sleep(3000);

		adp.OtherVehicleModel("C680");
		Thread.sleep(3000);

		adp.SeizureUpdate();
		Thread.sleep(2000);

		adp.SuretyForm();
		Thread.sleep(2000);

// ========Surety_FORM=======

//		adp.SuretyName("ARMS");
//		Thread.sleep(2000);
//		
//		adp.Contact_Type("INDIAN");
//		Thread.sleep(2000);
//		
//		adp.Country_Code("91");
//		Thread.sleep(2000);
//		
//		adp.Phone_Number("9844556621");
//		Thread.sleep(2000);
//		
//		adp.House_Number("1234FG");
//		Thread.sleep(3000);
//		
//		adp.Apartment_Name("twin tower");
//		Thread.sleep(2000);
//		
//		adp.Lane_Name("Noida");
//		Thread.sleep(2000);
//		
//		adp.City_Name("Noida");
//		Thread.sleep(2000);
//		
//		adp.Country_Name("INDIA");
//		Thread.sleep(2000);
//		
//		adp.State_Name("UTTAR PRADESH");
//		Thread.sleep(2000);
//		
//		adp.District_Name("Gautam Buddha Nagar");
//		Thread.sleep(2000);
//		
//		adp.Surety_Submit();
//		Thread.sleep(2000);
//		
//		adp.Edit_Form();
//		Thread.sleep(2000);
//		
//		adp.Update_button();
//		Thread.sleep(2000);
//		
//		adp.Next_Page();
//		Thread.sleep(2000);

	}

}
