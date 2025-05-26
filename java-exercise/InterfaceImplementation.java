// Core Java Exercises

// 19. Interface Implementation
// Objective: Use interfaces in Java.
// Task: Define an interface Playable with a method play().
// Instructions:
//   - Define the interface Playable.
//   - Create a class (e.g., Guitar or Piano) that implements the Playable interface.
//   - Implement the play() method in the class.
//   - Create an object of the class and call the play() method.

public class InterfaceImplementation {
    public static void main(String[] args) {
        // Your code here
        // Create an object of the class that implements Playable
        Playable guitar = new Guitar();

        // Call the play method
        guitar.play();

        Playable piano = new Piano();
        piano.play();
    }
}

// Define Playable interface here
interface Playable {
    // play method declaration
    void play();
}

// Define class implementing Playable here
class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the guitar");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Playing the piano");
    }
} 