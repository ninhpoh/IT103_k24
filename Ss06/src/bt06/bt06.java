package bt06;

public class bt06 {
    public static void main(String[] args) {

        User u1 = new User(1, "admin", "123456", "admin@gmail.com");
        u1.hienThiThongTin();

        User u2 = new User(2, "user01", "abc123", "user01gmail.com");
        u2.hienThiThongTin();

        User u3 = new User(3, "user02", "", "user02@gmail.com");
        u3.hienThiThongTin();

        u1.setEmail("sai-email");
        u1.setPassword("");
    }
}
