package com.inetbanking.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseURL="http://demo.guru99.com/v4/index.php";
    public String username="mngr214749";
    public String password="YmyhEnE123";
    public static WebDriver driver;

    //Make Logger object as global to use this method in multiple methods 
    public static Logger logger;
    
    @BeforeClass
    public void setup() {
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
    	driver =new ChromeDriver();
    	driver.manage().window().maximize();
    	
    	//Here initiate logger class object 
    	logger= Logger.getLogger("ebanking");
    	//Here we use property configurator to configure Log4j Properties
    	PropertyConfigurator.configure("Log4j.properties");
    }
    
    @AfterClass
    public void tearDown() {
    	driver.quit();
    }
    
}
