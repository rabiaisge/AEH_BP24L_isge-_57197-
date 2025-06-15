package Lab14;

public class ConstructionEquipment extends Vehicle implements FuelType {
    private int hoursWorked;
    private String fuelType;

    public ConstructionEquipment(String regNo, String vin, String color, double price,
                                 double consumption, double fuelLevel, double mileage,
                                 int hoursWorked, String fuelType) {
        super(regNo, vin, color, price, consumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
        this.fuelType = fuelType;
    }

    @Override
    public String getFuelType() {
        return fuelType;
    }
}
