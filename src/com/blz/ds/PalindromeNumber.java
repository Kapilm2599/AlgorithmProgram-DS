package com.blz.ds;

import java.util.*;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println("Enter The Value In String Format");
		Scanner scanner = new Scanner(System.in); 
		String str = scanner.next(); 
		String reverseStr = "";

		int strLength = str.length();

		for (int i = (strLength - 1); i >= 0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}
		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		} else {
			System.out.println(str + " is not a Palindrome String.");
		}

	}

}
