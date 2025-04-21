package myFifthApp;

public class FactorialTimeComparison {
    public static void main(String[] args) {
        int number = 10;

        // Iterative method
        long startIter = System.nanoTime();
        long resultIter = IterativeFactorial.calculate(number);
        long endIter = System.nanoTime();
        System.out.println("Iterative Factorial: " + resultIter);
        System.out.println("Time (Iterative): " + (endIter - startIter) + " ns");

        // Recursive method
        long startRec = System.nanoTime();
        long resultRec = RecursiveFactorial.calculate(number);
        long endRec = System.nanoTime();
        System.out.println("Recursive Factorial: " + resultRec);
        System.out.println("Time (Recursive): " + (endRec - startRec) + " ns");
    }
}
