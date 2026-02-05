package bt03;

public class Manager extends Employee {
    private String department;

    public Manager(String name, double baseSalary, String department) {
        super(name, baseSalary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Phòng ban: " + department);
    }
}