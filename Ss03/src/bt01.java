import java.util.Scanner;

public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng sách: ");
        int n = sc.nextInt();

        int[] books = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Sách " + (i + 1) + ": ");
            books[i] = sc.nextInt();
        }

        System.out.print("Danh sách mã sách: ");
        for (int i = 0; i < n; i++) {
            System.out.print(books[i] + ", ");
        }
    }
}
