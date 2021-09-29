package com.selenium.testng.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter {
	
	public WebDriver driver;
	
	@Parameters({"uname","password"})
	
	@Test
	public void SetUp(String uname,String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com");
		driver.findElement(By.name("email")).sendKeys("uname");
		driver.findElement(By.name("pass")).sendKeys("password");
		Thread.sleep(3000);
		
	}

	}