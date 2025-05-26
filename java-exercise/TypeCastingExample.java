// Core Java Exercises

// 7. Type Casting Example
// Objective: Practice type casting between different data types.
// Task: Convert a double to an int and vice versa.
// Instructions:
//   - Declare a double variable with a decimal value.
//   - Cast it to an int and display the result.
//   - Declare an int variable and cast it to a double, then display.

public class TypeCastingExample {
    public static void main(String[] args) {
        // Your code here
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Explicit casting from double to int

        System.out.println("Original double: " + myDouble);
        System.out.println("Casted to int: " + myInt);

        int anotherInt = 25;
        double anotherDouble = (double) anotherInt; // Explicit casting from int to double (though implicit is also possible)

        System.out.println("Original int: " + anotherInt);
        System.out.println("Casted to double: " + anotherDouble);
    }
} 