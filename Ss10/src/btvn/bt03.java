package btvn;

public class bt03 {

    public static abstract class Animal {
        protected String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public abstract void makeSound();
    }

    public interface Swimmable {
        void swim();
    }

    public interface Flyable {
        void fly();
    }

    public static class Duck extends Animal implements Swimmable, Flyable {

        public Duck(String name) {
            super(name);
        }

        @Override
        public void swim() {
            System.out.println(name + " is swimming.");
        }

        @Override
        public void fly() {
            System.out.println(name + " is flying.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " says: Quack!");
        }
    }

    public static class Fish extends Animal implements Swimmable {

        public Fish(String name) {
            super(name);
        }

        @Override
        public void swim() {
            System.out.println(name + " swimming.");
        }

        @Override
        public void makeSound() {
            System.out.println(name + " OaAOoaoaoooao.");
        }
    }

    public static void main(String[] args) {
        Duck daffy = new Duck("Daffy");
        Fish nemo = new Fish("Nemo");

        daffy.makeSound();
        daffy.swim();
        daffy.fly();

        System.out.println();

        nemo.makeSound();
        nemo.swim();

        System.out.println();
        System.out.println("Is Daffy Flyable ? " + (daffy instanceof Flyable));
        System.out.println("Is Nemo Flyable ? " + (nemo instanceof Flyable));
    }
}