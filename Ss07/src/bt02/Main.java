package bt02;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.println("Trước khi thay đổi:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 20;
        System.out.println("Sau khi thay đổi a:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("-----------------------------");

        Student s1 = new Student("SV001", "Nguyen Van A");
        Student s2 = s1; // gán tham chiếu của s1 cho s2

        System.out.println("Trước khi thay đổi:");
        s1.displayInfo();
        s2.displayInfo();

        // Thay đổi thông tin qua s1
        s1.studentName = "Tran Thi B";

        System.out.println("Sau khi thay đổi tên qua s1:");
        s1.displayInfo();
        s2.displayInfo();
    }
}