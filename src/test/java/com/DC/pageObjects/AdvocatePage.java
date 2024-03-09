package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class AdvocatePage extends BaseClass {
	
	WebDriver ldriver;
	
	public AdvocatePage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter name']")
	@CacheLookup
	WebElement txtName2;
	
	public void SetName2(String name2) {
		txtName2.sendKeys(name2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter parentage'])[1]")
	@CacheLookup
	WebElement txtParentage2;
	
	public void setParentage2(String parentage2) {
		txtParentage2.sendKeys(parentage2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter date of birth'])[1]")
	@CacheLookup
	WebElement txtBirthDate2;
	
	public void setBirthDate2(String birthdate2) {
		txtBirthDate2.sendKeys(birthdate2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter age'])[1]")
	@CacheLookup
	WebElement txtAge2;
	
	public void setAge2(String age2) {
		txtAge2.sendKeys(age2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter house number'])[1]")
	@CacheLookup
	WebElement txtHouseNumber2;
	
	public void setHouseNumber2(String housenumber2) {
		txtHouseNumber2.sendKeys(housenumber2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter Flat/Building/Apartment/Landmark'])[1]")
	@CacheLookup
	WebElement txtFlatName2;
	
	public void setFlatName2(String flatname2) {
		txtFlatName2.sendKeys(flatname2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter lane'])[1]")
	@CacheLookup
	WebElement txtLaneName2;
	
	public void setLaneName2(String lanename2) {
		txtLaneName2.sendKeys(lanename2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter city'])[1]")
	@CacheLookup
	WebElement txtCityName2;
	
	public void setCityName2(String cityname2) {
		txtCityName2.sendKeys(cityname2);
	}
	
	@FindBy(how=How.XPATH,using="(//select[@name='country'])[1]")
	@CacheLookup
	WebElement txtCountryName2;
	
	public void setCountryName2(String countryname2) {
		txtCountryName2.sendKeys(countryname2);
	}
	
	@FindBy(how=How.XPATH,using="(//select[@name='state'])[1]")
	@CacheLookup
	WebElement txtStateName2;
	
	public void setStateName2(String statename2) {
		txtStateName2.sendKeys(statename2);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='district']")
	@CacheLookup
	WebElement txtDistrictName2;
	
	public void setDistrictName2(String districtname2) {
		txtDistrictName2.sendKeys(districtname2);
	}
	

	@FindBy(how=How.XPATH,using="(//select[@name='contact_type'])[1]")
	@CacheLookup
	WebElement txtContactType2;
	
	public void setContactType2(String contacttype2) {
		txtContactType2.sendKeys(contacttype2);
	}
	
	@FindBy(how=How.XPATH,using="(//select[@name='country_code'])[1]")
	@CacheLookup
	WebElement txtCountryCode2;
	
	public void setCountryCode2(String countrycode2) {
		txtCountryCode2.sendKeys(countrycode2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter Phone number'])[1]")
	@CacheLookup
	WebElement txtPhoneNumber2;
	
	public void setPhoneNumber2(String phonenumber2) {
		txtPhoneNumber2.sendKeys(phonenumber2);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter IMEI number']")
	@CacheLookup
	WebElement txtIMEINumber2;
	
	public void setIMEINumber2(String Imeinumber2) {
		txtIMEINumber2.sendKeys(Imeinumber2);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='id_proof_type']")
	@CacheLookup
	WebElement txtIDProofType2;
	
	public void setIDProofType2(String idprooftype2) {
		txtIDProofType2.sendKeys(idprooftype2);
	}
	
	
	@FindBy(how=How.XPATH,using="(//select[contains(@name,'id_proof_type')])[2]")
	@CacheLookup
	WebElement txtIDProofType_2;
	
	public void setIDProofType_2(String idprooftype_2) {
		txtIDProofType_2.sendKeys(idprooftype_2);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter ID proof number']")
	@CacheLookup
	WebElement txtIDProofNumber2;
	
	public void setIDProofNumber2(String idproofnumber2) {
		txtIDProofNumber2.sendKeys(idproofnumber2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[contains(@placeholder,'Enter ID proof number')])[2]")
	@CacheLookup
	WebElement txtIDProofNumber_2;
	
	public void setIDProofNumber_2(String idproofnumber_2) {
		txtIDProofNumber_2.sendKeys(idproofnumber_2);
	}
	
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'attachments')])[1]")
	@CacheLookup
	WebElement txtAttachments2;
	
	public void setAttachments2(String attachments2) {
		txtAttachments2.sendKeys(attachments2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'attachments')])[2]")
	@CacheLookup
	WebElement txtAttachments_2;
	
	public void setAttachments_2(String attachments_2) {
		txtAttachments_2.sendKeys(attachments_2);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtRemark2;
	
	public void setRemark2(String remark2) {
		txtRemark2.sendKeys(remark2);
	}
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Add New Contact']")
	@CacheLookup
	WebElement btnAddNewContact2;
	
	public void ClickAddNewContact2() {
	  btnAddNewContact2.click();
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='card-body']//div[2]//div[1]//div[5]//button[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnCrossButton2;
	
	public void ClickCrossButton2() {
		btnCrossButton2.click();
	}
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Add New ID Proof']")
	@CacheLookup
	WebElement btnAddNewId2;
	
	public void ClickAddNewId2() {
		btnAddNewId2.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnSubmitButton2;
	
	public void ClickSubmitbutton2() {
		btnSubmitButton2.click();
	}
	
	@FindBy(how=How.XPATH,using="//tr[@class='text-capitalize']//button[@type='button']//*[name()='svg']")
	@CacheLookup
	WebElement btnEditButton2;
	
	public void ClickEditButton2() {
		btnEditButton2.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Update']")
	@CacheLookup
	WebElement btnUpdateButton2;
	
	public void ClickUpdateButton2() {
		btnUpdateButton2.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnNextPageButton2;
	
	public void ClickNextButton2() {
		btnNextPageButton2.click();
	}

}
