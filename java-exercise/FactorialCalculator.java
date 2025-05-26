// Core Java Exercises

// 11. Factorial Calculator
// Objective: Use loops to perform repetitive calculations.
// Task: Calculate the factorial of a number entered by the user.
// Instructions:
//   - Prompt the user for a non-negative integer.
//   - Use a for loop to calculate the factorial.
//   - Display the result.

import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a non-negative integer:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1; // Use long to handle larger factorials
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        scanner.close();
    }
} 