// Core Java Exercises

// 4. Leap Year Checker
// Objective: Apply nested conditional logic.
// Task: Check if a given year is a leap year.
// Instructions:
//   - Prompt the user to enter a year.
//   - A year is a leap year if it's divisible by 4 but not by 100, unless it's also divisible by 400.
//   - Display the result accordingly.

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = scanner.nextInt();

        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 != 0) {
                isLeap = true;
            } else {
                if (year % 400 == 0) {
                    isLeap = true;
                }
            }
        }

        if (isLeap) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        scanner.close();
    }
} 