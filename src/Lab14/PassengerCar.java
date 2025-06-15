package Lab14;
public class PassengerCar extends Vehicle implements FuelType {
    private int numberOfDoors;
    private String fuelType;

    public PassengerCar(String regNo, String vin, String color, double price,
                        double consumption, double fuelLevel, double mileage,
                        int numberOfDoors, String fuelType) {
        super(regNo, vin, color, price, consumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
