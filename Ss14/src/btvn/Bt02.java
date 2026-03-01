package btvn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bt02 {
    public static void main(String[] args) {
        Map<String, String> drugCatalog = new HashMap<>();
        drugCatalog.put("T01", "Paracetamol");
        drugCatalog.put("T02", "Ibuprofen");
        drugCatalog.put("T03", "Amoxicillin");
        drugCatalog.put("T04", "Cefalexin");
        drugCatalog.put("T05", "Vitamin C");

        Scanner scanner = new Scanner(System.in);
        String id;

        System.out.print("Nhập mã thuốc: ");
        id = scanner.nextLine();

        if (drugCatalog.containsKey(id)) {
            System.out.println("Tên thuốc: " + drugCatalog.get(id));
        } else {
            System.out.println("Thuốc không có trong danh mục BHYT");
        }
        scanner.close();
    }
}