package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignments7 {
	public static WebDriver pl=null;
	public static void main(String[] args) {
		LaunchBrowser();
		navigateURl();
		Login();
		minimizeFlyOutWindow();
		CreateCustomer();
		
	}
	private static void LaunchBrowser()
	{
		try 
		{
			pl= new ChromeDriver();
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void navigateURl()
	{
		try {
			pl.get("http://localhost/login.do");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void Login()
	{
		try {
			pl.findElement(By.id("username")).sendKeys("admin");
			pl.findElement(By.name("pwd")).sendKeys("manager");
			pl.findElement(By.xpath("//*[@id='loginButton']/div")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try {
			pl.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void CreateCustomer()
	{
		try {
			pl.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a")).click();
			pl.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div")).click();
			pl.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Suresh");
			pl.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("G");
			pl.findElement(By.id("userDataLightBox_emailField")).sendKeys("demo123@gmail.com");
			pl.findElement(By.id("userDataLightBox_usernameColumn")).sendKeys("Demo@123");
			pl.findElement(By.id("userDataLightBox_passwordField")).sendKeys("demo12");
			pl.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("demo12");
			Thread.sleep(2000);
			pl.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	
	}
}
