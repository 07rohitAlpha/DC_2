package com.DC.testCase;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.DC.pageObjects.EducationPage;
import com.DC.pageObjects.InterrogeeDetailsPage;
import com.DC.pageObjects.LoginPage;
import com.DC.pageObjects.PermanentAddressPage;
import com.DC.pageObjects.PresentAddressPage;
import com.DC.pageObjects.UserInfoPage;

public class Education extends BaseClass{

	//=======================Login====================
			@Test(priority=1)
			public void loginTest() throws InterruptedException, AWTException, IOException {
				LoginPage lp = new LoginPage(driver);
				lp.setUserName(username);
				lp.setPassword(password);
				lp.clickLogin();
				Thread.sleep(2000);
			}
	//================UserInfomation============================	
				@Test(priority=2)
				public void UserTest() throws InterruptedException, IOException {
				UserInfoPage uip = new UserInfoPage(driver);
				
				uip.setRank("INSPECTOR");
				uip.setName("Ajit");
				uip.setEntmob("9999999999");
				uip.clickCheckbox();
				Thread.sleep(2000);
				uip.setPhone("8950776471");
				uip.setPwrd("qwerty123321");
				uip.clickSubmit();
			    Thread.sleep(2000);
				}
	//================InterrogeeDeatils Form====================
				@Test(priority=3)
				public void IntoTest() throws InterruptedException, AWTException, IOException {
			       
				
		        InterrogeeDetailsPage idp = new InterrogeeDetailsPage(driver);
				
				idp.setFName("Virat");
//				logger.info("Entered Name");
				Thread.sleep(1000);
				
				idp.setParentage("Karma");
//				logger.info("Entered parentage");
				Thread.sleep(1000);
				
				idp.setGender("Male");
//				logger.info("Entered Gender");
				Thread.sleep(1000);
				
				idp.setAlias("qwertqwe");
//				logger.info("Entered Alias");
				Thread.sleep(1000);
				
				idp.setDOB("01-01-2020");
//				logger.info("Entered DOB");
				Thread.sleep(1000);
				
				idp.setAge("2");
//				logger.info("Entered Age");  
				Thread.sleep(1000);
				
				idp.BirthPlace("Delhi");
//				logger.info("Entered BirthPlace");
				Thread.sleep(1000);
				
				idp.DossierNo("123456789");
//				logger.info("Entered tribe");
				Thread.sleep(1000);
				
				idp.Tribe("Yes");
//				logger.info("Entered Tribe");
				Thread.sleep(1000);
				
				idp.Marital("MARRIED");
//				logger.info("Entered Martial");
				Thread.sleep(1000);
				
				idp.FingerPrNo("12ABC");
//				logger.info("Entered FingerPrNo");
				Thread.sleep(1000);
				
				idp.Religion("HINDU");
//				logger.info("Entered Religion");
				Thread.sleep(1000);
				
				idp.Caste("BRAHMIN");
//				logger.info("Entered Caste");
				Thread.sleep(1000);
				
				idp.Sect("SHAKTISM");
//				logger.info("Entered Sect");
				Thread.sleep(1000);
				
				idp.Nationality("INDIA");
//				logger.info("Entered Nationality");
				Thread.sleep(1000);
				
				idp.Identification("CUT MARK oN LRFT HAND WRIST");
//				logger.info("Entered Identification Mark");
				Thread.sleep(1000);
				
				idp.Occupation("KJGF");
//				logger.info("Entered Occupation");
				Thread.sleep(3000);
				
				idp.NatureOfCrime("Gangster");
//				logger.info("Entered NatureOdCrime");
				Thread.sleep(1000);
				
				idp.Gangster();
//				logger.info("select gangster");
				Thread.sleep(1000);
				
				idp.Narcotics();
//				logger.info("select Narcotics");
				Thread.sleep(1000);
				
				
				idp.Terrorist();
//				logger.info("select Terrorist");
				Thread.sleep(1000);
				
				idp.Dfdf();
//				logger.info("select Dfdf");
				Thread.sleep(1000);
				
				idp.uncheck4();
//				logger.info("uncheck");
				Thread.sleep(3000);
				
				
				
				idp.CriminalExpertise("Consumer");
//				logger.info("Entered CriminalExpertise");
				Thread.sleep(1000);
				
				idp.Consumer();
//				logger.info("select consumer");
				Thread.sleep(1000);
				
				idp.Carrier();
//				logger.info("select Carrier");
				Thread.sleep(1000);
				
				idp.Destination();
//				logger.info("select destination");
				Thread.sleep(1000);
				
				idp.Financer();
//				logger.info("select financer");
				Thread.sleep(1000);
				
				idp.uncheck7();
//				logger.info("uncheck the Financer ");
				Thread.sleep(4000);
				
				WebElement Frontbutton =driver.findElement(By.xpath("(//input[@name='frontimagesAttachment'])[1]"));
				JavascriptExecutor FrontSidePhoto = (JavascriptExecutor)driver;
				FrontSidePhoto.executeScript("arguments[0].click();" ,Frontbutton );
				
				// creating object of robot class
				Robot fb = new Robot();
				Thread.sleep(5000);
				
				// Simulate the keypress of the TAB key to move the focus to the file input element
				fb.keyPress(KeyEvent.VK_TAB);
				fb.keyRelease(KeyEvent.VK_TAB);
				
				// Simulate the keypress of the ENTER key to open the file upload dialog box
				fb.keyPress(KeyEvent.VK_ENTER);
				fb.keyRelease(KeyEvent.VK_ENTER);
				
				StringSelection Frontphoto= new StringSelection("C:\\Users\\User\\OneDrive\\Desktop\\photos1\\pho");
				Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Frontphoto, null);
				
				// press Contol+V for pasting
			    fb.keyPress(KeyEvent.VK_CONTROL);
			    fb.keyPress(KeyEvent.VK_V);
			   
			    
			    // release Contol+V for pasting
			    fb.keyRelease(KeyEvent.VK_CONTROL);
			    fb.keyRelease(KeyEvent.VK_V);
			    
			    // for pressing and releasing Enter
				fb.keyPress(KeyEvent.VK_ENTER);
				fb.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(4000);	
				
				
				idp.clickSubmit();
//				logger.info("Submit The Form");
				Thread.sleep(5000);
				}	
				
//==================Present Address===================
				
		   @Test(priority=4)
		   public void PresentTest() throws InterruptedException, IOException{
		   PresentAddressPage pap = new PresentAddressPage(driver);
											
			pap.setAddresstype("OWN PROPERTY");
//			logger.info("Select present address type");
			Thread.sleep(1000);
							
			pap.setFromDate("01-01-2010");
//			logger.info("Select the From Date");
			Thread.sleep(1000);
							
			pap.setToDate("11-11-2020");
//			logger.info("Select the To Date");
			Thread.sleep(1000);
							
			pap.setPresentRemark("this address is valid");
//			logger.info("Please the remark ");
			Thread.sleep(1000);
							
			pap.ClickOwnSubmit();
//			logger.info("please submit the Present submit");
			Thread.sleep(6000);
						
				
//=======================Own Property================
				
			pap.setOwnHouseNo("1019");
//			logger.info("please enter the house no");
			Thread.sleep(2000);
				
			pap.setOwnFlatName("Raman kumar");
//			logger.info("please enter the FlatName");
			Thread.sleep(2000);
				
			pap.setOwnLane("Krishna");
//			logger.info("please enter the lane");
			Thread.sleep(2000);
				
			pap.setCountry("INDIA");
//			logger.info("please enter the countty name");
			Thread.sleep(2000);
				
			pap.setState("GOA");
//			logger.info("Please enter the state name ");
			Thread.sleep(2000);
				
			pap.setDistrict("NORTH GOA");
//			logger.info("Please enter the district name");
			Thread.sleep(2000);
				
			pap.setPinCode("114565");
//			logger.info("Please enter the Pincode");
			Thread.sleep(4000);
				
			pap.clickOwnDetailsSubmit();
//			logger.info("Please Submit the form ");
			Thread.sleep(4000);
				
			pap.clickNextPage();
//			logger.info("Please click to NextPage");
			Thread.sleep(4000);
			
			
		   }
  //=============================PermanentAddress========================
		    @Test(priority=5)	
			public void PermanentAddressTest() throws InterruptedException, IOException{
			PermanentAddressPage pAp= new PermanentAddressPage(driver);
				
			pAp.setHouseNumber("F-235");
//			logger.info("Please enter the Hosue number");
		    Thread.sleep(2000);
				
			pAp.setApartmentName("Krishna Market");
//			logger.info("Please enter the Apartment name");
			Thread.sleep(2000);
				
			pAp.setLaneName("MGRoad");
//			logger.info("Please enter the LaneName");
			Thread.sleep(2000);
				
			pAp.setCityName("GURUGRAM");
//			logger.info("Please enter the City Name");
			Thread.sleep(2000);
				
			pAp.setCountryName("INDIA");
//			logger.info("Please enter the CountryName");
			Thread.sleep(2000);
				
			pAp.setStateName("DELHI");
//			logger.info("Please enter the StateName");
			Thread.sleep(2000);
				
			pAp.setDistrictName("CENTRAL");
//			logger.info("Please Enter the District Name");
			Thread.sleep(2000);
				
			pAp.setPoliceStation("ANAND PARBAT");
//			logger.info("Please Enter the District Name");
			Thread.sleep(2000);
				
			pAp.setPinCode("110034");
//			logger.info("Please Enter the PinCode");
			Thread.sleep(2000);
				
			pAp.clickPermanentSubmit();
//			logger.info("Please click the Subimt button");
			Thread.sleep(2000);
				
			pAp.clickPermanentNextPage();
//			logger.info("Please click the NextButton");
			Thread.sleep(5000);
		    }
//===================Education================================
		    @Test(priority=6)
			public void EducationTest()throws InterruptedException, IOException{
			EducationPage ep= new EducationPage(driver);
				
			ep.setInstituteType("COLLEGE");
//			logger.info("Please select the insitute type");
			Thread.sleep(2000);
			
			ep.setEducation("Bachelor of Education");
//			logger.info("Please enter the Education name");
			Thread.sleep(2000);
			
			ep.setInstituteName("DU");
//			logger.info("Please enter the insitute name");
			Thread.sleep(2000);
			
			ep.setPassingYear("2010");
//			logger.info("Please enter the passing year");
			Thread.sleep(2000);
			
			ep.setEducationHouseNumber("599");
//			logger.info("Please enter the Education House number");
			Thread.sleep(2000);
			
			
			ep.setEducationLandmark("MG Road");
//			logger.info("Please enter the Landmark");
			Thread.sleep(2000);
			
			
			ep.setEducationLane("Krishan");
//			logger.info("Please enter the lane");
			Thread.sleep(2000);
			
			ep.setEducationCity("GURUGRAM");
//			logger.info("Please enter the City name");
			Thread.sleep(2000);
			
			ep.setEducationCountry("INDIA");
//			logger.info("Please enter the Country");
			Thread.sleep(2000);
			
			ep.setEducationState("DELHI");
//			logger.info("Please enter the State");
			Thread.sleep(2000);
			
			ep.setEducationDistrict("CENTER");
//			logger.info("Please enter the District");
			Thread.sleep(2000);
			
			ep.setEducationPoliceStation("ANAND PARBAT");
//			logger.info("Please enter the policestation name");
			Thread.sleep(2000);
			
			ep.setEducationRemark("Education address is valid ");
//			logger.info("Please enter the Remark");
			Thread.sleep(2000);
			
			ep.setEducationSubmit();
//			logger.info("Please Submit the Education Form");
			Thread.sleep(3000);
			
//=========================Resident During Studies===================	
			ep.setResidentFromDate("01-05-2020");
//			logger.info("Please enter the From date");
			Thread.sleep(2000);
			
			ep.setResidentToDate("04-08-2023");
//			logger.info("Please enter the To Date");
			Thread.sleep(2000);
			
			ep.setResidentHouseNo("F-1404");
//			logger.info("Please enter the House number ");
			Thread.sleep(2000);
			
			ep.setResidentFlat("Cambridge ");
//			logger.info("Please enter the Flat name");
			Thread.sleep(2000);
			
			ep.setResidentLane("Cambridge Tower Noida");
//			logger.info("Please enter the lane name");
			Thread.sleep(2000);
			
			ep.setResidentCity("Delhi");
//			logger.info("Please enter the City name");
			Thread.sleep(2000);
			
			ep.setResidentCountry("INDIA");
//			logger.info("Please enter the Country");
			Thread.sleep(2000);
			
			ep.setResidentState("DELHI");
//			logger.info("Please enter the state name");
			Thread.sleep(2000);
			
			ep.setResidentDistrict("CENTRAL");
//			logger.info("Please enter the District name");
			Thread.sleep(2000);
			
			ep.setResidentPoliceStation("DBG ROAD");
//			logger.info("Please enter the policestation");
			Thread.sleep(2000);
			
			ep.setResidentRemark("resident dusring the studies");
//			logger.info("Please fill the remark ");
			Thread.sleep(2000);
			
			ep.ClickResidentSubmit();
//			logger.info("Please enter the submit button");
			Thread.sleep(2000);  
			
			ep.ClickEducationNextbutton();
//			logger.info("Please click to nextpage button");
			Thread.sleep(4000);
			
			}
}
