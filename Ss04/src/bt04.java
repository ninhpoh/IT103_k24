import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class bt04 {
    public static void main(String[] args) {

        String cardID = "TV202312345";

        if (!cardID.matches("^[A-Z]{2}.*")) {
            System.out.println("Thiếu hoặc sai tiền tố (phải là 2 chữ in hoa)");
        }
        else if (!cardID.matches("^[A-Z]{2}\\d{4}.*")) {
            System.out.println("Năm không hợp lệ");
        }
        else {
            Pattern p = Pattern.compile("^[A-Z]{2}\\d{4}\\d{5}$");
            Matcher m = p.matcher(cardID);

            if (m.matches()) {
                System.out.println("Mã thẻ hợp lệ!");
            } else {
                System.out.println("Sai 5 chữ số cuối");
            }
        }
    }
}
