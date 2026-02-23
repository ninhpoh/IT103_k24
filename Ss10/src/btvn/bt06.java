package btvn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class bt06 {

    // Lớp Product đơn giản
    public static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return String.format("%s (%.2f)", name, price);
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Bàn phím", 450000));
        products.add(new Product("Chuột", 150000));
        products.add(new Product("Màn hình", 3500000));
        products.add(new Product("Tai nghe", 700000));
        products.add(new Product("USB", 120000));

        System.out.println("Danh sách gốc:");
        printList(products);

        // 1) Sắp xếp theo giá tăng dần bằng Anonymous Class (Comparator)
        // Lý do dùng Anonymous Class ở đây: nếu cần trạng thái nội bộ (ví dụ đếm số lần so sánh)
        // hoặc thêm phương thức phụ trợ, anonymous class cho phép khai báo trường và override nhiều phương thức.
        Comparator<Product> priceComparator = new Comparator<Product>() {
            private int compareCount = 0; // ví dụ trạng thái nội bộ

            @Override
            public int compare(Product p1, Product p2) {
                compareCount++;
                return Double.compare(p1.getPrice(), p2.getPrice());
            }

            @Override
            public String toString() {
                return "PriceComparator (compares: " + compareCount + ")";
            }
        };

        List<Product> byPrice = new ArrayList<>(products);
        Collections.sort(byPrice, priceComparator);

        System.out.println("\nSắp xếp theo giá (Anonymous Class):");
        printList(byPrice);
        System.out.println(priceComparator.toString());

        // 2) Sắp xếp theo tên (A-Z) bằng Lambda Expression
        // Lambda ngắn gọn, phù hợp khi chỉ cần một biểu thức so sánh, không cần trạng thái nội bộ.
        List<Product> byName = new ArrayList<>(products);
        byName.sort((p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName()));

        System.out.println("\nSắp xếp theo tên (Lambda):");
        printList(byName);

        // Ghi chú:
        // - Dùng Lambda khi bạn chỉ cần một biểu thức/khối ngắn, không cần trường hay phương thức phụ.
        // - Bắt buộc/khuyến nghị dùng Anonymous Class khi bạn cần:
        //   * Trạng thái nội bộ (fields) trong comparator,
        //   * Nhiều phương thức cục bộ hoặc khởi tạo phức tạp,
        //   * Hoặc khi cần override nhiều phương thức (không chỉ một SAM).
    }

    private static void printList(List<Product> list) {
        for (Product p : list) {
            System.out.println(" - " + p);
        }
    }
}