package com.test;
import java.util.Scanner;
public class StairCase {
	public static void main(String args [])
	{
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		for(int i=1; i<=n; i++)
			
		{
			for (int j=1; j<=n-i; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		

		for(int i=1; i<=n; i++)
			
		{
			for (int j=1; j<i; j++)
			{
				System.out.print("#");
			}
			System.out.println();
		}
		
		s.close();
	}	
}
