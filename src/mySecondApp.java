package pl.pp;

import java.util.Scanner;

class MySecondApp {
    public static void main(String[] args) {

        // 1. Create an integer variable x and assign it the value 10
        int x = 10;

        // 2. Calculate double of x and its square
        int doubleX = x * 2;
        int squareX = x * x;

        // 3. Print the results
        System.out.println("x = " + x);
        System.out.println("2 * x = " + doubleX);
        System.out.println("x^2 = " + squareX);

        // 4. Ask the user for their age
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");

        int age = scanner.nextInt(); // User enters their age
        long ageInSeconds = (long) age * 365 * 24 * 60 * 60; // Convert age to seconds

        // 5. Print the result
        System.out.println("Your age in seconds: " + ageInSeconds + " seconds");

        scanner.close();
    }
}

