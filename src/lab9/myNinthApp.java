package lab9;

public class myNinthApp {
    public static void main(String[] args) {
        Person p1 = new Person("Marek", "Blue");
        System.out.println(p1.getFirstName() + " " + p1.getLastName());

        Circle c1 = new Circle(5);
        System.out.println("Area of the circle is: " + c1.getArea());


        Warehouse w = new Warehouse("W001", 5000, "John Doe", "john@old.com", "+48 000 000 000");

        w.addGoods(3000);
        w.removeGoods(1000);
        w.addGoods(2500);
        w.checkOccupancy();
        w.updateContact("owner@magazyn.pl", "+48 123 456 789");
        w.addGoods(1000);
    }
}

