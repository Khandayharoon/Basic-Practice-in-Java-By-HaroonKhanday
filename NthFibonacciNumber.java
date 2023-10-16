import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int a = 0;
        int b = 1;

        if (n == 0) {
            System.out.print(a);
        } else if (n == 1) {
            System.out.print(b);
        } else {
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            System.out.print(b);
        }

        s.close();
    }
}
