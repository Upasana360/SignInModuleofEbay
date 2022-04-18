package StepDefinition;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.browser.com.Browsing;
import org.log.com.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.browser.com.Browsing;

public class ExtentReportOnSearching extends Browsing{	
	public static ExtentHtmlReporter obj1=new ExtentHtmlReporter("./Reports/extentreport.html");
	public static ExtentReports obj2=new ExtentReports();
	public static WebDriver driver;
	static By search=By.xpath("//table[@class=\"gh-tbl2\"]/tbody/tr/td/div/div/input");
	static By price=By.xpath("//ul[@class=\"x-refine__left__nav\"]/li[3]/div/h3");
	static By lstprice=By.xpath("//span[@class=\"cbx x-refine__multi-select-cbx\"]");
	static By location=By.xpath("//ul[@class=\"x-refine__left__nav\"]/li[6]/div/h3");
	static By lstlocation=By.xpath("//div[@class=\"x-refine__select__svg\"]/div/span");
	static By shippingoptions=By.xpath("//li[@class=\"x-refine__main__list \"][6]");
	static By shiplsts=By.xpath("//div[@class=\"x-refine__select__svg\"]/div/div/span");
	static By showonlyitems=By.xpath("//li[@class=\"x-refine__main__list \"][8]");
	static By solditems=By.xpath("//div[@class=\"x-refine__select__svg\"]/div/div/span");
//	ExtentHtmlReporter htmlReporter=new ExtentHtmlReporter("./Reports/extentreport.html");
//	ExtentReports extent=new ExtentReports();
	@BeforeClass
	public void setUp()
	{
		Log.log(2);
		obj2.attachReporter(obj1);
		ExtentTest obj3=obj2.createTest("Opening the Test");
		obj3.log(Status.INFO,"Opening the browser");
		try
		{
			Log.log(1);
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(ChromeOptions.CAPABILITY, options);
			options.merge(capabilities);
			driver = new ChromeDriver(options);
			Thread.sleep(3000);
	      obj3.log(Status.PASS,"The browser open");
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("Before Report block");
			obj3.log(Status.FAIL,"The browser does not opened");
		}
		obj2.flush();
		
		
	}
	@Test(priority=1)
	public void getURL()
	{
		Log.log(2);
		obj2.attachReporter(obj1);
		ExtentTest obj3=obj2.createTest("Open the site");
		obj3.log(Status.INFO,"ebay application opening");
		try
		{
			Log.log(1);
			driver.get("https://www.ebay.com/");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			Thread.sleep(3000);
	      obj3.log(Status.PASS,"ebay application opens");
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("Before Report block");
			obj3.log(Status.FAIL,"ebay application does not opening");
		}
		obj2.flush();
		
		
	}
//	@Test
//	public void test1() throws IOException
//	{
//		obj2.attachReporter(obj1);
//		  ExtentTest test = obj2.createTest("MyFirstTest","Sample");
//		  test.log(Status.INFO, "This step shows usage of log(status, details)");
//
//	        // info(details)
//	        test.info("This step shows usage of info(details)");
//	        
//	        // log with snapshot
//	        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
//	        
//	        // test with snapshot
//	        test.addScreenCaptureFromPath("screenshot.png");
//	}
//	@AfterSuite
//	public void tearDown()
//	{
//		 obj2.flush();
//	}
	@Test(priority=2)
	public static void data_search_box()
	{
		Log.log(2);
		ExtentTest obj3=obj2.createTest("Opening the Test");
		obj3.log(Status.INFO,"Send which data to search");
		obj2.attachReporter(obj1);
		try
		{
			Log.log(1);
			WebElement searchdata=driver.findElement(search);
			searchdata.sendKeys("Books");
			obj3.log(Status.PASS,"Data send to search");
			//obj3.pass("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());
			 String filepath=System.getProperty("user.dir")+"//ScreenShot//Screenshot1.png";
			 obj3.addScreenCaptureFromPath(filepath);
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("In Click Business Radio Btn");
			System.out.println(e);
			obj3.log(Status.FAIL,"Data does not send to search");
		}
		obj2.flush();
	}
	@Test(priority=3)
	public static void search_box_click()
	{
		Log.log(2);
		ExtentTest obj3=obj2.createTest("Click on search box");
		obj3.log(Status.INFO,"After passing data click on search box");
		obj2.attachReporter(obj1);
		try
		{
			Log.log(1);
			WebElement searchdata=driver.findElement(search);
			searchdata.sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			obj3.log(Status.PASS,"clicking on the search box");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("In search box click");
			System.out.println(e);
			obj3.log(Status.FAIL,"Does not clicking on the search box");
		}
		obj2.flush();
	}
	@Test(priority=4)
	public static void search_price()
	{
		Log.log(2);
		ExtentTest obj3=obj2.createTest("Select the price");
		obj3.log(Status.INFO,"Selecting within which price range we want our search result");
		obj2.attachReporter(obj1);
		try
		{
			Log.log(1);
			WebElement priceselect=driver.findElement(price);	
			Actions act=new Actions(driver);
			act.moveToElement(priceselect).build().perform();	
			Thread.sleep(3000);
			List<WebElement> lstpricing=driver.findElements(lstprice);
			for(int i=0;i<lstpricing.size();i++)
			{
				String type=lstpricing.get(i).getText();
				if(type.contains("Under $10.00"))
				{				
					lstpricing.get(i).click();
					break;
				}	
			}
			obj3.log(Status.PASS,"Desired Price selected from the price list");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("In search price select");
			System.out.println(e);
			obj3.log(Status.FAIL,"Desired Price does not selected from the price list");
		}
		obj2.flush();
	}
	@Test(priority=5)
	public static void search_location()
	{
		Log.log(2);
		ExtentTest obj3=obj2.createTest("Select the location");
		obj3.log(Status.INFO,"Selecting within which location we want our search result");
		obj2.attachReporter(obj1);
		try
		{
			Log.log(1);
			WebElement locationselect=driver.findElement(location);
			Actions act=new Actions(driver);
			act.moveToElement(locationselect).build().perform();	
			Thread.sleep(3000);
			List<WebElement> lstloc=driver.findElements(lstlocation);
			for(int i=0;i<lstloc.size();i++)
			{
				String type=lstloc.get(i).getText();
				if(type.contains("North America"))
				{				
					lstloc.get(i).click();
					break;
				}	
			}
			obj3.log(Status.PASS,"Desired location selected from the location list");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("In search location select");
			System.out.println(e);
			obj3.log(Status.FAIL,"Desired location does not selected from the location list");
		}
		obj2.flush();
	}
	@Test(priority=6)
	public static void searchship_option()
	{
		Log.log(2);
		ExtentTest obj3=obj2.createTest("Select the ship option");
		obj3.log(Status.INFO,"Selecting within which ship option we want our search result");
		obj2.attachReporter(obj1);
		try
		{
			Log.log(1);
			WebElement shippingoption=driver.findElement(shippingoptions);
			Actions act=new Actions(driver);
			act.moveToElement(shippingoption).build().perform();
			Thread.sleep(4000);
			List<WebElement> shiplst=driver.findElements(shiplsts);
			for(int i=0;i<shiplst.size();i++)
			{
				String type=shiplst.get(i).getText();
				if(type.contains("Free International Shipping"))
				{				
					shiplst.get(i).click();
					break;
				}	
			}
			obj3.log(Status.PASS,"Desired ship option selected from the ship option list");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("In search ship option select");
			System.out.println(e);
			obj3.log(Status.FAIL,"Desired ship option does not selected from the ship option list");
		}
		obj2.flush();
	}
	@AfterClass
	public static void showonly_option(String string)
	{
		Log.log(2);
		ExtentTest obj3=obj2.createTest("Select the showonly option option");
		obj3.log(Status.INFO,"Selecting within which showonly option option we want our search result");
		obj2.attachReporter(obj1);
		try
		{
			Log.log(1);
			WebElement showonly=driver.findElement(showonlyitems);
			Actions act=new Actions(driver);
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
			obj3.log(Status.PASS,"Desired option selected from the showonly option list");
			Thread.sleep(3000);
		}
		catch(Exception e)
		{
			Log.log(3);
			System.out.println("In show only sold item option select");
			System.out.println(e);
			obj3.log(Status.FAIL,"Desired option does not selected from the showonly option list");
		}
		obj2.flush();
	}

	

}
