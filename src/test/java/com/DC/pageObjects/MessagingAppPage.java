package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class MessagingAppPage extends BaseClass {
	
	WebDriver ldriver;
	public  MessagingAppPage(WebDriver rdriver) {
		ldriver = rdriver ;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='digital_media_app']")
	@CacheLookup
	WebElement txtMessagingApp;
	
	
	public void setMessagingApp(String messagingapp) {
		txtMessagingApp.sendKeys(messagingapp);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Please enter social media id']")
	@CacheLookup
	WebElement txtSocialMediaId;
	
	public void setSocialMediaId(String socialmediaid) {
		txtSocialMediaId.sendKeys(socialmediaid);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Please enter mobile number']")
	@CacheLookup
	WebElement txtMobileNumber;
	
	public void setMobileNumber(String mobilenumber) {
		txtMobileNumber.sendKeys(mobilenumber);
	}
	
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtMessgingRemark;
	
	public void setMessgingRemark(String messgingremark) {
		txtMessgingRemark.sendKeys(messgingremark);
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnMessgingSubmit;
	
	public void ClickMessgingSubmit() {
		btnMessgingSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="//*[name()='path' and contains(@d,'M3 17.25V2')]")
	@CacheLookup
	WebElement btnMessgingEdit;
	
	public void ClickMessgingEdit() {
		btnMessgingEdit.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnMessgingUpdate;
	
	public void ClickMessgingUpdate() {
		btnMessgingUpdate.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnMessgingNextButton;
	
	public void ClickMessgingNextButton() {
		btnMessgingNextButton.click();
	}

}
