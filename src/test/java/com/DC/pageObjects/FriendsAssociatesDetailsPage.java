package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class FriendsAssociatesDetailsPage extends BaseClass {
	
	
	WebDriver ldriver;
	
	public FriendsAssociatesDetailsPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter name'])[1]")
	@CacheLookup
	WebElement txtName1;
	
	public void SetName1(String name1) {
		txtName1.sendKeys(name1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter parentage'])[1]")
	@CacheLookup
	WebElement txtParentage1;
	
	public void setParentage1(String parentage1) {
		txtParentage1.sendKeys(parentage1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter date of birth'])[1]")
	@CacheLookup
	WebElement txtBirthDate1;
	
	public void setBirthDate1(String birthdate1) {
		txtBirthDate1.sendKeys(birthdate1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter age'])[1]")
	@CacheLookup
	WebElement txtAge1;
	
	public void setAge1(String age1) {
		txtAge1.sendKeys(age1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter house number'])[1]")
	@CacheLookup
	WebElement txtHouseNumber1;
	
	public void setHouseNumber1(String housenumber1) {
		txtHouseNumber1.sendKeys(housenumber1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter Flat/Building/Apartment/Landmark'])[1]")
	@CacheLookup
	WebElement txtFlatName1;
	
	public void setFlatName1(String flatname1) {
		txtFlatName1.sendKeys(flatname1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter lane'])[1]")
	@CacheLookup
	WebElement txtLaneName1;
	
	public void setLaneName1(String lanename1) {
		txtLaneName1.sendKeys(lanename1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter city'])[1]")
	@CacheLookup
	WebElement txtCityName1;
	
	public void setCityName1(String cityname1) {
		txtCityName1.sendKeys(cityname1);
	}
	
	@FindBy(how=How.XPATH,using="(//select[@name='country'])[1]")
	@CacheLookup
	WebElement txtCountryName1;
	
	public void setCountryName1(String countryname1) {
		txtCountryName1.sendKeys(countryname1);
	}
	
	@FindBy(how=How.XPATH,using="(//select[@name='state'])[1]")
	@CacheLookup
	WebElement txtStateName1;
	
	public void setStateName1(String statename1) {
		txtStateName1.sendKeys(statename1);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='district']")
	@CacheLookup
	WebElement txtDistrictName1;
	
	public void setDistrictName1(String districtname1) {
		txtDistrictName1.sendKeys(districtname1);
	}
	

	@FindBy(how=How.XPATH,using="(//select[@name='contact_type'])[1]")
	@CacheLookup
	WebElement txtContactType1;
	
	public void setContactType1(String contacttype1) {
		txtContactType1.sendKeys(contacttype1);
	}
	
	@FindBy(how=How.XPATH,using="(//select[@name='country_code'])[1]")
	@CacheLookup
	WebElement txtCountryCode1;
	
	public void setCountryCode1(String countrycode1) {
		txtCountryCode1.sendKeys(countrycode1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[@placeholder='Enter Phone number'])[1]")
	@CacheLookup
	WebElement txtPhoneNumber1;
	
	public void setPhoneNumber1(String phonenumber1) {
		txtPhoneNumber1.sendKeys(phonenumber1);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter IMEI number']")
	@CacheLookup
	WebElement txtIMEINumber1;
	
	public void setIMEINumber1(String Imeinumber1) {
		txtIMEINumber1.sendKeys(Imeinumber1);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='id_proof_type']")
	@CacheLookup
	WebElement txtIDProofType1;
	
	public void setIDProofType1(String idprooftype1) {
		txtIDProofType1.sendKeys(idprooftype1);
	}
	
	@FindBy(how=How.XPATH,using ="(//select[contains(@name,'id_proof_type')])[2]")
	@CacheLookup
	WebElement txtIDProof_Type2;
	
	public void setIDProof_Type2(String idprooftype2) {
		txtIDProof_Type2.sendKeys(idprooftype2);
	}
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter ID proof number']")
	@CacheLookup
	WebElement txtIDProofNumber1;
	
	public void setIDProofNumber1(String idproofnumber1) {
		txtIDProofNumber1.sendKeys(idproofnumber1);
	}
	
	@FindBy(how=How.XPATH,using ="(//input[contains(@placeholder,'Enter ID proof number')])[2]")
	@CacheLookup
	WebElement txtIDProof_Number2;
	
	public void setIDProof_Number2(String idproofnumber2) {
		txtIDProof_Number2.sendKeys(idproofnumber2);
	}
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'attachments')])[1]")
	@CacheLookup
	WebElement txtAttachments1;
	
	public void setAttachments1(String attachments1) {
		txtAttachments1.sendKeys(attachments1);
	}
	
	@FindBy(how=How.XPATH,using="(//input[contains(@name,'attachments')])[2]")
	@CacheLookup
	WebElement txtAttachments2;
	
	public void setAttachments2(String attachments2) {
		txtAttachments2.sendKeys(attachments2);
	}
	
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtRemark1;
	
	public void setRemark1(String remark1) {
		txtRemark1.sendKeys(remark1);
	}
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Add New Contact']")
	@CacheLookup
	WebElement btnAddNewContact1;
	
	public void ClickAddNewContact1() {
	  btnAddNewContact1.click();
	}
	
	@FindBy(how=How.XPATH,using="//div[@class='card-body']//div[2]//div[1]//div[5]//button[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnCrossButton1;
	
	public void ClickCrossButton1() {
		btnCrossButton1.click();
	}
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Add New ID Proof']")
	@CacheLookup
	WebElement btnAddNewId1;
	
	public void ClickAddNewId1() {
		btnAddNewId1.click();
	}
	

	@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnSubmitButton1;
	
	public void ClickSubmitbutton1() {
		btnSubmitButton1.click();
	}
	
	@FindBy(how=How.XPATH,using="//tr[@class='text-capitalize']//button[@type='button']//*[name()='svg']")
	@CacheLookup
	WebElement btnEditButton1;
	
	public void ClickEditButton1() {
		btnEditButton1.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Update']")
	@CacheLookup
	WebElement btnUpdateButton1;
	
	public void ClickUpdateButton1() {
		btnUpdateButton1.click();
	}
	

	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnNextPageButton1;
	
	public void ClickNextButton1() {
		btnNextPageButton1.click();
	}
}
