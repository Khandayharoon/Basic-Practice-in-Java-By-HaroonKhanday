package hkpratice;
import java.util.Scanner;
public class DimondPatternSelf {

	public static void main(String[] args) {
//		   *
//		  * *
//		 * * *
//		* * * *
//	   * * * * *
//		* * * *
//		 * * *
//		  * *
//		   *
		int n;
		Scanner s = new Scanner(System.in);
		n = s.nextInt();
	
//			for (int i=1; i<n; i++)
//			{
//				for(int j=i; j<=n; j++)
//				{
//					System.out.print("  ");
//				}
//				for(int j=1; j<i; j++)
//				{
//					System.out.print("* ");
//				}
//				for(int j=1; j<=i; j++)
//				{
//					System.out.print("* ");
//				}
//				
//			  System.out.println();
//			}
//		
			for (int k=1; k<=n; k++)
			{
				for(int j=1; j<=k; j++)
				{
					System.out.print("  ");
				}
				
				for (int j=k; j<=n; j++)
				{
					System.out.print("* ");
				}
				for (int j=k; j<n; j++)
				{
					System.out.print("* ");
				}
				
			System.out.println();	
			}
		
		
		s.close();
	}

}
