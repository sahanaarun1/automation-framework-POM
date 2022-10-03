package com.firebase.test.tests;

import java.io.IOException;
import java.util.List;
import java.util.Properties;
//import org.bouncycastle.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By.ByCssSelector;

	import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.firebase.test.Utility.CommonUtilities;
import com.firebase.test.base.BaseTest;
import com.firebase.test.pages.home.HomePage;
import com.firebase.test.pages.login.LoginPage;





public class AutomationScripts extends BaseTest{
	
	public static void WithoutPassword() throws IOException{
		
			CommonUtilities CU=new CommonUtilities();
			Properties applicationPropertiesFile=CU.loadFile("applicationproperties");
			String url=CU.getApplicationProperty("url", applicationPropertiesFile);
			String usrname=CU.getApplicationProperty("username", applicationPropertiesFile);
			LoginPage login5=new LoginPage(driver);
			login5.withoutpassword(usrname);
		
		
		
				
	}
	
	@Test
	
	public static void ValidCredentials() throws IOException, InterruptedException
	{
		CommonUtilities CU=new CommonUtilities();
		Properties applicationPropertiesFile=CU.loadFile("applicationproperties");
			String url=CU.getApplicationProperty("url", applicationPropertiesFile);
			String usrname=CU.getApplicationProperty("username", applicationPropertiesFile);
			String password=CU.getApplicationProperty("password", applicationPropertiesFile);		
		LoginPage login=new LoginPage(driver);
		login.login(usrname, password);
		
	}
	
	public static void ForgetPassword() throws InterruptedException, IOException
	{
		CommonUtilities CU=new CommonUtilities();
		Properties applicationPropertiesFile=CU.loadFile("applicationproperties");
			String url=CU.getApplicationProperty("url", applicationPropertiesFile);
			String usrname=CU.getApplicationProperty("username", applicationPropertiesFile);
			LoginPage login1=new LoginPage(driver);
			
			login1.forgotpass(usrname);
			
	}
	
	@Test
	
	public static void InvalidCredentials() throws IOException
	{
		CommonUtilities CU=new CommonUtilities();
		Properties applicationPropertiesFile=CU.loadFile("applicationproperties");
			String url=CU.getApplicationProperty("url", applicationPropertiesFile);
			String Iusrname=CU.getApplicationProperty("InValidUserName", applicationPropertiesFile);
			String Ipassword=CU.getApplicationProperty("InvalidPassword", applicationPropertiesFile);
			LoginPage login2=new LoginPage(driver);
			login2.invalidlogin(Iusrname, Ipassword);
			
			

	}

	//3rd Remember me check box test case
	
	@Test
	
	public static void RememberMeCheckBox() throws InterruptedException, IOException
	{
		
			CommonUtilities CU=new CommonUtilities();
			Properties applicationPropertiesFile=CU.loadFile("applicationproperties");
			String url=CU.getApplicationProperty("url", applicationPropertiesFile);
			String usrname=CU.getApplicationProperty("username", applicationPropertiesFile);
			String password=CU.getApplicationProperty("password", applicationPropertiesFile);		
			LoginPage login3=new LoginPage(driver);
			HomePage home = new HomePage(driver);
			
			login3.loginwithrememberme(usrname, password);
			home.UsermenuAndLogout();
		
		
		
	}
	

	
	public static void TC05SelectUserMenu() throws InterruptedException, IOException
	
	{
		ValidCredentials();
		HomePage home2= new HomePage(driver);
		home2.UserMenuDis();

	
	}
	
	
	
	
	}  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

