package ArraysAndLogic.com;

import java.util.Scanner;

public class InputAndPrint2DArray {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		int rows,cols;
		
		System.out.println("Enter the Number of Rows");
		System.out.println();
		rows = s.nextInt();
		System.out.println("Enter the Number of Colmuns");
		System.out.println();
		cols = s.nextInt();
	
		int [][] arr = new int [rows][cols];
		
		System.out.println("Enter the the elemnts in 2D Array Row wise");
		System.out.println();
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
//				System.out.println("Enter the element at"+i+"th row and "+j+"th colmun");
				arr[i][j]=s.nextInt();
			}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	s.close();	
	}
}
