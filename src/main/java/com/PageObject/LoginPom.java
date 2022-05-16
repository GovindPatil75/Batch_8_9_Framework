package com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

	@FindBy(how=How.XPATH,using="//input[@id='emai']")
	private WebElement txt_emaiid;
	@FindBy(how=How.XPATH,using="//input[@id='pass']")
	private WebElement txt_password;
	@FindBy(how=How.XPATH,using="//button[@name='login']")
	private WebElement btn_login;
	
	public WebElement getTxt_emaiid() {
		return txt_emaiid;
	}
	
	public WebElement getTxt_password() {
		return txt_password;
	}
	
	public WebElement getBtn_login() {
		return btn_login;
	}

}
