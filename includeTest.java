package com.selenium.testng.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class includeTest {
	 public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    public WebDriver driver; 
	
	 // A test method belongs to Group G1
	   @Test(groups = { "G1" })
	   public void G1Method1() 
	   {
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		driver = new ChromeDriver();
		 driver.get(baseUrl);
	      System.out.println("G1Method1");
	   }
	   // A test method belongs to Group G1
	   @Test(groups = { "G1" })
	   public void G1Method2() 
	   {
		   driver.getTitle();
	      System.out.println("G1Method2");
	   }
	   // A test method belongs to Group G2
	   @Test(groups = { "G2" })
	   public void G2Method1() 
	   {
	      System.out.println("G2Method1");
	   }
	   // A test method belongs to Group G2
	   @Test(groups = { "G2" })
	   public void G2Method2() 
	   {
	      System.out.println("G2Method2");
	   }
	   // A test method belongs to Group G3
	   @Test(groups = { "G3" })
	   public void G3Method1() 
	   {
	      System.out.println("G3Method1");
	   }
	   // A test method belongs to Group G3
	   @Test(groups = { "G3" })
	   public void G3Method2() 
	   {
	      System.out.println("G3Method2");
	   }
	}