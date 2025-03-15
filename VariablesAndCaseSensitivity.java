public class VariablesAndCaseSensitivity {

    // Define the main method - program entry point
    public static void main(String[] args) {
        
        // Declare variables with descriptive names following camelCase
        int studentAge = 15;                  // Age of the student
        double itemPrice = 29.99;             // Price of the item
        String studentName = "Alice";         // Name of the student
        int counter = 10;                     // A counter variable
        int Counter = 20;                     // Another counter with a different case to demonstrate case sensitivity

        // Print the values of the variables
        System.out.println("Student Name: " + studentName);
        System.out.println("Student Age: " + studentAge);
        System.out.println("Item Price: $" + itemPrice);
        System.out.println("Counter (lowercase): " + counter);
        System.out.println("Counter (uppercase): " + Counter);
    }
}
