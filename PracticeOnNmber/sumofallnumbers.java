package PracticeOnNmber;

import java.util.Scanner;

public class sumofallnumbers {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int sum = 0;
        while (true) {
            int n = s.nextInt();

            if (n != 0) {
                sum += n;
            } else {
                break;
            }
        }

        System.out.println("Sum of all numbers: " + sum);
        s.close();
    }
}
