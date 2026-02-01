package bt04;

public class bt04 {
    public static void main(String[] args) {

        Employee nv1 = new Employee();

        Employee nv2 = new Employee("NV01", "Bruh Bruh Batabin");

        Employee nv3 = new Employee("NV02", "Tung Tung Sahur", 70000);

        nv1.hienThiThongTin();
        nv2.hienThiThongTin();
        nv3.hienThiThongTin();
    }
}
