



import java.util.Scanner;
public class FahrenheitToCelsiusTable {


	public static void main(String[] args) {

		/* Your class should be named Solution.
		 * Read input as specified in the question.
		 * Print output as specified in the question.
		 */
		int start , end , stepSize;
		int celsius;
		Scanner s = new Scanner(System.in);

		start = s.nextInt();
		end = s.nextInt();
		stepSize = s.nextInt();

		while (start <= end)
		{
			celsius = ((start-32)*5)/9;

			System.out.println(start +" "+ celsius);
			start = start + stepSize;
		}

		s.close();

	}

}




