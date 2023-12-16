package StringsAndLogics;

public class BooFoo {

	public static void main(String[] args) {
		int num = 100;
		
		for(int i=1; i<=num; i++)
		{
			if(i%5==0 && i%7==0) {
				System.out.println("FooBoo");
				i++;
			}
			else if(i%5==0)
			{
				System.out.println("Boo");
				i++;
			}
			else if(i%7==0)
			{
				System.out.println("Foo");
				i++;
			}
			System.out.println(i);
		}

	}

}
