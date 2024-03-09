package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class LanguagePage extends BaseClass {
	
	
	WebDriver ldriver;
	public LanguagePage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='type']")
	@CacheLookup
	WebElement txtLanguageSkill;
	
	public void setLanguageSkill(String languageskill) {
		txtLanguageSkill.sendKeys(languageskill);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='language']")
	@CacheLookup
	WebElement txtLanguageName;
	
	public void setLanguageName(String languagename) {
		txtLanguageName.sendKeys(languagename);
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement ClickLanguageSubmit;
	
	public void ClickLanguageSubmit() {
		ClickLanguageSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody[1]/tr[1]/td[3]/button[1]//*[name()='svg']")
	@CacheLookup
	WebElement ClickEditButton;
	
	public void ClickEditButton() {
		ClickEditButton.click();
	}	
		
	@FindBy(how=How.XPATH,using="//button[@type='submit']")	
	@CacheLookup
	WebElement ClickUpdateButton;
	
	public void ClickUpdateButton() {
		ClickUpdateButton.click();
	}
	
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement ClickNextButton;
	
	public void ClickNextButton() {
		ClickNextButton.click();
	}

}
