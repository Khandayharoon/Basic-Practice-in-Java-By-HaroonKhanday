import java.util.Scanner;
public class SumOfNnumbers {
	public static void main(String agrs [])
	{
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
		int i = 1, sum = 0;

		while (i <= n)
		{
			sum = sum + i;
			i = i +1;
		}
		System.out.println(sum);
		s.close();	
	}

}
