// Core Java Exercises

// 10. Number Guessing Game
// Objective: Implement loops and conditional logic.
// Task: Create a game where the user guesses a randomly generated number.
// Instructions:
//   - Generate a random number between 1 and 100.
//   - Prompt the user to guess the number.
//   - Provide feedback if the guess is too high or too low.
//   - Continue until the user guesses correctly.

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        // Your code here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        int numberOfAttempts = 0;
        int guess;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a number between 1 and 100. Try to guess it!");

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            numberOfAttempts++;

            if (guess < numberToGuess) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > numberToGuess) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + numberOfAttempts + " attempts.");
            }
        } while (guess != numberToGuess);

        scanner.close();
    }
} 