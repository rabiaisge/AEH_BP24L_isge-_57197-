package lab12;

import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile = null;

        // Step 1: Ask for valid input file path
        while (true) {
            System.out.print("Enter the path of the input text file: ");
            String inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (inputFile.exists() && inputFile.isFile()) {
                break; // valid file
            } else {
                System.out.println("File does not exist. Please try again.");
            }
        }

        // Step 2: Ask for output file path
        System.out.print("Enter the path of the output text file: ");
        String outputPath = scanner.nextLine();
        File outputFile = new File(outputPath);

        // Step 3: Count lines in input file
        int lineCount = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
        } catch (IOException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Step 4: Display result
        System.out.println("Number of lines: " + lineCount);

        // Step 5: Write to output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            writer.write("Input file: " + inputFile.getName());
            writer.newLine();
            writer.write("Number of lines: " + lineCount);
            System.out.println("Result saved to output file.");
        } catch (IOException e) {
            System.out.println("Error writing output file: " + e.getMessage());
        }
    }
}

