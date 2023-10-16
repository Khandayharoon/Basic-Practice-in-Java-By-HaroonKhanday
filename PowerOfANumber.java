import java.util.Scanner;
public class PowerOfANumber {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int n = s.nextInt();
		int x = s.nextInt();
		int result = 1;
		int i=1;
		if(x==0)
		{
			result  = 0;
		}
		
		else 
		{
			while(i<=x)
			{
				result = result *n;
				i=i+1;
			}
		}
		System.out.println(result);
		s.close();
	}

}
