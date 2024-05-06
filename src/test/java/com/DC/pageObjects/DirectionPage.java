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
		return null;
	}
	
	
	@FindBy(how=How.XPATH,using="//li[normalize-space()='Gangster']")
	@CacheLookup
	
	WebElement txtNatureOfCrime;
	public void setNatureOfCrime(String natureofcrime) {
		txtNatureOfCrime.sendKeys(natureofcrime);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter fir number']")
	@CacheLookup
	WebElement txtFIRNo;
	
	public void setFIRNo(String firno) {
		txtNatureOfCrime.sendKeys(firno);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='fir_year']")
	@CacheLookup
	WebElement txtFIRYear;
	
	public void setFIRYear(String firyear) {
		txtFIRYear.sendKeys(firyear);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter FIR Date']")
	@CacheLookup
	WebElement txtFIRDate;
	
	public void setFIRDate(String firdate) {
		txtFIRDate.sendKeys(firdate);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='fir_state']")
	@CacheLookup
	WebElement txtFIRState;
	
	public void setFIRState(String firstate) {
		txtFIRState.sendKeys(firstate);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='fir_district']")
	@CacheLookup
	WebElement txtFIRDistrict;
	
	public void setFIRDistrict(String firdistrict) {
		txtFIRDistrict.sendKeys(firdistrict);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='fir_police_station']")
	@CacheLookup
	WebElement txtFIRPoliceStation;
	
	public void setFIRPoliceStation(String firpolicestation) {
		txtFIRPoliceStation.sendKeys(firpolicestation);
	}
	
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Enter Context']")
	@CacheLookup
	WebElement txtContext;
	
	public void setContext(String context) {
		txtContext.sendKeys(context);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Enter Context']")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickSubmit() {
		btnSubmit.click();
	}

}
