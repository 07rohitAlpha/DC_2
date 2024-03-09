package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class DirectionPage extends  BaseClass {
	
	WebDriver ldriver;
	public DirectionPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Home']")
	@CacheLookup
	WebElement btnHome;
	
	public void clickHome() {
		btnHome.click();
	}
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Arrested']")
	@CacheLookup
	WebElement btnArrested;
	
	public void clickArrested() {
		btnArrested.click();
	}

	@FindBy(how=How.XPATH,using="//p[normalize-space()='Suspect']")
	@CacheLookup
	WebElement btnSuspect;

	public void clickSuspect() {
		btnSuspect.click();
	}
	

	@FindBy(how=How.XPATH,using="//p[normalize-space()='LeftOver/ Wanted']")
	@CacheLookup
	WebElement btnLeftover;
	
	public void clickLeftover() {
		btnLeftover.click();
	}

	public String getTitle() {
		// TODO Auto-generated method stub
		return null;
	}

}
