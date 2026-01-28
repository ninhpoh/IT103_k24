import java.time.LocalDate;

public class bt03 {
    public static void main(String[] args) {

        String[] transactions = {"BK001-20/01", "BK005-21/01", "BK099-22/01"};

        long t1 = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        sb.append("--- BÁO CÁO MƯỢN SÁCH ---\n");
        sb.append("Ngày tạo: ").append(LocalDate.now()).append("\n");

        for (String t : transactions) {
            sb.append("Giao dịch: ").append(t).append("\n");
        }

        long t2 = System.currentTimeMillis();

        long t3 = System.currentTimeMillis();

        String s = "";
        s += "--- BÁO CÁO MƯỢN SÁCH ---\n";
        s += "Ngày tạo: " + LocalDate.now() + "\n";

        for (String t : transactions) {
            s += "Giao dịch: " + t + "\n";
        }

        long t4 = System.currentTimeMillis();

        System.out.println(sb);
        System.out.println("Số thời gian thực thi đối với StringBuilder: " + (t2 - t1));
        System.out.println("Số thời gian thực thi đối với String: " + (t4 - t3));
    }
}

