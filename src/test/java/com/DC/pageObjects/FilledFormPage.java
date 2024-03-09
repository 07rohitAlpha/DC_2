package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class FilledFormPage extends BaseClass {
	
    WebDriver ldriver;
	public FilledFormPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	
	@FindBy(how=How.XPATH,using="")
	@CacheLookup
	WebElement btnFilledForm;
	
	public void FilledForm() {
		btnFilledForm.click();
	}
	
	@FindBy(how=How.XPATH,using="")
	@CacheLookup
	WebElement btnArrestedList;
	
	public void ArrestedList() {
		btnArrestedList.click();
	}
	
	@FindBy(how=How.XPATH,using="")
	@CacheLookup
	WebElement btnSuspectList;
	
	public void SuspectList() {
		btnSuspectList.click();
	}
	
	@FindBy(how=How.XPATH,using="")
	@CacheLookup
	WebElement btnLeftoverList;
	
	public void ListoverList() {
		
		btnLeftoverList.click();
	}

}
