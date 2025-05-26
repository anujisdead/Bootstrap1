// Core Java Exercises

// 18. Inheritance Example
// Objective: Implement inheritance.
// Task: Create a base class Animal and a subclass Dog.
// Instructions:
//   - Animal class should have a method makeSound().
//   - Dog class should override makeSound() to print "Bark".
//   - Instantiate both classes and call their methods.

public class InheritanceExample {
    public static void main(String[] args) {
        // Your code here
        // Instantiate Animal and Dog classes
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Call makeSound method on both objects
        System.out.print("Animal makes sound: ");
        animal.makeSound();

        System.out.print("Dog makes sound: ");
        dog.makeSound();
    }
}

// Define Animal class here
class Animal {
    // makeSound method
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

// Define Dog class here
class Dog extends Animal {
    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
} 