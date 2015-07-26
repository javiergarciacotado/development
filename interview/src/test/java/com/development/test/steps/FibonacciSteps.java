package com.development.test.steps;

import java.util.HashMap;

import org.junit.Assert;

import com.development.fibonacci.Fibonacci;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FibonacciSteps {

	private Fibonacci fibonacci;
	private int result;
	
	@Before("@fibonacci")
	public void setUp() {
		this.fibonacci = new Fibonacci(new HashMap<Integer, Integer>());
	}
	
	@Given("^A number (\\d+)$")
	public void a(int number) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    fibonacci.setNumber(number);
	}

	@When("^I call Fibonacci$")
	public void i_call_Fibonacci() throws Throwable {
	    result = fibonacci.calculate();
	}

	@Then("^Return a (\\d+)$")
	public void return_a(int expected) throws Throwable {
	    Assert.assertEquals(result, expected);
	}
}
