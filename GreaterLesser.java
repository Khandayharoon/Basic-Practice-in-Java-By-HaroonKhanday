import java.util.Scanner;
public class GreaterLesser {
public static void main (String args [])
{
	int a,b;
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	b = s.nextInt();
	
	if(a > b)
	{
		System.out.println("First number is greater");
	}
	else if (a<b)
	{
		System.out.println("Second number is greater");
	}
	else
	{
		System.out.println("Both are equal");
	}
	s.close();
}
}
