package bt01;

public class Student extends Person{
    private String studentId;
    private double gpa;

    public Student(String name, int age, String studentId, double gpa) {
        super(name, age);
        this.studentId = studentId;
        this.gpa = gpa;
    }

    public String getStudentId() { return studentId; }
    public double getGpa() { return gpa; }

    @Override
    public void show() {
        super.show();
        System.out.println("Mã SV: " + studentId);
        System.out.printf("Điểm TB: %.2f%n", gpa);
    }

}
