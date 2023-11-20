package ArraysAndLogic.com;
public class SwapAlternativesInArray {
	public static void main(String args []) {
		int arr[]= {1,0,3,2,5,4,7,6,9,8};
		swapAlternatives(arr);
		printArray(arr);
	}

	public static void swapAlternatives(int []arr) {
		int temp;
		for(int i=0; i<arr.length-1;i+=2)
		{
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	
	public static void printArray(int []arr) {
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
			}
	}
}
