package bt05;

public class Book {
    private String id;
    private String ten;
    private double gia;

    public Book(String id, String ten, double gia) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
    }

    public void hienThiThongTin() {
        System.out.println("----------------------");
        System.out.println("ID: " + id);
        System.out.println("Tên sách: " + ten);
        System.out.println("Giá: " + gia);
        System.out.println("----------------------");
    }
}
