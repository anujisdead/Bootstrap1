// Core Java Exercises

// 8. Operator Precedence
// Objective: Explore how Java evaluates expressions.
// Task: Evaluate and display the result of complex expressions.
// Instructions:
//   - Write expressions combining multiple operators, e.g., int result = 10 + 5 * 2;
//   - Display the result and explain the order of operations.

public class OperatorPrecedence {
    public static void main(String[] args) {
        // Your code here
        int result1 = 10 + 5 * 2;
        // Explanation: Multiplication (*) has higher precedence than addition (+).
        // So, 5 * 2 is evaluated first (10), then 10 + 10 is evaluated.
        System.out.println("Result of 10 + 5 * 2: " + result1); // Output: 20

        int result2 = (10 + 5) * 2;
        // Explanation: Parentheses () have the highest precedence.
        // So, 10 + 5 is evaluated first (15), then 15 * 2 is evaluated.
        System.out.println("Result of (10 + 5) * 2: " + result2); // Output: 30

        int result3 = 20 / 4 - 2;
        // Explanation: Division (/) and subtraction (-) have the same precedence, evaluated left to right.
        // So, 20 / 4 is evaluated first (5), then 5 - 2 is evaluated.
        System.out.println("Result of 20 / 4 - 2: " + result3); // Output: 3

        boolean result4 = 5 > 3 && 10 < 15;
        // Explanation: Comparison operators (> , <) have higher precedence than logical AND (&&).
        // So, 5 > 3 is true and 10 < 15 is true, then true && true is evaluated.
        System.out.println("Result of 5 > 3 && 10 < 15: " + result4); // Output: true
    }
} 