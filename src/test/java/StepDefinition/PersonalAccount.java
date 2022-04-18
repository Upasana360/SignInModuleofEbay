package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.browser.com.Browsing;
import org.pages.com.CreatePersonalAccount;

public class PersonalAccount {
	
	@When("user click on the Register link")
	public void user_click_on_the_Register_link() {
		CreatePersonalAccount.Register_link_Click();
	    
	}

	@And("user enters First Name {string}")
	public void user_enters_First_Name(String string) {
		CreatePersonalAccount.First_Name_Send(string);
	    
	}

	@And("user enters Last Name  {string}")
	public void user_enters_Last_Name(String string) {
		CreatePersonalAccount.Last_Name_Send(string);
	}

	@And("user enters Email {string}")
	public void user_enters_Email(String string) {
		CreatePersonalAccount.Email_Send(string);
	}

	@And("user enters Password {string}")
	public void user_enters_Password(String string) {
		CreatePersonalAccount.Password_Send(string);
	}

	@And("user click on the Register button")
	public void user_click_on_the_Register_button() {
		CreatePersonalAccount.Register_Button_Click();
	}

	@Then("user will success fully Registered and Personal account will be created")
	public void user_will_success_fully_Registered_and_Personal_account_will_be_created() throws Exception {
	  if(Browsing.getTitle().equals("Electronics, Cars, Fashion, Collectibles & More | eBay"))
	  {
		  System.out.println("Account successfully created");
	  }
	  else
	  {
		  System.out.println("Account is not created");
	  }
	}

}
