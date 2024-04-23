package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChormeBrowserDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		NavigateURL();
		closeApplication();

	}
	private static void LaunchBrowser()
	{
		try
		{
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void NavigateURL()
	{
		try
		{
			oBrowser.get("http://localhost/user/submit_tt.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
	}

}



