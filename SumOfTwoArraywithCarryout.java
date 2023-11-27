package ArraysAndLogic.com;

public class SumOfTwoArraywithCarryout {

	public static void main(String[] args) {
		int arr1[] = { 6, 2, 4 };
		int arr2[] = { 7, 5, 6 };
		int output[] = new int[Math.max(arr1.length, arr2.length) + 1];
		sumOfTwoArrays(arr1, arr2, output);

		for (int i = 0; i < output.length; i++) {
			System.out.print(output[i] + ", ");
		}

	}

	public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {

		int i = arr1.length - 1;
		int j = arr2.length - 1;
		int carry = 0;
		int k = Math.max(arr1.length, arr2.length);

		while (i >= 0 && j >= 0) {
			int sum = arr1[i] + arr2[j] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			i = i - 1;
			j = j - 1;
			k = k - 1;
		}
		while (i >= 0) {
			int sum = arr1[i] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			i = i - 1;
			k = k - 1;
		}

		while (j >= 0) {
			int sum = arr2[j] + carry;
			output[k] = sum % 10;
			carry = sum / 10;
			j = j - 1;
			k = k - 1;
		}

		output[0] = carry;
	}
}
