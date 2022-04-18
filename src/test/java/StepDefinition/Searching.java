package StepDefinition;

import org.browser.com.Browsing;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.pages.com.Search;




public class Searching {
	
	@When("user enter {string} data")
	public void user_enter_data(String string) {
		Search.data_search_box(string);
	    
	}

	@And("user click enter")
	public void user_click_enter() {
		Search.search_box_click();
	}

	@And("user select the buying format and enter data {string}")
	public void user_select_the_buying_format_and_enter_data(String string) {
		Search.search_price(string);
	   
	}

	@And("user select the Item location and enter data {string}")
	public void user_select_the_Item_location_and_enter_data(String string) {
		Search.search_location(string);
	}

	@And("user select the Shipping Option and enter data {string}")
	public void user_select_the_Shipping_Option_and_enter_data(String string) {
		Search.searchship_option(string);
	}

	@And("user select the Show only item option and enter data {string}")
	public void user_select_the_Show_only_item_option_and_enter_data(String string) {
		Search.showonly_option(string);
	}

	@Then("user gets an appropriate search data according to  requirement specification")
	public void user_gets_an_appropriate_search_data_according_to_requirement_specification() throws Exception {
		if (Browsing.getTitle().equals("Electronics, Cars, Fashion, Collectibles & More | eBay")) {
			System.out.println("User successfully logged in and redirected to home page");
		} else {
			System.out.println("User can not logged in and redirected to home page");
		}
		Browsing.closeBrowser();
	    
	}

}
