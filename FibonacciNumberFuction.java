package com.test.done;
import java.util.Scanner;
public class FibonacciNumberFuction {

	public static void main (String args [])
	{
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		boolean result = fin(num);
		System.out.println(result);
		s.close();
	}
	
	public static boolean fin(int num)
	{
		int a = 0;
		int b = 1;
		int c = 0;
		
		while (c < num)
		{
			c = a+b;
			a = b;
			b = c;
		}
		
		if (c==num)
		{
			return true;
			
		}
		else
		{
			return false;
		}
	}
}
