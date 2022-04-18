package org.pages.com;

import java.util.List;

import org.browser.com.Browsing;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.log.com.Log;

public class Search extends Browsing{
	static By search=By.xpath("//table[@class=\"gh-tbl2\"]/tbody/tr/td/div/div/input");
	static By price=By.xpath("//ul[@class=\"x-refine__left__nav\"]/li[3]/div/h3");
	static By lstprice=By.xpath("//span[@class=\"cbx x-refine__multi-select-cbx\"]");
	static By location=By.xpath("//ul[@class=\"x-refine__left__nav\"]/li[6]/div/h3");
	static By lstlocation=By.xpath("//div[@class=\"x-refine__select__svg\"]/div/span");
	static By shippingoptions=By.xpath("//li[@class=\"x-refine__main__list \"][6]");
	static By shiplsts=By.xpath("//div[@class=\"x-refine__select__svg\"]/div/div/span");
	static By showonlyitems=By.xpath("//li[@class=\"x-refine__main__list \"][8]");
	static By solditems=By.xpath("//div[@class=\"x-refine__select__svg\"]/div/div/span");
	public static void data_search_box(String string)
	{
		try
		{			
			WebElement searchdata=driver.findElement(search);
			searchdata.sendKeys(string);
		}
		catch(Exception e)
		{
			
			System.out.println("In Click Business Radio Btn");
			System.out.println(e);
		}
	}
	
	public static void search_box_click()
	{
		try
		{
			
			WebElement searchdata=driver.findElement(search);
			searchdata.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			
		}
		catch(Exception e)
		{
			
			System.out.println("In search box click");
			System.out.println(e);
			
		}
		
	}
	public static void search_price(String string)
	{
		try
		{
			
			WebElement priceselect=driver.findElement(price);	
			Actions act=new Actions(Browsing.driver);
			act.moveToElement(priceselect).build().perform();	
			Thread.sleep(3000);
			List<WebElement> lstpricing=driver.findElements(lstprice);
			for(int i=0;i<lstpricing.size();i++)
			{
				String type=lstpricing.get(i).getText();
				if(type.contains(string))
				{				
					lstpricing.get(i).click();
					break;
				}	
			}
		}
		catch(Exception e)
		{
			
			System.out.println("In search price select");
			System.out.println(e);
		}
		
	}
	public static void search_location(String string)
	{
		try
		{
			
			WebElement locationselect=driver.findElement(location);
			Actions act=new Actions(Browsing.driver);
			act.moveToElement(locationselect).build().perform();	
			Thread.sleep(3000);
			List<WebElement> lstloc=driver.findElements(lstlocation);
			for(int i=0;i<lstloc.size();i++)
			{
				String type=lstloc.get(i).getText();
				if(type.contains(string))
				{				
					lstloc.get(i).click();
					break;
				}	
			}
			
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("In search location select");
			System.out.println(e);
			
		}
		
	}
	public static void searchship_option(String string)
	{
		
		try
		{
			
			WebElement shippingoption=driver.findElement(shippingoptions);
			Actions act=new Actions(Browsing.driver);
			act.moveToElement(shippingoption).build().perform();
			Thread.sleep(4000);
			List<WebElement> shiplst=driver.findElements(shiplsts);
			for(int i=0;i<shiplst.size();i++)
			{
				String type=shiplst.get(i).getText();
				if(type.contains(string))
				{				
					shiplst.get(i).click();
					break;
				}	
			}
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("In search ship option select");
			System.out.println(e);
			
		}
		
	}
	public static void showonly_option(String string)
	{
		
		try
		{
			
			WebElement showonly=driver.findElement(showonlyitems);
			Actions act=new Actions(Browsing.driver);
			act.moveToElement(showonly).build().perform();
			Thread.sleep(4000);
			List<WebElement> solditem=driver.findElements(solditems);
			for(int i=0;i<solditem.size();i++)
			{
				String type=solditem.get(i).getText();
				if(type.contains("Sold Items"))
				{				
					solditem.get(i).click();
					break;
				}	
			}
			
		}
		catch(Exception e)
		{
			
			System.out.println("In show only sold item option select");
			System.out.println(e);
			
		}
	
	}

}
