package hkpratice;
import java.util.Scanner;
public class SquarePatternByHK {

	public static void main(String[] args) {
		
//		Square Pattern By Haroon Khanday 
//		
//		* * * *
//		* * * *
//		* * * *
//		* * * * 
//		here we will take number rows from user which will be n
//		Date 25/07/2023
		
		int n,i=1;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		
		while(i<=n)
		{
			int j=1;
			while (j<=n)
			{
				System.out.print("*"+" ");
//				j=j+1;
				j+=1;
			}
			System.out.println();
//			i=i+1;
			i+=1;
		}
		
//		now with for loop we can do the same 
		
		System.out.print ("\n Above output is with While loop and below is with for loop");
		
		for (int k=1; k<=n; k++)
		{
			for (int j=1; j<=n; j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	
	s.close();	
	}

}
