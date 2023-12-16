
package StringsAndLogics;

import java.util.Scanner;

public class ResverseASstring {

	public static void main(String[] args) {

		String str;
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		String reverse = revesredString(str);
		System.out.println(reverse);
	s.close();	
	}

	public static String revesredString(String s) {
		String rev = "";
		for (int i = 0; i < s.length(); i++) {
			rev = s.charAt(i) + rev;
		}
		return rev;

	}
}
