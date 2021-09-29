package com.program.selenium.firstautomation;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class TestngTest {
	public WebDriver driver ; 

	@BeforeTest
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://techcanvass.com/Examples/multi-select.html");
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void verifyHomepageTitle() {
		Select select = new Select(driver.findElement(By.id("multiselect")));
		List<WebElement> options = select.getOptions();
		System.out.println("Number of elements present inside the listbox is : "+options.size());
		System.out.println("For first Test");
	}

	@Test(priority = 2)
	public void verifyHomepageTit() {
		Select select = new Select(driver.findElement(By.id("multiselect")));
		boolean mulselect = select.isMultiple();
		System.out.println("Multi select listbox :"+mulselect);
		System.out.println("For sencond Test");
	}

	@Test(priority = 3)
	public void verifyHomepage() throws InterruptedException {
		Select select = new Select(driver.findElement(By.id("multiselect")));
		select.selectByIndex(1);
		Thread.sleep(2000);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByValue("opel");
		Thread.sleep(2000);
		select.selectByVisibleText("Honda");
		Thread.sleep(2000);
		System.out.println("for Third Test");
	}

	@AfterTest
	public void terminateBrowser(){
		driver.close();
	}
}
