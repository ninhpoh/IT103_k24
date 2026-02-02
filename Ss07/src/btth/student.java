package btth;

public class student {
    private String id;
    private String name;

    public static int studentCount;
    public static final String SCHOOL_NAME = "PTIT";

    public student(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInfo() {
        System.out.println("--------------------");
       System.out.println("School: " + SCHOOL_NAME);
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("--------------------");
    }

    public static void showTotalStudent() {
        System.out.println("Total students: " + studentCount);
    }

}
