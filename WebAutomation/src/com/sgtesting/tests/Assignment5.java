package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
	public static WebDriver rn=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigateURl();
		Login();
		minimizeFlyOutWindow();
		CreateCustomer();
		ModifyCustomer();
	}
	private static void LaunchBrowser()
	{
		try 
		{
			rn= new ChromeDriver();
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void navigateURl()
	{
		try {
			rn.get("http://localhost/login.do");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void Login()
	{
		try {
			rn.findElement(By.id("username")).sendKeys("admin");
			rn.findElement(By.name("pwd")).sendKeys("manager");
			rn.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try {
			rn.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void CreateCustomer()
	{
		try {
			rn.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[1]/div[2]/div")).click();
			rn.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			rn.findElement(By.id("customerLightBox_nameField")).sendKeys("Chethan N C");
			rn.findElement(By.id("customerLightBox_descriptionField")).sendKeys("sdchdajgyuhdjsxbcguwdhj");
			rn.findElement(By.xpath("/html/body/div[8]/div/div/div[2]/table/tbody/tr/td[2]/div[1]/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void ModifyCustomer()
	{
		try 
		{
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
