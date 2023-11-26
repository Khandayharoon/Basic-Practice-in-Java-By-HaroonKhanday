package ArraysAndLogic.com;

public class BubbleSortLastPractice {

	public static void main(String[] args) {
			int arr[]= {6,0,1,8,2,3,5,7,9,4};
			bubbleSortArray(arr);
			PrintSortedArray(arr);
	}
	
	public static void bubbleSortArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	public static void PrintSortedArray(int arr [])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+", ");
		}
	}

}
