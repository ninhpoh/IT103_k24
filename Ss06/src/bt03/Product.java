package bt03;

public class Product {
    private String productId;
    private String productName;
    private double price;

    public Product(String productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0){
            this.price = price;
        }else {
            System.out.println("Giá bán không hợp lệ! Giá phải > 0");
        }
    }

    public void hienThiThongTin() {
        System.out.println("----------------------");
        System.out.println("Mã SP: " + productId);
        System.out.println("Tên SP: " + productName);
        System.out.println("Giá bán: " + price);
        System.out.println("----------------------");
    }
}