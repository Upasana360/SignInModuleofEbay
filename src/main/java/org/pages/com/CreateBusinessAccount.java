package org.pages.com;

import java.util.List;

import org.browser.com.Browsing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CreateBusinessAccount extends Browsing{
	static By businessradiobtn =By.id("businessaccount-radio");
	static By businessname=By.id("businessName");
	static By businessemail=By.id("businessEmail");
	static By password=By.id("bizPassword");
	static By lstcountry=By.xpath("//select[@id=\"businessCountry\"]/option");
	static By checkbox=By.xpath("//form[@name=\"create-business-account-with-email\"]/span/span/input");
	static By businessregbtn=By.id("BUSINESS_REG_FORM_SUBMIT");
	static By verifybtn=By.xpath("//form[@name=\"verify-email\"]/div[2]/div/span/button");
	public static void Click_Business_Radio_Btn()
	{
		try
		{
			WebElement radiobtn=driver.findElement(businessradiobtn);
			radiobtn.click();
		}
		catch(Exception e)
		{
			System.out.println("In Click Business Radio Btn");
			System.out.println(e);
		}
	}
	public static void Enter_Business_Name(String bsname)
	{
		try
		{
			WebElement name=driver.findElement(businessname);
			name.sendKeys(bsname);
		}
		catch(Exception e)
		{
			System.out.println("In Enter Business Name");
			System.out.println(e);
		}
	}
	public static void Enter_Business_Email(String bsemail)
	{
		try
		{
			WebElement email=driver.findElement(businessemail);
			email.sendKeys(bsemail);
		}
		catch(Exception e)
		{
			System.out.println("In Enter Business Email");
			System.out.println(e);
		}
	}
	public static void Enter_Business_Password(String bspass)
	{
		try
		{
			WebElement bpass=driver.findElement(password);
			bpass.sendKeys(bspass);
		}
		catch(Exception e)
		{
			System.out.println("In Enter Business Password");
			System.out.println(e);
		}
	}
	public static void Enter_Business_Country(String countryname)
	{
		try
		{
			List<WebElement> lstcnt=driver.findElements(lstcountry) ;
			Thread.sleep(5000);
			for(int i=0;i<lstcnt.size();i++)
			{
				String country=lstcnt.get(i).getText();
				if(country.contains(countryname))
				{				
					lstcnt.get(i).click();
					break;
				}	
			}
		}
		catch(Exception e)
		{
			System.out.println("In Enter Business Country");
			System.out.println(e);
		}
	}
	public static void Enter_Business_Checkbox()
	{
		try
		{
			WebElement chkbox=driver.findElement(checkbox);
			chkbox.click();
		}
		catch(Exception e)
		{
			System.out.println("In Enter Business Checkbox");
			System.out.println(e);
		}
	}
	public static void Business_Register_Button()
	{
		try
		{
			WebElement regbtn=driver.findElement(businessregbtn);
			regbtn.click();
			Thread.sleep(30000);
		}
		catch(Exception e)
		{
			System.out.println("In Business Register Button");
			System.out.println(e);
		}
	}
	public static void Verify_Button()
	{
		try
		{
			WebElement verifyingbtn=driver.findElement(verifybtn);
			verifyingbtn.click();
		}
		catch(Exception e)
		{
			System.out.println("In Verify Button");
			System.out.println(e);
		}
	}

}
