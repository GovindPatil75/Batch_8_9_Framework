package com.Test;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class Test_1 extends BaseClass {
	
	@Test
	public void verifyTest_1() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_SendKeys(login.getTxt_emaiid(), excel.getStringData("Login", 0, 0),"EmailId");
		Library.custom_SendKeys(login.getTxt_password(), excel.getStringData("Login", 0, 1),"Password");
		
		Library.custom_click(login.getBtn_login(),"Login Button");
		
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook – log in or sign up";
		// verify
		Assert.assertEquals(actualtitle, expectedtitle);
		
		System.out.println(System.getProperty("user.dir"));
		
	}

	@Test
	public void verifyTest_2() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		Library.custom_SendKeys(login.getTxt_emaiid(), excel.getStringData("Login", 0, 0),"Email Id");
		Library.custom_SendKeys(login.getTxt_password(), excel.getStringData("Login", 0, 1),"Password");
		
		Library.custom_click(login.getBtn_login(),"Login Button");
	
		String actualtitle=driver.getTitle();
		String expectedtitle="Facebook – log in or sign up";
		// verify
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}
}
