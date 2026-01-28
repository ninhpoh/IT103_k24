import java.util.Scanner;

public class bt01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập tên sách: ");
        String title = sc.nextLine();

        System.out.print("Nhập tác giả: ");
        String author = sc.nextLine();

        title = title.trim().replaceAll("\\s+", " ");
        author = author.trim().replaceAll("\\s+", " ");

        title = title.toUpperCase();

        String[] words = author.toLowerCase().split(" ");
        author = "";
        for (String w : words) {
            author += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }
        author = author.trim();

        System.out.println("\n[" + title + "] - Tác giả: " + author);
    }
}
