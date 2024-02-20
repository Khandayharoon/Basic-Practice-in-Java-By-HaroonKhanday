package PracticeOnNmber;

import java.util.Scanner;

public class TakeNumberInALoopTillX {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers (enter 'x' to finish):");

        int sum = 0;
        while (true) {
            String input = scanner.next();

            if (input.equals("x")) {
                break; // Exit the loop if the user enters 'x'
            }

            try {
                int number = Integer.parseInt(input);
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number or 'x' to finish.");
            }
        }

        System.out.println("Sum of the entered numbers: " + sum);

        scanner.close();
    }
}

