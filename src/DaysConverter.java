import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        while (true) {
            System.out.print("Enter number of days (-1 to quit): ");
            days = scanner.nextInt();

            if (days <= 0) {
                System.out.println("Program terminated.");
                break;
            }

            int weeks = days / 7;
            int remainingDays = days % 7;
            System.out.println(days + " days is " + weeks + " weeks and " + remainingDays + " days.\n");
        }
    }
}
