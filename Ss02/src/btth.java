import java.util.Scanner;

public class btth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id;

        do {
            System.out.print("nhap id: ");
            id = sc.nextInt();


        }while (id <= 0);

    }
}
//
//YÊU CẦU 3:
//        •	Mục đích:
//o	     Thống kê số sách nhập kho
//•	Yêu cầu:
//o	      Nhập mã hợp lệ (> 0)
//o	      Đếm số mã hợp lệ
//o	      In ra số lượng sách hợp lệ
//•	Giải pháp:
//o	      While hoặc do…while
//o	      If else
//o	      Break
//•	Thực thi:
//o	      Tạo biến đếm = 0
//o	      B1: dùng vòng lặp do…while (luôn đúng)
//        	            B2: Nhập mã số
//	           B3: Kiểm tra
//•	                  B4: < 0 không tính bắt nhập lại
//•	                  B5: == 0  break – thoát khỏi vòng lặp
//•	                  B6: > 0 biến đếm tăng lên
//o	       B7: In kết quả biến đếm ra màn hình