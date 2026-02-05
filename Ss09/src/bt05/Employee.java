package bt05;

public abstract class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract long calculateSalary();

    public void showInfo() {
        System.out.printf("%s - Lương: %,d%n", name, calculateSalary());
    }
}

