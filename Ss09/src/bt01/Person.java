package bt01;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public void show() {
        System.out.println("Họ tên: " + name);
        System.out.println("Tuổi: " + age);
    }

}
