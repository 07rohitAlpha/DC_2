package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage {

	
	
	WebDriver ldriver;
	
	public UserInfoPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how=How.XPATH,using = "//select[@name='role']")
	@CacheLookup
	WebElement txtRank;
	
	public void setRank(String rank ) {
		txtRank.sendKeys(rank);
	}
	
	@FindBy(how=How.XPATH,using ="//input[@name='io_name']")
	@CacheLookup
	WebElement txtName;
	
	public void setName(String name) {
		txtName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH,using ="//input[@placeholder='Phone No.']")
	@CacheLookup
	WebElement txtEntmob;
	
	public void setEntmob(String entmob) {
		txtEntmob.sendKeys(entmob);
	}
	
	@FindBy(how=How.XPATH,using ="//input[@name='same_as_above']")
	@CacheLookup
	WebElement txtCheckbox;
	
	public void clickCheckbox() {
		txtCheckbox.click();
	}
	
	@FindBy(how=How.XPATH,using ="//input[@name='authorized_mobile_no']")
	@CacheLookup
	WebElement txtPhone;
	
	public void setPhone(String phone) {
		txtPhone.sendKeys(phone);
	}
	
	@FindBy(how=How.XPATH,using="//b[normalize-space()='Generate OTP']")
	@CacheLookup
	WebElement txtGenerateOtp;
	
	public void clickGenerateOtp() {
		txtGenerateOtp.click();
	}
	
	@FindBy(how=How.XPATH,using ="//input[@placeholder='Enter 6-digit OTP for verification']")
	@CacheLookup
	WebElement txtPwrd;
	
	public void setPwrd(String pwrd) {
	    txtPwrd.sendKeys(pwrd);
	}
	
	@FindBy(how=How.XPATH,using ="//button[@type='submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	
//	@FindBy(xpath= "//select[@name='role']")
//	@CacheLookup
//	WebElement txtRank; 
//	
//	@FindBy(xpath="//input[@name='io_name']")
//	@CacheLookup
//	WebElement txtName; 
//	
//	@FindBy(xpath= "//input[@name='io_mobile_no']")
//	@CacheLookup
//	WebElement txtEntmob; 
//	
//	@FindBy(xpath= "//label[@class='fw-bold text-white mt-3 mb-0']")
//	@CacheLookup
//	WebElement txtCheckbox; 
//	
//	@FindBy(xpath= "//input[@name='authorized_mobile_no']")
//	@CacheLookup
//	WebElement txtPhone;
//	
//	@FindBy(xpath= "//input[@placeholder='Password']")
//	@CacheLookup
//	WebElement txtPwrd;
//	
//	@FindBy(xpath= "//button[@type='submit']")
//	@CacheLookup
//	WebElement btnSubmit; 
	
	
//	@FindBy(xpath="//a[normalize-space()='Click here to resend OTP']")
//	@CacheLookup
//	WebElement btnOtpbutton;
	
	
	
	
	
	
	
	
	
	
	
	
	
}
