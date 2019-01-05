package com.byjus.qa.stepDef;

import java.util.List;

import org.openqa.selenium.By;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Add2 {
	int a,b,sum;
	String val;
	
	/*@Given("^Two integer numbers$")
	public void two_integer_numbers() throws Throwable {
	     a=10;
	     b=20;
	}*/
/*	@Given("^Two integer numbers (\\d+) and (\\d+)$")
	public void two_integer_numbers_and(int arg1, int arg2) throws Throwable {
	    
	     this.a=arg1;
	     this.b=arg2;
	}
	@Given("^Two integer numbers value(\\d+)_(\\d+) and value(\\d+)_(\\d+)$")
	public void two_integer_numbers_value___and_value__(int arg1, int arg2, int arg3, int arg4) throws Throwable {
		this.a=arg1;
	     this.b=arg2;
	}*/
	@Given("^Two integer numbers <\"([^\"]*)\"> and <\"([^\"]*)\">$")
	public void two_integer_numbers_and(String arg1, String arg2) throws Throwable {
		val=arg1+ arg2;
	}
	
	@Given("^Two integer numbers$")
	public void two_integer_numbers(DataTable arg1) throws Throwable {
	   
		List<List<String>> data = arg1.raw();
		 data.get(0).get(0); 
		 data.get(0).get(1); 
		 val=data.get(0).get(1)+data.get(0).get(0);
	}
	@When("^user adds number$")
	public void user_adds_number() throws Throwable {
	   sum= a+b;
	}

	@Then("^output should be displayed$")
	public void output_should_be_displayed() throws Throwable {
	   System.out.println(val);
	}


}
