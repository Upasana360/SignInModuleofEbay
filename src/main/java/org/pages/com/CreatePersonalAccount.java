package org.pages.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.browser.com.Browsing;

public class CreatePersonalAccount extends Browsing{
	static By register = By.xpath("//ul[@id=\"gh-topl\"]/li/span/span/a");
	static By firstname =By.id("firstname");
	static By lastname=By.id("lastname");
	static By email=By.id("Email");
	static By password=By.id("password");
	static By registerbtn=By.xpath("//form[@name=\"create-personal-account-with-email\"]/div[6]/div/span/button");
	public static void Register_link_Click()
	{
		try
		{
			WebElement registerlink=driver.findElement(register);
			registerlink.click();
		}
		catch(Exception e)
		{
			System.out.println("In Register Link");
			System.out.println(e);
		}
	}
	public static void First_Name_Send(String string)
	{
		try
		{
			WebElement first_name=driver.findElement(firstname);
			first_name.sendKeys(string);
			
		}
		catch(Exception e)
		{
			System.out.println("In First name ");
			System.out.println(e);
		}
	}
	public static void Last_Name_Send(String string)
	{
		try
		{
			WebElement last_name=driver.findElement(lastname);
			last_name.sendKeys(string);
			
		}
		catch(Exception e)
		{
			System.out.println("In last name");
			System.out.println(e);
		}
	}
	public static void Email_Send(String string)
	{
		try
		{
			WebElement emaildata=driver.findElement(email);
			emaildata.sendKeys(string);
			
		}
		catch(Exception e)
		{
			System.out.println("In Email");
			System.out.println(e);
		}
	}
	public static void Password_Send(String string)
	{
		try
		{
			WebElement passworddata=driver.findElement(password);
			passworddata.sendKeys(string);
			
		}
		catch(Exception e)
		{
			System.out.println("In last name");
			System.out.println(e);
		}
	}
	public static void Register_Button_Click()
	{
		try
		{
			WebElement Registerbtn=driver.findElement(registerbtn);
			Actions act=new Actions(driver);
			act.moveToElement(Registerbtn).build().perform();	
			Thread.sleep(2000);
			Registerbtn.click();
			
		}
		catch(Exception e)
		{
			System.out.println("In Email");
			System.out.println(e);
		}
	}
	

}
