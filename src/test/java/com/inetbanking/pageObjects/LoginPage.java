package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	//Here we creates a constructor
	
	public LoginPage(WebDriver rdriver){ 	
		ldriver = rdriver;                       //Initiating drivers
		PageFactory.initElements(rdriver, this);		
	}
	
	//Locating/Identifying page elements
	
	@FindBy(name="uid")
	@CacheLookup                            //Locating userName text field.
	WebElement textUserName;
	
	@FindBy(name="password")
	@CacheLookup                            //Locating user Password Field.
	WebElement txtPassword;

	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnLogin;
	
	public void setUserName(String uname) {
		textUserName.sendKeys(uname);        //Sending user name in user-name text field  
	}
	
	public void setPassword(String pwd) {
		txtPassword.sendKeys(pwd);           //Sending password in password field
	}

    public void clickSubmit() {
    	btnLogin.click();                    //Action to click login button
    }
}
