package com.selenium.testng.test;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTest {
	public WebDriver driver ; 

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		System.out.println("BeforeTest");
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Class");
	}

	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Method");
	}
	
	@Test(priority = 1)
	public void verifyHomepageTitle() {
		System.out.print(driver.getTitle());
		System.out.println("1st Test Pass");
}
	@Test(priority = 2)
	public void verifyPageSource() {
		System.out.print(driver.getPageSource());
		System.out.println("2st Test Pass");
	}
	@Test(priority = 3)
	public void verifyNavigation() throws InterruptedException {
		driver.navigate().to("https://en-gb.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		System.out.println("3st Test Pass for navigation");
	}
//	@Test(priority = 5)
//	public void verifyAlert() {
//    driver.get("https:mail.rediff.com/cgi-bin/login.cgi");		
//	Alert alert =driver.switchTo().alert();
//	System.out.print(alert.getText());
//	alert.accept();
//	System.out.println("5th Test Pass for Alert");
	

	@Test(priority = 4)
	public void verifyActionClass() throws InterruptedException {
		
	driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
	Actions action = new Actions(driver);
	action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
	Thread.sleep(3000);
	//Click on artical
	driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
	System.out.println("4rth Test Pass for Action");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("After Class");
	}
	@AfterTest
	public void terminateBrowser(){
		driver.close();
		System.out.println("AfterTest");
	}
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Method");
	}
	
}


