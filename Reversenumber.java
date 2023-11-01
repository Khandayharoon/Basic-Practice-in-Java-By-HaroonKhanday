package com.test.done;
import java.util.Scanner;
public class Reversenumber {

	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int temp = n;
		int rev = 0;
		
		while(temp>0)
		{
			rev=rev*10+temp%10;
			temp = temp /10;
		}
		System.out.println(rev);
		sc.close();
	}
 
}
