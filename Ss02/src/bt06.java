import java.util.Scanner;

public class bt06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = -1;
        int min = Integer.MAX_VALUE;
        int sum = 0;
        int count = 0;

        for (int i = 2; i <= 8; i++) {
            System.out.print("Nhap luot muon ngay " + i + ": ");
            int borrow = sc.nextInt();

            if (borrow == 0) continue;

            max = (borrow > max) ? borrow : max;
            min = (borrow < min) ? borrow : min;

            sum += borrow;
            count++;
        }

        double avg = count == 0 ? 0 : (double) sum / count;

        System.out.println("\n--- KET QUA THONG KE ---");
        System.out.println("Luot muon cao nhat: " + max);
        System.out.println("Luot muon thap nhat: " + min);
        System.out.printf("Trung binh luot muon/ngay: %.1f\n", avg);
    }
}
