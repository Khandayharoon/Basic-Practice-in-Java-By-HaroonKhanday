import java.util.Scanner;
public class PatternTriangle1 {
	public static void main (String [] agrs)
	{
		int num;
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		int i=1;
		while (i<=num)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print(j);
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		scan.close();
	}
}
