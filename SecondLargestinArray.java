package ArraysAndLogic.com;

public class SecondLargestinArray {

	public static void main(String[] args) {
		int[] arr = { 8, 12,68,54,34,776,777};
		secondlargest(arr);
	}

	public static void secondlargest(int arr[]) {

		int largest = arr[0];
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} 
				else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}

		}
		System.out.println(secondLargest);
	}
}
