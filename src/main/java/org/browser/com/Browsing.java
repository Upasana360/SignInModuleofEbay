package org.browser.com;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.pages.com.SignIn;

public class Browsing {
	public static WebDriver driver;
	public static Actions act;
	public static  WebDriverWait wait;
	
	
		public static WebDriver setDriver()
		{
			try {	
				String browsingchoice=Browsing.fileProperties("browser");
				if(browsingchoice.equals("chrome"))
				{
					WebDriverManager.chromedriver().setup();
					ChromeOptions options = new ChromeOptions();
					options.addArguments("--incognito");
					DesiredCapabilities capabilities = new DesiredCapabilities();
					capabilities.setCapability(ChromeOptions.CAPABILITY, options);
					options.merge(capabilities);
					driver = new ChromeDriver(options);   
				}
				else if(browsingchoice.equals("firefox")){
					WebDriverManager.firefoxdriver().setup();
					driver=new FirefoxDriver();
				}
			}
				catch(Exception e)
				{
					System.out.println("BrowserInput");
					System.out.println(e);
				}	
				  
				return driver;

		}

//		private static WebDriver setChromeDriver() {
//			try {		
//		String driverPath = System.getProperty("user.dir") + "\\Driver\\chromedriver.exe";
//		System.setProperty("webdriver.chrome.driver", driverPath);
//		driver = new ChromeDriver();
//			}catch(Exception e)
//			{
//		System.out.println("Chrome");
//		System.out.println(e);
//			}
//			return driver;
//			}

public static String fileProperties(String urltype)
{
	String returnData=null;
	String searchurl=urltype;
	try {
		String driverlocation=System.getProperty("user.dir")+"\\src\\main\\resources\\Configuration.properties";
		File file=new File(driverlocation);
		FileInputStream fileinput=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fileinput);
		returnData=prop.getProperty(searchurl);
		System.out.println(returnData);
		
	}
	catch(Exception e)
	{
		System.out.println("Browser not found");
	}
	return returnData;
}
//Method to get title of the browser window
	public static String getTitle() throws Exception {
		String actualTitle = driver.getTitle();
		return actualTitle;			
	}
//Url Setup Method
	public static void getUrl(String siteurl) throws Exception {
		try {
		//String url = IRCTCBrowsing.fileProperties(siteurl);
		driver.get(siteurl);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		}catch(Exception e)
		{
		System.out.println("URL Method");
		System.out.println(e);
		}
	}
	
	public static void closeBrowser() {
		try {
			driver.quit();
		}catch(Exception e)
		{
			System.out.println("Browser closing");
		}
	}
//	public static void main(String[] args)
//	{
//		SignInModule signin=new SignInModule();
//		 //PageFactory is used to find elements with @FindBy specified
//		PageFactory.initElements(driver,signin);
//	}
	

}
