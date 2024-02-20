package Strings;

import java.util.Scanner;

public class GreetingQuestion {

	public static void main(String[] args) {
		String str;
		Scanner s = new Scanner(System.in);
		System.out.println("Please Enter your Name");
		str = s.nextLine().trim();
		System.out.println(" Asalamiualikum " + " " + str);

		s.close();
	}

}
