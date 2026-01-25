import java.util.Scanner;

public class Bt04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập giá sách (USD): ");
        double bookPrice = sc.nextDouble();

        float tyGia = 25000;

        double tienVND = bookPrice * tyGia;

        long tienChan = (long) tienVND;

        System.out.println("Tong tien (double): " + tienVND + " VND");
        System.out.println("Tong tien (long): " + tienChan + " VND");
    }
}
