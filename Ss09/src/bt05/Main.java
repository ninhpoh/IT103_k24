package bt05;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new OfficeEmployee("Nguyen Van Anh", 10_000_000L));
        employees.add(new ProductionEmployee("Tran Thi Bình", 300, 20_000L));
        employees.add(new ProductionEmployee("Le Van Chinh", 150, 30_000L));

        System.out.println("Danh sách lương nhân viên:");
        long total = 0L;
        int idx = 1;
        for (Employee e : employees) {
            System.out.print(idx++ + ". ");
            e.showInfo();
            total += e.calculateSalary();
        }

        System.out.printf("%n=> TỔNG LƯƠNG CÔNG TY: %,d%n", total);
    }

}
