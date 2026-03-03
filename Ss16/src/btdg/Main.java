package btdg;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductRepository repository = new ProductRepository();
        Product product1 = new ElectronicProduct("E1", "Laptop", 1500.0, 24);
        Product product2 = new ElectronicProduct("E2", "PC", 100000.0, 10);
        Product product3 = new FoodProduct("F1", "Chocolate", 10.0, 20);
        Product product4 = new FoodProduct("F2", "Pho", 800.0, 12);

        repository.add(product1);
        repository.add(product2);
        repository.add(product3);
        repository.add(product4);

        int choice = -1;
        do {
            System.out.println("\n=== MENU QUẢN LÝ SẢN PHẨM ===");
            System.out.println("1. Hiển thị toàn bộ danh sách sản phẩm");
            System.out.println("2. Tìm sản phẩm theo id và hiển thị kết quả");
            System.out.println("3. Sắp xếp danh sách theo giá tăng dần (dùng Collections.sort hoặcComparator)");
            System.out.println("4. Thống kê số lượng sản phẩm theo từng loại (Electronic, Food)o Trả về kết quả dạng Map<String, Integer>");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn: ");
            choice = sc.nextInt();
            switch (choice){
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 0:
                    System.out.println("Cảm ơn bạn đã sử dụng chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }while (choice != 0);
    }
}