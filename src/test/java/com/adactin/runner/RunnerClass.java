package com.adactin.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseclass.BaseClassAdactin;
import com.properties.FileReaderManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//adactin//feature", glue = "com.adactin.stepdefinition",
monochrome = true, 
dryRun = false, 
strict = true, 
tags = ("@test"),
plugin = {"html:Reports/HtmlReport", 
		"pretty",
		"json:Reports/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtentReport.html" })

public class RunnerClass  {

	public static WebDriver driver;

	@BeforeClass
	public static void SetUp() throws IOException {
	
	
		
		String browser = FileReaderManager.getInstanceFRM().getInstanceCR().getBrowser();
		
		driver=BaseClassAdactin.getBrowser(browser);
		

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\user\\eclipse-workspace\\AdactinCucumber\\Chrome_Driver\\chromedriver.exe");
//
//		driver = new ChromeDriver();
//
//		driver.manage().window().maximize();

	}

	@AfterClass
	public static void tearDown() {

		driver=BaseClassAdactin.close();
		
//		driver.close();
	}
}
