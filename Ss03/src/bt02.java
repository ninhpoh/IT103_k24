import java.util.Scanner;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] books = {"Java", "Python", "C++", "C#", "JS"};

        System.out.print("Nhap ten sach: ");
        String s = sc.nextLine();

        for (int i = 0; i < books.length; i++) {
            if (books[i].equals(s)) {
                System.out.println("Tim thay tai vi tri " + i);
                return;
            }
        }

        System.out.println("Sach khong ton tai");
    }
}
