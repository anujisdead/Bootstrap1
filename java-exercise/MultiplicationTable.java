// Core Java Exercises

// 5. Multiplication Table
// Objective: Implement loops.
// Task: Print the multiplication table for a number up to 10.
// Instructions:
//   - Prompt the user for a number.
//   - Use a for loop to iterate from 1 to 10.
//   - Multiply the input number by the loop counter and display the result.

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = scanner.nextInt();

        System.out.println("Multiplication Table for " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        scanner.close();
    }
} 