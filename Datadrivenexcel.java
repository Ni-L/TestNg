package com.selenium.testng.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datadrivenexcel {
	public static  void main(String args[]) throws IOException, InterruptedException {
		//set the ChromeDriver path
		System.setProperty("webdriver.chrome.driver","/Bridgelabz/JAVA/SeleniumWebdriver/driver1/chromedriver.exe");

		File src=new File("./ExcelData/dataexcel.xlsx");

		// load file
		FileInputStream fis=new FileInputStream(src);

		// Load workbook
		XSSFWorkbook wb =new XSSFWorkbook(fis);

		// Load sheet- Here we are loading first sheetonly
		XSSFSheet sh1 = wb.getSheetAt(0);

		//get all rows in the sheet
		int rowCount = sh1.getLastRowNum()-sh1.getFirstRowNum();

		//Creating an object of ChromeDriver
		WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://en-gb.facebook.com/");
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));

		//iterate over all the rows in Excel and put data in the form.
		for(int i=1;i<=rowCount;i++ ) {
			//Returns the cell at the given (0 based) index
			//Get the value of the cell as a string
			//XSSFRow representing the rownumber or null if its not defined on the sheet
			email.sendKeys(sh1.getRow(i).getCell(0).getStringCellValue());
			password.sendKeys(sh1.getRow(i).getCell(1).getStringCellValue());//

			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("pass")).clear();
		}
		driver.quit();
	}
}


