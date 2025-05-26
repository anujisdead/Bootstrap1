// Core Java Exercises

// 12. Method Overloading
// Objective: Understand method overloading in Java.
// Task: Create multiple methods with the same name but different parameters.
// Instructions:
//   - Define methods named add that accept:
//     - Two integers.
//     - Three integers.
//     - Two doubles.
//   - Each method should return the sum of its parameters.
//   - Call each method and display the results.

public class MethodOverloading {
    public static void main(String[] args) {
        // Your code here
        MethodOverloading mo = new MethodOverloading();

        int sum1 = mo.add(5, 10);
        System.out.println("Sum of two integers: " + sum1);

        int sum2 = mo.add(1, 2, 3);
        System.out.println("Sum of three integers: " + sum2);

        double sum3 = mo.add(5.5, 4.5);
        System.out.println("Sum of two doubles: " + sum3);
    }
    
    // Add methods here
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
} 