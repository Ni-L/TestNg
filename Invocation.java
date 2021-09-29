package com.selenium.testng.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Invocation {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    public WebDriver driver; 
	
	 @Test(invocationCount=7)
	    public void multipleTimesRun(){
		 System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
			driver = new ChromeDriver();
		    driver.get(baseUrl);
	        System.out.println("Execute 7 times");
	    }
	}


