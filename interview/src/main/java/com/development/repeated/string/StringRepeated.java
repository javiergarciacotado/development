package com.development.repeated.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringRepeated {

	public static void main(String[] args) {
		System.out.println("Please enter the input string: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c = firstNonRepeatedString(s);
		System.out.println("The first non repeated string is " + c);
		sc.close();

	}

	private static char firstNonRepeatedString(final String s) {

		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>(s.length());
			
		for (char c: s.toCharArray()) {
			if (map.containsKey(c)) 
				map.put(c, map.get(c) + 1);
			else 
				map.put(c, 1);
		}
		
		for(Entry<Character,Integer> e : map.entrySet()) {
			if (e.getValue() == 1)
				return e.getKey();
		}
		throw new RuntimeException("desired message");
		
		
	}
}
