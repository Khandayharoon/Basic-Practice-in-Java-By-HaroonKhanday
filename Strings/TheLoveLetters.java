package Strings;

public class TheLoveLetters {

	public static void main(String[] args) {
		String s = "abcba";
		int res = loveLetters(s);
		System.out.println(res);

	}

	static int loveLetters(String s) {
		int op = 0;
		for (int i = 0; i < s.length(); i++) {
			char start = s.charAt(i);
			char last = s.charAt(s.length() - 1 - i);

			op = Math.abs(start - last);
		}

		return op;
	}

}
