package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdvancedScenariDemo {
	private static WebDriver pi=null;
	public static void main(String[] args) {
		launchBrowser();
		navigateurl();
		Login();
		minimizeFlyout();
		user();
		User2();
		user3();
		LogoutfromAdmin();
		LoginAsUser1();
		Logout();
		LoginAsUser2();
		Logout2();
		LoginAsUser3();
		Logout3();
		LoginChnagepasswordUser1();
		LoginChnagepasswordUser2();
		LoginChnagepasswordUser3();
		LogoutfromAdminchanges();
		LoginAsUserPass();
		LogoutUser1();
		LoginAsUser2Pass();
		LogoutUser2();
		LoginAsUser3Pass();
		LogoutUser3();
		LoginAsAdmin();
		DeleteUser1();
		DeleteUser2();
		DeleteUser3();
		logout();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			pi=new ChromeDriver();
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void navigateurl()
	{
		try
		{
			pi.get("http://localhost/login.do");
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void Login()
	{
		try
		{
			pi.findElement(By.id("username")).sendKeys("admin");
			pi.findElement(By.name("pwd")).sendKeys("manager");
			pi.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
		}catch (Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void minimizeFlyout()
	{
		try
		{
			pi.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void user()
	{
		try
		{
			pi.findElement(By.xpath("/html/body/div[4]/table/tbody/tr[1]/td[5]/a")).click();
			Thread.sleep(3000);
			pi.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div")).click();
			Thread.sleep(3000);
			pi.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Praveen1");
			pi.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("N");
			pi.findElement(By.id("userDataLightBox_emailField")).sendKeys("prn20cv@cmrit");
			pi.findElement(By.id("userDataLightBox_usernameField")).sendKeys("Praveen@966");
			pi.findElement(By.id("userDataLightBox_passwordField")).sendKeys("prav966");
			pi.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("prav966");
			pi.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(5000);
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void User2()
	{
		try 
		{
			pi.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div")).click();
			Thread.sleep(3000);
			pi.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Manoj Kumar ");
			pi.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("D N");
			pi.findElement(By.id("userDataLightBox_emailField")).sendKeys("manoj966@gmail.com");
			pi.findElement(By.id("userDataLightBox_usernameField")).sendKeys("manoj@966");
			pi.findElement(By.id("userDataLightBox_passwordField")).sendKeys("manu966");
			pi.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("manu966");
			pi.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);

		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void user3()
	{
		try
		{
			pi.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[2]/td[2]/div/div")).click();
			Thread.sleep(3000);
			pi.findElement(By.id("userDataLightBox_firstNameField")).sendKeys("Madhan");
			pi.findElement(By.id("userDataLightBox_lastNameField")).sendKeys("N");
			pi.findElement(By.id("userDataLightBox_emailField")).sendKeys("man123@gmail.com");
			pi.findElement(By.id("userDataLightBox_usernameField")).sendKeys("mad@944");
			pi.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Madh966");
			pi.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Madh966");
			pi.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		}catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void LogoutfromAdmin()
	{
		try
		{
			pi.findElement(By.id("logoutLink")).click();
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void  LoginAsUser1()
	{
		try 
		{
			pi.findElement(By.id("username")).sendKeys("Praveen@966");
			pi.findElement(By.name("pwd")).sendKeys("prav966");
			pi.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			pi.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			pi.findElement(By.id("SubmitTTButton")).click();
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void Logout()
	{
		try 
		{
			pi.findElement(By.id("logoutLink")).click();
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void LoginAsUser2()
	{
		try {
			pi.findElement(By.id("username")).sendKeys("manoj@966");
			pi.findElement(By.name("pwd")).sendKeys("manu966");
			pi.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			pi.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			pi.findElement(By.id("SubmitTTButton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void Logout2()
	{
		try 
		{
			pi.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void LoginAsUser3()
	{
		try {
			pi.findElement(By.id("username")).sendKeys("mad@966");
			pi.findElement(By.name("pwd")).sendKeys("Madh966");
			pi.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			pi.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div")).click();
			pi.findElement(By.id("SubmitTTButton")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void Logout3()
	{
		try 
		{
			pi.findElement(By.id("logoutLink")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void LoginChnagepasswordUser1()
	{
		try
		{
			pi.findElement(By.id("username")).sendKeys("admin");
			pi.findElement(By.name("pwd")).sendKeys("manager");
			pi.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();
			Thread.sleep(2000);
			pi.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			pi.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[4]/td[1]")).click();
			pi.findElement(By.id("userDataLightBox_passwordField")).sendKeys("praveen@123");
			pi.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("praveen@123");
			pi.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void LoginChnagepasswordUser2()
	{
		try
		{
			pi.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[4]/td[1]")).click();
			pi.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Manu944");
			pi.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Manu944");
			pi.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void LoginChnagepasswordUser3()
	{
		try
		{
			pi.findElement(By.xpath("/html/body/div[1]/table/tbody/tr[4]/td/span[1]/table/tbody/tr[4]/td[1]")).click();
			pi.findElement(By.id("userDataLightBox_passwordField")).sendKeys("Mad988");
			pi.findElement(By.id("userDataLightBox_passwordCopyField")).sendKeys("Mad988");
			pi.findElement(By.id("userDataLightBox_commitBtn")).click();
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	
	
	private static void LogoutfromAdminchanges()
	{
		try
		{
			pi.findElement(By.id("logoutLink")).click();
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}	
	private static void LoginAsUserPass()
	{
		try 
		{
			pi.findElement(By.id("username")).sendKeys("Praveen@966");
			pi.findElement(By.name("pwd")).sendKeys("praveen@123");
			pi.findElement(By.xpath("//*[@id='loginButton']/div")).click();	
			Thread.sleep(2000);
		} catch (Exception e) 
		{
			e.getStackTrace();
		}
	}
	private static void LogoutUser1()
	{
		try {
			pi.findElement(By.id("logoutLink")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void LoginAsUser2Pass()
	{
		try 
		{
			pi.findElement(By.id("username")).sendKeys("manoj@966");
			pi.findElement(By.name("pwd")).sendKeys("Manu944");
			pi.findElement(By.xpath("//*[@id='loginButton']/div")).click();		
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void LogoutUser2()
	{
		try {
			pi.findElement(By.id("logoutLink")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void LoginAsUser3Pass()
	{
		try 
		{
			pi.findElement(By.id("username")).sendKeys("mad@966");
			pi.findElement(By.name("pwd")).sendKeys("Mad988");
			pi.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void LogoutUser3()
	{
		try {
			pi.findElement(By.id("logoutLink")).click();
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void LoginAsAdmin()
	{
		try {
			pi.findElement(By.id("username")).sendKeys("admin");
			pi.findElement(By.name("pwd")).sendKeys("manager");
			pi.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/div/table/tbody/tr/td[2]/div/table/tbody/tr[5]/td/table[1]/tbody/tr[2]/td/table/tbody/tr/td[3]/a/div")).click();

		} catch (Exception e) {
			
		}
	}
	private static void DeleteUser1()
	{
		try {
			pi.findElement(By.xpath("//div[text()='USERS']")).click();
			Thread.sleep(2000);
			pi.findElement(By.xpath("(//table[@class='userNameContainer'])[1]")).click();
			Thread.sleep(2000);
			pi.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Alert olert=pi.switchTo().alert();
			olert.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void DeleteUser2()
	{
		try {
			pi.findElement(By.xpath("(//table[@class='userNameContainer'])[1]")).click();
			Thread.sleep(2000);
			pi.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Alert olert=pi.switchTo().alert();
			olert.accept();  
			Thread.sleep(2000);
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void DeleteUser3()
	{
		try {
			pi.findElement(By.xpath("(//table[@class='userNameContainer'])[1]")).click();
			Thread.sleep(2000);
			pi.findElement(By.xpath("//button[@id='userDataLightBox_deleteBtn']")).click();
			Alert olert=pi.switchTo().alert();
			olert.accept();
			Thread.sleep(2000);		
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
	private static void logout()
	{
		try {
			pi.findElement(By.xpath("//a[@id='logoutLink']")).click();
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
