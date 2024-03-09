package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class TelephonNumberPage extends BaseClass {
	
	
	
	WebDriver ldriver;
	public TelephonNumberPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='contact_type']")
	@CacheLookup
	WebElement txtContactType;
	
	public void setContactType(String  contacttype) {
		txtContactType.sendKeys(contacttype);
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='country_code']")
	@CacheLookup
	WebElement txtContactCountryCode;
	
	public void setContactCountryCode(String contactcountrycode) {
		txtContactCountryCode.sendKeys(contactcountrycode);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter mobile number']")
	@CacheLookup
	WebElement txtContactMobileNumber;
	
	public void setContactMobileNumber(String contactmobilenumber ) {
		txtContactMobileNumber.sendKeys(contactmobilenumber);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter IMEI number']")
	@CacheLookup
	WebElement txtContactIMEINumber;
	
	public void setContactIMEINumner(String contactimeinumber) {
		txtContactIMEINumber.sendKeys(contactimeinumber);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Enter remarks details']")
	@CacheLookup
	WebElement txtContactRemark;
	
	public void setContactRemark(String contactremark) {
		txtContactRemark.sendKeys(contactremark);
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnContactSubmit;
	
	
	public void ClickContactSubmit() {
		btnContactSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody//tr//td//button[@type='button']//*[name()='svg']")
	@CacheLookup
	WebElement btnContactEdit;
	 
	public void ClickContactEditbutton() {
		btnContactEdit.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnContactUpdate;
	
	public void ClickContactUpdatebutton() {
		btnContactUpdate.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnClickContactNextbutton;
	
	public void ClickContactNextbutton() {
		btnClickContactNextbutton.click();
	}

}
