package ArraysAndLogic.com;

public class PushZeroAtEnd {

	public static void main(String[] args) {

		int[] arr = {1, 0, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

		pushZeroatend(arr);

	}

	public static void pushZeroatend(int arr[]) {
		int n = arr.length;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[count] = arr[i];
				count++;
			}
		}
		while (count < n) {
			arr[count] = 0;
			count++;
		}

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
	}

}
