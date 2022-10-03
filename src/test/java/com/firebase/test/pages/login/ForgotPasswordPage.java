package com.firebase.test.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.firebase.test.pages.base.BasePage;

public class ForgotPasswordPage extends BasePage {
	
	@FindBy(xpath="//*[@id=\"un\"]")
	 WebElement username;
	@FindBy(id="continue")
	 WebElement Continue;
	public ForgotPasswordPage(WebDriver driver)
	{
		super(driver);
	}
	public  void forgotpassword(String usrname)
	{
		
		enterText(username, usrname, "username");	
		clickElement(Continue,"Continue button");
		
	}
	
}
