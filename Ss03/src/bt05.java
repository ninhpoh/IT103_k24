import java.util.Scanner;

public class bt05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] books = {101, 102, 103, 104, 105};
        int current = 5;

        do{
            System.out.print("Kho sách hiện tại (" + current + " cuốn): [ ");
            for (int i = 0; i < current; i++) {
                System.out.print(books[i] + " ");
            }
            System.out.println("]");

            System.out.print("Nhập mã sách cần xóa (0 để thoát): ");
            int bookId = sc.nextInt();

            if(bookId == 0){
                break;
            }

            int f = -1;
            for (int i = 0; i < current; i++) {
                if (books[i] == bookId) {
                    f = i;
                    break;
                }
            }

            if (f == -1) {
                System.out.println("Không tìm thấy sách mã " + bookId);
            }else {
                for (int i = f; i < current - 1; i++) {
                    books[i] = books[i + 1];
                }
                current--;
                System.out.println("Đã xóa sách mã " + bookId);
            }
        }while (current > 0);
    }
}
