package HN_CNTT5_TranAnNinh;

public class Main {
    public static void main(String[] args) {
        Drink[] drinks = new Drink[3];

        drinks[0] = new Coffee("D0","Bac xiu",30000,true);
        drinks[2] = null;
        drinks[1] = new FruitJuice("D2", "Nuoc cam", 40000, 10);

        for(int i = 0; i<drinks.length;i++){
            if (drinks[i]!=null){
                drinks[i].displayInfo();
                System.out.println("Thanh tien "+ drinks[i].calculatePrice());
                if (drinks[i] instanceof FruitJuice){
                    ((FruitJuice) drinks[i]).mix();
                }
                System.out.println("=======================================");
            }
        }
    }
}
