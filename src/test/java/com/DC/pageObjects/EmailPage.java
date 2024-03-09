package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class EmailPage extends BaseClass {
	
	WebDriver ldriver;
	public EmailPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='type']")
	@CacheLookup
	WebElement txtEmailType;
	
	public void setEmailType(String emailtype) {
		txtEmailType.sendKeys(emailtype);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Please enter email id']")
	@CacheLookup
	WebElement txtEmailId;
		
	public void setEmailId(String emailid) {
		txtEmailId.sendKeys(emailid);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Please enter remark']")
	@CacheLookup
	WebElement txtEmailRemark;
	
	public void setEmailRemark(String emailremark) {
		txtEmailRemark.sendKeys(emailremark);
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnEmailSubmit;
	
	public void ClickEmailSubmit() {
		btnEmailSubmit.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//*[name()='path' and contains(@d,'M3 17.25V2')]")
	@CacheLookup
	WebElement btnEmailEdit;
	
	public void ClickEmailEdit() {
		btnEmailEdit.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnClickNextButton;
	
	public void ClickNextButton() {
		btnClickNextButton.click();
	}

}
