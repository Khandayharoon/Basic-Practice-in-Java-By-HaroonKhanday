import java.util.Scanner;
public class AverageMarks {
	public static void main(String agrs [])
	{
		int m1,m2,m3;
		String str;
		Scanner S = new Scanner(System.in);
		str = S.next();
		char ch = str.charAt(0);
		m1=S.nextInt();
		m2=S.nextInt();
		m3=S.nextInt();
		int Avg = (m1+m2+m3)/3;
		System.out.println(ch);
		System.out.print(Avg);
		
		S.close();
	}

}
