import java.util.regex.*;

public class bt06 {
    public static void main(String[] args) {

        String review = "Cuốn sách này rất tệ, nội dung thật là ngu ngốc và không đáng đọc.";

        String[] blacklist = { "tệ", "ngu ngốc", "không đáng" };

        for (String bad : blacklist) {
            Pattern p = Pattern.compile(bad, Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(review);

            while (m.find()) {
                String stars = "*".repeat(m.group().length());
                review = review.replaceAll("(?i)" + bad, stars);
            }
        }

        if (review.length() > 200) {
            int cut = review.lastIndexOf(" ", 200);
            StringBuilder sb = new StringBuilder();
            sb.append(review.substring(0, cut)).append("...");
            review = sb.toString();
        }

        System.out.println("Review sau khi xử lý: " + review);
    }
}
