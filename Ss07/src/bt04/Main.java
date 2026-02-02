package bt04;

public class Main {
    public static void main(String[] args) {
        ClassRoom s1 = new ClassRoom("Nguyen Van Anh");
        ClassRoom s2 = new ClassRoom("Tran Thi Binh");
        ClassRoom s3 = new ClassRoom("Le Van Cuong");

        s1.contribute(100000);
        s2.contribute(200000);
        ClassRoom.viewClassFund();
        s3.contribute(150000);

        ClassRoom.viewClassFund();
    }

}
