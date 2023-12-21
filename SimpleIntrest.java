package PracticeOnNmber;

import java.util.Scanner;

public class SimpleIntrest {

	public static void main(String[] args) {
		int p, r, t;
		System.out.println("please Enter Principal, Time, and Rate");
		Scanner s = new Scanner(System.in);
		p = s.nextInt();
		t = s.nextInt();
		r = s.nextInt();
		
		int si = 0;
		si = p*r*t;
		System.out.println(si);
		
	s.close();	
	}

}
