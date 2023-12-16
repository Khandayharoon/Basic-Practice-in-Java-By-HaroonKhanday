package StringsAndLogics;

public class ReverseWordInAString {

    public static void reverseWord(String str) {
        String ans = "";
        int currentWordStart = 0;

        for (int i = 0; i <= str.length(); i++) {
            if (i == str.length() || str.charAt(i) == ' ') {
                int currentWordEnd = i - 1;
                String reverseWord = "";

                for (int j = currentWordEnd; j >= currentWordStart; j--) {
                    reverseWord += str.charAt(j);
                }

                ans += reverseWord + " ";
                currentWordStart = i + 1;
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        String str = "abc def ghi";
        reverseWord(str);
    }
}
