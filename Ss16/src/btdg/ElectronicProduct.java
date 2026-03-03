package btdg;

public class ElectronicProduct extends Product{
    private int warrantyMonths;

    public ElectronicProduct(String id, String name, double price, int warrantyMonths) {
        super(id, name, price);
        this.warrantyMonths = warrantyMonths;
    }

    public int getWarrantyMonths() {
        return warrantyMonths;
    }

    @Override
    double calculateFinalPrice() {
        double basePrice = super.calculateFinalPrice();
        if (warrantyMonths > 12) {
            return basePrice = super.calculateFinalPrice() + 1000000;
        }
        return basePrice;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty: " + warrantyMonths + " months");
    }
}
