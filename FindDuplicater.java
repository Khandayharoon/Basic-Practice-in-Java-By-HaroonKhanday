package ArraysAndLogic.com;

public class FindDuplicater {
	public static void main(String args[]) {
		int[] arr = { 0, 0, 2, 5, 4, 7, 1, 3, 6 };
		findDuplicate(arr);
	}

	public static void findDuplicate(int[] arr) {
		int size=arr.length;
		
		for(int i=0; i<size; i++) {
			for(int j=i+1; j<size; j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[i]);
					return;
				}
			}
			
		}
		System.out.println("No Duplicate element");
	}
}
