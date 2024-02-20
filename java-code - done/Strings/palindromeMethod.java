package Strings;

public class palindromeMethod {

	public static void main(String[] args) {
		boolean is = palindrome(121);
		if(is) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
	}

	public static boolean palindrome(int num) {
		int temp = num;
		int rev = 0;

		while (num > 0) {
			int rem = num % 10;
			rev = rev *10 + rem ;
			
			num = num / 10;
		}
		

		return temp == rev;
	}
}
