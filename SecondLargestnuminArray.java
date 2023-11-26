package ArraysAndLogic.com;

public class SecondLargestnuminArray {

	public static int secondlarges(int arr[]) {

		int largest = arr[0];
		int secoundlargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secoundlargest = largest;
				largest = arr[i];
			} else if (arr[i] > secoundlargest && arr[i] != largest) {
				secoundlargest = arr[i];
			}
		}

		return secoundlargest;
	}

	public static void main(String[] args) {

		int arr[] = { 45, 78, 1, 0, 5, 88, 89, 36, 67, 44 };

		int result = secondlarges(arr);
		System.out.println(result);
	}

}
