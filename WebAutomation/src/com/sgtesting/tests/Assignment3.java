package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
	private static WebDriver pr=null;
	public static void main(String[] args) {
		launchbrowser();
		navigateURL();
		Login();
		minimizeFlyout();
		CreateUser();
		ModifyUser();
		DeleteUser();
	}
	private static void launchbrowser()
	{
		try
		{
			pr=new ChromeDriver();
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void navigateURL()
	{
		try
		{
			pr.get("http://localhost/login.do");
		}catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void Login()
	{

		try
		{
			pr.findElement(By.id("username")).sendKeys("admin");
			pr.findElement(By.name("pwd")).sendKeys("manager");
			pr.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void minimizeFlyout()
	{
		try
		{
			pr.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void CreateUser()
	{
		try
		{
			pr.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a")).click();
			pr.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div")).click();
			Thread.sleep(2000);
			pr.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Gowtham");
			pr.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("n");
			pr.findElement(By.id("userDataLightBox_emailField")).sendKeys("prn20cv@cmrit");
			pr.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Gowtham@15");
			pr.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Gowtham@944");
			pr.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Gowtham@944");
			pr.findElement(By.id("userDataLightBox_commitBtn")).click();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void ModifyUser()
	{
		try
		{
			pr.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[3]/span")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void DeleteUser()
	{
		try
		{
			pr.findElement(By.xpath("html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[1]/td[1]/table/tbody/tr/td/div[1]/span[2]")).click();
			Thread.sleep(2000);
			pr.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(2000);
			Alert oAlert=pr.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			Thread.sleep(2000);
			oAlert.accept();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}