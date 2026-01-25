import java.util.Scanner;

public class Bt02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số ngày trả trễ (n): ");
        int n = sc.nextInt();

        System.out.print("Nhập số lượng sách mượn (m): ");
        int m = sc.nextInt();

        double total = n * m * 5000;

        double befTotal;

        if (n > 7 && m >= 3) {
            befTotal = total * 1.2;
        }else {
            befTotal = total;
        }

        boolean khoaThe = total > 50000;

        System.out.println("Tổng tiền phạt: " + total + " VND");
        System.out.println("tiền phạt sau dieu chinh: " + befTotal + " VND");
        System.out.println("Yêu cầu khóa thẻ: " + khoaThe);
    }
}
