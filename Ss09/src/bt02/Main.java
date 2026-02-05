package bt02;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();


        dog.sound();
        cat.sound();

        Animal a1 = new Dog();
        Animal a2 = new Cat();
        Animal a3 = new Animal();

        a1.sound();
        a2.sound();
        a3.sound();
    }
}