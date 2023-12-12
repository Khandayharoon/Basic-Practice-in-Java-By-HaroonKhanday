package StringsAndLogics;

public class pqrsSubstrings {

	public static void main(String[] args) {

		String str = "pqrs";

		for (int len = 1; len <=str.length(); len++) {
			for (int start = 0; start <= str.length()-len; start++) {
				int end = start + len - 1;
				System.out.println(str.substring(start, end + 1));
			}
		}
	}

}
