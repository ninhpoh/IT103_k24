package bt02;

import java.util.Scanner;

public class bt02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account acc = new Account("user01", "123456", "user01@gmail.com");

        System.out.println("tai khoan truoc thay doi:");
        acc.hienThiThongTin();

        System.out.print("Nhap mat khau moi: ");
        String newPass = sc.nextLine();
        acc.doiMatKhau(newPass);

        System.out.println("\ntai khoan sau thay doi:");
        acc.hienThiThongTin();
    }
}
