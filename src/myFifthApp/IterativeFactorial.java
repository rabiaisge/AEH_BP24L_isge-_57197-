package myFifthApp;

public class IterativeFactorial {
    public static long calculate(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}

