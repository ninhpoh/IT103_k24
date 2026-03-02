package btvn.bt02;

public class Main {
    public static void main(String[] args) {
        PatientQueue pq = new PatientQueue();

        pq.addPatient(new Patient("P001", "Nguyễn Văn Anh", 30));
        pq.addPatient(new Patient("P002", "Trần Thị Tarr", 25));
        pq.addPatient(new Patient("P003", "Lê Văn Ching", 40));

        pq.displayQueue();

        System.out.println("\nBệnh nhân tiếp theo: " + pq.peekNextPatient());

        Patient called = pq.callNextPatient();
        System.out.println("\nGọi khám: " + called);

        System.out.println();
        pq.displayQueue();
    }
}
