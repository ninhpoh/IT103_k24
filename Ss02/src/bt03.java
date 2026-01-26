import java.util.Scanner;

public class bt03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so sach tra muon: ");
        int book = sc.nextInt();

        double totalPrice = 0;

        for(int i=1; i <= book; i++){
            System.out.printf("Nhap so ngay tra tre cuon %d: ",i);
            int price = sc.nextInt();

            totalPrice += price * 5000;
        }
        System.out.printf("%.2f",totalPrice);
    }
}
