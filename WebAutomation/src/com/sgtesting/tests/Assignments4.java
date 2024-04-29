package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments4 {
	public static WebDriver pn=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigateUrl();
		login();
		 minimizeFlyOutWindow();
		 CreateCustomer();
		 DeleteCustomer();
		 logout();
		 closeApplication();
	}
	private static void LaunchBrowser()
	{
		try
		{
			pn=new ChromeDriver();
			pn.manage().window().maximize();
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	public static void navigateUrl()
	{
		try
		{
			pn.get("http://localhost/login.do");
			Thread.sleep(2000);
			
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			pn.findElement(By.id("username")).sendKeys("admin");
			pn.findElement(By.name("pwd")).sendKeys("manager");
			pn.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try
		{
			pn.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void CreateCustomer()
	{
		try
		{
			pn.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[3]/a")).click();
			Thread.sleep(2000);
			pn.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[1]/div[2]/div/div[2]")).click();
			pn.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			pn.findElement(By.id("customerLightBox_nameField")).sendKeys("Kushan");
			pn.findElement(By.id("customerLightBox_descriptionField")).sendKeys("Manoj project work one building");
			pn.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void DeleteCustomer()
	{
		try
		{
			pn.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			pn.findElement(By.xpath("//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[4]/div/div/div[1]")).click();
			pn.findElement(By.xpath("//div[text()='Delete']")).click();
			Thread.sleep(2000);
			pn.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			pn.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			pn.quit();
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}


}
