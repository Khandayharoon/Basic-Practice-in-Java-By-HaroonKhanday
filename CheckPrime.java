
import java.util.Scanner;
public class CheckPrime {
	public static void main (String args [])
	{	
		System.out.println("Please Enter the Number");
		int n;
		int div = 2;
		boolean isPrime = true;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();

		while(div<=n-1)
		{
			if (n%div==0)
			{
				isPrime = false;
			}
			div=div+1;

		}

		if (isPrime == true)
		{
			System.out.println(n + " " + "is prime");
		}
		else
		{
			System.out.println(n + " " + "is Composite");
		}
		s.close();
	}
}
