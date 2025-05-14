package lab10;

public class myTenthApp {
    public static void main(String[] args) {
        // Example input array
        int[] input = {1, 2, 3, 4, 5, -3, -2, -1};

        // Call the method
        int[] result = countAndSumElements(input);

        // Print the result
        if (result.length == 0) {
            System.out.println("Input array was null or empty.");
        } else {
            System.out.println("Number of negative elements: " + result[0]);
            System.out.println("Sum of positive elements: " + result[1]);
        }
    }

    public static int[] countAndSumElements(int[] input) {
        // Handle null or empty input
        if (input == null || input.length == 0) {
            return new int[0];
        }

        int negativeCount = 0;
        int positiveSum = 0;

        // Loop through array elements
        for (int number : input) {
            if (number < 0) {
                negativeCount++;
            } else if (number > 0) {
                positiveSum += number;
            }
        }

        // Return result array
        return new int[] {negativeCount, positiveSum};
    }
}
