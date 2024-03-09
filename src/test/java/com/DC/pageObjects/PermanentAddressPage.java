package com.DC.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class PermanentAddressPage extends BaseClass {

	WebDriver ldriver;
	public PermanentAddressPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(how=How.XPATH,using="//span[normalize-space()='Education']")
	@CacheLookup
	WebElement ClickPermanentIcon;
	
	public void ClickPermanentIcon() {
		ClickPermanentIcon.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter house number']")
	@CacheLookup
	WebElement txtHouseNumber;
	
	public void setHouseNumber(String housenumber) {
		txtHouseNumber.sendKeys(housenumber);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Flat/Building/Apartment/Landmark']")
	@CacheLookup
	WebElement txtApartmentName;
	
	public void setApartmentName(String apartmentname) {
		txtApartmentName.sendKeys(apartmentname);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter lane']")
	@CacheLookup
	WebElement txtLaneName;
	
	public void setLaneName(String lanename) {
		txtLaneName.sendKeys(lanename);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter city']")
	@CacheLookup
	WebElement txtCityName;
	
	public void setCityName(String cityname) {
		txtCityName.sendKeys(cityname);
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	@CacheLookup
	WebElement txtCountryName;
	
	public void setCountryName(String countryname) {
		txtCountryName.sendKeys(countryname);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='state']")
	@CacheLookup
	WebElement txtStateName;
	
	public void setStateName(String statename) {
		txtStateName.sendKeys(statename);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='district']")
	@CacheLookup
	WebElement txtDistrictName;
	
	public void setDistrictName(String districtname) {
		txtDistrictName.sendKeys(districtname);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='police_station']")
	@CacheLookup
	WebElement txtPoliceStation;
	
	public void setPoliceStation(String policestation) {
		txtPoliceStation.sendKeys(policestation);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='village']")
	@CacheLookup
	WebElement txtVillageName;
	
	public void setVillageName(String villagename) {
		txtVillageName.sendKeys(villagename);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Please enter pin code']")
	@CacheLookup
	WebElement txtPinCode;
	
	public void setPinCode(String pincode) {
		txtPinCode.sendKeys(pincode);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtRemark;
	
	public void setRemark(String remark) {
		txtRemark.sendKeys(remark);
	}
	

	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement clickPermanentSubmit;
	
	public void clickPermanentSubmit() {
		clickPermanentSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement clickPermanentNextPage;
	
	public void clickPermanentNextPage() {
		clickPermanentNextPage.click();
	}
}
