package StringsAndLogics;

public class ReverseAStringWordWise {

	public static void reverseWordWise(String input) {
		String revSentence = "";
		if (input.length() != 0) {
			int start = 0;
			int end;
			for (int i = 0; i < input.length(); i++) {
				String word = "";
				if (input.charAt(i) == ' ') {
					end = i - 1;
					for (int j = start; j <= end; j++) {
						word += input.charAt(j);
					}
					revSentence = word + " " + revSentence;
					start = i + 1;
				}

			}
			end = input.length() - 1;
			String lastWord = "";
			for (int j = start; j <= end; j++) {
				lastWord += input.charAt(j);
			}
			revSentence = lastWord + " " + revSentence;
		}
		System.out.println(revSentence);
	}

	public static void main(String[] args) {
		String str = "Coding is fun";
		// Output: fun is Coding
		reverseWordWise(str);
	}
}
