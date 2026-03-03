package btdg;

public class FoodProduct extends Product{
    private int discountPercent;

    public FoodProduct(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }
    @Override
    double calculateFinalPrice() {
        double basePrice = super.calculateFinalPrice();
        return basePrice - (basePrice * discountPercent / 100);
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Discount: " + discountPercent + "%");
    }
}
