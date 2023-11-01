package com.test.done;

public class fucntionEvenNumber {
	
	public static void  even (int num) {
		for (int i=1; i<=num; i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
	}
	
	public static void main (String args [])
	{
		even(10);
	}

}
