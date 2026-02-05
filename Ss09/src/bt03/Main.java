package bt03;

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee("Lê Thị Bình", 8000000);
        Manager m = new Manager("Trần Văn Chinh", 15000000, "Kế toán");

        System.out.println("=== Employee ===");
        e.showInfo();

        System.out.println("\n=== Manager ===");
        m.showInfo();
    }

}
