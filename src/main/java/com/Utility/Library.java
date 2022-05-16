package com.Utility;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_SendKeys(WebElement element,String value,String fieldname) {
		
		try {
			element.sendKeys(value);
			test.log(Status.PASS, fieldname +"Value succefully Send ="+value);
			
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}

	public static void custom_click(WebElement element,String fieldname) {
		try {
			element.click();
			test.log(Status.PASS, "click sucefully ="+fieldname);
		}catch(Exception e) {
			test.log(Status.FAIL, e.getMessage());
		
		}
	}
	
	public static void verifybrokenlink(String url1) throws IOException {
		
		URL url=new URL(url1);
		HttpURLConnection httpurl=(HttpURLConnection) url.openConnection();
		httpurl.setConnectTimeout(4000);
		httpurl.connect();
		
		if(httpurl.getResponseCode()==200) {
			test.log(Status.PASS, url+"=="+httpurl.getResponseMessage());
		}else {
			test.log(Status.FAIL, "Link broken");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
