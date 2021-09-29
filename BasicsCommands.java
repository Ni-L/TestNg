package com.selenium.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class BasicsCommands {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    public WebDriver driver; 
	    
	    @BeforeSuite
	    public void beforesuit()
	    {
	    	System.out.println("BeforeSuit");
	    }
	    @AfterSuite
	      public void afterSuit()
	      {
	    	  System.out.println("After Suit Method");
	      }
	    


          @BeforeGroups("urlValidation")
          public void setUpSecurity() {
          System.out.println("url validation test starting");
           }
	       
	        
	        @BeforeTest
	      public void launchBrowser() {
	          System.out.println("launching chrome browser"); 
	      	System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
			driver = new ChromeDriver();
	          driver.get(baseUrl);
	          System.out.println("BeforeTest");
	      }
	      
	      @BeforeMethod
	      public void verifyHomepageTitle() {
	          System.out.println("BeforeMethod");
	      }
	      @Test (dependsOnMethods = { "OpenBrowser" })
          public void SignIn() {
        	  System.out.println("This will execute second (SignIn)");
          }

          @Test
          public void OpenBrowser() {
        	  System.out.println("This will execute first (Open Browser)");
          }
	          @Test(priority = 0)
	      public void register(){
	          driver.findElement(By.linkText("REGISTER")).click() ;
	          System.out.println("Test num 0");
	      }
	          @Test(priority = 1)
	            public void support() {
	            driver.findElement(By.linkText("SUPPORT")).click() ;
	            System.out.println("Test 1");
	      }
	          
	        
	      @AfterMethod
	      public void goBackToHomepage ( ) {
	            driver.findElement(By.linkText("Home")).click() ;
	            System.out.println("AfterMethod");
	      }
	   
	      @AfterTest
	      public void terminateBrowser(){
	          driver.close();
	          System.out.println("AfterTest");
	      }
	}
