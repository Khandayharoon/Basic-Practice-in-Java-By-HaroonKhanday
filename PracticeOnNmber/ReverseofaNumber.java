package PracticeOnNmber;

import java.util.Scanner;

public class ReverseofaNumber {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		reverseNumber(num);
	
	s.close();	
	}
	public static void reverseNumber(int num) {
		int ans=0;
		while(num>0) {
			int rem = num%10;
			num = num/10;
			ans = ans*10+rem;
		}
		System.out.println(ans);
	}

}
