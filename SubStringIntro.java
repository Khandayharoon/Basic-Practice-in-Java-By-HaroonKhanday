package StringsAndLogics;

public class SubStringIntro {

	public static void main(String[] args) {

			String str = "Coding";
			int count=0;
			
			
			for(int j=0; j<str.length(); j++)
			{
			for(int i=j; i<str.length(); i++)
			{
				System.out.print("("+str.substring(i)+")"+" ");
				count++;
			}
			System.out.println();
			}
			
			System.out.println(count);
	}

}
