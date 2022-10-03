package com.firebase.test.pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.firebase.test.pages.login.ForgotPasswordPage;
import com.firebase.test.pages.base.BasePage;

public class LoginPage extends BasePage{
	
	@FindBy(id="username") WebElement username;
	@FindBy(id = "password") WebElement password;
	@FindBy(id = "Login") WebElement loginButton;
	@FindBy(id = "forgot_password_link") WebElement forgotpassword;
	@FindBy(id = "rememberUn") WebElement rememberme;
	
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
		}
		
	public void enterUserName(String usrname) {
		waitUntilVisible(username,"user name field");
		enterText(username, usrname, "username field");
		}
	public void enterPassword(String passWord)
	{
		
		enterText(password, passWord, "password field");
		
	}
	
	public void clickLoginButton() 
	{
		clickElement(loginButton,"login button");
	}
	
	public void enterInValidUserName(String Iusrname) {
		waitUntilVisible(username,"user name field");
		enterText(username, Iusrname, "InValidusername data");
		}
	public void enterInValidPassword(String Ipassword)
	{
		
		enterText(password, Ipassword, "password field");
		
	}
	
	
	public void login(String usrname,String passWrd)
	{
		enterUserName(usrname);
		enterPassword(passWrd);
		clickLoginButton();
	}
	
	public void invalidlogin(String Iusrname,String Ipassword)
	{
		enterUserName(Iusrname);
		enterPassword(Ipassword);
		clickLoginButton();
	}


	public void forgotpass(String usrname)
	{
		ForgotPasswordPage forgotpsspage=new  ForgotPasswordPage(driver);
		enterUserName(usrname);
		clickElement(forgotpassword,"forgotpassword link");
		waitUntilVisible(username,"user name field");
		forgotpsspage.forgotpassword(usrname);
		
	}
	public void clickRememberMe() 
	{
		clickElement(rememberme,"rememberme check");
	}

	public void loginwithrememberme(String usrname,String passWrd)
	{
		enterUserName(usrname);
		enterPassword(passWrd);
		clickRememberMe();
		clickLoginButton();
	}
	
	public void withoutpassword(String usrname)
	{
		enterUserName(usrname);
		clickLoginButton();
	}
}
