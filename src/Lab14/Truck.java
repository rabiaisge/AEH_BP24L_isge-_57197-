package Lab14;

public class Truck extends Vehicle implements FuelType {
    private double loadCapacity;
    private String fuelType;

    public Truck(String regNo, String vin, String color, double price,
                 double consumption, double fuelLevel, double mileage,
                 double loadCapacity, String fuelType) {
        super(regNo, vin, color, price, consumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
