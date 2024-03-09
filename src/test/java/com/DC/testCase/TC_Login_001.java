package com.DC.testCase;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.DC.pageObjects.LoginPage;

 
public class TC_Login_001 extends BaseClass {

	@Test()
	public void loginTest() throws InterruptedException, IOException {
	
		
		logger.info("URL is opened");
		
        String ExpetedTitle= "localhost:3000";
		LoginPage lp = new LoginPage(driver);
		String ActualTitle= lp.getTitle();
		System.out.println(ActualTitle);
		Thread.sleep(2000);

		
//	    lp.selectDepartment(selectdpt);
	    
		Thread.sleep(2000);
		lp.setUserName(username);
//		logger.info("Entered username");
		Thread.sleep(2000);
		lp.setPassword(password);
//		logger.info("Entered password");
		Thread.sleep(1000);
		lp.clickLogin();
		Thread.sleep(2000);
		
		try {
		if (driver.getTitle().equals("http://localhost:3001/")) {
				Assert.assertTrue(true);
//			logger.info("Login test passed");
		}
		}catch(Exception e) {
			e.printStackTrace();
			
			captureScreen(driver ,"loginTest");
			Assert.assertTrue(false);
//			logger.info("Login test failed");
		}
		
//		lp.setRank(rank);
//		Thread.sleep(1000);
//		lp.setName(name);
//		Thread.sleep(1000);
//		lp.setEntmob(entmob);
//		Thread.sleep(1000);
//		lp.clickCheckbox();
//		Thread.sleep(1000);
//		lp.setPhone(phone);
//		Thread.sleep(1000);


	}	
}
