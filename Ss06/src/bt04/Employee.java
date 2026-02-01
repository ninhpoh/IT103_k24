package bt04;

public class Employee {
    private String maNV;
    private String tenNV;
    private double luong;

    public Employee(){};

    public Employee(String maNV, String tenNV) {
        this.maNV = maNV;
        this.tenNV = tenNV;
    }

    public Employee(String maNV, String tenNV, double luong) {
        this.maNV = maNV;
        this.tenNV = tenNV;
        this.luong = luong;
    }

    public void hienThiThongTin() {
        System.out.println("----------------------");
        System.out.println("Mã NV: " + maNV);
        System.out.println("Tên NV: " + tenNV);
        System.out.println("Lương: " + luong);
        System.out.println("----------------------");
    }


}
