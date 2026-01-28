public class bt02 {
    public static void main(String[] args) {

        String description = "Sách giáo khoa Toán lớp 12, Kệ: A1-102, tình trạng mới";

        int pos = description.indexOf("Kệ:");

        if (pos != -1) {
            int start = pos + 4; // sau "Kệ:"
            int end = description.indexOf(",", start);

            String location = description.substring(start, end).trim();
            System.out.println("Vị trí tìm thấy: " + location);

            description = description.replace("Kệ:", "Vị trí lưu trữ:");
            System.out.println("Mô tả mới: " + description);
        }
    }
}

