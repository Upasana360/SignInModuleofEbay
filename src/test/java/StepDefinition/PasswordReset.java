package StepDefinition;

import java.io.IOException;

import org.browser.com.Browsing;
import org.pages.com.SignIn;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PasswordReset {
	@And("user click on the need help link")
	public void user_click_on_the_need_help_link() {
		SignIn.Need_Help_Link_Click();		    
	}

	@And("user select the Reset your password option")
	public void user_select_the_Reset_your_password_option() {
		SignIn.Reset_Password_Button_Click();
	    
	}


	@And("click on Receive Email")
	public void click_on_Receive_Email() {
		SignIn.Receive_Email_Button_Click();
	    
	}

	@And("enter the password received through otp")
	public void enter_the_password_received_through_otp() {
		System.out.println("This is done manually by getting email through OTP");    
	}

	@And("click on continue button")
	public void click_on_continue_button() {
		SignIn.continue_Email_Button();
	   
	}

	@And("enter the new password")
	public void enter_the_new_password() throws IOException {//Use column name 
		String email="upasanamajhi999@gmail.com";
		//String email=ExcelRead.readExcel(6, 2);//Here excel call is occuring to get the email id from excel 
		System.out.println(email);
		SignIn.New_Email_Password(email);
	}

	@And("click on continue")
	public void click_on_continue() {
		
		SignIn.continue_After_Reset();
	    
	}

	@Then("user can able to change the old password with new one.")
	public void user_can_able_to_change_the_old_password_with_new_one() {
		if(Browsing.driver.getTitle().equals("Change Password"))
		{
			System.out.println("User is navigated succesfully to reset password page");
		}
		else
		{
			System.out.println("User does not navigated to reset password page");
		}
		Browsing.closeBrowser();
	}
	@And("click on Receive Text")
	public void click_on_Receive_Text() {
		SignIn.Receive_Otp_In_Phone();
	}

}
