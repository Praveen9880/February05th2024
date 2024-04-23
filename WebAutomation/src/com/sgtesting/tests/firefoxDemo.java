package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxDemo {

	public static WebDriver oBrwser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigateURL();
		colesapplication();
	}
	private static void LaunchBrowser()
	{
		try
		{
			oBrwser=new FirefoxDriver();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			oBrwser.get("https://chat.openai.com/?");
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void colesapplication()
	{
		try
		{
			oBrwser.quit();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}

}
