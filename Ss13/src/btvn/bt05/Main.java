package btvn.bt05;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Patient> patients = new ArrayList<>();
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            printMenu();
            String choice = scanner.nextLine().trim();
            switch (choice) {
                case "1":
                    admitPatient();
                    break;
                case "2":
                    updateDiagnosis();
                    break;
                case "3":
                    dischargePatient();
                    break;
                case "4":
                    sortPatients();
                    break;
                case "5":
                    listPatients();
                    break;
                case "0":
                    running = false;
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            System.out.println(); // dòng trống cho dễ đọc
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("===== QUẢN LÝ BỆNH NHÂN =====");
        System.out.println("1. Tiếp nhận bệnh nhân");
        System.out.println("2. Cập nhật chẩn đoán (theo ID)");
        System.out.println("3. Xuất viện (xóa theo ID)");
        System.out.println("4. Sắp xếp danh sách (Tuổi giảm dần, nếu bằng thì tên A-Z)");
        System.out.println("5. Hiển thị danh sách hiện tại");
        System.out.println("0. Thoát");
        System.out.print("Chọn chức năng: ");
    }

    private static void admitPatient() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID (không được trùng): ");
        String id = scanner.nextLine().trim();
        if (id.isEmpty()) {
            System.out.println("ID không được để trống.");
            return;
        }
        if (existsById(id)) {
            System.out.println("ID đã tồn tại. Tiếp nhận bị hủy.");
            return;
        }

        System.out.print("Nhập họ và tên: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Tên không được để trống.");
            return;
        }

        System.out.print("Nhập tuổi: ");
        String ageStr = scanner.nextLine().trim();
        int age;
        try {
            age = Integer.parseInt(ageStr);
            if (age < 0) {
                System.out.println("Tuổi không hợp lệ.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Tuổi phải là số nguyên.");
            return;
        }

        System.out.print("Nhập chẩn đoán: ");
        String diagnosis = scanner.nextLine().trim();
        if (diagnosis.isEmpty()) diagnosis = "Chưa có";

        Patient p = new Patient(id, name, age, diagnosis);
        patients.add(p);
        System.out.println("Tiếp nhận thành công: " + p);
    }

    private static void updateDiagnosis() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID bệnh nhân cần cập nhật chẩn đoán: ");
        String id = scanner.nextLine().trim();
        Patient p = findById(id);
        if (p == null) {
            System.out.println("Không tìm thấy bệnh nhân với ID: " + id);
            return;
        }
        System.out.println("Bệnh nhân hiện tại: " + p);
        System.out.print("Nhập chẩn đoán mới: ");
        String newDiag = scanner.nextLine().trim();
        if (newDiag.isEmpty()) {
            System.out.println("Chẩn đoán không được để trống. Hủy cập nhật.");
            return;
        }
        p.setDiagnosis(newDiag);
        System.out.println("Cập nhật thành công: " + p);
    }

    private static void dischargePatient() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID bệnh nhân xuất viện: ");
        String id = scanner.nextLine().trim();
        Iterator<Patient> it = patients.iterator();
        boolean removed = false;
        while (it.hasNext()) {
            Patient p = it.next();
            if (p.getId().equals(id)) {
                it.remove(); // xóa an toàn khi duyệt
                System.out.println("Đã xuất viện và xóa khỏi danh sách: " + p);
                removed = true;
                break;
            }
        }
        if (!removed) {
            System.out.println("Không tìm thấy bệnh nhân với ID: " + id);
        }
    }

    private static void sortPatients() {

        if (patients.isEmpty()) {
            System.out.println("Danh sách rỗng, không thể sắp xếp.");
            return;
        }
        Collections.sort(patients, Comparator
                .comparingInt(Patient::getAge).reversed()
                .thenComparing(Patient::getFullName));
        System.out.println("Đã sắp xếp danh sách theo Tuổi giảm dần, nếu bằng thì tên A-Z.");
        listPatients();
    }

    private static void listPatients() {
        if (patients.isEmpty()) {
            System.out.println("Danh sách bệnh nhân hiện tại trống.");
            return;
        }
        System.out.println("Danh sách bệnh nhân hiện tại:");
        for (Patient p : patients) {
            System.out.println(" - " + p);
        }
    }

    private static boolean existsById(String id) {
        return findById(id) != null;
    }

    private static Patient findById(String id) {
        for (Patient p : patients) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

}
