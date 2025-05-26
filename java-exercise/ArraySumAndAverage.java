// Core Java Exercises

// 14. Array Sum and Average
// Objective: Work with arrays and perform calculations.
// Task: Calculate the sum and average of elements in an array.
// Instructions:
//   - Prompt the user to enter the number of elements.
//   - Read the elements into an array.
//   - Calculate and display the sum and average.

import java.util.Scanner;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int size = scanner.nextInt();

        if (size <= 0) {
            System.out.println("Please enter a positive number of elements.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];
        int sum = 0;

        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / size;

        System.out.println("Sum of elements: " + sum);
        System.out.println("Average of elements: " + average);

        scanner.close();
    }
} 