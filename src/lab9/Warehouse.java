package lab9;

public class Warehouse {
    private String warehouseNumber;
    private int totalSpace;
    private int occupiedSpace;
    private String ownerName;
    private String email;
    private String phone;

    public Warehouse(String warehouseNumber, int totalSpace, String ownerName, String email, String phone) {
        this.warehouseNumber = warehouseNumber;
        this.totalSpace = totalSpace;
        this.occupiedSpace = 0; // başta boş
        this.ownerName = ownerName;
        this.email = email;
        this.phone = phone;
    }

    // Getters and Setters
    public String getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(String warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public int getTotalSpace() {
        return totalSpace;
    }

    public void setTotalSpace(int totalSpace) {
        this.totalSpace = totalSpace;
    }

    public int getOccupiedSpace() {
        return occupiedSpace;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Methods
    public void addGoods(int amount) {
        if (occupiedSpace + amount <= totalSpace) {
            occupiedSpace += amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough space in the warehouse. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        }
    }

    public void removeGoods(int amount) {
        if (amount <= occupiedSpace) {
            occupiedSpace -= amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + (totalSpace - occupiedSpace) + " units.");
        } else {
            System.out.println("Not enough goods in the warehouse. Occupied space: " + occupiedSpace + " units.");
        }
    }

    public void checkOccupancy() {
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + (totalSpace - occupiedSpace) + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        this.email = newEmail;
        this.phone = newPhone;
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + email);
        System.out.println("New phone number: " + phone);
    }
}
