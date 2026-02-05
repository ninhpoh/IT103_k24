package bt04;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound();

        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.fetch();
        }
    }

}
