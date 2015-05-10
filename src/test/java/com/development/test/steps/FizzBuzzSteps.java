package com.development.test.steps;

import java.util.List;

import org.junit.Assert;

import com.development.fizzbuzz.FizzBuzz;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FizzBuzzSteps {
	
	private int number;
	private List<String> resultList;
	
	@Given("^the number (\\w+)$")
	public void theNumber(String number) throws Throwable {
		try
		{
			this.number = Integer.parseInt(number);
		}
		catch (NumberFormatException nfex) {
			this.number = 0;
		}
		
	}

	@When("^I call fizzbuzz$")
	public void iCallFizzbuzz() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    resultList = FizzBuzz.fizzbuzz(number);
	}

	@Then("^I see \"(.*?)\"$")
	public void iSee(List<String> expectedResult) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(expectedResult, resultList);
	}
}
