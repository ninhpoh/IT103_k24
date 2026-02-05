package bt05;

public class ProductionEmployee extends Employee {
    private int numOfProducts;
    private long pricePerProduct;

    public ProductionEmployee(String name, int numOfProducts, long pricePerProduct) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.pricePerProduct = pricePerProduct;
    }

    public int getNumOfProducts() {
        return numOfProducts;
    }

    public long getPricePerProduct() {
        return pricePerProduct;
    }

    @Override
    public long calculateSalary() {
        return (long) numOfProducts * pricePerProduct;
    }

    @Override
    public void showInfo() {
        System.out.printf("%s (Production) - Lương: %,d (%d sản phẩm * %,d)%n",
                getName(), calculateSalary(), numOfProducts, pricePerProduct);
    }
}
