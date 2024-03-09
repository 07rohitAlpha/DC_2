package com.delhi_crime_pra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;




public class DC_Test {
		
		WebDriver driver ;
		WebElement select,Box,comp,subj,text, fileupload ,rb ;
		
		//WebElement comp = //input[@placeholder='To'];
		//List<WebElement> elements = driver.findElements(By.xpath("//input[@placeholder='To']"));
	
	     public void login() throws InterruptedException {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\com.BData\\Driver\\chromedriver.exe");
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			driver.manage().window().maximize();
			Thread.sleep(1000);

	}    
	     public void launchapplication() {
	    	 driver.get("http://14.140.15.91:82/");
	    	 boolean img = driver.findElement(By.xpath("/static/media/logo.6ab7c76374cc106cdd65.png")).isDisplayed();
	    
	    	 
	     }

}
