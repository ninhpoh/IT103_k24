package HN_KS24_CNTT5_TranAnNinh;

public class Student {
    private String id;
    private String name;
    private double score;

    public Student() {
    }

    public Student(String id, String name, double score) {
        setId(id);
        this.name = name;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.matches("SV\\d{3}")) {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getRank() {
        if (score >= 8.0) {
            return "Gioi";
        } else if (score >= 6.5) {
            return "Kha";
        } else {
            return "Trung Binh";
        }
    }

    public String toString() {
        return id + " - " + name + " - " + score + " - " + getRank();
    }

    public static void displayStudents(Student[] students) {
        if (students == null) {
            System.out.println("Chưa có sinh viên!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
