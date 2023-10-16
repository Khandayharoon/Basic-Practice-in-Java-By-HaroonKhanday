import java.util.Scanner;
public class SumOfEvenAndOdd {
	public static void main(String[] args) {
		int n,evenSum=0,oddSum=0;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int r;
		while (n>0)
		{
			r = n%10;

			if(r%2==0)
			{
				evenSum = evenSum + r;	
			}
			else
			{
				oddSum = oddSum + r;	
			}	
          	n = n/10;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
		s.close();	
	}

}
