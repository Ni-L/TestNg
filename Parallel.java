package com.selenium.testng.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel {
	WebDriver driver;
	@Test()
	public void test1() throws InterruptedException {
		System.out.println(" i am inside test 1 | "+Thread.currentThread().getId());
      	System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.get("https://en-gb.facebook.com/");
		   Thread.sleep(3000);
		   driver.close(); 
	}

	@Test
	public void test2() throws InterruptedException { 
		System.out.println(" i am inside test 2 | "+Thread.currentThread().getId());
      	System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		   driver= new ChromeDriver();
		   driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		   Thread.sleep(10000);
		   driver.close();
	}

	}


