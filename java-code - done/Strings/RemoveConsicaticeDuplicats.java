package Strings;

public class RemoveConsicaticeDuplicats {

	public static void main(String[] args) {
		String str = "aaabbccdf";
//		output Should be abcdf

		removeDuplicates(str);

	}

	public static void removeDuplicates(String str) {

		if (str.length() == 0) {
			System.out.println("String is empty");
			return;
		}
		char lastChar = str.charAt(0);
		String result = "";
		result += str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != lastChar) {
				result += str.charAt(i);
				lastChar = str.charAt(i);
			}
		}
		System.out.println(result);
	}

}
