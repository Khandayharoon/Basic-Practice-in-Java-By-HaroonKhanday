import java.util.Scanner;
public class primeNumbers {
	public static void main (String agrs [])
	{
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
			 for (int i=2; i<=n; i++)
			 {
				 boolean isPrime = true;
				 for (int j=2; j<i; j++)
				 {
					 if(i%j==0)
					 {
						 isPrime =false;
						 break;
					 }
				 }
				
				if(isPrime)
				{
					System.out.println(i + "is Prime");
				}
				else
				{
					System.out.println(i + "is Compsite");
				}
			 }
	s.close();
	}

}
