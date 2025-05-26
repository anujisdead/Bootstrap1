// Core Java Exercises

// 13. Recursive Fibonacci
// Objective: Implement recursion.
// Task: Calculate the nth Fibonacci number using recursion.
// Instructions:
//   - Prompt the user for a positive integer n.
//   - Define a recursive method fibonacci(int n) that returns the nth Fibonacci number.
//   - Display the result.

import java.util.Scanner;

public class RecursiveFibonacci {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer (n) to find the nth Fibonacci number:");
        int n = scanner.nextInt();

        if (n < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            long result = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }

        scanner.close();
    }
    
    // Define recursive fibonacci method here
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
} 