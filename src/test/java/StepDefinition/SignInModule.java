package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

import java.io.IOException;

import org.browser.com.Browsing;
import org.pages.com.SignIn;

public class SignInModule {
	SignIn objSignin;

	// public static WebDriver driver;
	@Given("user is on the home page {string}")
	public void user_is_on_the_home_page(String string) throws Exception {
		Browsing.setDriver();
		Browsing.getUrl(string);
	}

	@When("user click on the Sign In link")
	public void user_click_on_the_Sign_In_link() {
		objSignin = new SignIn(Browsing.driver);
		objSignin.Sign_in_link();
		// SignInModule.Sign_in_link();
	}

	@Then("user will be redirected to the sign in page")
	public void user_will_be_redirected_to_the_sign_in_page() throws Exception {
		if (Browsing.getTitle().equals("Sign in:Sign in or Register | eBay")) {
			System.out.println("User is redirected to the sign in page");
		} else {
			System.out.println("User donesn't redirected to the sign in page");
		}
	}

	@When("user enters valid emai id {string}")
	public void user_enters_valid_emai_id(String string) throws InterruptedException {
		SignIn.validemai_id(string);

	}

	@And("user click on the continue button")
	public void user_click_on_the_continue_button() throws InterruptedException {
		SignIn.click_continue_button();

	}

	@And("user enters valid password {string}")
	public void user_enters_valid_password(String string) {
		SignIn.valid_password(string);

	}

	@And("user click on the Sign in button")
	public void user_click_on_the_Sign_in_button() {
		SignIn.Sign_in_button();
	}

	@Then("user will Sign in successfully and redirect to home page of ebay")
	public void user_will_Sign_in_successfully_and_redirect_to_home_page_of_ebay() throws Exception {
		if (Browsing.getTitle().equals("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
			System.out.println("User successfully logged in and redirected to home page");
		} else {
			System.out.println("User can not logged in and redirected to home page");
		}
		Browsing.closeBrowser();

	}
	//I need to change from here
	@When("user enters in valid emai id {string}")
	public void user_enters_in_valid_emai_id(String string) throws InterruptedException {
		SignIn.invalidemai_id(string);
	}

	@And("user click on continue button")
	public void user_click_on_continue_button() throws InterruptedException {
		SignIn.click_continue_button();
	}

	@Then("user will get an error message Invalid Email Id")
	public void user_will_get_an_error_message_Invalid_Email_Id() {
		    SignIn.errorMessage();
		    Browsing.closeBrowser();
	}

	@When("user enters invalid password {string}")
	public void user_enters_invalid_password(String string) {
		SignIn.invalid_password(string);
	   
	}

	@Then("user will get an error message Either Username or Password is incorrect.")
	public void user_will_get_an_error_message_Either_Username_or_Password_is_incorrect() {
		System.out.println("Inside Invalid password");
		 SignIn.errorMessage();
		 Browsing.closeBrowser();
	}

	@When("user left the email id field as blank")
	public void user_left_the_email_id_field_as_blank() throws InterruptedException {
		SignIn.blankdemai_id();	
	    
	}
//	//I have added this one which is not generated automatically
//	@And("user click on continue button")
//	public void user_click_on_continue_button1() throws InterruptedException {
//		SignIn.click_continue_button();
//	}
	

	@Then("user gets an appropriate error message on the screen")
	public void user_gets_an_appropriate_error_message_on_the_screen() {
		System.out.println("Inside blank Email id");
		 SignIn.errorMessage();
		 Browsing.closeBrowser();
	}

	@When("user left the password field as blank")
	public void user_left_the_password_field_as_blank() {
	  SignIn.blank_password();
	}
//	@And("user click on continue button")
//	public void user_click_on_continue_button2() throws InterruptedException {
//		SignIn.click_continue_button();
//	}

	@Then("user can not able to click on the Sign in button and can not sign in")
	public void user_can_not_able_to_click_on_the_Sign_in_button_and_can_not_sign_in() throws Exception {
		if (Browsing.getTitle().equals("Sign in:Sign in or Register | eBay")) {
			System.out.println("User is Still on the Sign In page");
		} else {
			System.out.println("User succesfully Signed In");
		}
		Browsing.closeBrowser();
	}

	@When("user click on continue with facebook button")
	public void user_click_on_continue_with_facebook_button() {
		SignIn.clickonfacebookbtn();
	    
	}

	@And("user enters email id or phone no of face book account {string}")
	public void user_enters_email_id_or_phone_no_of_face_book_account(String string) {
	   SignIn.enteremailorphone(string);
	}

	@And("user enters the password of facebook account {string}")
	public void user_enters_the_password_of_facebook_account(String string) {
		SignIn.valid_password(string);
	    
	}

	@And("user click on the Log In button")
	public void user_click_on_the_Log_In_button() {
		SignIn.clickonloginbtn();
	    
	}
	@And("user click on continue As button")
	public void user_click_on_continue_As_button() {
		SignIn.clickonloginforfacebook();
	    
	}
	@Then("user will success fully logged in to the facebook account and sign in and redirect to the home page")
	public void user_will_success_fully_logged_in_to_the_facebook_account_and_sign_in_and_redirect_to_the_home_page() throws Exception {
		if (Browsing.getTitle().equals("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
			System.out.println("User successfully logged in and redirected to home page");
		} else {
			System.out.println("User can not logged in and redirected to home page");
		}
		Browsing.closeBrowser();
		
	}

	

}
