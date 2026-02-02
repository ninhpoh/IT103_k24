package bt05;

public class Main {

    public static void main(String[] args) {
            int score1 = 85;
            int score2 = 120;


            if (score1 <= Config.MAX_SCORE && score1 >= Config.MIN_SCORE) {
                System.out.println("Điểm hợp lệ: " + score1);
            } else {
                System.out.println("Điểm không hợp lệ: " + score1);
            }

            if (score2 <= Config.MAX_SCORE && score2 >= Config.MIN_SCORE) {
                System.out.println("Điểm hợp lệ: " + score2);
            } else {
                System.out.println("Điểm không hợp lệ: " + score2);
            }

            // Config.MAX_SCORE = 200;
            // Lỗi: cannot assign a value to final variable MAX_SCORE
    }

}
