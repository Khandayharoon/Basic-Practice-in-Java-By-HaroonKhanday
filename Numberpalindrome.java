package ArraysAndLogic.com;

public class Numberpalindrome {

	public static void main(String[] args) {

		int num = 121;
		int temp = num;
		int reversed = 0;
		while (temp != 0) {
			int rem = temp % 10;
			reversed = reversed * 10 + rem;
			temp = temp / 10;
			
		}
		System.out.println(reversed);
	}

}
