package com.DC.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	 Properties pro;
	 
	 public ReadConfig() {
		
		 File src = new File("C:\\Users\\User\\eclipse-workspace\\DC\\Configuration\\config.properties");
		 
		 try {
			 FileInputStream fis = new FileInputStream(src);
			 pro = new Properties();
			 pro.load(fis);
			 
		 }catch (Exception e){
			 System.out.println("Exception is "+e.getMessage());
			 
		 }
	 }	
	 
	 
	 public String getApplicationURL() {
		String url= pro.getProperty("baseURL");
		return url;
	 }
	 
	 
	 
	 public String getUsername() {
		 String username= pro.getProperty("username");
		 return username;
	 }
	 
	 
	 public String getPassword() {
		 String password = pro.getProperty("password");
		 return password;
	 }
	 
	 public String getChromePath() {
		 String chromepath = pro.getProperty("chromepath");
		 return chromepath;
	 }
	 
	 public String getRank() {
		 String rank = pro.getProperty("rank");
				 return rank;
	 }
	 
	 public String getName() {
		 String name = pro.getProperty("name");
		 return name;
	 }
	 
	 public String getEntmob() {
		 String entmob = pro.getProperty("entmob");
		 return entmob;
	 }
	 public  String getPhone() {
	 String phone = pro.getProperty("phone");
	 return phone;
   }
	 
	 public String getOtp() {
		 String otp = pro.getProperty("otp");
		 return otp ;
	 }

}
