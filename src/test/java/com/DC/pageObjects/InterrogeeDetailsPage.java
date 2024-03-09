 package com.DC.pageObjects;





import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.actiondriver.Action;
import com.DC.testCase.BaseClass;

public class InterrogeeDetailsPage extends BaseClass{

	
	
	
	
	WebDriver ldriver;
	
	public InterrogeeDetailsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//a[@class='text-decoration-none d-flex']")
	@CacheLookup
	private WebElement btnShowAll;
	
	public void ClickShowAllbutton() {
		btnShowAll.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody/tr[1]/td[8]/a[1]//*[name()='svg']//*[name()='path' and contains(@d,'M3 17.25V2')]")
	@CacheLookup
	WebElement btnEditbutton;
	
	public void ClickEditbutton() {
		btnEditbutton.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody/tr[2]/td[9]//*[name()='svg']")
	@CacheLookup
	WebElement btnCWIRbutton;
	
	public void ClickbtnCWIRbutton() {
		btnCWIRbutton.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter name']")
	@CacheLookup
	WebElement txtFName;
	
	public void setFName(String fname) {
		txtFName.sendKeys(fname);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter parentage']")
	@CacheLookup
	WebElement txtParentage;
	

	public void setParentage(String parentage) {
		txtParentage.sendKeys(parentage);
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='gender']")
	@CacheLookup
	WebElement txtGender;
	
	public void setGender(String gender) {
		txtGender.sendKeys(gender);
	}
	
	@FindBy(how=How.XPATH,using="//input[@id='tags']")
	@CacheLookup
	WebElement txtAlias;
	
	public void setAlias(String alias) {
		txtAlias.sendKeys(alias);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Birth Date ']")
	@CacheLookup
	WebElement txtDOB;
	

	public void setDOB(String dob) {
		txtDOB.sendKeys(dob);
	}
	
	@FindBy(how=How.XPATH,using ="//input[@placeholder='Age']")
	@CacheLookup
	WebElement txtAge;
	
	public void setAge(String age) {
		txtAge.sendKeys(age);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Birth place']")
	@CacheLookup
	WebElement txtBirthPlace;
	
	public void BirthPlace(String birthplace) {
		txtBirthPlace.sendKeys(birthplace);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Dossier number']")
	@CacheLookup
	WebElement txtDossierNo;
	
	public void DossierNo(String dossierno) {
		txtDossierNo.sendKeys(dossierno);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Tribe']")
	@CacheLookup
	WebElement txtTribe;
	
	public void Tribe(String tribe) {
		txtTribe.sendKeys(tribe);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='marital_status']")
	@CacheLookup
	WebElement txtMarital;

	public void Marital (String marital ) {
		txtMarital.sendKeys(marital );
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Finger print number']")
	@CacheLookup
	WebElement txtFingerPrNo ;
	
	public void FingerPrNo (String fingerprno) {
		txtFingerPrNo.sendKeys(fingerprno);

	}
	
	@FindBy(how=How.XPATH,using="//select[@name='religion']")
	@CacheLookup
	WebElement txtReligion;
	
	public void Religion (String religion) {
		txtReligion.sendKeys(religion);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='caste']")
	@CacheLookup
	WebElement txtCaste;
	
	public void Caste (String caste) {
		txtCaste.sendKeys(caste);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='sect']")
	@CacheLookup
	WebElement txtSect;
	

	public void Sect(String sect) {
		txtSect.sendKeys(sect);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='nationality']")
	@CacheLookup
	WebElement txtNationality;
	
	public void Nationality(String nationality) {
		txtNationality.sendKeys(nationality);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Identification mark']")
	@CacheLookup
	WebElement txtIdentification;
	
	public void Identification(String identification) {
		txtIdentification.sendKeys(identification);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Occupation before crime']")
	@CacheLookup
	WebElement txtOccupation;
	
	public void Occupation(String occupation) {
		txtOccupation.sendKeys(occupation);
	}
	
	//==========NatureOfCrime======================
	
	@FindBy(how=How.XPATH,using="(//input[@id='search_input'])[1]")
	@CacheLookup
	WebElement txtNatureOfCrime;
	
	public void NatureOfCrime(String natureofcrime) {
		txtNatureOfCrime.sendKeys(natureofcrime);
	}
	
	@FindBy(how=How.XPATH,using="//li[normalize-space()='Gangster']")
	@CacheLookup
	WebElement txtGangster;
	
	public void Gangster() {
		txtGangster.click();
	}
	
	@FindBy(how=How.XPATH,using="//li[normalize-space()='Narcotics']")
	@CacheLookup
	WebElement txtNarcotics;
	
	public void Narcotics(){
		txtNarcotics.click();
	}
	
	@FindBy(how=How.XPATH,using="//li[normalize-space()='Terrorist']")
	@CacheLookup
	WebElement txtTerrorist;
	
	public void Terrorist(){
		txtTerrorist.click();
	}
	
	@FindBy(how=How.XPATH,using="//li[normalize-space()='dfdf']")
	@CacheLookup
	WebElement txtDfdf;
	
	public void Dfdf() {
		txtDfdf.click();
	}
	
	@FindBy(how=How.XPATH,using="(//img[contains(@class,'icon_cancel closeIcon')])[2]")
	@CacheLookup
	WebElement txtuncheck4;
	
	public void uncheck4() {
		txtuncheck4.click();
	}
	
	
	//================Criminal Expertise=====================
	
	@FindBy(how=How.XPATH,using="(//input[@id='search_input'])[2]")
	@CacheLookup
	WebElement txtCriminalExpertise;
	
	public void CriminalExpertise (String criminalexpertise) {
		txtCriminalExpertise.sendKeys(criminalexpertise);
	}
	
	@FindBy(how=How.XPATH,using="//li[normalize-space()='Carrier']")
	@CacheLookup
	WebElement txtCarrier;
	
	public void Carrier() {
		txtCarrier.click();
	}

	@FindBy(how=How.XPATH,using="//li[normalize-space()='Consumer']")
	@CacheLookup
	WebElement txtConsumer;
	
	public void Consumer() {
		txtConsumer.click();
	}
	
	@FindBy(how=How.XPATH,using="//li[normalize-space()='Destination']")
	@CacheLookup
	WebElement txtDestination;
	
	public void Destination() {
		txtDestination.click();
	}
	
	@FindBy(how=How.XPATH,using="//li[normalize-space()='Financer']")
	@CacheLookup
	WebElement txtFinancer;
	
	public void Financer() {
		txtFinancer.click();
	}
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Consumer']//img[contains(@class,'icon_cancel closeIcon')]")
	@CacheLookup
	WebElement txtuncheck7;
	
	public void uncheck7() {
		txtuncheck7.click();
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtRemark;
	
	public void Remark(String remark) {
		txtRemark.sendKeys(remark);
	}
	
//	@FindBy(how=How.XPATH,using="(//input[@name='frontimagesAttachment'])[1]")
//	@CacheLookup
//	WebElement txtFrontSidePhoto;

//	// creating object of Robot class
//	Robot rb = new Robot();
	
	@FindBy(how=How.XPATH,using="//input[@name='backimagesAttachment']")
	@CacheLookup
	WebElement txtBackSidePhoto;
	
	public void BackSidePhoto() {
		txtBackSidePhoto.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='rightimagesAttachment']")
	@CacheLookup
	WebElement txtRightSidePhoto;
	
	public void RightSidePhoto() {
		txtRightSidePhoto.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='leftimagesAttachment']")
	@CacheLookup
	WebElement txtLeftSidePhoto;
	
	public void LeftSidePhoto() {
		txtLeftSidePhoto.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='tattooimagesAttachment']")
	@CacheLookup
	WebElement txtTattooPhoto;
	
	public void TattooPhoto() {
		txtTattooPhoto.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='deformatiyimagesAttachment']")
	@CacheLookup
	WebElement txtDeformityPhoto;
	
	public void DeformityPhoto() {
		txtDeformityPhoto.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//tbody/tr[1]/td[2]/marquee[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnAllmatch;
	
	public void clickAllmatch() {
		btnAllmatch.click();
	}  
	
	@FindBy(how=How.XPATH,using="//tbody/tr[2]/td[2]/marquee[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnNameandParentage;
	public void clickNameandParentage() {
		btnNameandParentage.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody/tr[3]/td[2]/marquee[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnFingerPrintNo;
	
	public void clickFingerPrintNo() {
		btnFingerPrintNo.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody/tr[4]/td[2]/marquee[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnDossierNo;
	
	public void clickDossierNo() {
		btnDossierNo.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody/tr[5]/td[2]/marquee[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnFRS;
	
	public void clickFRS() {
		btnFRS.click();
	}
	
//	======================Continue with new Filled Form ======================
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Continue with new filled form']")
	@CacheLookup
	WebElement btnContinuewithnewForm;
	
	public void clickContinuewithnewForm() {
		btnContinuewithnewForm.click();
	}
	
	
// ==================CLOSE BUTTON ========================	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Close']")
	@CacheLookup
	WebElement btnclosebutton;
	
	public void clickclosebutton() {
		btnclosebutton.click();
	}
	
// ================ MATCH RESULTS =======================	
	
	@FindBy(how=How.XPATH,using="//td[normalize-space()='Karan']")
	@CacheLookup
	WebElement btnresultname;
	
	public void clickresultname() {
		btnresultname.click();
	}
	
// ================== FIR Arrest FIR ===========
	@FindBy(how=How.XPATH,using="(//button[@type='button'])[4]")
	@CacheLookup
	WebElement btnArrestFIR;
	
	public void clickArrestFIR() {
		btnArrestFIR.click();
	}
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='3880/1954/ANAND PARBAT']")
	@CacheLookup
	WebElement btnFIRNumbercheck;
	
	
// ============BACK button =======================
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Back']")
	@CacheLookup
	WebElement btnBackButton;
	
	public void clickBackButton() {
		btnBackButton.click();
	}
	
// ========== View button =============
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='View']")
	@CacheLookup
	WebElement btnViewButton;
	
	public void clickViewButton() {
		btnViewButton.click();
	}
	
// ======== he/she is the same person =======
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='He/She is the same person']")
	@CacheLookup
	WebElement btnsameperson;
	
	public void clicksameperson() {
		btnsameperson.click();
	}
	
	
// ====== Confirmation YES ===========
	@FindBy(how=How.XPATH,using="//button[normalize-space()='YES']")
	@CacheLookup
	WebElement btnYes;
	
	public void clickYes() {
		btnYes.click();
	}

	
// =========== Confirmation No =========
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NO']")
	@CacheLookup
	WebElement btnNo;
	
	public void clickNo() {
		btnNo.click();
	}
	
//	public void FrontSidePhoto(String frontsidephoto)  {
//		txtFrontSidePhoto.sendKeys(frontsidephoto);
//	}
	
		

//		// creating object of robot class
//		Robot rb = new Robot();
//		
//		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(txtFrontSidePhoto, null);
//		
//		// press Contol+V for pasting
//	    rb.keyPress(KeyEvent.VK_CONTROL);
//	    rb.keyPress(KeyEvent.VK_V);
//	     Thread.sleep(1000);
//	    // release Contol+V for pasting
//	    rb.keyRelease(KeyEvent.VK_CONTROL);
//	    rb.keyRelease(KeyEvent.VK_V);
//	    Thread.sleep(1000);
//	    // for pressing and releasing Enter
//		rb.keyPress(KeyEvent.VK_ENTER);
//		rb.keyRelease(KeyEvent.VK_ENTER);
//		Thread.sleep(20000); 
//		
//	}
		
	
/*	@FindBy(xpath ="//input[@placeholder='Enter name']")
	@CacheLookup
	WebElement txtFName;
	
	@FindBy(xpath=)
	@CacheLookup
	WebElement txtParentage;
	
	@FindBy(xpath= "//select[@name='gender']")
	@CacheLookup
	WebElement txtGender;
	
	@FindBy(xpath="//input[@id='tags']")
	@CacheLookup
	WebElement txtAlias;  
	
	@FindBy(xpath="//input[@placeholder='Birth Date ']")
	@CacheLookup
	WebElement txtDOB;  
	
	@FindBy(xpath="//input[@placeholder='Age']")
	@CacheLookup
	WebElement txtAge;   
	
	@FindBy(xpath="//input[@placeholder='Birth place']")
	@CacheLookup
	WebElement txtBirthPlace;  
	
	@FindBy(xpath="//input[@placeholder='Dossier number']")
	@CacheLookup
	WebElement txtDossierNo;
	
	@FindBy(xpath="//input[@placeholder='Tribe']")
	@CacheLookup
	WebElement txtTribe;
	
	@FindBy(xpath = "//select[@name='marital_status']")
	@CacheLookup
	WebElement txtMarital;  
	
	@FindBy(xpath = "//input[@placeholder='Finger print number']")
	@CacheLookup
	WebElement txtFingerPrNo;
	
	
	@FindBy(xpath= "//select[@name='religion']")
    @CacheLookup
    WebElement txtReligion;
	
	@FindBy(xpath= "//select[@name='caste']")
	@CacheLookup
	WebElement txtCaste;
	
	@FindBy(xpath="//select[@name='sect']")
	@CacheLookup
	WebElement txtSect;  
	
	@FindBy(xpath= "//select[@name='nationality']")
	@CacheLookup
	WebElement txtNationality;
	
	@FindBy(xpath="//input[@placeholder='Identification mark']")
	@CacheLookup
	WebElement txtIdentification;
	
	@FindBy(xpath="//input[@placeholder='Occupation before crime']")
	@CacheLookup
	WebElement txtOccupation; 
	
	
	@FindBy(xpath="(//input[@id='search_input'])[1]")
	@CacheLookup
	WebElement txtNatureOfCrime; 
	
	@FindBy(xpath="(//input[@id='search_input'])[2]")
	@CacheLookup
	WebElement txtCriminalExpertise;
	
	
	@FindBy(xpath="//input[@name='frontimagesAttachment']")
	@CacheLookup
	WebElement txtFrontSidePhoto; */
	
	
	
	
	
	
}
