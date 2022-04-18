package org.pages.com;

import org.browser.com.Browsing;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.ScreenShot.com.*;


public class SignIn {
	WebDriver driver;
	@FindBy(xpath="//div[@id='gh-top']/ul/li/span/a")
	public static WebElement SignIn_link;	
	@FindBy(id="userid")
	public static WebElement Email_box;
	@FindBy(id="signin-continue-btn")
	public static WebElement continue_btn;
	@FindBy(id="pass")
	public static WebElement password_box;
	@FindBy(id="sgnBt")
	public static WebElement Signin_btn;
	@FindBy(xpath="//ul[@id='gh-topl']/li[2]/a")
	public static WebElement dailydealtext;
	@FindBy(xpath="//form[@id='signin-form']/div/div/span[2]/p/p")
	public static WebElement errormessage;
	@FindBy(id="signin_fb_btn")
	public static WebElement ContinueFaceBook;
	@FindBy(xpath="//div[@id='email_container']/input")
	public static WebElement emailphonetxt;
	@FindBy(id="loginbutton")
	public static WebElement loginbtn;
	@FindBy(xpath="//div[@class='j83agx80 cbu4d94t']/div/div/div/div/div/div/span/span")
	public static WebElement continueasbtn;
	@FindBy(id="gf-norton")
	public static WebElement logohover;
	@FindBy(xpath="//div[@class='need-help need-help-container']/div/a")
	public static WebElement Needhelpbtn;
	@FindBy(xpath="//div[@id='emailWithCode']/div[2]/button")
	public static WebElement receiveemail;
	@FindBy(id="fyp-btn")
	public static WebElement Resetpassbtn;
	@FindBy(xpath="//div[@id='mainContent']/div/button")
	public static WebElement Emailbox;
	@FindBy(xpath="//div[@class='body-content']/div/div/div/div/div/div/div/input")
	public static WebElement passwordreset;
	@FindBy(xpath="//div[@class='body-content']/div/div/div/div/button")
	public static WebElement continueafterest;
	@FindBy(xpath="//div[@id='text']/div[2]/button")
	public static WebElement receivetext;
	@FindBy(id="userid")
	public static WebElement Emailtextbox;
	public SignIn(WebDriver driver) {
		this.driver = driver;
		// Call initElements() method by using PageFactory reference and pass driver and this as parameters. 
	    PageFactory.initElements( driver, this); 
	}
	
	//Methods for Sign In with valid credentials 
	public static void Sign_in_link()
	{
		try
		{
			SignIn_link.click();
			Thread.sleep(30000);
		}
		catch(Exception e)
		{
			System.out.println("In Sign in Link");
			System.out.println(e);
		}
	}
	public static void Sign_in_button() {
		try
		{
			Signin_btn.click();
		}
		catch(Exception e)
		{
			System.out.println("In Sign in Button");
			System.out.println(e);
		}
	}
	//User enter valid password
	public static  void valid_password(String string) {
		try
		{
			password_box.sendKeys(string);
			
		}
		catch(Exception e)
		{
			System.out.println("In Password box");
			System.out.println(e);
		}
		
	}
	//Click on Continue button
	public static void click_continue_button() throws InterruptedException {
		try
		{
			continue_btn.click();
			CaptureScreen.screenShot(1);
		Thread.sleep(3000);
		}
		catch(Exception e)
		{
			System.out.println("In Continue Button");
			System.out.println(e);
		}
		
	    
	}
	//Enter valid email
	public static void validemai_id(String string) throws InterruptedException {
		try
		{
			Email_box.sendKeys(string);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("In Emailid Box");
			System.out.println(e);
		}
	   
	}
	//Enter invalid Email id
	public static void invalidemai_id(String string) throws InterruptedException {
		try
		{
			Email_box.sendKeys(string);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("In invalid Emailid Box");
			System.out.println(e);
		}
	   
	}
	//Enter blank email
	public static void blankdemai_id() throws InterruptedException {
		try
		{
			Email_box.sendKeys("");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println("In blank Emailid Box");
			System.out.println(e);
		}
	   
	}
	//Error Message
	public static void errorMessage()
	{
		try
		{
			System.out.println("Error Message :"+errormessage);
		}
		catch(Exception e)
		{
			System.out.println("In Error Message");
			System.out.println(e);
		}
	}
	//User enter valid password
		public static  void invalid_password(String string) {
			try
			{
				password_box.sendKeys(string);
			}
			catch(Exception e)
			{
				System.out.println("Invalid Password box");
				System.out.println(e);
			}
			
		}
		public static  void blank_password() {
			try
			{
				password_box.sendKeys("");
			}
			catch(Exception e)
			{
				System.out.println("blank Password box");
				System.out.println(e);
			}
			
		}
		public static  void clickonfacebookbtn() {
			try
			{
				ContinueFaceBook.click();
				
			}
			catch(Exception e)
			{
				System.out.println("In continue with facebook");
				System.out.println(e);
			}
			
		}
		public static  void enteremailorphone(String string) {
			try
			{
				emailphonetxt.sendKeys(string);
				
			}
			catch(Exception e)
			{
				System.out.println("In enteremailorphone text box of  facebook");
				System.out.println(e);
			}
			
		}
		public static  void clickonloginbtn() {
			try
			{
				loginbtn.click();
				
			}
			catch(Exception e)
			{
				System.out.println("In clicked login button");
				System.out.println(e);
			}
			
		}
		public static  void clickonloginforfacebook() {
			try
			{
				continueasbtn.click();
				
			}
			catch(Exception e)
			{
				System.out.println("In clicked continue as button on facebook");
				System.out.println(e);
			}
			
		}
		public static void Need_Help_Link_Click()
		{
			try
			{
				Actions act=new Actions(Browsing.driver);
				act.moveToElement(logohover).build().perform();	
				Thread.sleep(3000);
				Needhelpbtn.click();
			}
			catch(Exception e)
			{
				System.out.println("In Need Help Link");
				System.out.println(e);
			}
		}
		public static void Reset_Password_Button_Click()
		{
			try
			{
				Resetpassbtn.click();
				
			}
			catch(Exception e)
			{
				System.out.println("In Reset Password Button Click");
				System.out.println(e);
			}
		}
		public static void Receive_Email_Button_Click()
		{
			try
			{
				receiveemail.click();
				Thread.sleep(30000);
				
			}
			catch(Exception e)
			{
				System.out.println("In Reset Password Button Click");
				System.out.println(e);
			}
		}
		public static void continue_Email_Button()
		{
			try
			{
				Emailbox.click();
						
			}
			catch(Exception e)
			{
				System.out.println("In continue Email Button");
				System.out.println(e);
			}
		}
		public static void New_Email_Password(String password)
		{
			try
			{
				passwordreset.sendKeys(password);
						
			}
			catch(Exception e)
			{
				System.out.println("In New Email Password");
				System.out.println(e);
			}
		}
		public static void continue_After_Reset()
		{
			try
			{
				continueafterest.click();
						
			}
			catch(Exception e)
			{
				System.out.println("In Continue After Reset Button");
				System.out.println(e);
			}
			
		}
		public static void Receive_Otp_In_Phone()
		{
			try
			{
				receivetext.click();
						
			}
			catch(Exception e)
			{
				System.out.println("In Receive Otp In Phone");
				System.out.println(e);
			}
		}
		public static void Enter_Email_Id(String Emailid)
		{
			try
			{
				Emailtextbox.sendKeys(Emailid);
						
			}
			catch(Exception e)
			{
				System.out.println("In Receive Otp In Phone");
				System.out.println(e);
			}
		}
	}
