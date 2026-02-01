package bt02;

public class Account {
    private String useName;
    private String password;
    private String email;

    public Account(String useName, String password, String email) {
        this.useName = useName;
        this.password = password;
        this.email = email;
    }

    public void doiMatKhau(String newPassword) {
        this.password = newPassword;
        System.out.println("Đổi mật khẩu thành công!");
    }

    public void hienThiThongTin() {
        System.out.println("----------------------");
        System.out.println("Username: " + useName);
        System.out.println("Email: " + email);
        System.out.println("Password: "+ password);
        System.out.println("----------------------");
    }
}
