package steps;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	
	
	//this hooks are used to link the annotaiton with the feature
	//The Before and After are from cucumber.api package, not from selenium
	//build verification test
	@Before("@bvt")
	public void setUp() {
		System.out.println("setup");
	}
	
	@After("@bvt")
	public void quit() {
		System.out.println("quit");
	}
	
	@Before("@prod")
	public void setUpProd() {
		System.out.println("setup for production");
	}
	
	@After("@prod")
	public void quitProd() {
		System.out.println("quit for production");
	}
	
	
	@Given("user navigates to facebook website")
	public void user_navigates_to_facebook_website() {
	}

	@When("user validates the homepage title")
	public void user_validates_the_homepage_title() {
	}
	
	@Then("^user entered \"([^\"]*)\" username$")
	public void user_entered_the_username(String username) {
	}

	@Then("^user entred \"([^\"]*)\" password$")
	public void user_entred_the_password(String password) {
	}

	@Then("^user \"([^\"]*)\" successfully logged in$")
	public void user_should_be_successfully_logged_in(String status) {
	}
	
	@And("^user select the age category$")
	public void user_select_the_age_and_location(DataTable table) {
		
		List<Map<String,String>> data = table.asMaps(String.class, String.class);
		System.out.println("age " + data.get(0).get("Age") + " " + data.get(0).get("Location"));
	}

	}
