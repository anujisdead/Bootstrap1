// Core Java Exercises

// 17. Class and Object Creation
// Objective: Understand classes and objects.
// Task: Create a Car class with attributes and methods.
// Instructions:
//   - Define attributes: make, model, year.
//   - Implement a method displayDetails() to print car information.
//   - Create objects of the Car class and call the method.

public class ClassAndObjectCreation {
    public static void main(String[] args) {
        // Your code here
        // Create objects of the Car class
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Call the displayDetails method for each object
        car1.displayDetails();
        car2.displayDetails();
    }
}

// Define Car class here
class Car {
    // Attributes
    String make;
    String model;
    int year;
    
    // Constructor
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    // Method to display details
    public void displayDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }
} 