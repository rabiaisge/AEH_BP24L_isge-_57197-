package lab8;

public class myEighthApp {
    public static void main(String[] args) {
        System.out.println("Welcome to my Eighth App");

        Person p1 = new Person("Marek", "Blue");
        p1.printInfo();

        Circle circle = new Circle(5.0);
        System.out.println("Area of the circle is: " + circle.getArea());

        Account myAccount = new Account("123", 500);
        myAccount.deposit(200);
        myAccount.withdraw(100);
        myAccount.withdraw(1000);
    }
}


