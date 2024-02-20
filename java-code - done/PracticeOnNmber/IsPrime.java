package PracticeOnNmber;

import java.util.Scanner;
public class IsPrime {
	public static void main ( String [] args) {
		System.out.println("Please Enter a number");
		int num ,c=2;
		boolean isPrime = true;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
//		c<num/2    c*c<=num  c<num
		
		while(c*c<=num) {        
			if(num%c==0) {
				isPrime = false;
				break;
			}
			c++;
		}
		
		if(isPrime) {
			System.out.println(num +" "+" is a Prime Number");
		}
		else
		{
			System.out.println(num +" "+" is a Composite Number");
		}
		
	s.close();	
	}

}
