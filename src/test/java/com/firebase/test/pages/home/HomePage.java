package com.firebase.test.pages.home;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.firebase.test.pages.base.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(className="menuButtonLabel")
	static WebElement usermenu;
	
	@FindBy(linkText="Logout")
	static WebElement Logout;
	
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	public void UserMenuDis() {
		clickElement(usermenu, "usermenu display");
	}

	public static void UsermenuAndLogout()
	{
		//waitUntilVisible(c,"user menu list");
		clickElement(usermenu,"usermenu");
		clickElement(Logout,"Logout");
		
	}
	
}


