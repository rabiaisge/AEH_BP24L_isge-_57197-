package lab8;

public class Account {
    private String number;
    private double balance;

    public Account(String number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of PLN " + amount + " was made. New balance PLN " + balance);
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds. You have PLN " + balance + " in your account.");
        } else {
            balance -= amount;
            System.out.println("Withdrew PLN " + amount + " from the account, Remaining balance = PLN " + balance);
        }
    }
}


