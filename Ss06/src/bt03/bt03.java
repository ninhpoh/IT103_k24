package bt03;

public class bt03 {
    public static void main(String[] args) {

            Product p = new Product("SP01", "Bàn phím cơ", 500000);

            p.hienThiThongTin();

            System.out.println("Thử set giá = -100000");
            p.setPrice(-100000);

            // Quan sát kết quả
            p.hienThiThongTin();
    }
}
