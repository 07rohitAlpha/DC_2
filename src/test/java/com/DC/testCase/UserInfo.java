package com.DC.testCase;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import com.DC.pageObjects.LoginPage;
import com.DC.pageObjects.UserInfoPage;

import junit.framework.Assert;

public class UserInfo extends BaseClass  {
	
    private String pwrd;
    public static org.apache.logging.log4j.Logger log;

	@Test
	public void UserTest() throws InterruptedException, IOException {
    	
    	log = LogManager.getLogger(UserInfo.class);
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		lp.clickLogin();
		Thread.sleep(2000);
		
		
		UserInfoPage uip = new UserInfoPage(driver);
		
		
		
		
		uip.setRank("INSPECTOR");
 		log.info("Select Rank");
		Thread.sleep(2000);
		
		uip.setName("Ajit");
		log.info("Entered Name");
		Thread.sleep(2000);
		
		uip.setEntmob("9999999999");
		log.info("Entered Mobile Number");
		Thread.sleep(2000);
		
		uip.clickCheckbox();
		log.info("click to checkbox");
		Thread.sleep(2000);
		
		uip.setPhone("8950776471");
		log.info("Entered Phone number");
		Thread.sleep(2000);
		
		uip.clickGenerateOtp();
		log.info("click to generate OTP button");
		Thread.sleep(5000);
		
		uip.setPwrd("123456");
     	log.info("Entered Password ");
		Thread.sleep(2000);
		
		uip.clickSubmit();
		log.info("Submitted");
		Thread.sleep(3000);
		
		
		boolean res =driver.getPageSource().contains("http://localhost:3001/home/direction");
		if(res==true) {
		//org.testng.Assert.assertTrue(true);
			org.testng.Assert.assertTrue(true);
			Assert.assertTrue(true);
		}
		else {
			captureScreen(driver,"userinfo");
			Assert.assertTrue(false);
		}
		
		driver.close();
		

	}
//    DataProvider(name="User")
	
	
}
