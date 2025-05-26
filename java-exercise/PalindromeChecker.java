// Core Java Exercises

// 16. Palindrome Checker
// Objective: Combine string manipulation and conditional logic.
// Task: Check if a string is a palindrome.
// Instructions:
//   - Prompt the user for a string.
//   - Remove any non-alphanumeric characters and convert to lowercase.
//   - Check if the string reads the same forwards and backwards.
//   - Display the result.

import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to check if it's a palindrome:");
        String inputString = scanner.nextLine();

        // Remove non-alphanumeric characters and convert to lowercase
        String cleanedString = inputString.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversedString = new StringBuilder(cleanedString).reverse().toString();

        // Check if the cleaned string is equal to its reversed version
        if (cleanedString.equals(reversedString)) {
            System.out.println("\"" + inputString + "\" is a palindrome.");
        } else {
            System.out.println("\"" + inputString + "\" is not a palindrome.");
        }

        scanner.close();
    }
} 