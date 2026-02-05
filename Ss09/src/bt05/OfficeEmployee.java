package bt05;

public class OfficeEmployee extends Employee {
    private long baseSalary;

    public OfficeEmployee(String name, long baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    public long getBaseSalary() {
        return baseSalary;
    }

    @Override
    public long calculateSalary() {
        return baseSalary;
    }

    @Override
    public void showInfo() {
        System.out.printf("%s (Office) - Lương: %,d%n", getName(), calculateSalary());
    }
}
