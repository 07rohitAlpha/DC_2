package com.DC.testCase;



import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.Logger;
//import org.apache.log4j.Logger;
//import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.DC.utilities.ReadConfig;
import com.DC.utilities.XLUtils;


public class BaseClass {
	
	
	ReadConfig readconfig = new ReadConfig();
	public String baseURL = readconfig.getApplicationURL(); 
	public String username=readconfig.getUsername();
	public String password =readconfig.getPassword();
	public static WebDriver driver;
	public static Logger logger;
	public static ThreadLocal<WebDriver> tdriver = new ThreadLocal<WebDriver>();
	public String rank= readconfig.getRank();
	public String name= readconfig.getName();
	public String entmob = readconfig.getEntmob();
	public String phone= readconfig.getPhone();
	public String otp = readconfig.getOtp();
	public String fname = "raman";
	public String parentage = "ram";
	public String gender = "Male";
	public String alias = "";
	public String dob = "01-01-2000";
	public String age = "23";
	public String birthplace = "xyz";
	public String dossierno = "123456789";
	public String tribe = "yes";
	public String marital = "Single";
	public String fingerprno = "11122233";
	public String religion = "Hindu";
	public String caste = "Brahmin";
	public String sect = "shaktism";
	public String nationality = "INDIA";
	public String identification = "abc";
	public String occupation = "AAA";
	public String natureofcrime = "Gangster";
	public String criminalexpertise= "Carrier";
	private Object PropertyConfigurator;

		
		
	
	
	//public static Logger logger; 
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) {
		
		String browserName = "chrome";
		if(browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equals("firefox")) {
			driver = new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			driver = new EdgeDriver();
		}
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--disable-web-security");
		options.addArguments("--no-proxy-server");

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("credentials_enable_service", false);
		prefs.put("profile.password_manager_enabled", false);

		options.setExperimentalOption("prefs", prefs);
		
		
//		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//		driver = new ChromeDriver(capabilities);
		
		
		
		
//			logger = Logger.getLogger("DC");
//			PropertyConfigurator.configure("Log4j2.properties");
		
		
		
		
		
		if(br.equals("chrome")) {
		System.setProperty("Webdriver.chrome.driver",readconfig.getChromePath());
//		System.setProperty("Webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--remote-allow-origins=*");
		tdriver.set(driver);
		driver = new ChromeDriver(co);
		driver.manage().window().maximize(); 
		driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(XLUtils.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(java.time.Duration.ofSeconds(XLUtils.PAGE_WAIT_TIME));
		
		


		}
		driver.get(baseURL);
	}

	@AfterClass
	public  void tearDown() {
	//	driver.quit();
	} 
	
	
	public  void captureScreen(WebDriver driver , String  tname) throws  IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir") +"/Screenshots/" + tname + ".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshots taken");
	}
	
	
	public String randomestring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return(generatedstring);
	}
	
	public static String randomeNum() {
		String generatedString2 = RandomStringUtils.randomNumeric(4);
		return(generatedString2);
	}

	public static synchronized WebDriver getDriver() {
		return tdriver.get();
	}

	public void initiaze_driver() {
		
		
	}

	
			
	}
	
	

	
	
 
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	

