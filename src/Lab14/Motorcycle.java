package Lab14;

public class Motorcycle extends Vehicle implements FuelType {
    private boolean hasSidecar;
    private String fuelType;

    public Motorcycle(String regNo, String vin, String color, double price,
                      double consumption, double fuelLevel, double mileage,
                      boolean hasSidecar, String fuelType) {
        super(regNo, vin, color, price, consumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
