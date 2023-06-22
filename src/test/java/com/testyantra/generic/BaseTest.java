package com.testyantra.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class BaseTest implements Autoconstant
{
	public WebDriver driver;
	@BeforeSuite
	public void executestart()
	{
		Reporter.log("Execution Start");
	}

	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(Url);
	}
	
	@AfterSuite
	public void executionend()
	{
		Reporter.log("Execution End");
	}
}
