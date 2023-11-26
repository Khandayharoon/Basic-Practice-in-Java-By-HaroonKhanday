package ArraysAndLogic.com;

public class InsertionSortLastPractice {

	public static void main(String[] args) {
			int arr [] = {9,6,3,7,2,8,4,1,0,5};
			insertionSortArray(arr);
			printSortedArray(arr);
	}
	
	public static void insertionSortArray(int arr[]) {
		
		for(int i=1;i<arr.length; i++)
		{
			int j = i-1;
			int temp = arr[i];
			
			while(j>=0 && arr[j]>temp)
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
	}
	
	public static void printSortedArray(int arr[]) {
		for(int i=0;i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}

}
