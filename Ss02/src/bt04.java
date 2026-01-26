import java.util.Scanner;

public class bt04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int id;
        do {
            System.out.print("Nhap ma ID sach moi (> 0): ");
            id = sc.nextInt();

            if (id <= 0){
                System.out.println("Loi: ID phai la so duong. Moi nhap lai!");
            }else {
                System.out.println("Xac nhan: Ma sach " + id + " da duoc ghi nhan.");
            }
        }while (id <= 0);
    }
}
