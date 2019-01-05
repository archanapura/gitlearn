package com.byjus.qa.stepDef;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HardCode {
	String name;
	int age;
	@Given("^Name of person \"([^\"]*)\"$")
	public void name_of_person(String arg1) throws Throwable {
	  this.name=arg1;
	}

	@When("^User enters age (\\d+)$")
	public void user_enters_age(int arg1) throws Throwable {
	    this.age=arg1;
	}

	@Then("^print \"([^\"]*)\" and (\\d+)$")
	public void print_and(String arg1, int arg2) throws Throwable {
	    if(this.name.equals(arg1)) 
	    {
	    	System.out.println("Correct name is dispalyed");
	    }
	    if(this.age==arg2) 
	    {
	    	System.out.println("Correct age is dispalyed");
	    }
	}


}
