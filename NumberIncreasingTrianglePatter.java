package hkpratice;

public class NumberIncreasingTrianglePatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		As we know we dont have to mix the number pattern and shap patter new logic
		
		int n=5;
		for (int i=1 , p=0; i<=n; i++,p+=2)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(p+" ");
			}
		System.out.println();	
		}
		
//		int n=5;
//		for (int i=1 , p=1; i<=n; i++,p++)
//		{
//			for (int j=1; j<=i; j++)
//			{
//				System.out.print(p+" ");
//			}
//		System.out.println();	
//		}
		
		
//		int n=5;
//		for (int i=1; i<=n; i++)
//		{
//			for (int j=1; j<=i; j++)
//			{
//				System.out.print(i+" ");
//			}
//		System.out.println();	
//		}
		
	}

}
