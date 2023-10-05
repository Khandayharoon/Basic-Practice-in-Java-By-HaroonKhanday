import java.util.Scanner;
public class NumberIsEvenOrOdd {
	public static void main(String [] agrs)
	{
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		if(num%1==0)
		{
			System.out.println(num + " " +"is even number");
		}
		else
		{
			System.out.println(num + " " + " is odd number");
		}
	
	s.close();
	}

}
