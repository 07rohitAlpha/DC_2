package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class ArrestDeatilsPage extends BaseClass {

	public WebDriver ldriver;
//	BaseClass bs = new BaseClass();
	public ArrestDeatilsPage(WebDriver rdriver) {
		ldriver= rdriver;
//		bs.initiaze_driver();
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='arrest_by_rank']")
	@CacheLookup
	WebElement txtOfficerRank;
	
	public void setOfficerRank(String officerrank) {
		txtOfficerRank.sendKeys(officerrank);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Arrest made by name']")
	@CacheLookup
	WebElement txtOfficerName;
	
	public void setOfficerName(String officername) {
		txtOfficerName.sendKeys(officername);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Arrest made by phone no.']")
	@CacheLookup
	WebElement txtOfficerphoneNumber;
	
	public void setOfficerphoneNumber(String officerphonenumber) {
		txtOfficerphoneNumber.sendKeys(officerphonenumber);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter place of arrest']")
	@CacheLookup
	WebElement txtPlaceOfArrest;
	
	public void setPlaceOfArrest(String placeofarrest) {
		txtPlaceOfArrest.sendKeys(placeofarrest);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter date']")
	@CacheLookup
	WebElement txtArrestDate;
	
	public void setArrestDate(String arrestdate) {
		txtArrestDate.sendKeys(arrestdate);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter DD No']")
	@CacheLookup
	WebElement txtDDNo;
	
	public void setDDNo(String ddno) {
		txtDDNo.sendKeys(ddno);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='FIR No.']")
	@CacheLookup
	WebElement txtFIRNo;
	
	public void setFIRNo(String firno) {
		txtFIRNo.sendKeys(firno);
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='fir_year']")
	@CacheLookup
	WebElement txtFIRYear;
	
	public void setFIRYear(String FIRyear) {
		txtFIRYear.sendKeys(FIRyear);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Fir date']")
	@CacheLookup
	WebElement txtFIRDate;
	
	public void setFIRDate(String FIRdate) {
		txtFIRDate.sendKeys(FIRdate);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='fir_state']")
	@CacheLookup
	WebElement txtFIRState;
	
	public void FIRState(String FIRstate) {
		txtFIRState.sendKeys(FIRstate);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='fir_district']")
	@CacheLookup
	WebElement txtDistrict;
	
	public void District(String district) {
		txtDistrict.sendKeys(district);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='fir_police_station']")
	@CacheLookup
	WebElement txtFIRPoliceStation;
	
	public void FIRPoliceStation(String FIRpolicestation) {
		txtFIRPoliceStation.sendKeys(FIRpolicestation);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='indian_acts']")
	@CacheLookup
	WebElement txtActs;
	
	public void Acts(String acts) {
		txtActs.sendKeys(acts);
	}
	
	@FindBy(how=How.XPATH,using="(//select[contains(@name,'indian_acts')])[2]")
	@CacheLookup
	WebElement txtActs1;
	
	public void Acts1(String acts) {
		txtActs1.sendKeys(acts);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Multiple sections then put commas in between ']")
	@CacheLookup
	WebElement txtSections;
	
	public void Sections(String sections) {
		txtSections.sendKeys(sections);
	}
	
	

	@FindBy(how=How.XPATH,using="(//input[contains(@placeholder,'Multiple sections then put commas in between')])[2]")
	@CacheLookup
	WebElement txtSections1;
	
	public void Sections1(String sections1) {
		txtSections1.sendKeys(sections1);
	}
	
	
	
	@FindBy(how=How.XPATH,using="//select[@name='role_of_accused']")
	@CacheLookup
	WebElement txtRoleOfAccused;
	
	public void RoleOfAccused(String roleofaccused) {
		txtRoleOfAccused.sendKeys(roleofaccused);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter circumstances of arrest']")
	@CacheLookup
	WebElement txtCircumstancesOfArrest;
	
	public void CircumstancesOfArrest(String circumstancesofarrest) {
		txtCircumstancesOfArrest.sendKeys(circumstancesofarrest);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtRemark;
	public void Remark(String remark) {
		txtRemark.sendKeys(remark);
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnSubmit;
	public void Submit() {
		btnSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Add New Acts']")
	@CacheLookup
	WebElement btnAddNewActs;
	
	public void AddNewActs() {
		btnAddNewActs.click();
	}
	
	@FindBy(how=How.XPATH,using="(//*[name()='svg'][@class='MuiSvgIcon-root MuiSvgIcon-fontSizeMedium css-i4bv87-MuiSvgIcon-root'])[38]")
	@CacheLookup
	WebElement btnCross;
	
	public void Cross() {
		btnCross.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Update']")
	@CacheLookup
	WebElement btnUpdate;
	
	public void Update() {
		btnUpdate.click();
	}
	
	@FindBy(how=How.XPATH,using="//p[normalize-space()='Add New Arrest']")
	@CacheLookup
	WebElement btnAddNewArrest;
	
	public void AddNewArrest() {
		btnAddNewArrest.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Seizure made from accussed in this arrest']")
	@CacheLookup
	WebElement btnSeizuremadeForm;
	
	public void SeizuremadeFrom() {
		btnSeizuremadeForm.click();
	}
	
	
//========SeizuremadeForm==========
	
	@FindBy(how=How.XPATH,using="//select[@name='seizure_type']")
	@CacheLookup
	WebElement txtSeizureType;
	
	public void SeizureType(String seizuretype) {
		txtSeizureType.sendKeys(seizuretype);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter vehicle class eg. (SUV, SEDAN, BIKE)']")
	@CacheLookup
	WebElement txtVehicleclass;
	
	public void Vehicleclass(String vehicleclass) {
		txtVehicleclass.sendKeys(vehicleclass);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Vehicle color']")
	@CacheLookup
	WebElement txtVehicleColor;
	
	public void VehicleColor(String vehiclecolor) {
		txtVehicleColor.sendKeys(vehiclecolor);
	}
	
	
	@FindBy(how=How.XPATH,using="//select[@name='vehicle_type']")
	@CacheLookup
	WebElement txtTypeOfVehicle;
	
	public void TypeOfVehicle(String typeofvehicle) {
		txtTypeOfVehicle.sendKeys(typeofvehicle);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='vehicle_make']")
	@CacheLookup
	WebElement txtVehicle_Make;
	
	public void Vehicle_Make(String vehicle_make) {
		txtVehicle_Make.sendKeys(vehicle_make);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='vehicle_model']")
	@CacheLookup
	WebElement txtVehicle_Model;
	
	public void Vehicle_Model(String vehicle_model) {
		txtVehicle_Model.sendKeys(vehicle_model);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter name of EXPLOSIVE ']")
	@CacheLookup
	WebElement txtNameOfExplosive;
	
	public void NameOfSeizure(String nameofexplosive) {
		txtNameOfExplosive.sendKeys(nameofexplosive);
	}
	

	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter name of ARMS ']")
	@CacheLookup
	WebElement txtNameOfARMS;
	
	public void NameOfARMS(String nameofarms) {
		txtNameOfARMS.sendKeys(nameofarms);
	}
	

	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter name of DRUGS ']")
	@CacheLookup
	WebElement txtNameOfDRUGS;
	
	public void NameOfDRUGS(String nameofdrugs) {
		txtNameOfDRUGS.sendKeys(nameofdrugs);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter name of OTHER ']")
	@CacheLookup
	WebElement txtNameOfOther;
	
	public void NameOfOther(String nameofother) {
		txtNameOfOther.sendKeys(nameofother);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter quantity']")
	@CacheLookup
	WebElement txtQuantityOfSeizure;
	
	public void QuantityOfSeizure(String quantityofseizure) {
		txtQuantityOfSeizure.sendKeys(quantityofseizure);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='unit']")
	@CacheLookup
	WebElement txtUnitOfCount;
	
	public void UnitOfCount(String unitofcount) {
		txtUnitOfCount.sendKeys(unitofcount);
	}
	
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Value in rupees']")
	@CacheLookup
	WebElement txtValueOfRupees;
	
	public void ValueOfRupees(String valueofrupees) {
		txtValueOfRupees.sendKeys(valueofrupees);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtSeizureRemark;
	
	public void SeizureRemark(String seizureremark) {
		txtSeizureRemark.sendKeys(seizureremark);
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnSeizureMadeSubmit;
	
	public void SeizureMadeSubmit() {
		btnSeizureMadeSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody/tr/td[7]/button[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnSeizureEdit;
	
	public void SeizureEdit() {
		btnSeizureEdit.click();
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='Other1']")
	@CacheLookup
	WebElement btnOtherTypeOfVehicle;
	
	
	public void OtherTypeOfVehicle(String othertypeofvehicle) {
		btnOtherTypeOfVehicle.sendKeys(othertypeofvehicle);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='Other2']")
	@CacheLookup
	WebElement txtOtherVehicleMaker;
	
	public void OtherVehicleMaker(String othervehiclemaker) {
		txtOtherVehicleMaker.sendKeys(othervehiclemaker);
	}
	
	@FindBy(how=How.XPATH,using="//input[@name='Other3']")
	@CacheLookup
	WebElement txtOtherVehicleModel;
	
	public void OtherVehicleModel(String othervehiclemodel) {
		txtOtherVehicleModel.sendKeys(othervehiclemodel);
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Update']")
	@CacheLookup
	WebElement btnSeizureUpdate;
	
	public void SeizureUpdate() {
		btnSeizureUpdate.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Next Step']")
	@CacheLookup
	WebElement btnNext_Step;
	
	public void Next_Step() {
		btnNext_Step.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Surety for this arrest']")
	@CacheLookup
	WebElement btnSuretyForm;
	
	public void SuretyForm() {
		btnSuretyForm.click();
	}
	
//	======== Surety Form======
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Name']")
	@CacheLookup
	WebElement txtSuretyName;
	
	public void SuretyName(String suretyname) {
		txtSuretyName.sendKeys(suretyname);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='contact_type']")
	@CacheLookup
	WebElement txtContact_Type;
	
	public void Contact_Type(String contacttype) {
		txtContact_Type.sendKeys(contacttype);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='country_code']")
	@CacheLookup
	WebElement txtCountry_Code;
	
	public void Country_Code(String countrycode ) {
		txtCountry_Code.sendKeys(countrycode);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Phone number']")
	@CacheLookup
	WebElement txtPhone_Number;
	
	public void Phone_Number(String phonenumber ) {
		txtPhone_Number.sendKeys(phonenumber);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter house number']")
	@CacheLookup
	WebElement txtHouse_Number;
	
	public void House_Number(String housenumber) {
		txtHouse_Number.sendKeys(housenumber);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Flat/Building/Apartment/Landmark']")
	@CacheLookup
	WebElement txtApartment_Name;
	
	public void Apartment_Name(String apartmentname) {
		txtApartment_Name.sendKeys(apartmentname);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter lane']")
	@CacheLookup
	WebElement txtLane_Name;
	
	public void Lane_Name(String lanename) {
		txtLane_Name.sendKeys(lanename);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter city']")
	@CacheLookup
	WebElement txtCity_Name;
	
	public void City_Name(String cityname) {
		txtCity_Name.sendKeys(cityname);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='country']")
	@CacheLookup
	WebElement txtCountry_Name;
	
	public void Country_Name(String countryname) {
		txtCountry_Name.sendKeys(countryname);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='state']")
	@CacheLookup
	WebElement txtState_Name;
	
	public void State_Name(String statename) {
		txtState_Name.sendKeys(statename);
	}
	
	@FindBy(how=How.XPATH,using="//select[@name='district']")
	@CacheLookup
	WebElement txtDistrict_Name;
	
	public void District_Name(String districtname) {
		txtDistrict_Name.sendKeys(districtname);
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnSurety_Submit;
	
	public void Surety_Submit() {
		btnSurety_Submit.click();
	}
	
	@FindBy(how=How.XPATH,using="(//*[name()='path'])[46]")
	@CacheLookup
	WebElement btnEdit_Form;
	
	public void Edit_Form() {
		btnEdit_Form.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Update']")
	@CacheLookup
	WebElement Update_button;
	
	public void Update_button() {
		Update_button.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement Next_Page;
	
	public void Next_Page() {
		Next_Page.click();
	}

}
