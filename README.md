# Web Development, Java, and SQL Exercises

This repository contains a collection of exercises covering HTML, CSS, JavaScript, Bootstrap, Core Java, and ANSI SQL (using MySQL syntax). Each folder contains specific exercises and examples for learning these concepts.

## Project Structure

```
.
├── html exercise/
│   └── html5-exercises.html    # HTML5 elements and structure exercises
├── css exercise/
│   ├── css-exercises.html     # CSS styling exercises
│   └── styles.css             # CSS styles for exercises
├── javascript exercise/
│   ├── js-exercises.html      # JavaScript programming exercises
│   └── main.js               # JavaScript implementation
├── java-exercise/
│   ├── HelloWorld.java
│   ├── SimpleCalculator.java
│   ├── EvenOddChecker.java
│   ├── LeapYearChecker.java
│   ├── MultiplicationTable.java
│   ├── DataTypeDemonstration.java
│   ├── TypeCastingExample.java
│   ├── OperatorPrecedence.java
│   ├── GradeCalculator.java
│   ├── NumberGuessingGame.java
│   ├── FactorialCalculator.java
│   ├── MethodOverloading.java
│   ├── RecursiveFibonacci.java
│   ├── ArraySumAndAverage.java
│   ├── StringReversal.java
│   ├── PalindromeChecker.java
│   ├── ClassAndObjectCreation.java
│   ├── InheritanceExample.java
│   └── InterfaceImplementation.java # Core Java programming exercises
└── sql-exercise/
    └── sql-exercises-solutions.html # HTML file with SQL exercises and solutions
```

## How to Run Each Exercise

### HTML Exercises
1. Navigate to the `html exercise` folder
2. Open `html5-exercises.html` in your web browser
3. You can do this by:
   - Double-clicking the file
   - Dragging the file into your browser
   - Using the command: `open "html exercise/html5-exercises.html"`

### CSS Exercises
1. Navigate to the `css exercise` folder
2. Open `css-exercises.html` in your browser
3. The styles from `styles.css` will be automatically applied
4. To modify styles:
   - Edit `styles.css`
   - Refresh the browser to see changes
5. Run command: `open "css exercise/css-exercises.html"`

### JavaScript Exercises
1. Navigate to the `javascript exercise` folder
2. Open `js-exercises.html` in Google Chrome
3. Use Chrome DevTools (F12) to:
   - View console output
   - Debug JavaScript code
   - Monitor network requests
4. Test interactive features:
   - Click buttons
   - Use form inputs
   - Check console logs
5. Run command: `open -a "Google Chrome" "javascript exercise/js-exercises.html"`

### Bootstrap Exercises
1. Navigate to the `bootstrap exercise` folder
2. Open `index.html` in your browser
3. Ensure you have an internet connection (for CDN links)
4. Test responsive design by:
   - Resizing your browser window
   - Using browser dev tools device emulation
5. Run command: `open "bootstrap exercise/index.html"`

### Java Exercises
1. Ensure you have the Java Development Kit (JDK) installed.
2. Open your terminal or command prompt.
3. Navigate to the `java-exercise` directory using the `cd` command:
   ```bash
   cd java-exercise
   ```
4. Compile the Java file using the `javac` command. Replace `YourExercise.java` with the name of the file you want to run (e.g., `HelloWorld.java`):
   ```bash
   javac YourExercise.java
   ```
   This will create a `.class` file (e.g., `YourExercise.class`).
5. Run the compiled Java code using the `java` command. Replace `YourExercise` with the name of the compiled class (without the `.class` extension):
   ```bash
   java YourExercise
   ```
6. Interact with the program in the terminal as required by the exercise (e.g., provide input for the calculator).

### SQL Exercises
1. Navigate to the `sql-exercise` folder.
2. Open the `sql-exercises-solutions.html` file in your web browser.
3. You can do this by:
   - Double-clicking the file.
   - Dragging the file into your browser.
   - Using the command: `open "sql-exercise/sql-exercises-solutions.html"`
4. Note that this HTML file contains the solutions. To actually run these SQL queries, you will need a MySQL database server and a client tool (like MySQL Workbench, a terminal client, or a web-based tool like phpMyAdmin). You can then copy and paste the queries from the HTML file into your MySQL client.

## Development Tools

### Recommended Tools
- Visual Studio Code or any code editor (with extensions for Java, SQL, etc.)
- Google Chrome (for web development debugging and viewing SQL solutions)
- JDK (Java Development Kit) for Java exercises
- MySQL Database Server and Client Tool (for SQL exercises)
- Git (for version control)

### Browser Developer Tools
- Press F12 to open DevTools
- Use Elements tab to inspect HTML
- Use Console tab for JavaScript
- Use Network tab to monitor requests
- Use Sources tab to debug code

## Best Practices

1. **HTML**
   - Use semantic HTML elements
   - Ensure proper document structure
   - Include meta tags and viewport settings

2. **CSS**
   - Use external stylesheets
   - Follow BEM naming convention
   - Implement responsive design

3. **JavaScript**
   - Use modern ES6+ features
   - Implement error handling
   - Follow best practices for async code

4. **Bootstrap**
   - Use CDN links for latest version
   - Customize when necessary
   - Follow grid system guidelines

5. **Java**
   - Write clean and readable code
   - Follow Java coding conventions
   - Use meaningful variable names
   - Add comments to explain complex logic
   - Handle potential errors (e.g., user input)

6. **SQL**
   - Understand the database schema
   - Use appropriate JOINs for combining tables
   - Filter data using WHERE and HAVING clauses
   - Group and aggregate data using GROUP BY and aggregate functions
   - Order results using ORDER BY

## Getting Started

1. Clone this repository
2. Navigate to the exercise folder you want to work on
3. Open the relevant files in your code editor
4. Follow the instructions in each exercise file (for Java/Web) or the SQL solutions file
5. Use the browser (for web and SQL solutions) or terminal (for Java) and a MySQL client (for SQL) to view and test your work

## Notes

- Each exercise folder contains its own specific instructions within the files or a dedicated README.
- Use browser developer tools for web debugging.
- Use terminal for compiling and running Java code.
- Use a MySQL client to run the SQL queries from the solutions file.
- Keep your code organized and well-commented.
- Test your code thoroughly.