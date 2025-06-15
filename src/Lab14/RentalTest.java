package Lab14;

public class RentalTest {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("ABC123", "1HGCM82633A004352", "Red", 25000,
                6.5, 40, 10000, 4, "Gasoline");
        Truck truck = new Truck("TRK456", "1HTMKADN43H561239", "White", 50000,
                12.0, 60, 20000, 8000, "Diesel");
        Motorcycle moto = new Motorcycle("MOTO789", "JH2SC59057M100001", "Black", 7000,
                3.5, 10, 5000, false, "Gasoline");
        ConstructionEquipment ce = new ConstructionEquipment("CON999", "CNSTRCT3456VIN", "Yellow",
                100000, 15.0, 100, 5000, 1200, "Diesel");

        car.drive(100);
        car.refuel(10);
        System.out.println("Fuel type: " + car.getFuelType());

        truck.drive(50);
        System.out.println("Fuel type: " + truck.getFuelType());

        moto.drive(30);
        System.out.println("Fuel type: " + moto.getFuelType());

        ce.drive(80);
        System.out.println("Fuel type: " + ce.getFuelType());
    }
}
