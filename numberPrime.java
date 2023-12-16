package ArraysAndLogic.com;

import java.util.Scanner;

public class numberPrime {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		boolean isPrime = true;
		int i=2;
		
		while(i*i<=num) {
			if(num%i==0) {
				isPrime = false;
				break;
			}
			i++;
		}
		if(isPrime) {
			System.out.println(num+" "+"is the Prime Number");
		}
		else {
			System.out.println(num+" "+"Is the compostie number ");
		}
	}

}
