package com.DC.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.DC.testCase.BaseClass;

public class DescriptionAndHabitsPage extends BaseClass {
	
	WebDriver ldriver;
	public DescriptionAndHabitsPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter types of Clothes/Brand']")
	@CacheLookup
	WebElement txtClothes;
	
	public void setClothes(String clothes) {
		txtClothes.sendKeys(clothes);
		
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter types of Footwear/Brand']")
	@CacheLookup
	WebElement txtFootwear;
	
	public void setFootwear(String footwear) {
		txtFootwear.sendKeys(footwear);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter drink']")
	@CacheLookup
	WebElement txtDrinking;
	
	public void setDrinking(String drinking) {
		txtDrinking.sendKeys(drinking);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter tobacco/cigarette']")
	@CacheLookup
	WebElement txtSmoking;
	
	public void setSmoking(String smoking) {
		txtSmoking.sendKeys(smoking);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter what drug he/she takes']")
	@CacheLookup
	WebElement txtDrug;
	
	public void setDrug(String drug) {
		txtDrug.sendKeys(drug);
	}
	
	@FindBy(how=How.XPATH,using="//input[@placeholder='Enter Area/Pimp he/she goes/contacts']")
	@CacheLookup
	WebElement txtProstitute;
	
	public void setProstitute(String prostitute) {
		txtProstitute.sendKeys(prostitute);
	}
	
	@FindBy(how=How.XPATH,using="//textarea[@placeholder='Remark']")
	@CacheLookup
	WebElement txtRemark;
	
	public void setRemark(String remark) {
		txtRemark.sendKeys(remark);
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='Submit']")
	@CacheLookup
	WebElement btnSubmit;
	
	public void clickSubmit() {
		btnSubmit.click();
	}
	
	@FindBy(how=How.XPATH,using="//tbody/tr[1]/td[8]/button[1]//*[name()='svg']")
	@CacheLookup
	WebElement btnEdit;
	
	public void clickEdit() {
		btnEdit.click();
	}
	
	@FindBy(how=How.XPATH,using="//button[normalize-space()='NEXT PAGE']")
	@CacheLookup
	WebElement btnNextButton;
	
	public void clickNextButton() {
		btnNextButton.click();
	}

	
	
}

