import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		
		int n,i=0;
		Scanner s = new Scanner(System.in);
		n =s.nextInt();
		while(i<=10)
		{
			System.out.println(n + "x" + i +"=" +(n*i));
			i=i+1;
		}
		
		s.close();
	}

}
