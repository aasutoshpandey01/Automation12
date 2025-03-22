package com.CRM.page;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class loginTest {
	
	WebDriver driver;

	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
	}
	
	@Test
	void loginfunctiontest()
	{
		loginpage obj = new loginpage(driver);
		obj.enterusername("student");
		obj.enterpassword("Password123");
		obj.login();
	}
	
	@AfterClass
	void teardown()
	{
		driver.quit();
	}

}
