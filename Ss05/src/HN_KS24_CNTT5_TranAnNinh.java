import java.util.Scanner;

public class HN_KS24_CNTT5_TranAnNinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mssv = new String[100];
        int size = 0;
        int choice;

        do {
            System.out.println("\n===== MENU QUAN LY MSSV =====");
            System.out.println("1. Hien thi danh sach MSSV");
            System.out.println("2. Them MSSV moi");
            System.out.println("3. Cap nhat MSSV theo index");
            System.out.println("4. Xoa MSSV");
            System.out.println("5. Tim kiem MSSV (Regex)");
            System.out.println("6. Thoat");
            System.out.print("Chon: ");
            choice = Integer.parseInt(sc.nextLine());

            switch (choice){
                case 1:
                    if (size == 0) {
                        System.out.println("Danh sach rong!");
                    } else {
                        System.out.println("Danh sach MSSV:");
                        for (int i = 0; i < size; i++) {
                            System.out.printf("%d: " + mssv[i]+"\n",i);
                        }
                    }
                    break;
                case 2:
                    if (size == 100) {
                        System.out.println("Danh sach da day!");
                    } else {
                        String newMSSV;
                        while (true) {
                            System.out.print("Nhap MSSV moi: ");
                            newMSSV = sc.nextLine().trim();
                            if (newMSSV.matches("^B\\d{7}$")) {
                                break;
                            }
                            System.out.println("Sai dinh dang!");
                        }

                        mssv[size] = newMSSV;
                        size++;
                        System.out.println("Them thanh cong!");
                        break;
                    }
                    break;
                case 3:
                    System.out.print("Nhap index can cap nhat: ");
                    int index = sc.nextInt();

                    if (index < 0 || index >= size) {
                        System.out.println("index khong hop le!");
                        break;
                    }
                    String updateMSSV;
                    while (true){
                        System.out.print("Nhap MSSV moi: ");
                        updateMSSV = sc.nextLine().trim();

                        if (updateMSSV.matches("^B\\d{7}$")) {
                            break;
                        }
                        System.out.println("Sai dinh dang!");
                    }
                    mssv[index] = updateMSSV;
                    System.out.println("Cap nhat thanh cong");
                    break;
                case 4:
                    System.out.print("Nhap MSSV can xoa: ");
                    String deleteMSSV = sc.nextLine().trim();

                    int flag = -1;
                    for (int i = 0; i < size; i++){
                        if(mssv[i].equals(deleteMSSV)){
                            flag = i;
                            break;
                        }
                    }
                    if (flag == -1) {
                        System.out.println("Khong tim thay MSSV!");
                    } else {
                        for (int i = flag; i < size - 1; i++) {
                            mssv[i] = mssv[i + 1];
                        }
                        size--;
                        System.out.println("Xoa thanh cong!");
                    }
                    break;
                case 5:
                    System.out.println("acbacbacbacb");
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 6);
    }
}
