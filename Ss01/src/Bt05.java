import java.util.Scanner;

public class Bt05 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap ma sach (4 chu so): ");
        int code = sc.nextInt();

        int thousands = code / 1000;
        int hundreds = (code / 100) % 10;
        int dozens = (code / 10) % 10;
        int units = code % 10;

        int sumOfFirstThreeNumber = thousands + hundreds + dozens;

        System.out.printf("Chu so kiem tra ky vong: %d\n",units);

        boolean isValid = (sumOfFirstThreeNumber % 10) == units;

        System.out.println("Ma sach hop le: " + isValid);

    }
}
