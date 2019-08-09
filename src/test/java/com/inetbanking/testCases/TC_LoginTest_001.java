package com.inetbanking.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	
	@Test
	public void loginTest() throws InterruptedException{
	
		driver.get(baseURL);
		//Adding log messages
		logger.info("Opening URL");
		LoginPage lp=new LoginPage(driver);;
		lp.setUserName(username); 
		logger.info("Enter UserName");
		lp.setPassword(password);
		logger.info("Enter Password");
		Thread.sleep(3000);
		lp.clickSubmit();

		
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
			logger.info("Login Sucessfully");
		}else {
			Assert.assertTrue(false);
			logger.info("Login Failed");
		}
	}

}
