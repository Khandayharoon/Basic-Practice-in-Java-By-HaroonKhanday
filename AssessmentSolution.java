package ArraysAndLogic.com;

public class AssessmentSolution {

	public static void main(String[] args) {
		
		int x=5;
		System.out.println(x++);
//////		the output of above code will be 5 because 
////		5 will be printed, and then x will be incremented 
//	
		int[] arr1 = new int[5];
		System.out.println(arr1[3]);
		int arr2[] = {1, 2, 3, 4, 5};
		System.out.println(arr2[3]);
//		
//		sumOfEvenNumbers();
//		
//		
		String str = "dlrow olleH"; 
//////		just for fun i have mention reversed String above so
////		when call the fucntion it will make it reverse and it will be correct String
	String resultString =	reveredword(str);
	System.out.println(resultString);
//	
//	
	  int[] arrayToSort = {12, 5, 23, 8, 17, 9};

      // Call the mergeSort method on the arrayToSort
      mergeSort(arrayToSort);

      // Print the sorted array
      System.out.println("Sorted Array:");
      for (int num : arrayToSort) {
          System.out.print(num + " ");
      }
  
	
	}

	
	    public static void mergeSort(int[] array) {
	        if (array.length > 1) {
	            int mid = array.length / 2;

	            // Split the array into two halves
	            int[] leftArray = new int[mid];
	            int[] rightArray = new int[array.length - mid];

	            // Copy elements to leftArray and rightArray
	            for (int i = 0; i < mid; i++) {
	                leftArray[i] = array[i];
	            }
	            for (int i = mid; i < array.length; i++) {
	                rightArray[i - mid] = array[i];
	            }

	            // Recursively sort the two halves
	            mergeSort(leftArray);
	            mergeSort(rightArray);

	            // Merge the sorted halves
	            merge(array, leftArray, rightArray);
	        }
	    }

	    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
	        int i = 0; // Index for leftArray
	        int j = 0; // Index for rightArray
	        int k = 0; // Index for array

	        // Merge the two arrays
	        while (i < leftArray.length && j < rightArray.length) {
	            if (leftArray[i] <= rightArray[j]) {
	                array[k++] = leftArray[i++];
	            } else {
	                array[k++] = rightArray[j++];
	            }
	        }

	        // Copy remaining elements of leftArray, if any
	        while (i < leftArray.length) {
	            array[k++] = leftArray[i++];
	        }

	        // Copy remaining elements of rightArray, if any
	        while (j < rightArray.length) {
	            array[k++] = rightArray[j++];
	        }
	    }
	
	public static void sumOfEvenNumbers() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of even numbers from 1 to 10: " + sum);
    }


		public static String reveredword(String str) {
			String Rev="";
			int size = str.length();
			for(int i=0; i<size; i++)
			{
				Rev = str.charAt(i)+Rev;
			}
			
			return Rev;
		}

}