package bt01;

public class bt01 {
    public static void main(String[] args) {
            // Khởi tạo ít nhất 2 đối tượng sinh viên
            Student sv1 = new Student("SV001", "Nguyễn Văn A", "2003", 8.5);
            Student sv2 = new Student("SV002", "Trần Thị B", "2004", 7.9);

            // Gọi phương thức hiển thị thông tin
            sv1.hienThiThongTin();
            sv2.hienThiThongTin();
    }
}
