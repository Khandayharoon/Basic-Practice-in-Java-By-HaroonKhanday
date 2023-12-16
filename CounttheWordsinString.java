package StringsAndLogics;

import java.util.Scanner;

public class CounttheWordsinString {

	public static void main(String[] args) {

		String str;
		Scanner s = new Scanner(System.in);
		str =  s.nextLine();
		countWords(str);

	s.close();	
	}
	
	public static void countWords(String str) {
		int count = 0;
		if(str.length()==0)
		{
			System.out.println("String is empty");
			return;
		}
		
		for(int i=0; i<str.length(); i++)
		{
			if(str.charAt(i)==' ')
			{
				count++;
			}
		}
		System.out.println(count+1);
	}

}
