// Core Java Exercises

// 2. Simple Calculator
// Objective: Practice arithmetic operations and user input.
// Task: Develop a calculator that performs addition, subtraction, multiplication, and division.
// Instructions:
//   - Prompt the user to enter two numbers.
//   - Ask the user to choose an operation.
//   - Display the result of the operation.

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Enter second number:");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }

        scanner.close();
    }
} 