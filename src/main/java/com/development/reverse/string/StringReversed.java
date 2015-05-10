package com.development.reverse.string;

import java.util.Scanner;

public class StringReversed {
	
	public static void main(String...args) {
		System.out.println("Please enter the String: ");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		s = reverseString(s);
		System.out.println("s is " + s);
		s = recursiveString(s);
		System.out.println("s is " + s);
		sc.close();
	}

	private static String recursiveString(String s) {
		
		if (s.length() == 1) {
			return s;
		}
		return s.charAt(0) + recursiveString(s.substring(1));
		
	}

	private static String reverseString(String s) {
		
		StringBuilder sb = new StringBuilder(s.length());

		for (int i=s.length() - 1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		
		return sb.toString();
	}
}
