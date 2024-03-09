package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class VoiceSamplePage extends BaseClass{
	
	WebDriver ldriver;
	public VoiceSamplePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnVoiceSampleSubmit;
	
	public void ClickVoiceSampleSubmit() {
		btnVoiceSampleSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="(//*[name()='path'])[38]")
	@CacheLookup
	WebElement btnVoiceDeletebutton;
	
	public void ClickVoiceDeletebutton() {
		btnVoiceDeletebutton.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Delete']")
	@CacheLookup
	WebElement btnVoiceDelete;
	
	public void ClickVoiceDelete() {
		btnVoiceDelete.click();
	}
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnVoiceNextButton;
	
	public void ClickVoiceNextButton() {
		btnVoiceNextButton.click();
	}
	
	

	

	

}
