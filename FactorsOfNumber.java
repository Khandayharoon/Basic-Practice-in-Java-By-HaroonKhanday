import java.util.Scanner;
public class FactorsOfNumber {
	public static void main(String [] args)
	{
		int n;
	   Scanner s = new Scanner(System.in);
	   n = s.nextInt();
	  boolean factors = false;
	  int i=2;
	  while(i<n)
	  {
		  if (n%i==0)
		  {
			  System.out.print(i + " ");
			  factors = true;
		  }
		  i=i+1; 
	  }
	if (factors == false)
	{
		 System.out.print("-1");
	}

	
	s.close();
	}
}
