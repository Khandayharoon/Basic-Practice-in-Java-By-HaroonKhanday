package ArraysAndLogic.com;

public class BigSorting {

    public static void main(String[] args) {

        String[] unsorted = {"1", "200", "150", "3"};

        // Bubble Sort
        for (int i = 0; i < unsorted.length; i++) {
            for (int j = 0; j < unsorted.length -1; j++) {
                if (Integer.parseInt(unsorted[j]) > Integer.parseInt(unsorted[j + 1])) {
                    // Swap elements if they are in the wrong order
                    String temp = unsorted[j];
                    unsorted[j] = unsorted[j + 1];
                    unsorted[j + 1] = temp;
                }
            }
        }

        // Display the sorted array
        System.out.println("Sorted Array:");
        for (String num : unsorted) {
            System.out.print(num +" ");
        }
    }
}
