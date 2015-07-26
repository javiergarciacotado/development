@fibonacci
Feature: Fibonacci Number 
	Scenario Outline: The Nth Fibonacci Number
		Given A number <number>
		When I call Fibonacci
		Then Return a <fibonacciNumber>
		
		Examples: 
		| number | fibonacciNumber |
		|	5	 |		  5	       |
		| 	10	 |		  55	   |
		|	30	 |		832040	   |
		