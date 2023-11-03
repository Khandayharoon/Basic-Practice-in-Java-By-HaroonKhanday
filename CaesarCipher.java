package com.test.done;

public class CaesarCipher {

	public static void main(String[] args) {
		String str = "z";
		int k = 2;
		caesarCipher(str, k);
	}

	public static String caesarCipher(String s, int k) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {
			int num = (s.charAt(i));

			if (num >= 97 && num <= 122) {
				if (num + k > 122) {
					num = ((num + k - 122)) + 96;
					System.out.println(num);
					num = ((num - 97 + k) % 26) + 97;
					System.out.println(num);
				} else {
					num = num + k;
				}
				char x = (char) num;
				result.append(x);

			} else if (num >= 65 && num <= 90) {
				if (num + k > 90) {
					num = ((num + k - 90) % 26) + 64;
					// char x = (char) num;
					System.out.println(num);
					num = ((num - 65 + k) % 26) + 65;
					System.out.println(num);
				} else {
					num = num + k;
				}
				char x = (char) num;
				result.append(x);
			} else {
				char x = (char) num;
				result.append(x);
			}

		}
		// System.out.println(result.toString());
		return result.toString();

	}
}
