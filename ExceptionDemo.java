package ExceptionHandling;

public class ExceptionDemo {

	public static void main(String[] args) {

		try {

			System.out.println(divide(2, 2));
			System.out.println(fact(-2));
			System.out.println("With try");
		} catch (DividByZeroException e) {

			System.out.println("In the catch ");
		} catch (NegativeNumberException Nve) {
			System.out.println("Negative Number Exception");
		} finally {
			System.out.println("in finally After the try and catch");
		}
		System.out.println("Main");
	}

	public static int divide(int a, int b) throws DividByZeroException {

		if (b == 0) {
			throw new DividByZeroException();
		}
		return a / b;
	}

	public static int fact(int n) throws NegativeNumberException {
		if (n < 0) {
			throw new NegativeNumberException();
		}
		int ans = 1;
		for (int i = 1; i <= n; i++) {
			ans = ans * i;
		}
		return ans;
	}
}
