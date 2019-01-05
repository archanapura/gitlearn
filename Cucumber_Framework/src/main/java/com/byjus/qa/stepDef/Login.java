package com.byjus.qa.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login {
	
	
	
	@Given("^Browser is lanuched$")
	public void browser_is_lanuched() throws Throwable {

		System.out.println("Browser launched");

	}

	@Given("^gmail url is entered$")
	public void gmail_url_is_entered() throws Throwable {

System.out.println("Url entered");
	}

	@Then("^I should be on the gmail login page$")
	public void i_should_be_on_the_gmail_login_page() throws Throwable {

System.out.println("we are in gmail page");
	}

	@When("^I enter the valid username \"([^\"]*)\"$")
	public void i_enter_the_valid_username(String arg1) throws Throwable {

			System.out.println("entered user name is "+arg1);
	}

	@When("^I enter the valid password \"([^\"]*)\"$")
	public void i_enter_the_valid_password(String arg1) throws Throwable {

			System.out.println("entered password is "+arg1);
	}

	@When("^I click on signing button$")
	public void i_click_on_signing_button() throws Throwable {

System.out.println("clicked on signing button");
	}

	@Then("^I should be seeing the inbox page$")
	public void i_should_be_seeing_the_inbox_page() throws Throwable {

System.out.println("Im in inbox page");
System.out.println("----------------------------------------");
	}

}
