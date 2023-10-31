package com.test;

public class SuperReducedString {

	public static void main(String[] args) {
		String str = "aacddcbaa";
		System.out.println(superReducedString(str));
	}

	public static String superReducedString(String str) {
		StringBuilder build = new StringBuilder();

		for (int i = 0; i < str.length() - 1; i++) {
			System.out.println("Value " + i);
			char current = str.charAt(i);
			System.out.println("Curent " + current);
			System.out.println("i + 1 " + str.charAt(i + 1));
			if (current != str.charAt(i + 1)) {
				build.append(str.charAt(i));
			} else if (current == str.charAt(i + 1)) {

				i++;
			}
		}
		if (build.length() > 1) {
			System.out.println("Length " + build);
			superReducedString(build.toString());
		}

		return build.toString();

	}

}
