package HN_KS24_CNTT5_TranAnNinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = null;
        int n = 0;
        int choice;

        do {
            System.out.println("===== QUAN LY DIEM SINH VIEN =====");
            System.out.println("1. Nhập danh sách sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Tìm kiếm sinh viên theo học lực");
            System.out.println("4. Sắp xếp theo học lực giảm dần");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");

            choice = Integer.parseInt(sc.nextLine());

            switch (choice) {

                case 1:
                    System.out.print("Nhập số lượng sinh viên: ");
                    n = Integer.parseInt(sc.nextLine());
                    students = new Student[n];

                    for (int i = 0; i < n; i++) {
                        System.out.println("Sinh viên thứ " + (i + 1));

                        String id;
                        do {
                            System.out.print("Mã SV (SVxxx): ");
                            id = sc.nextLine();
                            if (!id.matches("SV\\d{3}")) {
                                System.out.println("Mã SV không hợp lệ! Ví dụ đúng: SV001");
                            }
                        } while (!id.matches("SV\\d{3}"));

                        System.out.print("Họ tên: ");
                        String name = sc.nextLine();

                        System.out.print("Điểm TB: ");
                        double score = Double.parseDouble(sc.nextLine());

                        students[i] = new Student(id, name, score);
                    }
                    break;

                case 2:
                    if (students == null) {
                        System.out.println("Chưa có sinh viên!");
                    } else {
                        for (int i = 0; i < n; i++) {
                            System.out.println(students[i]);
                        }
                    }
                    break;
                case 3:
                    if (students == null) {
                        System.out.println("Chưa có sinh viên!");
                        break;
                    }
                    System.out.println(".....");
                    break;

                case 4:
                    if (students == null) {
                        System.out.println("Chưa có sinh viên!");
                        break;
                    }

                    for (int i = 0; i < n - 1; i++) {
                        for (int j = i + 1; j < n; j++) {
                            if (students[i].getScore() < students[j].getScore()) {
                                Student temp = students[i];
                                students[i] = students[j];
                                students[j] = temp;
                            }
                        }
                    }

                    System.out.println("Danh sach sau sap xep");
                    for (int i = 0; i < n; i++) {
                        System.out.println(students[i]);
                    }
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh!");
                    break;

                default:
                    System.out.println("Chuc nang khong hop le!");
            }

        } while (choice != 5);
    }
}
