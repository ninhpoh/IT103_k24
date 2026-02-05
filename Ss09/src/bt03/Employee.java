package bt03;

public class Employee {
    private String name;
    private double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void showInfo() {
        System.out.println("Tên: " + name);
        System.out.printf("Lương cơ bản: %.2f%n", baseSalary);
    }
}