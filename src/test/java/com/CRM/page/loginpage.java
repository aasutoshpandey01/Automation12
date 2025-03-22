package com.CRM.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginpage {
	WebDriver driver;
	
	loginpage(WebDriver d)
	{
		driver = d;
	}
	
	By username = By.xpath("//input[@id=\"username\"]");
	By password = By.xpath("//input[@id=\"password\"]");
	By loginbtn = By.xpath("//button[@id=\"submit\"]");
	
	public void enterusername(String uname)
	{
		driver.findElement(username).sendKeys(uname);
	}
	
	public void enterpassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void login()
	{
		driver.findElement(loginbtn).click();
	}
	
	

}
