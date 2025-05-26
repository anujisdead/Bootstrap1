// Core Java Exercises

// 15. String Reversal
// Objective: Manipulate strings.
// Task: Reverse a string entered by the user.
// Instructions:
//   - Prompt the user for a string.
//   - Use a loop or StringBuilder to reverse the string.
//   - Display the reversed string.

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to reverse:");
        String inputString = scanner.nextLine();

        // Using StringBuilder
        StringBuilder reversedStringBuilder = new StringBuilder(inputString);
        reversedStringBuilder.reverse();
        String reversedString = reversedStringBuilder.toString();

        System.out.println("Reversed string (using StringBuilder): " + reversedString);

        // Using a loop
        String reversedStringLoop = "";
        for (int i = inputString.length() - 1; i >= 0; i--) {
            reversedStringLoop += inputString.charAt(i);
        }
        System.out.println("Reversed string (using a loop): " + reversedStringLoop);

        scanner.close();
    }
} 