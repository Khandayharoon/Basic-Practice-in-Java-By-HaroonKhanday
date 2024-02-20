package PracticeOnNmber;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        int num;
        System.out.println("Please Enter any Number");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        int temp = num;
        int count = 0;

        // Count the number of digits in the input
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        boolean is = isArmstrong(num, count);

        if (is) {
            System.out.println("Number is Armstrong");
        } else {
            System.out.println("Number is not Armstrong");
        }

        s.close();
    }

    public static boolean isArmstrong(int num, int digits) {
        int temp = num;
        int ans = 0;

        while (num > 0) {
            int rem = num % 10;

            // Calculate sum of digits raised to the power of count
            ans = ans + (int) Math.pow(rem, digits);
            num = num / 10;
        }

        // Check if the number is Armstrong
        return temp == ans;
    }
}
