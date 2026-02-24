package HN_CNTT5_TranAnNinh;

public class FruitJuice extends Drink implements IMixable{
    protected int discountPercent;

    public FruitJuice(String id, String name, double price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        return price = price - (price * discountPercent/100);
    };

    @Override
    public void mix(){
        System.out.println("dang ep trai cay ....");
    };
}
