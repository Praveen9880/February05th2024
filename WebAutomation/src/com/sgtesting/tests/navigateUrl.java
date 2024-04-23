package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateUrl {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) 
	{
		LanunchBrowser();
		NavigateURL();
		closeApplication();
	}
	private static void LanunchBrowser()
	{
		oBrowser=new ChromeDriver();
	}
	private static void NavigateURL()
	{
		try
		{
			oBrowser.get("https://www.youtube.com/");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void closeApplication()
	{
		oBrowser.quit();
	}

}
