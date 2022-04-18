package StepDefinition;

import org.browser.com.Browsing;
import org.pages.com.CreateBusinessAccount;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BusinessAccount {
	@When("user choose the Business account radio button")
	public void user_choose_the_Business_account_radio_button() {
		CreateBusinessAccount.Click_Business_Radio_Btn();
	   
	}

	@And("user enters the  Business Name {string}")
	public void user_enters_the_Business_Name(String string) {
		CreateBusinessAccount.Enter_Business_Name(string);
	}

	@And("user enters the  Business Email {string}")
	public void user_enters_the_Business_Email(String string) {
		CreateBusinessAccount.Enter_Business_Email(string);
	}

	@And("user enter the  Password  {string}")
	public void user_enter_the_Password(String string) {
		CreateBusinessAccount.Enter_Business_Password(string);
	}

	@And("user enters the  Business Location {string}")
	public void user_enters_the_Business_Location(String string) {
		CreateBusinessAccount.Enter_Business_Country(string);
	}

	@And("user click on the checkbox I only want to buy on eBay option")
	public void user_click_on_the_checkbox_I_only_want_to_buy_on_eBay_option() {
		CreateBusinessAccount.Enter_Business_Checkbox();
	   
	}
	@When("user click on the BusinessRegister button")
	public void user_click_on_the_BusinessRegister_button() {
		CreateBusinessAccount.Business_Register_Button();
	}
	@When("user enter the otp which is get manually and click the verify button")
	public void user_enter_the_otp_which_is_get_manually_and_click_the_verify_button() {
		CreateBusinessAccount.Verify_Button();
	}

	@Then("user will success fully Registered and Business account will be created")
	public void user_will_success_fully_Registered_and_Business_account_will_be_created() throws Exception {
		 if(Browsing.getTitle().equals("Register: Create a business account"))
		  {
			  System.out.println("Account successfully created");
		  }
		  else
		  {
			  System.out.println("Account is not created");
		  }
		
	   
	}



}
