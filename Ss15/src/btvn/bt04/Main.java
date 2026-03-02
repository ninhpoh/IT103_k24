package btvn.bt04;

public class Main {
    public static void main(String[] args) {
        EmergencyQueue queue = new EmergencyQueue();

        EmergencyPatient a = new EmergencyPatient("EP001", "Nguyễn Văn A", 2);
        EmergencyPatient b = new EmergencyPatient("EP002", "Trần Thị B", 1);
        EmergencyPatient c = new EmergencyPatient("EP003", "Lê Văn C", 1);
        EmergencyPatient d = new EmergencyPatient("EP004", "Phạm Thị D", 2);

        queue.addPatient(a);
        queue.addPatient(b);
        queue.addPatient(c);
        queue.addPatient(d);

        queue.displayQueue();

        System.out.println("Gọi: " + queue.callNextPatient());
        System.out.println("Gọi: " + queue.callNextPatient());

        queue.displayQueue();
    }
}
