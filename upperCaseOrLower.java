package Strings;

import java.util.Scanner;

public class upperCaseOrLower {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().trim().charAt(0);
		if (ch >= 'a' && ch <= 'z') {
			System.out.println("Enter char is in Lower-Case/small");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Enter char is in Upper-Case/Captial");
		} else {
			System.out.println("Not Alphabet is entered so far");
		}
		
	s.close();
	}

}
