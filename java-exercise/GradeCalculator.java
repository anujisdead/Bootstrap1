// Core Java Exercises

// 9. Grade Calculator
// Objective: Use conditional statements to determine grades.
// Task: Assign grades based on marks entered by the user.
// Instructions:
//   - Prompt the user for marks out of 100.
//   - Use if-else if-else statements to assign grades:
//     - 90-100: A
//     - 80-89: B
//     - 70-79: C
//     - 60-69: D
//     - Below 60: F
//   - Display the assigned grade.

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks out of 100:");
        int marks = scanner.nextInt();

        char grade;

        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 80 && marks < 90) {
            grade = 'B';
        } else if (marks >= 70 && marks < 80) {
            grade = 'C';
        } else if (marks >= 60 && marks < 70) {
            grade = 'D';
        } else if (marks >= 0 && marks < 60) {
            grade = 'F';
        } else {
            grade = 'I'; // Indicate invalid input
            System.out.println("Invalid marks entered.");
        }

        if (grade != 'I') {
            System.out.println("Your grade is: " + grade);
        }

        scanner.close();
    }
} 