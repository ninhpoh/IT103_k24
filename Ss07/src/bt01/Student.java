package bt01;

public class Student {
    private String studentId;
    private String studentName;

    private static int totalStudent;

    public Student(String studentId, String StudentName) {
        this.studentId = studentId;
        studentName = StudentName;
        totalStudent++;
    }

    public void displayInfo() {
        System.out.println("Mã sinh viên: " + studentId);
        System.out.println("Tên sinh viên: " + studentName);
    }

    public static void displayTotalStudent() {
        System.out.println("Tổng số sinh viên đã tạo: " + totalStudent);
    }

}
