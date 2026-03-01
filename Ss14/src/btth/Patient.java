package btth;

public class Patient extends Person implements Comparable<Patient> {

    private String phone;

    public Patient(String id, String name, int age, String phone) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    @Override
    public int compareTo(Patient o) {
        return this.name.compareToIgnoreCase(o.name);
    }

    @Override
    public void displayInfo() {
        System.out.println(id + " - " + name + " - " + age + " - " + phone);
    }

}