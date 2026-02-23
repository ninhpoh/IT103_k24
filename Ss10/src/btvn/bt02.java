package btvn;

public class bt02 {

    abstract static class Vehicle {
        protected String brand;

        public Vehicle(String brand) {
            this.brand = brand;
        }

        public abstract void move();

        public String getBrand() {
            return brand;
        }
    }

    static class Car extends Vehicle {
        public Car(String brand) {
            super(brand);
        }

        @Override
        public void move() {
            System.out.println("Di chuyển bằng động cơ");
        }
    }

    static class Bicycle extends Vehicle {
        public Bicycle(String brand) {
            super(brand);
        }

        @Override
        public void move() {
            System.out.println("Di chuyển bằng sức người");
        }
    }

    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        System.out.print(car.getBrand() + " - Cách di chuyển: ");
        car.move();

        Vehicle bike = new Bicycle("Giant");
        System.out.print(bike.getBrand() + " - Cách di chuyển: ");
        bike.move();
    }
}