// Core Java Exercises

// 3. Even or Odd Checker
// Objective: Utilize conditional statements.
// Task: Determine if a number entered by the user is even or odd.
// Instructions:
//   - Prompt the user for an integer.
//   - Use the modulus operator % to check divisibility by 2.
//   - Display whether the number is even or odd.

import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer:");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is an even number.");
        } else {
            System.out.println(number + " is an odd number.");
        }

        scanner.close();
    }
} 