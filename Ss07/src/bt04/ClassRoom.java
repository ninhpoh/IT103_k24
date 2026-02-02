package bt04;

class ClassRoom {
    public static int classFund = 0;

    private String studentName;

    public ClassRoom(String studentName) {
        this.studentName = studentName;
    }

    public void contribute(int amount) {
        classFund += amount;
        System.out.println(studentName + " đã đóng " + amount + " vào quỹ lớp.");
    }

    public static void viewClassFund() {
        System.out.println("Tổng quỹ lớp hiện tại: " + classFund);
    }
}