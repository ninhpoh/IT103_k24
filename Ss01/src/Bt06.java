import java.util.Scanner;

public class Bt06 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số thứ tự sách: ");
        int stt = sc.nextInt();

        int ke = (stt - 1) / 25 + 1;
        int viTri = (stt - 1) % 25 + 1;
        String khuVuc = (ke <= 10) ? "Khu Cận" : "Khu Viễn";

        System.out.print("--- THONG TIN DINH VI ----\n");
        System.out.println(
                "Dia chi:" + stt +
                "\nKệ số " + ke + " - Vị trí " + viTri
                + "\nPhan khu: " + khuVuc);
    }
}