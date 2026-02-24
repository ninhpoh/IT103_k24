package HN_CNTT5_TranAnNinh;

public abstract class Drink{
    private String id;
    protected String name;
    protected double price;

    public Drink(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice() ;

    public void displayInfo(){
        System.out.println("MA:"+ id);
        System.out.println("Ten:"+ name);
        System.out.println("Gia:"+ price);
    };
}
