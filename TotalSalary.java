import java.util.Scanner;
public class TotalSalary {
	public static void main(String [] args)
	{
		double basicSalary; 
		double totalSalary;
		Scanner s = new Scanner(System.in);
		basicSalary = s.nextInt();
		String grade = s.next();
		char ch = grade.charAt(0);
		double hra = ((basicSalary*20)/100);
		double da = ((basicSalary*50)/100);
		double pf = ((basicSalary*11)/100);
		int allow = 0;
		if(ch == 65)
		{
			allow = 1700;
		}
		else if(ch == 66) 
		{
			allow = 1500;
		}
		else
		{
			allow=1300;
		}

		totalSalary = (basicSalary+hra +da+allow) - pf;
		System.out.println(Math.round(totalSalary));
		s.close();	
	}
}
