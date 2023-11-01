package com.test.done;
import java.util.Scanner;
public class NcRFunctions {
	
	public static int factorial (int num)
	{
		int fact = 1;
		for (int i=1; i<=num; i++)
		{
			fact = fact * i;
		}
		return fact;
	}
	
	public static void main (String args [])
	{
		int n ;
		int r ;
		Scanner s = new Scanner (System.in);
		n = s.nextInt();
		r = s.nextInt();
		
		int factN = factorial(n);
		int factR = factorial(r);
		int factNR = factorial(n-r);
		
		int result = factN / (factR * factNR);
		System.out.println(result);
		
	s.close();	
	}

}
