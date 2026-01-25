import java.util.Scanner;

public class Bt01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach: ");
        String bookId = sc.nextLine();

        System.out.print("Nhap ten sach: ");
        String bookName = sc.nextLine();

        System.out.print("Nhap nam xuat ban: ");
        int publishYear = sc.nextInt();

        System.out.print("Nhap gia sach: ");
        double price = sc.nextFloat();

        System.out.print("Sach con trong kho (true/false): ");
        boolean isAvailable = sc.nextBoolean();

        int age = 2026 - publishYear;

        String status = isAvailable ? "Còn sách" : "Đã mượn";

        System.out.println("\n===== THÔNG TIN SÁCH =====");
        System.out.println("Mã sách: " + bookId);
        System.out.println("Tên sách: " + bookName.toUpperCase());
        System.out.printf("Giá sách: %.2f%n", price);
        System.out.println("Tuổi thọ sách: " + age + " năm");
        System.out.println("Tình trạng: " + status);
    }
}