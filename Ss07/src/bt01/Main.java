package bt01;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("SV001", "Tung Tung Sahur");
        Student s2 = new Student("SV002", "Tralalero Tralala");

        s1.displayInfo();
        s2.displayInfo();

        Student.displayTotalStudent();
    }

}
