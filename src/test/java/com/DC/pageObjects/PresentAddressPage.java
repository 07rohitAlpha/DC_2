package com.DC.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.DC.testCase.BaseClass;

public class PresentAddressPage extends BaseClass {

	
	
	
	
	
	WebDriver ldriver;
	public PresentAddressPage(WebDriver rdriver) {
		ldriver =rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	
	@FindBy(how=How.XPATH,using="//select[@name='staying_at']")
	@CacheLookup
	WebElement txtAddresstype;
	
	WebElement txtAddresstype1;
	public void setAddresstype1(String addresstype1) {
		txtAddresstype1.sendKeys(addresstype1);
	}
	public void setAddresstype(String addresstype) {
		txtAddresstype.sendKeys(addresstype);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='From Date']")
	@CacheLookup
	WebElement txtFromDate;
	
	public void setFromDate(String fromdate) {
		txtFromDate.sendKeys(fromdate);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='To Date']")
	@CacheLookup
	WebElement txtToDate;
	
	public void setToDate(String todate) {
		txtToDate.sendKeys(todate);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtPresentRemark;
	
	public void setPresentRemark(String presentremark) {
		txtPresentRemark.sendKeys(presentremark);
	}
	
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnOwnSubmit;
	
	public void ClickOwnSubmit() {
		btnOwnSubmit.click(); 
	}
	
	
	
	
	//===============Own Property Details===============
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter house number']")
	@CacheLookup
	WebElement txtOwnHouseNo;
	
	public void setOwnHouseNo(String ownhouseno) {
		txtOwnHouseNo.sendKeys(ownhouseno);
	}
	
	@FindBy(how=How.XPATH,using ="//input[@placeholder='Enter Flat/Building/Apartment/Landmark']")
	@CacheLookup
	WebElement txtOwnFlatName;
	
	public void setOwnFlatName(String ownflatname) {
		txtOwnFlatName.sendKeys(ownflatname);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter lane']")
	@CacheLookup
	WebElement txtOwnLane;
	
	public void setOwnLane(String ownlane) {
		txtOwnLane.sendKeys(ownlane);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter city']")
	@CacheLookup
	WebElement txtOwnCity;
	
	public void setOwnCity(String owncity) {
		txtOwnCity.sendKeys(owncity);
	}
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	@CacheLookup
	WebElement txtCountry;
	
	public void setCountry(String country) {
		txtCountry.sendKeys(country);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='state']")
	@CacheLookup
	WebElement txtState;
	
	public void setState(String state) {
		txtState.sendKeys(state);
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='district']")
	@CacheLookup
	WebElement txtDistrict;
	
	public void setDistrict(String district) {
		txtDistrict.sendKeys(district);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Pin Code']")
	@CacheLookup
	WebElement txtPinCode;
	
	public void setPinCode(String pincode) {
		txtPinCode.sendKeys(pincode);
	}
	
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnOwnDetailSubmit;
	
	public void clickOwnDetailsSubmit() {
		btnOwnDetailSubmit.click();
	}
	
//	==================================================
	
	
	
	
	
	//===========Add New Address==============
	@FindBy(how=How.XPATH,using="//p[@class='me-2']")
	@CacheLookup
	WebElement btnAddNewAddress;
	
	public void clickAddNewAddress() {
		btnAddNewAddress.click();
	}
	
	
	
	
	
	
//=====================Rented Property Details=====================================
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter name of landlord']")
	@CacheLookup
	WebElement txtNameLandlord;
	
	public void setNameLandlord(String namelandlord) {
		txtNameLandlord.sendKeys(namelandlord);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter house number']")
	@CacheLookup
	WebElement txtLandlordHouseNo;
	
	public void setLandlordHouseNo(String landlordhouseno) {
		txtLandlordHouseNo.sendKeys(landlordhouseno);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter house number']")
	@CacheLookup
	WebElement txtFlatNo;
	 
	public void setFlatNo(String flatno){
		txtFlatNo.sendKeys(flatno);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter lane']")
	@CacheLookup
	WebElement txtLandlordLane;
	
	public void setLandlordLane(String landlordlane) {
		txtLandlordLane.sendKeys(landlordlane);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter city']")
	@CacheLookup
	WebElement txtLandlordCity;
	
	public void setLandlordCity(String landlordcity) {
		txtLandlordCity.sendKeys(landlordcity);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	@CacheLookup
	WebElement txtLandlordCountry;
	
	public void setLandlordCountry(String landlordcountry) {
		txtLandlordCountry.sendKeys(landlordcountry);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='state']")
	@CacheLookup
	WebElement txtLandlordState;
	
	public void setLandlordState(String landlordstate) {
		txtLandlordState.sendKeys(landlordstate);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='district']")
	@CacheLookup
	WebElement txtLandlordDistrict;
	
	public void setLandlordDistrict(String landlorddistrict) {
		txtLandlordDistrict.sendKeys(landlorddistrict);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Attach rent agreement ']")
	@CacheLookup
	WebElement txtRentagreement;
	
	public void setRentagreement(String rentagreement) {
		txtRentagreement.sendKeys(rentagreement);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='payment_mode']")
	@CacheLookup
	WebElement txtPaymentMode;
	
	public void setPaymentMode(String paymentmode) {
		txtPaymentMode.sendKeys(paymentmode);
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Add payment details']")
	@CacheLookup
	WebElement btnAddPaymentDetails;
	
	public void clickAddPayemntDetails() {
		btnAddPaymentDetails.click();
	}
	
	
	
	
	//==================Cash Account=====================
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Source of cash']")
	@CacheLookup
	WebElement txtSourceOfCase;
	
	public void setSourceOfCase(String sourceofcase) {
		txtSourceOfCase.sendKeys(sourceofcase);
	}
	
	@FindBy(how=How.XPATH,using ="//input[@placeholder='Enter place name']")
	@CacheLookup
	WebElement txtPlaceName;
	
	public void setPlaceName(String placename) {
		txtPlaceName.sendKeys(placename);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Paid to Whom']")
	@CacheLookup
	WebElement txtPaidToWhom;
	
	public void setPaidToWhom(String paidtowhom) {
		txtPaidToWhom.sendKeys(paidtowhom);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter amount']")
	@CacheLookup
	WebElement txtAmount;
	
	public void setAmount(String amount) {
		txtAmount.sendKeys(amount);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Select transcation date']")
	@CacheLookup
	WebElement txtTransactionDate;
	
	public void setTransactionDate(String transactiondate) {
		txtTransactionDate.sendKeys(transactiondate);
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Continue']")
	@CacheLookup
	WebElement txtContinue;
	
	public void clickContinue() {
		txtContinue.click();
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='contact_type']")
	@CacheLookup
	WebElement txtContactType;
	
	public void setContactType(String contacttype) {
		txtContactType.sendKeys(contacttype);
	}
	
	//=====================UPI===================
	
	private WebElement btnAddPaymentDetails1;
	
	public void clickAddPayementDetails1() {
	 btnAddPaymentDetails1.click();
	}
	
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Mobile Number']")
	@CacheLookup
	WebElement txtUPIMobileNo;
	
	public void setUPIMobileNo(String upimobileno) {
		txtUPIMobileNo.sendKeys(upimobileno);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Name']")
	@CacheLookup
	WebElement txtUPIToName;
	
	public void setUPIToName(String upitoname) {
		txtUPIToName.sendKeys(upitoname);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter UPI ID']")
	@CacheLookup
	WebElement txtUPIID;
	
	public void setUPIID(String upiid) {
		txtUPIID.sendKeys(upiid);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Amount']")
	@CacheLookup
	WebElement txtUPIAmount;
	
	public void setUPiAmount(String upiamount) {
		txtUPIAmount.sendKeys(upiamount);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Transaction ID']")
	@CacheLookup
	WebElement txtUPITransactionId;
	
	public void setUPItransactionId(String upitransactionid) {
		txtUPITransactionId.sendKeys(upitransactionid);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Transaction Date']")
	@CacheLookup
	WebElement txtUPITransactionDate;
	
	public void setUPITransactionDate(String upitransactiondate) {
		txtUPITransactionDate.sendKeys(upitransactiondate);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Transaction Time']")
	@CacheLookup
	WebElement txtUPITransactionTime;
	
	public void setUPITransactionTime(String upitransactiontime) {
		txtUPITransactionTime.sendKeys(upitransactiontime);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='app_type']")
	@CacheLookup
	WebElement txtUPIAppName;
	
	public void setUPIAppName(String upiappname) {
		txtUPIAppName.sendKeys(upiappname);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter a/c holder name']")
	@CacheLookup
	WebElement txtAccHolderName;
	
	public void setAccHolderName(String accholdername) {
		txtAccHolderName.sendKeys(accholdername);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter a/c holder name']")
	@CacheLookup
	WebElement txtBankName;
	
	public void setBankName(String bankname) {
		txtBankName.sendKeys(bankname);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter linked bank branch']")
	@CacheLookup
	WebElement txtBankBranch;
	
	public void setBankBranch(String bankbranch) {
		txtBankBranch.sendKeys(bankbranch);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter linked bank a/c no.']")
	@CacheLookup
	WebElement txtBankAccNo;
	
	public void setBankAccNo(String bankaccno) {
		txtBankAccNo.sendKeys(bankaccno);
	}
	
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Continue']")
	@CacheLookup
	WebElement btnUPIContine;
	
	public void UPIContine() {
		btnUPIContine.click();
	}
	//===============Present Address Button====================
	
	@FindBy(how=How.XPATH,using="//button[@fdprocessedid='bmuig']//*[name()='svg']")
	@CacheLookup
	WebElement btnUPIEdit;
	
	public void clickUPIEdit() {
		btnUPIEdit.click();
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='country_code']")
	@CacheLookup
	WebElement txtCountryCode;
	
	public void setCountryCode(String countrycode) {
		txtCountryCode.sendKeys(countrycode);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter mobile number']")
	@CacheLookup
	WebElement txtMobileNo;
	
	public void setMobileNo(String mobileno) {
		txtMobileNo.sendKeys(mobileno);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='id_proof_type']")
	@CacheLookup
	WebElement txtIDType;
	
	
	public void setIDType(String idtype) {
		txtIDType.sendKeys(idtype);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter ID proof number']")
	@CacheLookup
	WebElement txtIDProofNo;
	
	public void setIDProofNo(String idproofno) {
		txtIDProofNo.sendKeys(idproofno);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='attachments']")
	@CacheLookup
	WebElement txtIDAttachment;
	
	public void setIDAttachment(String idattachment) {
		txtIDAttachment.sendKeys(idattachment);
	}
	
	@FindBy(how=How.XPATH,using="//button[@type='submit']")
	@CacheLookup
	WebElement btnRentSubmit;
	
	public void clickRentSubmit() {
		btnRentSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnNextPage;
	
	public void clickNextPage() {
		btnNextPage.click();
		  
	}
	
	
	
}




