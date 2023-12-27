package Strings;

import java.util.Scanner;

public class StringIsPalindrome {

	public static void main(String[] args) {
		String str;
		System.out.println("Please type any String");
		Scanner s = new Scanner(System.in);
		str = s.next().trim();

		boolean isPalindrome = ispalindrome(str);
		if (isPalindrome) {
			System.out.println("String is Palindrome");
		} else {
			System.out.println("String is not Palindrome");
		}
		s.close();
	}

	public static boolean ispalindrome(String str) {
		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}

		if (rev.equals(str)) {
			return true;
		} else {
			return false;
		}

	}
}
