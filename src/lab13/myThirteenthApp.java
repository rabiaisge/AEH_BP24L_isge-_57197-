package lab13;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class myThirteenthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputPath = "";
        String outputPath = "";

        // 1. Kullanıcıdan geçerli input dosya yolu al
        while (true) {
            System.out.print("Enter input file path: ");
            inputPath = scanner.nextLine();
            if (Files.exists(Paths.get(inputPath))) {
                break;
            } else {
                System.out.println("File does not exist. Please try again.");
            }
        }

        // 2. Kullanıcıdan output dosya yolu al
        System.out.print("Enter output file path: ");
        outputPath = scanner.nextLine();

        try {
            File inputFile = new File(inputPath);
            Scanner fileReader = new Scanner(inputFile);
            Map<String, Integer> wordCount = new HashMap<>();
            int totalWords = 0;

            // 3. Dosya satır satır okunup kelimeler sayılıyor
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                String[] words = line.toLowerCase().replaceAll("[^a-zA-Z0-9 ]", "").split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
            fileReader.close();

            // 4. Console'a yazdır
            System.out.println("Total number of words: " + totalWords);
            for (String word : wordCount.keySet()) {
                System.out.println(word + ": " + wordCount.get(word));
            }

            // 5. Output dosyasına yaz
            PrintWriter writer = new PrintWriter(outputPath);
            writer.println("Input file: " + inputPath);
            writer.println("Total number of words: " + totalWords);
            for (String word : wordCount.keySet()) {
                writer.println(word + ": " + wordCount.get(word));
            }
            writer.close();

            System.out.println("Results saved to: " + outputPath);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

