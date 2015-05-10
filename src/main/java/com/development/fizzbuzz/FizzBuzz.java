package com.development.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static List<String> fizzbuzz(final int n) {
		
		List<String> list = new ArrayList<String>();
		String s = null;
		for (int i = 1; i <= n; i++) {
			s = toWord(i, 5, "Fizz") + toWord(i, 3, "Buzz");
			if ("".equals(s))
				s = Integer.toString(i);
			list.add(s);
		}
		
		return list;
	}

	private static String toWord(int i, int n, String word) {
		return i % n == 0 ? word : "";  
	}

}
