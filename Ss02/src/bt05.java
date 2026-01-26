import java.util.Scanner;
public class bt05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalScore = 100;
        int days;

        System.out.println("--- HE THONG DANH GIA DOC GIA ---");
        System.out.println("(Nhap so ngay tre. Nhap 999 de ket thuc)");

        while (true) {
            System.out.print("\nSo ngay tre cua lan nay: ");
            days = sc.nextInt();

            if (days == 999) {
                break;
            }

            int minus = days * 2;
            totalScore -= minus;

            System.out.println("-> Tra tre " + days + " ngay: -" + minus + " diem.");
        }

        System.out.println("\nTong diem uy tin: " + totalScore);

        if (totalScore >= 80) {
            System.out.println("Xep loai: DOC GIA TOT");
        } else if (totalScore >= 60) {
            System.out.println("Xep loai: DOC GIA CAN LUU Y");
        } else {
            System.out.println("Xep loai: DOC GIA HAN CHE MUON");
        }
    }
}
