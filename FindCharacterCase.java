import java.util.Scanner;
public class FindCharacterCase {
	public static void main(String args [])
	{
		String str;
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		char c;
		c = str.charAt(0);

		if (c>=65 && c<=90)
		{
			System.out.println("1");
		}
		else if (c>=97 && c<=122)
		{
			System.out.println("-1");
		}
		else 
		{
			System.out.println("0");
		}
		scan.close();
	}
}
