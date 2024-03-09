package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class FamilyDetailsPage extends BaseClass {
	
	WebDriver ldriver;
	public FamilyDetailsPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='relation_type']")
	@CacheLookup
	WebElement txtRelationtype;
	
	public void setRelationtype(String relationtype) {
		txtRelationtype.sendKeys(relationtype);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter name']")
	@CacheLookup
	WebElement txtName;
	
	public void setName(String name) {
		txtName.sendKeys(name);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter parentage']")
	@CacheLookup
	WebElement txtParentage;
	
	public void setParentage(String parentage ) {
		txtParentage.sendKeys(parentage);
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter date of birth']")
	@CacheLookup
	WebElement txtBirthDate;
	
	public void setBirthDate(String birthdate) {
		txtBirthDate.sendKeys(birthdate);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter age']")
	@CacheLookup
	WebElement txtAge;
	
	public void setAge(String age) {
		txtAge.sendKeys(age);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter house number']")
	@CacheLookup
	WebElement txtHouseNumber;
	
	public void setHouseNumber(String housenumber) {
		txtHouseNumber.sendKeys(housenumber);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Flat/Building/Apartment/Landmark']")
	@CacheLookup
	WebElement txtFlatName;
	
	public void setFlatName(String flatname) {
		txtFlatName.sendKeys(flatname);
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
	
	@FindBy(how=How.XPATH,using="//select[@name='contact_type']")
	@CacheLookup
	WebElement txtContactType;
	
	public void setContactType(String contacttype) {
		txtContactType.sendKeys(contacttype);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='country_code']")
	@CacheLookup
	WebElement txtCountryCode;
	
	public void setCountryCode(String countrycode) {
		txtCountryCode.sendKeys(countrycode);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Phone number']")
	@CacheLookup
	WebElement txtPhoneNumber;
	
	public void setPhoneNumber(String phonenumber) {
		txtPhoneNumber.sendKeys(phonenumber);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter IMEI number']")
	@CacheLookup
	WebElement txtIMEINumber;
	
	public void setIMEINumber(String Imeinumber) {
		txtIMEINumber.sendKeys(Imeinumber);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='id_proof_type']")
	@CacheLookup
	WebElement txtIDProofType;
	
	public void setIDProofType(String idprooftype) {
		txtIDProofType.sendKeys(idprooftype);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter ID proof number']")
	@CacheLookup
	WebElement txtIDProofNumber;
	
	public void setIDProofNumber(String idproofnumber) {
		txtIDProofNumber.sendKeys(idproofnumber);
	}
	@FindBy(how=How.XPATH,using="//input[@name='attachments']")
	@CacheLookup
	WebElement txtAttachments;
	
	public void setAttachments(String attachments) {
		txtAttachments.sendKeys(attachments);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtRemark;
	
	public void setRemark(String remark) {
		txtRemark.sendKeys(remark);
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnSubmitButton;
	
	public void ClickSubmitbutton() {
		btnSubmitButton.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[@fdprocessedid='orzmji']//*[name()='svg']")
	@CacheLookup
	WebElement btnEditButton;
	
	public void ClickEditButton() {
		btnEditButton.click();
	}
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Add New ID Proof']")
	@CacheLookup
	WebElement btnAddNewIdProof;
	
	public void ClickAddnewIdProof() {
		btnAddNewIdProof.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Update']")
	@CacheLookup
	WebElement btnUpdateButton;
	
	public void ClickUpdateButton() {
		btnUpdateButton.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnNextPageButton;
	
	public void ClickNextButton() {
		btnNextPageButton.click();
	}
	

}
