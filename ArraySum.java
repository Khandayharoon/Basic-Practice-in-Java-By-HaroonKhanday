package ArraysAndLogic.com;

public class ArraySum {
	public static void main(String [] args)
	{
		int array1 [] = {0,1,2,3,4,5};
		int array2 [] = {6,7,8,9,10};
		arraySum(array1);
		arraySumBoth(array1,array2);
		arraySum2(array2);
		
		
	}
	
	public static void arraySum(int arr []) {
		
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			sum+=arr[i];
		}
		System.out.println("The sum of  first Array is"+" "+sum);
		
	}
	
	public static void arraySumBoth(int arr1[],int arr2[]) {
		int sum=0;
		for(int i=0; i<arr1.length;i++)
		{
			sum+=arr1[i];
		}
		for(int j=0;j<arr2.length;j++) {
			sum+=arr2[j];
		}
		System.out.println("The sum of  Both Array's is"+" "+sum);
		
	}
	
	
	
	public static void arraySum2(int arr [])
	{
		int sum=0;
		for(int i=0; i<arr.length;i++)
		{
			sum+=arr[i];
		}
		System.out.println("The sum of  second Array is"+" "+sum);
	}
}
