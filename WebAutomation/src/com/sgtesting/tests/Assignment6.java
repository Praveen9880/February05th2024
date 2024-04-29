package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static WebDriver pi=null;
	public static void main(String[] args) {
		LaunchBroser();
		navigate();
		Login();
		minimizeFlyOutWindow();
		CreateCustomer();
		CreateProject();
		DeleteProject();
		logout();
		closeApplication();
	}
	private static void LaunchBroser()
	{
		try 
		{
			pi=new ChromeDriver();
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void navigate()
	{
		try {
		pi.get("http://localhost/login.do");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void Login()
	{
		try {
			pi.findElement(By.id("username")).sendKeys("admin");
			pi.findElement(By.name("pwd")).sendKeys("manager");
			pi.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void minimizeFlyOutWindow()
	{
		try {
			pi.findElement(By.id("gettingStartedShortcutsPanelId")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void CreateCustomer()
	{
		try {
			pi.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[3]/a")).click();
			Thread.sleep(2000);
			pi.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[1]/div[2]/div")).click();
			pi.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(2000);
			pi.findElement(By.id("customerLightBox_nameField")).sendKeys("Rudra");
			pi.findElement(By.id("customerLightBox_descriptionField")).click();
			pi.findElement(By.id("customerLightBox_commitBtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void CreateProject()
	{
		try {
			pi.findElement(By.xpath("/html/body/div[4]/table/tbody/tr/td[3]/a")).click();
			pi.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[1]/div[2]/div")).click();
			pi.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(3000);
			pi.findElement(By.id("projectPopup_projectNameField")).sendKeys("Software Project");
			pi.findElement(By.id("ext-gen98")).click();
			pi.findElement(By.id("projectPopup_newCustomerNameField")).sendKeys("Rudra");
			Thread.sleep(2000);
			pi.findElement(By.id("projectPopup_commitBtn")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void DeleteProject()
	{
		try 
		{
			pi.findElement(By.xpath("/html/body/div[12]/div[1]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[4]/div[4]")).click();
			pi.findElement(By.xpath("/html/body/div[12]/div[2]/div[2]/div[1]/div[4]/div/div")).click();
			Thread.sleep(2000);
			pi.findElement(By.xpath("//div[text()='Delete']")).click();
			pi.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void logout()
	{
		try {
			pi.findElement(By.id("logoutLink")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void closeApplication()
	{
		try {
			pi.quit();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}
