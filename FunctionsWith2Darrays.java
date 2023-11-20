package ArraysAndLogic.com;

import java.util.Scanner;

public class FunctionsWith2Darrays {
	public static int[][] takeInput() {
		Scanner s = new Scanner(System.in);
		int rows, cols;
		System.out.println("Please enter the number of Rows for 2D array");
		rows = s.nextInt();
		System.out.println("Please enter the number of Colmuns for 2D array");
		cols = s.nextInt();

		int[][] arr = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
	
	public static void print2Darray(int[][]arr) {
		int rows = arr.length;
		int cols=arr[0].length;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String [] args) {
		
		int [][]input=takeInput();
		print2Darray(input);
	}
}
