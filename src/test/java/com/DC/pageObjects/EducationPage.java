package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class EducationPage extends BaseClass {


		WebDriver ldriver;
		public EducationPage(WebDriver rdriver) {
			ldriver =rdriver;
			PageFactory.initElements(rdriver, this);
		}
		
		@FindBy(how=How.XPATH,using="//select[@name='institute']")
		@CacheLookup
		WebElement txtInstituteType; 
		
		public void setInstituteType(String institutetype) {
			txtInstituteType.sendKeys(institutetype);
		}
		
		
		@FindBy(how=How.XPATH,using="//select[@name='education']")
		@CacheLookup
		WebElement txtEducation;
		
		public void setEducation(String education) {
			txtEducation.sendKeys(education);
		}
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='Enter institute name']")
		@CacheLookup
		WebElement txtInstituteName;
		
		public void setInstituteName(String institutename) {
			txtInstituteName.sendKeys(institutename);
		}
		
		@FindBy(how=How.XPATH,using="//select[@name='passing_year']")
		@CacheLookup
		WebElement txtPassingYear;
		
		public void setPassingYear(String passingyear) {
			txtPassingYear.sendKeys(passingyear);
		}
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='Enter house number']")
		@CacheLookup
		WebElement txtEducationHouseNumber;
		
		public void setEducationHouseNumber(String housenumber) {
			txtEducationHouseNumber.sendKeys(housenumber);
		}
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Flat/Building/Apartment/Landmark']")
		@CacheLookup
		WebElement txtEducationLandmark;
		
		public void setEducationLandmark(String landmark) {
			txtEducationLandmark.sendKeys(landmark);
		}
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='Enter lane']")
		@CacheLookup
		WebElement txtEducationLane;
		
		public void setEducationLane(String lane) {
			txtEducationLane.sendKeys(lane);
		}
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='Enter city']")
		@CacheLookup
		WebElement txtEducationCity;
		
		
		public void setEducationCity(String city) {
			txtEducationCity.sendKeys(city);
		}
		
		@FindBy(how=How.XPATH,using="//select[@name='country']")
		@CacheLookup
		WebElement txtEducationCountry;
		
		public void setEducationCountry(String country) {
			txtEducationCountry.sendKeys(country);
		}
		
		@FindBy(how=How.XPATH,using="//select[@name='state']")
		@CacheLookup
		WebElement txtEducationState;
		
		public void setEducationState(String state) {
			txtEducationState.sendKeys(state);
		}
		
		@FindBy(how=How.XPATH,using="//select[@name='district']")
		@CacheLookup
		WebElement txtEducationDistrict;
		
		public void setEducationDistrict(String district) {
			txtEducationDistrict.sendKeys(district);
		}
		
		@FindBy(how=How.XPATH,using="//select[@name='police_station']")
		@CacheLookup
		WebElement txtEducationPoliceStation;
		
		public void setEducationPoliceStation(String policestation) {
			txtEducationPoliceStation.sendKeys(policestation);
		}
		
		@FindBy(how=How.XPATH,using="//input[@placeholder='Enter other']")
		@CacheLookup
		WebElement txtEducationOther;
		
		public void setEducationOther(String other) {
			txtEducationOther.sendKeys(other);
		}
		
		@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
		@CacheLookup
		WebElement txtEducationRemark;
		
		public void setEducationRemark(String remark) {
			txtEducationRemark.sendKeys(remark);
		}
		
		@FindBy(how=How.XPATH,using="//button[@type='submit']")
		@CacheLookup
		WebElement btnEducationSubmit;
		
		public void setEducationSubmit() {
			btnEducationSubmit.click();
		}
		
		
	//==================Resident During Studies=================
		@FindBy(how=How.XPATH,using="//div[@class='d-flex row']//div[1]//input[1]")
		@CacheLookup
		WebElement txtResidentFromDate;
		
		public void setResidentFromDate(String fromdate) {
			txtResidentFromDate.sendKeys(fromdate);
		}
		
		@FindBy(how=How.XPATH,using="//div[@class='d-flex row']//div[1]//input[1]")
		@CacheLookup
		WebElement txtResidentToDate;
		
		public void setResidentToDate(String ToDate) {
			txtResidentToDate.sendKeys(ToDate);
		}
		
		@FindBy(how=How.XPATH,using="//input[@focused='true']")
		@CacheLookup
		WebElement txtResidentHouseNo;
		
		public void setResidentHouseNo(String houseno) {
			txtResidentHouseNo.sendKeys(houseno);
		}
		
		@FindBy(how=How.XPATH,using="//input[@fdprocessedid='calzeq']")
		@CacheLookup
		WebElement txtResidentFlat;
		
		public void setResidentFlat(String residentflat) {
			txtResidentFlat.sendKeys(residentflat);
		}
		
		
		@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter lane'])[2]")
		@CacheLookup
		WebElement txtResidentLane;
		
		public void setResidentLane(String residentlane) {
			txtResidentLane.sendKeys(residentlane);
		}
		
		
		@FindBy(how=How.XPATH,using="//input[@fdprocessedid='jxsxls']")
		@CacheLookup
		WebElement txtResidentCity;
		
		public void setResidentCity(String residentcity) {
			txtResidentCity.sendKeys(residentcity);
		}
		
		@FindBy(how=How.XPATH,using="(//select[contains(@name,'country')])[2]")
		@CacheLookup
		WebElement txtResidentCountry;
		
		public void setResidentCountry(String residentcountry) {
			txtResidentCountry.sendKeys(residentcountry);
		}
		
		@FindBy(how=How.XPATH,using="(//select[contains(@name,'state')])[2]")
		@CacheLookup
		WebElement txtResidentState;
		
		public void setResidentState(String residentstate) {
			txtResidentState.sendKeys(residentstate);
		}
		
		
		@FindBy(how=How.XPATH,using="(//select[contains(@name,'district')])[2]")
		@CacheLookup
		WebElement txtResidentDistrict;
		
		public void setResidentDistrict(String residentdistrict) {
			txtResidentDistrict.sendKeys(residentdistrict);
		}
		
		@FindBy(how=How.XPATH,using="(//select[contains(@name,'police_station')])[2]")
		@CacheLookup
		WebElement txtResidentPoliceStation;
		
		public void setResidentPoliceStation(String residentpolicestation) {
			txtResidentPoliceStation.sendKeys(residentpolicestation);
		}
		
		@FindBy(how=How.XPATH,using="(//textarea[contains(@placeholder,'Remark')])[2]")
		@CacheLookup
		WebElement txtResidentRemark;
		
		public void setResidentRemark(String residentremark) {
			txtResidentRemark.sendKeys(residentremark);
		}
		
		
		@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
		@CacheLookup
		WebElement btnResidentSubmit;
		
		public void ClickResidentSubmit() { 
			btnResidentSubmit.click();
		}
		
		@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
		@CacheLookup 
		WebElement btnEducationNextbutton;
		
		public void ClickEducationNextbutton() {
			btnEducationNextbutton.click();
		}
	}


