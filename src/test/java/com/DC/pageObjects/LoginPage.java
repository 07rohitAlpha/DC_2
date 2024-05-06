package com.DC.pageObjects;

import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;

public class LoginPage {
 
	WebDriver ldriver;
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	

	
//	@FindBy(xpath="//select[@name='department_name']")
//	@CacheLookup
//	WebElement txtSelect;
	
	@FindBy(xpath="//input[@placeholder='Email Address']")
	@CacheLookup
	WebElement txtUserName;
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	@FindBy(xpath="//input[@placeholder='Password']")
	@CacheLookup
	WebElement txtPassword;
	
	public void setPassword(String password) {
		txtPassword.sendKeys(password);
	}
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	@CacheLookup
	WebElement txtlogin;
	
	public void clickLogin() {
		txtlogin.click();
	}
	
	@FindBy(xpath="")
	@CacheLookup
	WebElement txtLogout;
	
	public void clickLogout() {
		txtLogout.click();
	}
	
//	public void selectDepartment(String selctdpt) {
//		txtSelect.sendKeys(selctdpt);
//	}
	
		
	
	public String getTitle()
		{
			return ldriver.getTitle();
		}
	
	//Capture logo image
	public void captureLogoImage() throws IOException
		{
				
		WebDriver driver = null;
		Collection<WebElement> logo = null;
//		Screenshot logoImageScreenshot=new AShot().takeScreenshot(driver,logo);
				
//		ImageIO.write(logoImageScreenshot.getImage(), "png", new File("D://selenium logo/logo.png"));
	
	

}
}
