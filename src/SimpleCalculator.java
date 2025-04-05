
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char option;

        while (true) {
            // Show menu
            System.out.println("\n=== SIMPLE CALCULATOR ===");
            System.out.println("a) Add");
            System.out.println("b) Subtract");
            System.out.println("c) Multiply");
            System.out.println("d) Divide");
            System.out.print("Select an option (a/b/c/d): ");

            option = scanner.next().toLowerCase().charAt(0);

            // Check if input is valid
            if (option != 'a' && option != 'b' && option != 'c' && option != 'd') {
                System.out.println("Invalid option. Please choose a, b, c, or d.");
                continue;
            }

            // Read two valid numbers
            double num1 = readNumber(scanner, "Enter the first number: ");
            double num2 = readNumber(scanner, "Enter the second number: ");

            // Perform selected operation
            switch (option) {
                case 'a':
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 'b':
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 'c':
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case 'd':
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
            }
        }
    }

    // Helper method to safely read a number
    private static double readNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.println("Invalid number. Try again.");
                scanner.next(); // Clear invalid input
            }
        }
    }
}
