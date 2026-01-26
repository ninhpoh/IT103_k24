import java.util.Scanner;

public class bt01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap tuoi cua ban: ");
        int age = sc.nextInt();

        System.out.print("Nhap sach da muon: ");
        int book = sc.nextInt();

        if( age < 18 || book >= 3){
            System.out.print("Ko du dieu kien\n");
            if (age < 18){
                System.out.print("-Ly do: Ban chua du tuoi!");
            }else {
                System.out.print("-Ly do: Ban da muon qua nhieu!");
            }
        }else {
            System.out.print("Du dieu kien muon sach");
        }
    }
}
