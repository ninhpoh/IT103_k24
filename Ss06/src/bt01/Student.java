package bt01;

public class Student {
    private String Id;
    private  String name;
    private  String dateOfBirth;
    private  double averageScore;

    public Student(String Id, String name, String dateOfBirth, double averageScore) {
        this.Id = Id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.averageScore = averageScore;
    }

    public void hienThiThongTin() {
        System.out.println("----------------------");
        System.out.println("Mã SV: " + Id);
        System.out.println("Họ tên: " + name);
        System.out.println("Năm sinh: " + dateOfBirth);
        System.out.println("Điểm TB: " + averageScore);
        System.out.println("----------------------");
    }
}
