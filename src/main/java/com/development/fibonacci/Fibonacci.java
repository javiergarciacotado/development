package com.development.fibonacci;

import java.util.Map;

public class Fibonacci {

	private Map<Integer, Integer> map;
	private Integer number;
	
	public Fibonacci(Map<Integer,Integer> map) {
		this.map = map;
	}
	
	public int calculate() {
		if (this.getNumber() < 0) throw new IllegalArgumentException();
		//Base case
		map.put(0,0);
		map.put(1,1);
		
		return cachedFibonacci(number);
	}

	private int cachedFibonacci(int number) {
		if (map.containsKey(number)) {
			return map.get(number);
		}
		
		int value = cachedFibonacci(number - 1) + cachedFibonacci(number -2);
		map.put(number, value);
		return value;
 	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
