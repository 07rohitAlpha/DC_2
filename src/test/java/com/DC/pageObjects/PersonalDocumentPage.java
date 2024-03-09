package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class PersonalDocumentPage extends BaseClass {
	
	WebDriver ldriver;
	public PersonalDocumentPage(WebDriver rdriver) {
		ldriver= rdriver ;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER PAN CARD']")
	@CacheLookup
	WebElement txtPanCard;
	
	public void setPanCard(String pancard) {
		txtPanCard.sendKeys(pancard);
	}
	
//	@FindBy(how=How.XPATH,using="//div[@class='row']//div[1]//div[2]//div[1]//input[1]")
//	@CacheLookup
//	WebElement btnPanCardImg;
//	
//	public void ClickPanCardImg() {
//		btnPanCardImg.click();
//	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER AADHAR CARD']")
	@CacheLookup
	WebElement txtAadharCard;
	
	public void setAadharCard(String aadharcard) {
		txtAadharCard.sendKeys(aadharcard);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER DRIVING LICENSE']")
	@CacheLookup
	WebElement txtDrivingLicense;
	
	public void setDrivingLicense(String drivinglicense) {
		txtDrivingLicense.sendKeys(drivinglicense);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER PASSPORT3']")
	@CacheLookup
	WebElement txtPassport;
	
	public void setPassport(String passport) {
		txtPassport.sendKeys(passport);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER VOTER ID']")
	@CacheLookup
	WebElement txtVoterIDCard;
	
	public void setVoterIDCard(String voteridcard) {
		txtVoterIDCard.sendKeys(voteridcard);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER RATION CARD']")
	@CacheLookup
	WebElement txtRationCard;
	
	public void setRationCard(String rationcard) {
		txtRationCard.sendKeys(rationcard);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER ACCOUNT STATEMENT']")
	@CacheLookup
	WebElement txtAccountStatement;
	
	public void setAccountStatement(String accountstatement) {
		txtAccountStatement.sendKeys(accountstatement);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER ACCOUNT ANALYSIS']")
	@CacheLookup
	WebElement txtAccountAnalysis;
	
	public void setAccountAnalysis(String accountanalysis) {
		txtAccountAnalysis.sendKeys(accountanalysis);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER NIA INTERROGATION REPORT']")
	@CacheLookup
	WebElement txtNIAInterrogation;
	
	public void setNIAInterrogation(String NIAinterrogation) {
		txtNIAInterrogation.sendKeys(NIAinterrogation);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER IMMIGRATION FORM']")
	@CacheLookup
	WebElement txtImmigrationForm;
	
	public void setImmigrationForm(String immigrationform) {
		txtImmigrationForm.sendKeys(immigrationform);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='ENTER FRRO FORM']")
	@CacheLookup
	WebElement txtFRROForm;
	
	public void setFRROForm(String FRROform) {
		txtFRROForm.sendKeys(FRROform);
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnPersonalSubmitbutton;
	
	public void ClickPersonalSubmitbutton() {
		btnPersonalSubmitbutton.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnPersonalNextButton;
	
	public void ClickPersonalNextButton() {
		btnPersonalNextButton.click();
	} 
	

}
